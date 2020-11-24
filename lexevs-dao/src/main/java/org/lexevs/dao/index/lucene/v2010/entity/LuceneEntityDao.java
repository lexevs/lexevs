
package org.lexevs.dao.index.lucene.v2010.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.Utility.logging.LgLoggerIF;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Filter;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.lexevs.dao.database.utility.DaoUtility;
import org.lexevs.dao.index.access.entity.EntityDao;
import org.lexevs.dao.index.lucene.AbstractBaseLuceneIndexTemplateDao;
import org.lexevs.dao.index.lucenesupport.LuceneDirectoryFactory.NamedDirectory;
import org.lexevs.dao.index.lucenesupport.LuceneIndexTemplate;
import org.lexevs.dao.index.lucenesupport.MultiBaseLuceneIndexTemplate;
import org.lexevs.dao.index.version.LexEvsIndexFormatVersion;
import org.lexevs.dao.indexer.utility.CodingSchemeMetaData;
import org.lexevs.dao.indexer.utility.ConcurrentMetaData;
import org.lexevs.logging.LoggerFactory;

/**
 * The Class LuceneEntityDao.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class LuceneEntityDao extends AbstractBaseLuceneIndexTemplateDao implements EntityDao {
	
	public enum BitSetOp {AND, OR};
	
	/** The supported index version2010. */
	public static LexEvsIndexFormatVersion supportedIndexVersion2010 = LexEvsIndexFormatVersion.parseStringToVersion("2010");

	//This is wired to a multi index template in spring but many of the services 
	// created in this class are run through single index templates pulled from the 
	// metadata structure that tracks templates associated with index directories
	private LuceneIndexTemplate luceneIndexTemplate;
	
	private static LgLoggerIF logger = LoggerFactory.getLogger();

	@Override
	public void addDocuments(String codingSchemeUri, String version,
			List<Document> documents, Analyzer analyzer) {
		getLuceneIndexTemplate(codingSchemeUri, version).addDocuments(documents, analyzer);
	}

	@Override
	public void deleteDocuments(String codingSchemeUri, String version,
			Query query) {
		getLuceneIndexTemplate(codingSchemeUri, version).removeDocuments(query);
	}

	@Override
	public void deleteDocuments(String codingSchemeUri, String version,
			Term term) {
		getLuceneIndexTemplate(codingSchemeUri, version).removeDocuments(term);
	}

	
	@Override
	public String getIndexName(String codingSchemeUri, String version) {
		return getLuceneIndexTemplate(codingSchemeUri, version).getIndexName();
	}

	public List<ScoreDoc> query(String codingSchemeUri, String version, Query query) {

		try {
			LuceneIndexTemplate template = getLuceneIndexTemplate(codingSchemeUri, version);

			Filter codingSchemeFilter = null;

			int maxDoc = template.getMaxDoc();
			
			if (maxDoc == 0) {
				String errorMsg = "Index does not exist for coding scheme URI " + codingSchemeUri + " and version " + version;
			    logger.error(errorMsg);
			    throw new RuntimeException(errorMsg);
			}
			
			TopScoreDocCollector hitCollector = TopScoreDocCollector.create(maxDoc);
			template.search(query, codingSchemeFilter, hitCollector);
			ScoreDoc[] arrayDocs = hitCollector.topDocs().scoreDocs;
			List<ScoreDoc> docs = new ArrayList<ScoreDoc>(Arrays.asList(arrayDocs));
			return docs;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<ScoreDoc> query(List<AbsoluteCodingSchemeVersionReference> codingSchemes, BooleanQuery query) {
		try {
			//Gets the MultScheme template instead of the single scheme template
			LuceneIndexTemplate template = this.getLuceneIndexTemplate(codingSchemes);			
			int maxDoc = template.getMaxDoc();
			
			if (maxDoc == 0) {
				String errorMsg = "Index does not exist: " + template.getIndexName();
			    logger.error(errorMsg);
			    throw new RuntimeException(errorMsg);
			}
			
			TopScoreDocCollector hitCollector = TopScoreDocCollector.create(maxDoc);
			template.search(query, null, hitCollector);
			return Arrays.asList(hitCollector.topDocs().scoreDocs);
		} catch (Exception e) {
			throw new RuntimeException("Problems getting results from a potential multischeme query.", e);
		}
	}
	
	@Override
	public Document getDocumentById(String codingSchemeUri, String version,
			int id) {
		return getDocumentById(codingSchemeUri, version, id, null);
	}
	
	@Override
	public Document getDocumentById(String codingSchemeUri, String version,
			int id, Set<String> fields) {
		//TODO redo with a Set<String> field
		return getLuceneIndexTemplate(codingSchemeUri, version).getDocumentById(id, fields);
	}


	/* (non-Javadoc)
	 * @see org.lexevs.dao.index.access.AbstractBaseIndexDao#doGetSupportedLexEvsIndexFormatVersions()
	 */
	@Override
	public List<LexEvsIndexFormatVersion> doGetSupportedLexEvsIndexFormatVersions() {
		return DaoUtility.createList(
				LexEvsIndexFormatVersion.class, 
				supportedIndexVersion2010);
	}
	
	
	protected LuceneIndexTemplate getLuceneIndexTemplate(
		String codingSchemeUri, String version) {
		// TODO New Lucene will not support or be compatible with older versions.
		
		return this.getIndexRegistry().getLuceneIndexTemplate(codingSchemeUri, version);
	}

	public LuceneIndexTemplate getLuceneIndexTemplate() {
		return luceneIndexTemplate;
	}

	public void setLuceneIndexTemplate(LuceneIndexTemplate luceneIndexTemplate) {
		this.luceneIndexTemplate = luceneIndexTemplate;
	}

    private LuceneIndexTemplate getLuceneIndexTemplate(
            List<AbsoluteCodingSchemeVersionReference> codingSchemes) {
        List<NamedDirectory> directories = getNamedDirectoriesForCodingSchemes(codingSchemes);
        return new MultiBaseLuceneIndexTemplate(directories);
    }

	private List<NamedDirectory> getNamedDirectoriesForCodingSchemes(
			List<AbsoluteCodingSchemeVersionReference> codingSchemes) {
	    List<NamedDirectory> directories = new ArrayList<NamedDirectory>();
		ConcurrentMetaData metadata = ConcurrentMetaData.getInstance();
		for(CodingSchemeMetaData csmd: metadata.getCodingSchemeList()){
		    for(AbsoluteCodingSchemeVersionReference ref : codingSchemes){
		    if(csmd.getCodingSchemeUri().equals(ref.getCodingSchemeURN()) && 
		            csmd.getCodingSchemeVersion().equals(ref.getCodingSchemeVersion())){
		    directories.add(csmd.getDirectory());}
		    }
		}
		return directories;
	}

}