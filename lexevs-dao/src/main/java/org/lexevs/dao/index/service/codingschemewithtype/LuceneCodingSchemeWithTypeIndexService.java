package org.lexevs.dao.index.service.codingschemewithtype;

import java.net.URI;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.apache.lucene.search.Query;
import org.lexevs.dao.index.access.IndexDaoManager;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypePropertyList;
import org.lexevs.dao.index.indexer.CodingSchemeWithTypeIndexCreator;

/**
 * The Class LuceneCodingSchemeWithTypeIndexService.
 * 
 */
public class LuceneCodingSchemeWithTypeIndexService implements CodingSchemeWithTypeIndexService {

	private CodingSchemeWithTypeIndexCreator codingSchemeWithTypeIndexCreator;
	private IndexDaoManager indexDaoManager;
	
	@Override
	public List<CodingSchemeSummary> listCodingSchemeWithType() {
		return indexDaoManager.getCodingSchemeWithTypeDao().listCodingSchemeWithType();
	} 

	@Override
	public void indexCodingSchemeWithType(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName,
			boolean isCodingSchemeResolvedValueSet, URI codingSchemeLocation) throws Exception {
		
		codingSchemeWithTypeIndexCreator.indexCodingSchemeWithType(codingSchemeUri, codingSchemeVersion, codingSchemeName, 
				isCodingSchemeResolvedValueSet, codingSchemeLocation);
	}

	@Override
	public List<CodingSchemeSummary> search(Query query) {
		return indexDaoManager.getCodingSchemeWithTypeDao().search(query);
	}

	@Override
	public void removeCodingSchemeWithType(String codingSchemeUri, String codingSchemeVersion) {
		indexDaoManager.getCodingSchemeWithTypeDao().removeCodingSchemeWithType(codingSchemeUri, codingSchemeVersion);
	}
	
	public CodingSchemeWithTypeIndexCreator getCodingSchemeWithTypeIndexCreator() {
		return codingSchemeWithTypeIndexCreator;
	}

	public void setCodingSchemeWithTypeIndexCreator(CodingSchemeWithTypeIndexCreator codingSchemeWithTypeIndexCreator) {
		this.codingSchemeWithTypeIndexCreator = codingSchemeWithTypeIndexCreator;
	}
	
	public void setIndexDaoManager(IndexDaoManager indexDaoManager) {
		this.indexDaoManager = indexDaoManager;
	}

	public IndexDaoManager getIndexDaoManager() {
		return indexDaoManager;
	}

}
