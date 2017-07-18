package org.lexevs.dao.index.access.codingschemewithtype;

import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.search.Query;

public interface CodingSchemeWithTypeDao {

	public List<CodingSchemeSummary> search(Query query);
	
	public void removeCodingSchemeWithType(
			String codingSchemeUri,
			String codingSchemeVersion);
	
	public List<CodingSchemeSummary> listCodingSchemeWithType(); 
	
	public void addDocuments(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName, 
			Boolean isCodingSchemeResolvedValueSet, List<Document> documents, Analyzer analyzer);
}
