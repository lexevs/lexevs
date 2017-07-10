package org.LexGrid.LexBIG.LexBIGService;

import java.io.Serializable;

import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.apache.lucene.search.Query;

public interface LexBIGServiceCodingSchemeWithType extends Serializable {

	/**
	 * List the coding schemes that are resolved value sets that are represented 
	 * in the coding scheme with type index.
	 * 
	 * @throws LBInvocationException
	 */
	public abstract String listResolvedValueSets() throws LBInvocationException;
	
	public abstract String /*CodingSchemeWithTypeList*/ search(Query query);
}
