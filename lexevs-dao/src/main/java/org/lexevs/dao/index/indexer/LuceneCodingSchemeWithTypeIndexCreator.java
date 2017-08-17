package org.lexevs.dao.index.indexer;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.lexevs.dao.index.access.IndexDaoManager;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypeDao;
import org.lexevs.dao.index.codingschemewithType.BaseCodingSchemeWithTypeLoader;

public class LuceneCodingSchemeWithTypeIndexCreator implements CodingSchemeWithTypeIndexCreator {

	private BaseCodingSchemeWithTypeLoader baseCodingSchemeWithTypeLoader;
	private IndexDaoManager indexDaoManager;
	
	@Override
	public void indexCodingSchemeWithType(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName,
			boolean isCodingSchemeResolvedValueSet, URI codingSchemeLocation) throws Exception {
		
		CodingSchemeWithTypeDao codingSchemeWithTypeDao = indexDaoManager.getCodingSchemeWithTypeDao();
		
		List<org.apache.lucene.document.Document> documents = this.loadContent(
				codingSchemeUri,
				codingSchemeVersion,
				codingSchemeName,
				isCodingSchemeResolvedValueSet,
				codingSchemeLocation);
		
		codingSchemeWithTypeDao.
			addDocuments(
					codingSchemeUri, 
					codingSchemeVersion, 
					codingSchemeName,
					isCodingSchemeResolvedValueSet,
					documents, 
					BaseCodingSchemeWithTypeLoader.getCodingSchemeWithTypeAnalyzer());
	}
	
    private List<org.apache.lucene.document.Document> loadContent(
    		String codingSchemeUri,
			String codingSchemeVersion, 
			String codingSchemeName,
			Boolean isCodingSchemeResolvedValueSet,
			URI codingSchemeLocation) throws Exception {
		
    	List<org.apache.lucene.document.Document> returnList = new ArrayList<org.apache.lucene.document.Document>();

        returnList.addAll(processAttributes(
        		codingSchemeUri,
    			codingSchemeVersion,
    			codingSchemeName,
    			isCodingSchemeResolvedValueSet));

        return returnList;
    }

	private List<org.apache.lucene.document.Document> processAttributes(String codingSchemeUri,
			String codingSchemeVersion, String codingSchemeName, 
			boolean isCodingSchemeResolvedValueSet) throws Exception {
		
    	List<org.apache.lucene.document.Document> returnList = new ArrayList<org.apache.lucene.document.Document>();
    	
        returnList.add(baseCodingSchemeWithTypeLoader.addProperty(
    		codingSchemeUri,
    		codingSchemeVersion, 
    		codingSchemeName, 
    		isCodingSchemeResolvedValueSet));
        
    	return returnList;
    }

	public BaseCodingSchemeWithTypeLoader getBaseCodingSchemeWithTypeLoader() {
		return baseCodingSchemeWithTypeLoader;
	}

	public void setBaseCodingSchemeWithTypeLoader(BaseCodingSchemeWithTypeLoader baseCodingSchemeWithTypeLoader) {
		this.baseCodingSchemeWithTypeLoader = baseCodingSchemeWithTypeLoader;
	}

	public IndexDaoManager getIndexDaoManager() {
		return indexDaoManager;
	}

	public void setIndexDaoManager(IndexDaoManager indexDaoManager) {
		this.indexDaoManager = indexDaoManager;
	}

}
