package org.lexevs.dao.index.lucenesupport;

import java.util.List;
import java.util.Set;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.StoredFieldVisitor;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Collector;
import org.apache.lucene.search.DocIdSet;
import org.apache.lucene.search.Filter;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.lexevs.dao.index.lucenesupport.BaseLuceneIndexTemplate.IndexReaderCallback;
import org.lexevs.dao.index.lucenesupport.BaseLuceneIndexTemplate.IndexSearcherCallback;
import org.lexevs.dao.index.lucenesupport.BaseLuceneIndexTemplate.IndexWriterCallback;

public class CodingSchemeWithTypeIndexTemplate implements LuceneIndexTemplate {

	@Override
	public void addDocuments(List<Document> documents, Analyzer analyzer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDocuments(Term term) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDocuments(Query query) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(Query query, Filter filter, Collector Collector) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMaxDoc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Document getDocumentById(int id, StoredFieldVisitor fieldSelector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document getDocumentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocIdSet getDocIdSet(Filter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIndexName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T executeInIndexReader(IndexReaderCallback<T> callback) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T executeInIndexSearcher(IndexSearcherCallback<T> callback) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T executeInIndexWriter(IndexWriterCallback<T> callback) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScoreDoc> search(Query query, Filter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query getCombinedQueryFromSchemes(List<AbsoluteCodingSchemeVersionReference> codingSchemes,
			BooleanQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document getDocumentById(int id, Set<String> fields) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void blockJoinSearch(Query query, Filter codingSchemeFilter, TopScoreDocCollector hitCollector) {
		// TODO Auto-generated method stub

	}

}
