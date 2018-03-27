package org.lexevs.dao.database.service.valuesets;

import java.io.Serializable;
import java.util.List;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.codingSchemes.CodingScheme;
import org.LexGrid.concepts.Entity;
import org.LexGrid.util.assertedvaluesets.AssertedValueSetParameters;

public interface  AssertedValueSetService extends Serializable {
	
	List<CodingScheme> getSourceAssertedValueSetforTopNodeEntityCode(String matchCode) throws LBException;

	public List<String> getAllValueSetTopNodeCodes(String rootCode);
	
	public List<Entity> getSourceAssertedValueSetEntitiesForEntityCode(String rootCode);
	
	public void init(AssertedValueSetParameters params);

	List<String> getSourceAssertedValueSetEntityUidsforPredicateUid( int start, int pageSize);

	List<Entity> getEntitiesForUidMap(List<String> entityUids);

	int getVSEntityCountForTopNodeCode(String code);

	List<Entity> getPagedSourceAssertedValueSetEntities(String rootCode, int start, int pageSize);

	List<CodingScheme> getSourceAssertedValueSetforMemberEntityCode(String matchCode);

	List<String> getAllValidValueSetTopNodeCodes();



}
