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
package org.LexGrid.lexevs.metabrowser;


import java.util.List;
import java.util.Map;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Extensions.Generic.GenericExtension;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.lexevs.metabrowser.model.BySourceTabResults;
import org.LexGrid.lexevs.metabrowser.model.RelationshipTabResults;
import org.LexGrid.lexevs.metabrowser.model.SemanticTypeHolder;

/**
 * The Interface MetaBrowserService.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public interface MetaBrowserService extends GenericExtension {
	
	/**
	 * The Enum Direction.
	 * 
	 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
	 */
	public enum Direction {SOURCEOF, TARGETOF};

	/**
	 * Gets the by source tab display.
	 * 
	 * @param cui the cui
	 * @param source the source
	 * @param relations the relations
	 * @param direction the direction
	 * 
	 * @return the by source tab display
	 * 
	 * @throws LBException the LB exception
	 */
	public Map<String, List<BySourceTabResults>> getBySourceTabDisplay(String cui, String source, List<String> relations, Direction direction) throws LBException;
	
	/**
	 * Gets the by source tab display.
	 * 
	 * @param cui the cui
	 * @param source the source
	 * @param relations the relations
	 * @param direction the direction
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the by source tab display
	 * 
	 * @throws LBException the LB exception
	 */
	public Map<String, List<BySourceTabResults>> getBySourceTabDisplay(String cui, String source, List<String> relations, Direction direction, boolean excludeSelfReferencing) throws LBException;
	
	/**
	 * Gets the by source tab display.
	 * 
	 * @param cui the cui
	 * @param source the source
	 * @param relations the relations
	 * @param direction the direction
	 * @param excludeSelfReferencing the exclude self referencing
	 * @param start the start
	 * @param pageSize the page size
	 * 
	 * @return the by source tab display
	 * 
	 * @throws LBException the LB exception
	 */
	public Map<String, List<BySourceTabResults>> getBySourceTabDisplay(
			String cui, 
			String source, 
			List<String> relations, 
			Direction direction, 
			boolean excludeSelfReferencing, 
			int start, 
			int pageSize) throws LBException;
	
	/**
	 * Gets the relationships display.
	 * 
	 * @param cui the cui
	 * @param relations the relations
	 * @param direction the direction
	 * 
	 * @return the relationships display
	 * 
	 * @throws LBException the LB exception
	 */
	public Map<String, List<RelationshipTabResults>> getRelationshipsDisplay(String cui, List<String> relations, Direction direction) throws LBException;
	
	/**
	 * Gets the relationships display.
	 * 
	 * @param cui the cui
	 * @param relations the relations
	 * @param direction the direction
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the relationships display
	 * 
	 * @throws LBException the LB exception
	 */
	public Map<String, List<RelationshipTabResults>> getRelationshipsDisplay(String cui, List<String> relations, Direction direction, boolean excludeSelfReferencing) throws LBException;
	
	/**
	 * Gets the count.
	 * 
	 * @param cui the cui
	 * @param relations the relations
	 * @param direction the direction
	 * 
	 * @return the count
	 * 
	 * @throws LBException the LB exception
	 */
	public int getCount(String cui, List<String> relations, Direction direction) throws LBException;
	
	/**
	 * Gets the count.
	 * 
	 * @param cui the cui
	 * @param relations the relations
	 * @param direction the direction
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the count
	 * 
	 * @throws LBException the LB exception
	 */
	public int getCount(String cui, List<String> relations, Direction direction, boolean excludeSelfReferencing) throws LBException;
	
	/**
	 * Gets the count.
	 * 
	 * @param cui the cui
	 * @param source the source
	 * @param relations the relations
	 * @param direction the direction
	 * 
	 * @return the count
	 * 
	 * @throws LBException the LB exception
	 */
	public int getCount(String cui, String source, List<String> relations, Direction direction) throws LBException;

	/**
	 * Gets the count.
	 * 
	 * @param cui the cui
	 * @param source the source
	 * @param relations the relations
	 * @param direction the direction
	 * @param excludeSelfReferencing the exclude self referencing
	 * 
	 * @return the count
	 * 
	 * @throws LBException the LB exception
	 */
	public int getCount(String cui, String source, List<String> relations, Direction direction, boolean excludeSelfReferencing) throws LBException;
	
	/**
	 * Gets the max to return.
	 * 
	 * @return the max to return
	 * 
	 * @throws LBException the LB exception
	 */
	public int getMaxToReturn() throws LBException;
	
	/**
	 * Sets the lex big service.
	 * 
	 * @param lbs the new lex big service
	 * 
	 * @throws LBException the LB exception
	 */
	public void setLexBIGService(LexBIGService lbs) throws LBException;
	
	/**
	 * Gets the lex big service.
	 * 
	 * @return the lex big service
	 * 
	 * @throws LBException the LB exception
	 */
	public LexBIGService getLexBIGService() throws LBException;
	
	/**
	 * Gets the meta NCI neighborhood, focused on a given CUI
	 * 
	 * @param focus the focus CUI
	 * 
	 * @return the meta nci neighborhood
	 * 
	 * @throws LBException the LB exception
	 */
	public MetaTree getMetaNCINeighborhood(String focus) throws LBException;
	
	/**
	 * Gets the meta nci neighborhood, starting with the root (This will usually be the 'V-SAB' concept).
	 * 
	 * @return the meta nci neighborhood
	 * 
	 * @throws LBException the LB exception
	 */
	public MetaTree getMetaNCINeighborhood() throws LBException;

	/**
	 * Gets the meta neighborhood of a given Source SAB, focused on a focus CUI.
	 * 
	 * @param focus the focus The focus CUI
	 * @param source the source The source SAB
	 * 
	 * @return the meta neighborhood
	 * 
	 * @throws LBException the LB exception
	 */
	public MetaTree getMetaNeighborhood(String focus, String source) throws LBException;
	
	/**
	 * Gets the meta neighborhood of a given Source SAB, starting with the root (This will usually be the 'V-SAB' concept).
	 * 
	 * @param source the source The Source SAB
	 * 
	 * @return the meta neighborhood
	 * 
	 * @throws LBException the LB exception
	 */
	public MetaTree getMetaNeighborhood(String source) throws LBException;
	
	/**
	 * Gets the semantic type given a set of cuis.
	 *
	 * @param cui the cui
	 * @return the semantic type
	 * @throws LBException the LB exception
	 */
	public List<SemanticTypeHolder> getSemanticType(List<String> cui) throws LBException;
}
