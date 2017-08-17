package org.lexevs.dao.index.service.codingschemewithtype;

import java.net.URI;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.apache.lucene.search.Query;

public interface CodingSchemeWithTypeIndexService {
	
	public List<CodingSchemeSummary> listCodingSchemeWithType();
	
	public void indexCodingSchemeWithType(
	    		String codingSchemeUri, 
	    		String codingSchemeVersion, 
	    		String codingSchemeName,
	    		boolean isCodingSchemeResolvedValueSet,
	    		URI codingSchemeLocation) throws Exception;
	
	//public CodingSchemeWithTypePropertyList search(Query query);
	
	public List<CodingSchemeSummary> search(Query query);

	public void removeCodingSchemeWithType(
			String codingSchemeUri,
			String version);
}
