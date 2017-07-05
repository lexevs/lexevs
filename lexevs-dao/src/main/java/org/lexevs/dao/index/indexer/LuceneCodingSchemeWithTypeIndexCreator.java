package org.lexevs.dao.index.indexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
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
	
	@SuppressWarnings("unchecked")
    private List<org.apache.lucene.document.Document> loadContent(
    		String codingSchemeUri,
			String codingSchemeVersion, 
			String codingSchemeName,
			Boolean isCodingSchemeResolvedValueSet,
			URI codingSchemeLocation) throws Exception {
		
    	List<org.apache.lucene.document.Document> returnList = new ArrayList<org.apache.lucene.document.Document>();
    	
    	BufferedReader reader = null;
        if (codingSchemeLocation.getScheme().equals("file")) {
            reader = new BufferedReader(new FileReader(new File(codingSchemeLocation)));
        } else {
            reader = new BufferedReader(new InputStreamReader(codingSchemeLocation.toURL().openConnection()
                    .getInputStream()));
        }

        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(reader);

        Element root = document.getRootElement();

        ArrayList<String> parentPath = new ArrayList<String>();

        String name = root.getName();
        String value = root.getTextTrim();
        parentPath.add(name);

        if (value != null && value.length() > 0) {
        	returnList.add(baseCodingSchemeWithTypeLoader.addProperty(
        			codingSchemeUri, 
        			codingSchemeVersion, 
        			codingSchemeName, 
        			isCodingSchemeResolvedValueSet));
        }

        returnList.addAll(processAttributes(
        		codingSchemeUri,
    			codingSchemeVersion,
    			codingSchemeName,
    			isCodingSchemeResolvedValueSet,
    			root.getAttributes()));
//        returnList.addAll(processChildren(
//        		codingSchemeUri,
//    			codingSchemeVersion,
//    			parentPath, 
//    			root.getChildren()));
        
        return returnList;
    }

	private List<org.apache.lucene.document.Document> processAttributes(String codingSchemeUri,
			String codingSchemeVersion, String codingSchemeName, 
			boolean isCodingSchemeResolvedValueSet,List<Attribute> attributeList) throws Exception {
		
    	List<org.apache.lucene.document.Document> returnList = new ArrayList<org.apache.lucene.document.Document>();
    	
//    	for (Iterator<Attribute> attIter = attributeList.iterator(); attIter.hasNext();) {
//            Attribute currentAttribute = (Attribute) attIter.next();

//            String name = currentAttribute.getName();
//            String value = currentAttribute.getValue();
            
            returnList.add(baseCodingSchemeWithTypeLoader.addProperty(
            		codingSchemeUri,
            		codingSchemeVersion, 
            		codingSchemeName, 
            		isCodingSchemeResolvedValueSet));
//        }
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
