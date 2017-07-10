package org.lexevs.dao.index.service.codingschemewithtype;

import java.net.URI;

import org.apache.lucene.search.Query;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypePropertyList;

public interface CodingSchemeWithTypeIndexService {
	
	public CodingSchemeWithTypePropertyList listCodingSchemeWithType();
	
	public void indexCodingSchemeWithType(
	    		String codingSchemeUri, 
	    		String codingSchemeVersion, 
	    		String codingSchemeName,
	    		boolean isCodingSchemeResolvedValueSet,
	    		URI codingSchemeLocation) throws Exception;
	
	public CodingSchemeWithTypePropertyList search(Query query);

	public void removeCodingSchemeWithType(
			String codingSchemeUri,
			String version);
}
