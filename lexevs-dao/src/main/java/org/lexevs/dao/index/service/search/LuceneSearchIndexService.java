
package org.lexevs.dao.index.service.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.concepts.Entity;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Filter;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
//import org.compass.core.lucene.support.ChainedFilter;
import org.lexevs.dao.database.utility.DaoUtility;
import org.lexevs.dao.index.access.IndexDaoManager;
import org.lexevs.dao.index.indexer.EntityIndexer;
import org.lexevs.dao.index.indexer.IndexCreator;
import org.lexevs.dao.index.indexer.IndexCreator.IndexOption;
import org.lexevs.dao.index.indexer.LuceneLoaderCode;
import org.lexevs.system.model.LocalCodingScheme;
import org.lexevs.system.service.SystemResourceService;

/**
 * The Class LuceneEntityIndexService.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class LuceneSearchIndexService implements SearchIndexService {
	
	/** The index dao manager. */
	private IndexDaoManager indexDaoManager;

	/** The index creator. */
	private EntityIndexer entityIndexer;
	
	private IndexCreator indexCreator;
	
	private SystemResourceService systemResourceService;
	

	public void deleteEntityFromIndex(
			String codingSchemeUri,
			String codingSchemeVersion, 
			Entity entity) {

		Term term = new Term(
					LuceneLoaderCode.CODING_SCHEME_URI_VERSION_CODE_NAMESPACE_KEY_FIELD, 
					LuceneLoaderCode.
						createCodingSchemeUriVersionCodeNamespaceKey(
							codingSchemeUri, 
							codingSchemeVersion, 
							entity.getEntityCode(), 
							entity.getEntityCodeNamespace()));
		
		indexDaoManager.getSearchDao().
			deleteDocuments(codingSchemeUri, codingSchemeVersion, new TermQuery(term));
	}
	
	@Override
	public void addEntityToIndex(
			String codingSchemeUri,
			String codingSchemeVersion, 
			Entity entity) {

		List<Document> docs = 
			entityIndexer.indexEntity(codingSchemeUri, codingSchemeVersion, entity);
		
		indexDaoManager.getSearchDao().
			addDocuments(codingSchemeUri, codingSchemeVersion, docs, entityIndexer.getAnalyzer());
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.index.service.entity.EntityIndexService#updateIndexForEntity(java.lang.String, java.lang.String, org.LexGrid.concepts.Entity)
	 */
	public void updateIndexForEntity(
			String codingSchemeUri,
			String codingSchemeVersion,
			Entity entity) {
		
		this.deleteEntityFromIndex(codingSchemeUri, codingSchemeVersion, entity);
		this.addEntityToIndex(codingSchemeUri, codingSchemeVersion, entity);
	}
	
	/**
	 * Sets the index dao manager.
	 * 
	 * @param indexDaoManager the new index dao manager
	 */
	public void setIndexDaoManager(IndexDaoManager indexDaoManager) {
		this.indexDaoManager = indexDaoManager;
	}

	/**
	 * Gets the index dao manager.
	 * 
	 * @return the index dao manager
	 */
	public IndexDaoManager getIndexDaoManager() {
		return indexDaoManager;
	}


	/* (non-Javadoc)
	 * @see org.lexevs.dao.index.service.entity.EntityIndexService#dropIndex(org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference)
	 */
	public void dropIndex(AbsoluteCodingSchemeVersionReference reference) {
		String codingSchemeUri = reference.getCodingSchemeURN();
		String codingSchemeVersion = reference.getCodingSchemeVersion();
		
		Term term = new Term(
			LuceneLoaderCode.CODING_SCHEME_URI_VERSION_KEY_FIELD,
			LuceneLoaderCode.createCodingSchemeUriVersionKey(
					codingSchemeUri, codingSchemeVersion));
		
		indexDaoManager.getSearchDao().
			deleteDocuments(
				codingSchemeUri, 
				codingSchemeVersion, 
				new TermQuery(term));
	}

	@Override
	public boolean doesIndexExist(AbsoluteCodingSchemeVersionReference reference) {
		
		//TODO implement with concurrent metadata
		return false;
	}


	@Override
	public Analyzer getAnalyzer() {
		return this.entityIndexer.getAnalyzer();
	}

	@Override
	public List<ScoreDoc> query(
			Set<AbsoluteCodingSchemeVersionReference> codeSystemsToInclude,
			final Query query) {

		List<AbsoluteCodingSchemeVersionReference> codingSchemes = new ArrayList<AbsoluteCodingSchemeVersionReference>();
		codingSchemes.addAll(codeSystemsToInclude);
		return this.indexDaoManager.getCommonEntityDao(codingSchemes).query(query);
	}
	
	protected String getCodingSchemeKey(AbsoluteCodingSchemeVersionReference reference) {
		try {
			String codingSchemeName =
				systemResourceService.getInternalCodingSchemeNameForUserCodingSchemeName(
						reference.getCodingSchemeURN(), 
						reference.getCodingSchemeVersion());
			
			return this.getCodingSchemeKey(codingSchemeName, reference.getCodingSchemeVersion());
		} catch (LBParameterException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected Query getCodingSchemeMatchQuery(AbsoluteCodingSchemeVersionReference codingScheme) {
		String codingSchemeUri = codingScheme.getCodingSchemeURN();
		String codingSchemeVersion = codingScheme.getCodingSchemeVersion();

		return new TermQuery(new Term(
					LuceneLoaderCode.CODING_SCHEME_URI_VERSION_KEY_FIELD,
					LuceneLoaderCode.createCodingSchemeUriVersionKey(
							codingSchemeUri, codingSchemeVersion)));
	}
	
	@Override
	public void createIndex(AbsoluteCodingSchemeVersionReference ref) {
		indexCreator.index(ref, IndexOption.SEARCH);
	}
	
	protected String getFilterMapKey(String codingSchemeUri, String codingSchemeVersion) {
		return DaoUtility.createKey(codingSchemeUri, codingSchemeVersion);
	}
	
	protected String getCodingSchemeKey(String codingSchemeName, String version) {
		LocalCodingScheme lcs = LocalCodingScheme.getLocalCodingScheme(codingSchemeName, version);
			
		return lcs.getKey();
	}

	public Document getById(int id){
		return this.indexDaoManager.getSearchDao().getById(id);
	}

	@Override
	public Document getById(Set<AbsoluteCodingSchemeVersionReference> codeSystemsToInclude,
			int doc) {
		return this.indexDaoManager.getSearchDao().getById(codeSystemsToInclude, doc);
	}

	public SystemResourceService getSystemResourceService() {
		return systemResourceService;
	}

	public void setSystemResourceService(SystemResourceService systemResourceService) {
		this.systemResourceService = systemResourceService;
	}

	public void setEntityIndexer(EntityIndexer entityIndexer) {
		this.entityIndexer = entityIndexer;
	}

	public EntityIndexer getEntityIndexer() {
		return entityIndexer;
	}

	public IndexCreator getIndexCreator() {
		return indexCreator;
	}

	public void setIndexCreator(IndexCreator indexCreator) {
		this.indexCreator = indexCreator;
	}
}