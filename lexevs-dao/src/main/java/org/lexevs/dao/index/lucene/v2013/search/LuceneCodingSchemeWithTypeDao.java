package org.lexevs.dao.index.lucene.v2013.search;

import java.util.ArrayList;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Fields;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.MultiFields;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.Terms;
import org.apache.lucene.index.TermsEnum;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.util.BytesRef;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypeDao;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypePropertyList;
import org.lexevs.dao.index.codingschemewithType.BaseCodingSchemeWithTypeLoader;
import org.lexevs.dao.index.lucenesupport.BaseLuceneIndexTemplate.IndexReaderCallback;
import org.lexevs.dao.index.lucenesupport.LuceneIndexTemplate;

public class LuceneCodingSchemeWithTypeDao implements CodingSchemeWithTypeDao {

	private BaseCodingSchemeWithTypeLoader baseCodingSchemeWithTypeLoader;
	private LuceneIndexTemplate luceneIndexTemplate;
	
	@Override
	public List<CodingSchemeSummary> search(Query query) {
		
		List<ScoreDoc> docs = this.luceneIndexTemplate.search(query, null);
		CodingSchemeWithTypePropertyList codingSchemeWithTypePropertyList = new CodingSchemeWithTypePropertyList();
		List<CodingSchemeSummary> cssList = new ArrayList<CodingSchemeSummary>();

        // assemble the result object
        for (ScoreDoc doc : docs) {
       	 	Document d = luceneIndexTemplate.getDocumentById(doc.doc);
       	 
       	 	CodingSchemeWithType curr = new CodingSchemeWithType();
       	    CodingSchemeSummary css = new CodingSchemeSummary();
       	    css.setCodingSchemeURI(d.get("codingSchemeUri"));
       	 	css.setFormalName(d.get("codingSchemeRegisteredName"));
       	 	css.setRepresentsVersion(d.get("codingSchemeVersion"));
       	 	
       	 	cssList.add(css);
       	 	
            curr.setCodingSchemeURI(d.get("codingSchemeUri"));
            curr.setFormalName(d.get("codingSchemeRegisteredName"));
            curr.setRepresentsVersion(d.get("codingSchemeVersion"));
            curr.setCodingSchemeIsResolvedValueSet(new Boolean(d.get("codingSchemeIsResolvedValueSet")));
            
            codingSchemeWithTypePropertyList.addCodingSchemeWithType(curr);
        }
        
        return cssList;
	}

	@Override
	public void removeCodingSchemeWithType(String codingSchemeUri, String codingSchemeVersion) {
		this.luceneIndexTemplate.removeDocuments(
				new Term("codingSchemeNameAndVersion",
						codingSchemeUri	+ BaseCodingSchemeWithTypeLoader.CONCATINATED_VALUE_SPLIT_TOKEN + codingSchemeVersion));
	}

	@Override
	public List<CodingSchemeSummary> listCodingSchemeWithType() {
		List<CodingSchemeSummary> cssList = new ArrayList<CodingSchemeSummary>();
		
		try {
			final TermsEnum te = luceneIndexTemplate.executeInIndexReader(new IndexReaderCallback<TermsEnum>() {

				@Override
				public TermsEnum doInIndexReader(IndexReader indexReader) throws Exception {
					TermsEnum termsEnum = null;
					Fields fields = MultiFields.getFields(indexReader);
					if (fields != null) {
						Terms terms = fields.terms("codingSchemeNameAndVersion");
						if (terms != null) {
							termsEnum = terms.iterator();
						}
					}

					return termsEnum;
				}
			});

			// TODO see Multifield for a better implementation of this.
			BytesRef text = null;
			while ((te != null) && (text = te.next()) != null) {
				Query temp = new TermQuery(new Term("codingSchemeNameAndVersion", text.utf8ToString()));

				List<ScoreDoc> d = this.luceneIndexTemplate.search(temp, null);
				if (d.size() > 0) {

					ScoreDoc doc = d.get(0);
					CodingSchemeSummary css = new CodingSchemeSummary();

					Document document = luceneIndexTemplate.getDocumentById(doc.doc);
					
					css.setCodingSchemeURI(document.get("codingSchemeUri"));
					css.setRepresentsVersion(document.get("codingSchemeVersion"));
					css.setFormalName(document.get("codingSchemeRegisteredName"));
					
					cssList.add(css);
				}
			}
			return cssList;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void addDocuments(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName,
			Boolean isCodingSchemeResolvedValueSet, List<Document> documents, Analyzer analyzer) {
		this.luceneIndexTemplate.addDocuments(documents, analyzer);	
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
