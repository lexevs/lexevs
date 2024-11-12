/*
 * Copyright: (c) 2004-2009 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.LexGrid.lexevs.metabrowser.impl;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Extensions.ExtensionRegistry;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.Extensions.AbstractExtendable;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.annotations.LgClientSideSafe;
import org.LexGrid.commonTypes.Source;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaTree;
import org.LexGrid.lexevs.metabrowser.helper.MrDocLoader;
import org.LexGrid.lexevs.metabrowser.model.BySourceTabResults;
import org.LexGrid.lexevs.metabrowser.model.RelationshipTabResults;
import org.LexGrid.lexevs.metabrowser.model.SemanticTypeHolder;
import org.LexGrid.util.sql.lgTables.SQLTableConstants;
import org.apache.commons.collections.CollectionUtils;
import org.lexevs.locator.LexEvsServiceLocator;
import org.lexevs.logging.LoggerFactory;
import org.lexevs.system.service.SystemResourceService;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

/**
 * The Class MetaBrowserServiceImpl.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class MetaBrowserServiceImpl extends AbstractExtendable implements MetaBrowserService {

	/** The CODIN g_ schem e_ name. */
	public static String CODING_SCHEME_NAME = "NCI MetaThesaurus";
	
	public static String CODING_SCHEME_URI = "urn:oid:2.16.840.1.113883.3.26.1.2";
	
	/** The NC i_ source. */
	private static String NCI_SOURCE = "NCI";
	
	/** The NC i_ root. */
	private static String NCI_ROOT = "C1140168";
	
	/** The CH d_ rel. */
	public static String CHD_REL = "CHD";
	
	/** The PA r_ rel. */
	public static String PAR_REL = "PAR";
	
	/** The lbs. */
	private transient LexBIGService lbs;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

    private static final String SEMANTIC_TYPES_PROPERTY = "Semantic_Type";
	
	/** The SOURC e_ qua l_ col. */
	private static String SOURCE_QUAL_COL = "sourceQualifier";
	
	/** The REL a_ qua l_ col. */
	private static String RELA_QUAL_COL = "relaQualifier";
	
	/** The RE l_ col. */
	private static String REL_COL = "rel";
	
	/** The SOURC e_ cod e_ qua l_ col. */
	private static String SOURCE_CODE_QUAL_COL = "sourceCodeQualifier";
	
	/** The SOURC e_ qua l_ value. */
	private static String SOURCE_QUAL_VALUE = "source";
	
	/** The SOURC e_ cod e_ qua l_ value. */
	private static String SOURCE_CODE_QUAL_VALUE = "source-code";
	
	/** The REL a_ qua l_ value. */
	private static String RELA_QUAL_VALUE = "rela";
	
	/** The AU i_ targe t_ qua l_ value. */
	private static String AUI_TARGET_QUAL_VALUE = "target-aui";
	
	/** The AU i_ sourc e_ qua l_ value. */
	private static String AUI_SOURCE_QUAL_VALUE = "source-aui";
	
	/** The AU i_ qua l_ value. */
	private static String AUI_QUAL_VALUE = "AUI";;
	
	/** The ROOT. */
	private static String ROOT = "@";
	
	/** The TAIL. */
	private static String TAIL = "@@";
	
	private static String SEMANTIC_TYPE_SEPARATOR = ";";
	
	/** The sab root node cache. */
	private Map<String,String> sabRootNodeCache = new HashMap<String,String>();
	
	/** The max to return. */
	private int maxToReturn;
	
	/** The associations. */
	private List<String> associations;

	/** The rela reverse names. */
	private Map<String,String> relaReverseNames;
	
	/** The rela reverse names. */
	private Map<String,String> relReverseNames;
	
	/** The sql interface. */
	private transient JdbcTemplate jdbcTemplate;
	
	private static SemanticTypeRowMapper SEMANTIC_TYPE_ROWMAPPER = new SemanticTypeRowMapper();
	
	private static String ENTITY_ASSOCIATION_TO_ENTITY = "entityAssnsToEntity";
	private static String ENTITY_ASSOCIATION_TO_E_QUALS = "entityAssnQuals";
	private static String ENTITY = "entity";
	private static String ASSOCIATION_PREDICATE = "associationPredicate";
	private static String ENTITY_PROPERTY_MULTI_ATTRIBUTES = "propertyMultiAttrib";
	private static String ENTITY_PROPERTY = "property";
	private static String ENTITY_DESCRIPTION = "description";

	
	/**
	 * Inits the extension.
	 * 
	 * @throws LBException the LB exception
	 */
	public void initExtension() throws LBException{
		
		SystemResourceService rm = null;
		try {
			rm = LexEvsServiceLocator.getInstance().getSystemResourceService();
	
		 if(relaReverseNames == null){
			 MrDocLoader mrdocLoader = new MrDocLoader();
			 relaReverseNames = mrdocLoader.getRelasAndReverseRelas();
			 relReverseNames = mrdocLoader.getRelsAndReverseRels();
		 }
		 
		 maxToReturn = rm.getSystemVariables().getMaxResultSize();
		 
		 try {
			 if(associations == null){
				 associations = buildAssociationList();
			 }
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		} catch (Throwable e1) {
			throw new LBException(e1.toString());
		}
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getBySourceTabDisplay(java.lang.String, java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction)
	 */
	public Map<String, List<BySourceTabResults>> getBySourceTabDisplay(String cui,
			String source, List<String> relationships, Direction direction) throws LBException {	
		return getBySourceTabDisplay(cui,
				source, relationships, direction, true);
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getBySourceTabDisplay(java.lang.String, java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction, boolean)
	 */
	public Map<String, List<BySourceTabResults>> getBySourceTabDisplay(
			String cui,
			String source, 
			List<String> relationships, 
			Direction direction, 
			boolean excludeSelfReferencing) throws LBException{
		return this.getBySourceTabDisplay(
				cui, 
				source, 
				relationships, 
				direction, 
				excludeSelfReferencing, 
				0, 
				-1);
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getBySourceTabDisplay(java.lang.String, java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction, boolean, int, int)
	 */
	public Map<String, List<BySourceTabResults>> getBySourceTabDisplay(
			String cui,
			String source, 
			List<String> relationships, 
			Direction direction, 
			boolean excludeSelfReferencing, 
			int start,
			int pageSize) throws LBException {	
		initExtension();
		
		String getRelationsSql = null;

		if(CollectionUtils.isEmpty(relationships)){
			relationships = this.associations;
		}
		
		Map<String, List<BySourceTabResults>> map =
			buildRelationshipMap(relationships, direction, BySourceTabResults.class);
		
		try {
			getRelationsSql = 
					buildGetBySourceDisplaySql(
							source, 
							direction, 
							relationships, 
							excludeSelfReferencing, 
							start, 
							pageSize);

			return buildBySourceTabResults(getRelationsSql, cui, map, direction);	
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	/**
	 * Gets the association reverse name.
	 * 
	 * @param cs the cs
	 * @param associationName the association name
	 * 
	 * @return the association reverse name
	 * @throws LBException 
	 */
	
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getRelationshipsDisplay(java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction)
	 */
	public Map<String, List<RelationshipTabResults>> getRelationshipsDisplay(String cui, 
			List<String> relationships, 
			Direction direction) throws LBException {
		return getRelationshipsDisplay(cui, 
				relationships, 
				direction, true);
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getRelationshipsDisplay(java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction, boolean)
	 */
	public Map<String, List<RelationshipTabResults>> getRelationshipsDisplay(String cui, 
			List<String> relationships, 
			Direction direction, boolean excludeSelfReferencing) throws LBException {
		initExtension();
		
		String getRelationsSql = null;

		if(relationships == null){
			relationships = this.associations;
		}
		
		Map<String, List<RelationshipTabResults>> map =
			buildRelationshipMap(relationships, direction, RelationshipTabResults.class);
		
		try {
			getRelationsSql = buildGetRelationshipsDisplaySql(direction, relationships, excludeSelfReferencing);

			return buildRelationshipTabResults(getRelationsSql, cui, map, direction);	
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	/**
	 * Builds the relationship map.
	 * 
	 * @param relationships the relationships
	 * @param direction the direction
	 * @param result the result
	 * 
	 * @return the map< string, list< t>>
	 */
	private <T> Map<String, List<T>> buildRelationshipMap(
			List<String> relationships, Direction direction,
			Class<T> result) {
		Map<String, List<T>> map = 
			new HashMap<String, List<T>>();
		for(String rel : relationships){
			String relationDirectionName = rel;
			if(direction.equals(Direction.TARGETOF)){
				relationDirectionName = reverseRel(rel);
			}
			map.put(relationDirectionName, new ArrayList<T>());
		}
		return map;
	}

	/**
	 * Builds the relationship tab results.
	 * 
	 * @param rs the rs
	 * @param map the map
	 * @param direction the direction
	 * 
	 * @return the map< string, list< relationship tab results>>
	 * 
	 * @throws SQLException the SQL exception
	 */
	@SuppressWarnings({ "unchecked"})
	private Map<String, List<RelationshipTabResults>> buildRelationshipTabResults(
			String sql, 
			String cui,
			final Map<String, List<RelationshipTabResults>> map,
			final Direction direction) throws SQLException {

		return (Map<String, List<RelationshipTabResults>>) this.getJdbcTemplate().query(sql, new String[] {cui}, new ResultSetExtractor() {

			public Object extractData(ResultSet rs) throws SQLException,
			DataAccessException {
				while(rs.next()){
					RelationshipTabResults result = new RelationshipTabResults();

					String rel = rs.getString(REL_COL);
					if(direction.equals(Direction.TARGETOF)){
						rel = reverseRel(rel);
					}

					String targetConceptCode = null;
					if(direction.equals(Direction.TARGETOF)){
						targetConceptCode = rs.getString("sourceEntityCode");
					} else {
						targetConceptCode = rs.getString("targetEntityCode");
					}

					String entityDescription = rs.getString(ENTITY_DESCRIPTION);
					String sourceQualValue = rs.getString(SOURCE_QUAL_COL);

					String relaQualValue = rs.getString(RELA_QUAL_COL);
					if(direction.equals(Direction.TARGETOF)){
						relaQualValue = reverseRela(relaQualValue);
					}

					result.setCui(targetConceptCode);
					result.setName(entityDescription);
					result.setRel(rel);
					result.setSource(sourceQualValue);
					result.setRela(relaQualValue);

					map.get(rel).add(result);
				}
				return map;
			}
		});
	}
	
	/**
	 * Builds the by source tab results.
	 * 
	 * @param rs the rs
	 * @param map the map
	 * @param direction the direction
	 * 
	 * @return the map< string, list< by source tab results>>
	 * 
	 * @throws SQLException the SQL exception
	 */
	@SuppressWarnings({ "unchecked"})
	private Map<String, List<BySourceTabResults>> buildBySourceTabResults(
			String sql,
			String cui, 
			final Map<String, List<BySourceTabResults>> map,
			final Direction direction) throws SQLException{
		
		return (Map<String, List<BySourceTabResults>>) this.getJdbcTemplate().query(sql, new String[] {cui}, new ResultSetExtractor() {

			public Object extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				while(rs.next()){
					BySourceTabResults result = new BySourceTabResults();
					
					String rel = rs.getString(REL_COL);
					if(direction.equals(Direction.TARGETOF)){
						rel = reverseRel(rel);
					}
					
					String targetConceptCode = null;
					if(direction.equals(Direction.TARGETOF)){
						targetConceptCode = rs.getString("sourceEntityCode");
					} else {
						targetConceptCode = rs.getString("targetEntityCode");
					}
					
					String termText = rs.getString(SQLTableConstants.TBLCOL_PROPERTYVALUE);
					String sourceQualValue = rs.getString(SOURCE_QUAL_COL);
					String repForm = rs.getString(SQLTableConstants.TBLCOL_REPRESENTATIONALFORM);
					String sourceCode = rs.getString(SOURCE_CODE_QUAL_COL);
					
					String relaQualValue = rs.getString(RELA_QUAL_COL);
					if(direction.equals(Direction.TARGETOF)){
						relaQualValue = reverseRela(relaQualValue);
					}
					
					result.setCui(targetConceptCode);
					result.setTerm(termText);
					result.setRel(rel);
					result.setSource(sourceQualValue);
					result.setRela(relaQualValue);
					result.setType(repForm);
					result.setCode(sourceCode);
					
					map.get(rel).add(result);
				}
				return map;
			}
		});
	}
	
	/**
	 * Reverse rel.
	 * 
	 * @param rel the rel
	 * 
	 * @return the string
	 */
	private String reverseRel(String rel){
		return this.relReverseNames.get(rel);
	}
	
	/**
	 * Reverse rela.
	 * 
	 * @param rela the rela
	 * 
	 * @return the string
	 */
	private String reverseRela(String rela){
		return relaReverseNames.get(rela);
	}
	
	/**
	 * Builds the get relationships count sql.
	 * 
	 * @param direction the direction
	 * @param relations the relations
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the string
	 */
	private String buildGetRelationshipsCountSql(Direction direction, List<String> relations, boolean excludeSelfReferencing) {
		String targetCol = null;
		if(direction.equals(Direction.SOURCEOF)){
			targetCol = "sourceEntityCode";
		} else {
			targetCol = "targetEntityCode";
		}
		
		StringBuffer sb = new StringBuffer();
		String sql = 
	    		 "SELECT count(*) " + 
	    		 " FROM " + this.getTableName(ENTITY_ASSOCIATION_TO_ENTITY) +
	             " AS eate " +
	             " INNER JOIN " + this.getTableName(ASSOCIATION_PREDICATE) + " AS ap " +
	             " ON (ap.associationPredicateGuid = eate.associationPredicateGuid) " +
	             " WHERE " +
	             targetCol  + " = ? " +
	             " AND " +
	             targetCol + " != '" + ROOT + "' " +
	             " AND " +
	             targetCol + " != '" + TAIL + "' " +
	             " AND ( ";
		
				sb.append(sql);
		
				for(int i=0;i<relations.size();i++){
					sb.append("ap.associationName = '" + relations.get(i) + "'");
					if(i == relations.size() -1 ){
						sb.append(" )");
					} else {
						sb.append(" OR ");
					}
				}
				
				if(excludeSelfReferencing){
					sb.append(getExcludeSelfReferencingSql());
				}
		return sb.toString();
	}
	
	/**
	 * Builds the by source count sql.
	 * 
	 * @param source the source
	 * @param direction the direction
	 * @param relations the relations
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the string
	 */
	private String buildBySourceCountSql(String source, Direction direction, List<String> relations,  boolean excludeSelfReferencing) {
		String targetCol = null;
		if(direction.equals(Direction.SOURCEOF)){
			targetCol = "sourceEntityCode";
		} else {
			targetCol = "targetEntityCode";
		}
		
		StringBuffer sb = new StringBuffer();
		String sql = 
	    		 "SELECT count(*) " + 
	    		 " FROM " + this.getTableName(ENTITY_ASSOCIATION_TO_ENTITY) +
	             " AS eate " +
	             
	             " INNER JOIN " + this.getTableName(ASSOCIATION_PREDICATE)  +
                 " AS associationPredicate ON " +
                 " eate.associationPredicateGuid = associationPredicate.associationPredicateGuid " +
                 
	             " INNER JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS sourceQual ON (" +
                 " eate.entityAssnsGuid " +
                 " = sourceQual.referenceGuid" +
                 " AND " +
                 " sourceQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '"+ SOURCE_QUAL_VALUE + "' )" +
	
	             " WHERE " +
	             targetCol  + " = ? " +	           
	             " AND " +
	             targetCol + " != '" + ROOT + "' " +
	             " AND " +
	             targetCol + " != '" + TAIL + "' ";
		
				sb.append(sql);
		
				if(relations.size() > 0) {
					sb.append(" AND ( ");
				}
				for(int i=0;i<relations.size();i++){
					sb.append("associationPredicate.associationName = '" + relations.get(i) + "'");
					if(i == relations.size() -1 ){
						sb.append(" )");
					} else {
						sb.append(" OR ");
					}
				}
				
				if(source != null){
					sb.append(" AND " +
						"sourceQual." + SQLTableConstants.TBLCOL_QUALIFIERVALUE + " =  '" + source + "'");
				}
		
				if(excludeSelfReferencing){
					sb.append(getExcludeSelfReferencingSql());
				}
		return sb.toString();
	}
	
	/**
	 * Builds the get relationships display sql.
	 * 
	 * @param direction the direction
	 * @param relations the relations
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the string
	 */
	private String buildGetRelationshipsDisplaySql(Direction direction, List<String> relations, boolean excludeSelfReferencing) {
		String sourceCol = null;
		String targetCol = null;
		if(direction.equals(Direction.SOURCEOF)){
			sourceCol = "targetEntityCode";
			targetCol = "sourceEntityCode";
		} else {
			targetCol = "targetEntityCode";
			sourceCol = "sourceEntityCode";
		}
		
		StringBuffer sb = new StringBuffer();
		String sql = 
	    		 "SELECT " + 
	    		 "associationPredicate.associationName AS " + REL_COL + ", " +
	    		 sourceCol + ", " +
	    		 " entity."+ ENTITY_DESCRIPTION + ", " +
	    		 " sourceQual."+ SQLTableConstants.TBLCOL_QUALIFIERVALUE + " AS " + SOURCE_QUAL_COL + ", " +
	    		 " relaQual."+ SQLTableConstants.TBLCOL_QUALIFIERVALUE + " AS " + RELA_QUAL_COL +
	    		 " FROM " + this.getTableName(ENTITY_ASSOCIATION_TO_ENTITY) +
	             " eate " +
	             
	             " INNER JOIN " + this.getTableName(ENTITY) +
                 " AS entity ON " +
                 sourceCol +
                 " = entity.entityCode" +
                 
                 " INNER JOIN " + this.getTableName(ASSOCIATION_PREDICATE)  +
                 " AS associationPredicate ON " +
                 " eate.associationPredicateGuid = associationPredicate.associationPredicateGuid " +
                 
                 " INNER JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS sourceQual ON (" +
                 " eate.entityAssnsGuid" +
                 " = sourceQual.referenceGuid" +
                 " AND " +
                 " sourceQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '"+ SOURCE_QUAL_VALUE + "' )" +
                 
                 " LEFT JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS relaQual ON (" +
                 " eate.entityAssnsGuid " +
                 " = relaQual.referenceGuid " +
                 " AND " +
                 " relaQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '" + RELA_QUAL_VALUE + "' )" +
                 
	             " WHERE " +
	             targetCol  + " = ? " +
	             " AND " +
	             targetCol + " != '" + ROOT + "' " +
	             " AND " +
	             targetCol + " != '" + TAIL + "' ";
		
				sb.append(sql);
		
				if(relations.size() > 0) {
					sb.append(" AND ( ");
				}
				for(int i=0;i<relations.size();i++){
					sb.append("associationPredicate.associationName = '" + relations.get(i) + "'");
					if(i == relations.size() -1 ){
						sb.append(" )");
					} else {
						sb.append(" OR ");
					}
				}
				
				if(excludeSelfReferencing){
					sb.append(getExcludeSelfReferencingSql());
				}
				
				
		return sb.toString();
	}
	
	/**
	 * Builds the get by source display sql.
	 * 
	 * @param source the source
	 * @param direction the direction
	 * @param relations the relations
	 * @param excludeSelfReferencing the exclude self referencing
	 * @param start the start
	 * @param pageSize the page size
	 * 
	 * @return the string
	 */
	private String buildGetBySourceDisplaySql(
			String source, Direction direction, List<String> relations,  
			boolean excludeSelfReferencing, int start, int pageSize) {
		String sourceCol = null;
		String targetCol = null;
		String auiCol = null;
		if(direction.equals(Direction.SOURCEOF)){
			sourceCol = "targetEntityCode";
			targetCol = "sourceEntityCode";
			auiCol = "auiTargetQual";
		} else {
			targetCol = "targetEntityCode";
			sourceCol = "sourceEntityCode";
			auiCol = "auiSourceQual";
		}
		
		StringBuffer sb = new StringBuffer();
		String sql = 
	    		 "SELECT " + 
	    		 " ap.associationName AS " + REL_COL + ", " +
	    		 sourceCol + ", " +
	    		 " entityProperty." + SQLTableConstants.TBLCOL_PROPERTYVALUE + ", " +
	    		 " entityProperty." + SQLTableConstants.TBLCOL_REPRESENTATIONALFORM + ", " +
	    		 " assocSourceQual." + SQLTableConstants.TBLCOL_QUALIFIERVALUE + " AS " + SOURCE_QUAL_COL + ", " +
	    		 " sourceCodeQual." + "attributeValue AS " + SOURCE_CODE_QUAL_COL + ", " +
	    		 " relaQual."+ SQLTableConstants.TBLCOL_QUALIFIERVALUE + " AS " + RELA_QUAL_COL +
	    		 " FROM " + this.getTableName(ENTITY_ASSOCIATION_TO_ENTITY) +
	             " AS eate " +
	             
	             " INNER JOIN " + this.getTableName(ASSOCIATION_PREDICATE) +
	             " AS ap ON (eate.associationPredicateGuid = ap.associationPredicateGuid)" +
	     
                 " INNER JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS assocSourceQual ON (" +
                 " eate.entityAssnsGuid" +
                 " = assocSourceQual.referenceGuid" +
                 " AND " +
                 " assocSourceQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '"+ SOURCE_QUAL_VALUE + "' )" +
                 
                 " LEFT JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS relaQual ON (" +
                 " eate.entityAssnsGuid" +
                 " = relaQual.referenceGuid"  +
                 " AND " +
                 " relaQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '" + RELA_QUAL_VALUE + "' )" +
                 
                 " INNER JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS auiSourceQual ON (" +
                 " eate.entityAssnsGuid" +
                 " = auiSourceQual.referenceGuid" +
                 " AND " +
                 " auiSourceQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '" + AUI_SOURCE_QUAL_VALUE + "' )" +
                 
                 " INNER JOIN " + this.getTableName(ENTITY_ASSOCIATION_TO_E_QUALS) +
                 " AS auiTargetQual ON (" +
                 " eate.entityAssnsGuid" +
                 " = auiTargetQual.referenceGuid" + 
                 " AND " +
                 " auiTargetQual." + SQLTableConstants.TBLCOL_QUALIFIERNAME +
                 " = '" + AUI_TARGET_QUAL_VALUE + "' )" +
 
                 " INNER JOIN " + this.getTableName(ENTITY_PROPERTY_MULTI_ATTRIBUTES) +
                 " AS sourceAuiPropQual ON ( " +
                 " sourceAuiPropQual.attributeValue" + 
                 " = " + auiCol + ".qualifierValue " +
                 " AND " +
                 " sourceAuiPropQual.attributeId = '" + AUI_QUAL_VALUE + "' )" +
                 
                 " INNER JOIN " + this.getTableName(ENTITY_PROPERTY) +
                 " AS entityProperty ON ( " +
                 " entityProperty.propertyGuid = sourceAuiPropQual.propertyGuid )" +
                 
                 " INNER JOIN " + this.getTableName(ENTITY_PROPERTY_MULTI_ATTRIBUTES) +
                 " AS sourceCodeQual ON ( " +
                 " sourceCodeQual.propertyGuid" + 
                 " = entityProperty.propertyGuid " +
                 " AND " +
                 " sourceCodeQual.attributeId = '" + SOURCE_CODE_QUAL_VALUE + "' )" +
    
	             " WHERE " +
	             targetCol  + " = ? " +   
	             " AND " +
	             targetCol + " != '" + ROOT + "' " +
	             " AND " +
	             targetCol + " != '" + TAIL + "' ";
		
				sb.append(sql);
		
				if(relations.size() > 0) {
					sb.append(" AND ( ");
				}
				for(int i=0;i<relations.size();i++){
					sb.append("ap.associationName = '" + relations.get(i) + "'");
					if(i == relations.size() -1 ){
						sb.append(" )");
					} else {
						sb.append(" OR ");
					}
				}
				
				if(source != null){
					sb.append(" AND " +
						"assocSourceQual." + SQLTableConstants.TBLCOL_QUALIFIERVALUE + " = '" + source + "'");
				}
				
				if(excludeSelfReferencing){
					sb.append(getExcludeSelfReferencingSql());
				}
				
				if(pageSize > 0){
					sb.append(" LIMIT " + pageSize);
					sb.append(" OFFSET " + start);
				}	
				
		return sb.toString();
	}
	
	private String getTableName(String tableName) {
		try {
			String version = 
				LexEvsServiceLocator.getInstance().getSystemResourceService().getInternalVersionStringForTag(CODING_SCHEME_NAME, null);
			String prefix = LexEvsServiceLocator.getInstance().
				getLexEvsDatabaseOperations().
					getPrefixResolver().
					resolvePrefixForCodingScheme(CODING_SCHEME_URI, version);
			return prefix + tableName;
		} catch (LBParameterException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Builds the association list.
	 * 
	 * @return the list< string>
	 * 
	 * @throws Exception the exception
	 */
	private List<String> buildAssociationList() throws Exception {
		return new ArrayList<String>(this.relReverseNames.keySet());
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getCount(java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction)
	 */
	public int getCount(String cui,
			List<String> relationships, Direction direction) throws LBException {
		return getCount(cui,
				relationships, direction,  true);
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getCount(java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction, boolean)
	 */
	public int getCount(String cui,
			List<String> relationships, Direction direction,  boolean excludeSelfReferencing) throws LBException {
		initExtension();

		String getRelationsSql = null;

		if(relationships == null){
			relationships = this.associations;
		}

		getRelationsSql =
			buildGetRelationshipsCountSql(direction, relationships, excludeSelfReferencing);


		return this.getJdbcTemplate().queryForObject(getRelationsSql, Integer.class, cui);
	}
	
	/**
	 * Gets the exclude self referencing sql.
	 * 
	 * @return the exclude self referencing sql
	 */
	private String getExcludeSelfReferencingSql(){
		StringBuffer sb = new StringBuffer();

		sb.append(
				" AND " +
				" targetEntityCode " +
				" != " +
				" sourceEntityCode ");
		
		return sb.toString();
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getCount(java.lang.String, java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction)
	 */
	public int getCount(String cui, String source,
			List<String> relationships, Direction direction) throws LBException {
		return getCount(cui, source,
				relationships, direction, true);
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getCount(java.lang.String, java.lang.String, java.util.List, org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction, boolean)
	 */
	public int getCount(String cui, String source,
			List<String> relationships, Direction direction, boolean excludeSelfReferencing) throws LBException {
		initExtension();

		String getRelationsSql = null;

		if(relationships == null){
			relationships = this.associations;
		}

		getRelationsSql =
			buildBySourceCountSql(source, direction, relationships, excludeSelfReferencing);

		return this.getJdbcTemplate().queryForObject(getRelationsSql, Integer.class, cui);
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getMaxToReturn()
	 */
	public int getMaxToReturn() throws LBException {
		initExtension();
		return this.maxToReturn;
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.LexBIG.Impl.Extensions.AbstractExtendable#buildExtensionDescription()
	 */
	@Override
	protected ExtensionDescription buildExtensionDescription() {
		ExtensionDescription ed = new ExtensionDescription();
		ed.setDescription("MetaBrowser Relationship Utility Extension");
		ed.setExtensionBaseClass(MetaBrowserService.class.getName());
		ed.setExtensionClass(MetaBrowserServiceImpl.class.getName());
		ed.setExtensionProvider(new Source("Mayo Clinic"));
		ed.setName("metabrowser-extension");
		ed.setVersion("1.0");
		return ed;
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getMetaNCINeighborhood(java.lang.String)
	 */
	@LgClientSideSafe 
	public MetaTree getMetaNCINeighborhood(String focus) throws LBException {
		return getMetaNeighborhood(focus, NCI_SOURCE);	
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getMetaNCINeighborhood()
	 */
	public MetaTree getMetaNCINeighborhood() throws LBException {
		sabRootNodeCache.put(NCI_SOURCE, NCI_ROOT);
		return getMetaNeighborhood(NCI_SOURCE);	
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getMetaNeighborhood(java.lang.String, java.lang.String)
	 */
	public MetaTree getMetaNeighborhood(String focus, String source) throws LBException {
		MetaBrowserService svc = this;
		return new  MetaTreeImpl(svc, focus, source);	
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getMetaNeighborhood(java.lang.String)
	 */
	public MetaTree getMetaNeighborhood(String source) throws LBException {
		MetaBrowserService svc = this;
		if(sabRootNodeCache.containsKey(source)){
			return new MetaTreeImpl(svc, sabRootNodeCache.get(source), source);
		} else {
			MetaTree tree = new MetaTreeImpl(svc, source);	
			sabRootNodeCache.put(source, tree.getCurrentFocus().getCui());
			return tree;
		}
	}

	@SuppressWarnings("unchecked")
	public List<SemanticTypeHolder> getSemanticType(final List<String> cuis)
	throws LBException {
		if(SemTypeCache.instance().isDone()){

			LoggerFactory.getLogger().info("Using Semantic Type cache");
			
			List<SemanticTypeHolder> returnList = new ArrayList<SemanticTypeHolder>();

			for (String cui : cuis) {
				String semanticType = SemTypeCache.instance().getSemanticType(cui);
				returnList.add(new SemanticTypeHolder(cui, semanticType));
			}

			return returnList;
		} else {
			LoggerFactory.getLogger().info("Semantic Type Cache not ready -- querying database.");

			return this.getJdbcTemplate().query(
					createSemanticTypeSelectSql(cuis.size()), 
					new PreparedStatementSetter(){

						public void setValues(PreparedStatement ps)
						throws SQLException {
							for(int i=0;i<cuis.size();i++){
								ps.setString(i+1, cuis.get(i));
							}
						}

					},SEMANTIC_TYPE_ROWMAPPER);
		}
	}

	private static class SemanticTypeRowMapper implements RowMapper, Serializable {

		private static final long serialVersionUID = 8190790713921725472L;
		
		private static final String SEM_TYPE_COLUMN = "semType";
		private static final String ENTITY_CODE_COLUMN = "code";

		public SemanticTypeHolder mapRow(ResultSet rs, int param)
			throws SQLException {
			return new SemanticTypeHolder(rs.getString(ENTITY_CODE_COLUMN), rs.getString(SEM_TYPE_COLUMN));
		}
	};

	private String createSemanticTypeSelectSql(int number){
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT entity.entityCode " + SemanticTypeRowMapper.ENTITY_CODE_COLUMN + ", GROUP_CONCAT(entityProperty.propertyValue SEPARATOR '" + SEMANTIC_TYPE_SEPARATOR + "') " + SemanticTypeRowMapper.SEM_TYPE_COLUMN);
		sb.append(" FROM " + this.getTableName(ENTITY) + " entity ");
		sb.append(" INNER JOIN " + this.getTableName(ENTITY_PROPERTY) + " entityProperty");
		sb.append(" ON (entity.entityGuid = entityProperty.referenceGuid)" );
		sb.append(" WHERE entity.entityCode IN (" );
		
		for(int i=0;i<number;i++){
			sb.append("?");
			if(i < number-1){
				sb.append(",");
			}
		}
		
		sb.append(")" );
		
		sb.append(" AND entityProperty.propertyName = '" + SEMANTIC_TYPES_PROPERTY + "'");
		
		sb.append(" GROUP BY " + SemanticTypeRowMapper.ENTITY_CODE_COLUMN);

		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#setLexBIGService(org.LexGrid.LexBIG.LexBIGService.LexBIGService)
	 */
	@LgClientSideSafe 
	public void setLexBIGService(LexBIGService lbs) throws LBException {
		this.lbs = lbs;	
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaBrowserService#getLexBIGService()
	 */
	@LgClientSideSafe 
	public LexBIGService getLexBIGService() throws LBException {
		if(lbs == null){
			lbs = LexBIGServiceImpl.defaultInstance();
		} 
		return lbs;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		if(this.jdbcTemplate == null) {
			this.jdbcTemplate = new JdbcTemplate(LexEvsServiceLocator.getInstance().getLexEvsDatabaseOperations().getDataSource());
		}
		return this.jdbcTemplate;
	}
	
	public static class SemTypeCache {
		private static SemTypeCache semTypeCache;
		
		private static String C_CODE = "10";
		private static String CL_CODE = "11";
		
		/** The rela reverse names. */
		private Map<Integer,String> semanticTypeIntToTypeMap = new HashMap<Integer,String>();
		
		private Map<Integer,Integer> semanticTypeCodeToIntMap = new HashMap<Integer,Integer>();
		
		private JdbcTemplate jdbcTemplate;
		private boolean isDone = false;
		
		private SemTypeCache(){
			this.jdbcTemplate = new JdbcTemplate(LexEvsServiceLocator.getInstance().getLexEvsDatabaseOperations().getDataSource());
			this.jdbcTemplate.setFetchSize(1000);
		}
		
		public static synchronized SemTypeCache instance(){
			if(semTypeCache == null){
				semTypeCache = new SemTypeCache();

				ExecutorService executor = Executors.newCachedThreadPool();

				executor.submit(new Callable<Void>(){
					
					public Void call() throws Exception {
						semTypeCache.populateCache();
						
						return null;
					}
				});
				
				executor.shutdown();
			}
			
			return semTypeCache;
		}
		
		protected void populateCache(){
			final Map<String,Integer> semTypeIntMap = new HashMap<String,Integer>();
			
			StringBuilder sb = new StringBuilder();
			sb.append(" SELECT entity.entityCode " + SemanticTypeRowMapper.ENTITY_CODE_COLUMN + ", GROUP_CONCAT(entityProperty.propertyValue SEPARATOR '" + SEMANTIC_TYPE_SEPARATOR + "') " + SemanticTypeRowMapper.SEM_TYPE_COLUMN);
			sb.append(" FROM " + getTableName(ENTITY) + " entity ");
			sb.append(" INNER JOIN " + getTableName(ENTITY_PROPERTY) + " entityProperty");
			sb.append(" ON (entity.entityGuid = entityProperty.referenceGuid)" );
			sb.append(" WHERE entityProperty.propertyName = '" + SEMANTIC_TYPES_PROPERTY + "'");
			sb.append(" GROUP BY " + SemanticTypeRowMapper.ENTITY_CODE_COLUMN);
			
			this.jdbcTemplate.query(sb.toString(), new RowCallbackHandler(){
				
				int semTypeCounter = 0;
				
				public void processRow(ResultSet rs) throws SQLException {
					String cui = rs.getString(SemanticTypeRowMapper.ENTITY_CODE_COLUMN );
					String semType = rs.getString(SemanticTypeRowMapper.SEM_TYPE_COLUMN);
					int semTypeInt;
					
					int cuiInt = cuiToInt(cui);
					
					if(! semTypeIntMap.containsKey(semType)){
						semTypeIntMap.put(semType, semTypeCounter);
						semTypeInt = semTypeCounter;
						
						semTypeCounter++;
					} else {
						semTypeInt = semTypeIntMap.get(semType);
					}
					
					semanticTypeCodeToIntMap.put(cuiInt, semTypeInt);

				}
				
			});
			
			for(Entry<String, Integer> entry : semTypeIntMap.entrySet()){
				semanticTypeIntToTypeMap.put(entry.getValue(), entry.getKey());
			}
			
			this.isDone = true;
		}
		
		private String getTableName(String tableName) {
			try {
				String version = 
					LexEvsServiceLocator.getInstance().getSystemResourceService().getInternalVersionStringForTag(CODING_SCHEME_NAME, null);
				String prefix = LexEvsServiceLocator.getInstance().
					getLexEvsDatabaseOperations().
						getPrefixResolver().
						resolvePrefixForCodingScheme(CODING_SCHEME_URI, version);
				return prefix + tableName;
			} catch (LBParameterException e) {
				throw new RuntimeException(e);
			}
		}
	
		public int cuiToInt(String cui){
			if(cui.startsWith("CL")){
				cui = cui.replaceFirst("CL", CL_CODE);
			} else {
				cui = cui.replaceFirst("C", C_CODE);
			}
			return Integer.valueOf(cui);
		}
		
		public String getSemanticType(String cui){
			int cuiInt = this.cuiToInt(cui);
			
			int semTypeInt = semanticTypeCodeToIntMap.get(cuiInt);
			
			return semanticTypeIntToTypeMap.get(semTypeInt);
		}
		
		public boolean isDone(){
			return this.isDone;
		}
	}

	@Override
	protected void doRegister(ExtensionRegistry registry,
			ExtensionDescription description) throws LBParameterException {
		// TODO Auto-generated method stub
		
	}
}
