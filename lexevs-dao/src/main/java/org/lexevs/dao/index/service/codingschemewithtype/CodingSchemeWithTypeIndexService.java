package org.lexevs.dao.index.service.codingschemewithtype;

import java.net.URI;

import org.apache.lucene.search.Query;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypeList;

public interface CodingSchemeWithTypeIndexService {
	
	public CodingSchemeWithTypeList listCodingSchemeWithType();
	
	public void indexCodingSchemeWithType(
	    		String codingSchemeUri, 
	    		String codingSchemeVersion, 
	    		String codingSchemeName,
	    		boolean isCodingSchemeResolvedValueSet,
	    		URI codingSchemeLocation) throws Exception;
	
	public CodingSchemeWithTypeList search(Query query);

	public void removeCodingSchemeWithType(
			String codingSchemeUri,
			String version);
}
