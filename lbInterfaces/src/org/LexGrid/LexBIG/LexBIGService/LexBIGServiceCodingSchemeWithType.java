package org.LexGrid.LexBIG.LexBIGService;

import java.io.Serializable;

import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.apache.lucene.search.Query;

public interface LexBIGServiceCodingSchemeWithType extends Serializable {

	/**
	 * List the coding schemes that are resolved value sets that are represented 
	 * in the coding scheme with type index.
	 * 
	 * @throws LBInvocationException
	 */
	public abstract String listResolvedValueSets() throws LBInvocationException;
	
	/**
	 * List all of the coding schemes that are represented 
	 * in the coding scheme with type index.
	 * 
	 * @throws LBInvocationException
	 */
	public abstract String listCodingSchemes() throws LBInvocationException;
	
	/**
     * Restrict the result to the coding scheme with type elements that match the supplied string, 
     * using the supplied matching algorithm 
     * 
     * @param matchText
     *          The match text.  Format is determined by the match algorithm.
     * @throws LBParameterException
     */
    public abstract LexBIGServiceCodingSchemeWithType restrictToValue(String matchText) throws LBParameterException;

    public abstract LexBIGServiceCodingSchemeWithType restrictToCodingSchemeName(String matchText) throws LBParameterException;
    
    public abstract LexBIGServiceCodingSchemeWithType makeResolvedValueSetRestriction() throws LBParameterException;
	
	public abstract String /*CodingSchemeWithTypeList*/ search(Query query);
	
	
	
	/**
     * Apply all of the restrictions, and return the result.
     * 
     * @return
     * @throws LBParameterException
     * @throws LBInvocationException
     */
    public abstract String /*CodingSchemeWithTypeList*/  resolve() throws LBParameterException, LBInvocationException;

}
