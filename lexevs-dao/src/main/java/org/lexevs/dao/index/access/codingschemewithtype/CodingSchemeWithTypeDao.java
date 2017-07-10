package org.lexevs.dao.index.access.codingschemewithtype;

import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.search.Query;

public interface CodingSchemeWithTypeDao {

	public CodingSchemeWithTypePropertyList search(Query query);
	
	public void removeCodingSchemeWithType(
			String codingSchemeUri,
			String codingSchemeVersion);
	
	public CodingSchemeWithTypePropertyList listCodingSchemeWithType(); 
	
	public void addDocuments(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName, 
			Boolean isCodingSchemeResolvedValueSet, List<Document> documents, Analyzer analyzer);
}
