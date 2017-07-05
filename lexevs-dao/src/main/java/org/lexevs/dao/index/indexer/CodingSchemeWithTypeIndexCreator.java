package org.lexevs.dao.index.indexer;

import java.net.URI;

/**
 * The Interface CodingSchemeWithTypeIndexCreator.
 * 
 */
public interface CodingSchemeWithTypeIndexCreator {
	
	 public void indexCodingSchemeWithType(
	    		String codingSchemeUri, 
	    		String codingSchemeVersion, 
	    		String codingSchemeName,
	    		boolean isCodingSchemeResolvedValueSet,
	    		URI codingSchemeLocation) throws Exception;
}
