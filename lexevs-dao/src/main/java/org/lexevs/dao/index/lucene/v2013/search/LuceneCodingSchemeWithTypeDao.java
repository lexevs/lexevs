package org.lexevs.dao.index.lucene.v2013.search;

import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.search.Query;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypeDao;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypeList;
import org.lexevs.dao.index.codingschemewithType.BaseCodingSchemeWithTypeLoader;
import org.lexevs.dao.index.lucenesupport.LuceneIndexTemplate;

public class LuceneCodingSchemeWithTypeDao implements CodingSchemeWithTypeDao {

	private BaseCodingSchemeWithTypeLoader baseCodingSchemeWithTypeLoader;
	private LuceneIndexTemplate luceneIndexTemplate;
	

	@Override
	public CodingSchemeWithTypeList search(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCodingSchemeWithType(String codingSchemeUri, String codingSchemeVersion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CodingSchemeWithTypeList listCodingSchemeWithType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDocuments(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName,
			Boolean isCodingSchemeResolvedValueSet, List<Document> documents, Analyzer analyzer) {
		// TODO Auto-generated method stub
		
	}
	
	public BaseCodingSchemeWithTypeLoader getBaseCodingSchemeWithTypeLoader() {
		return baseCodingSchemeWithTypeLoader;
	}

	public void setBaseCodingSchemeWithTypeLoader(BaseCodingSchemeWithTypeLoader baseCodingSchemeWithTypeLoader) {
		this.baseCodingSchemeWithTypeLoader = baseCodingSchemeWithTypeLoader;
	}

	public LuceneIndexTemplate getLuceneIndexTemplate() {
		return luceneIndexTemplate;
	}

	public void setLuceneIndexTemplate(LuceneIndexTemplate luceneIndexTemplate) {
		this.luceneIndexTemplate = luceneIndexTemplate;
	}
}
