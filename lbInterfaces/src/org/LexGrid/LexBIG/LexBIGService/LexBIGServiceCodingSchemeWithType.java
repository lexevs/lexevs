package org.LexGrid.LexBIG.LexBIGService;

import java.io.Serializable;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.apache.lucene.search.Query;

public interface LexBIGServiceCodingSchemeWithType extends Serializable {
	
	/**
	 * List all of the coding schemes that are represented 
	 * in the coding scheme with type index.
	 * 
	 * @throws LBInvocationException
	 */
	public List<CodingSchemeSummary> listAllCodingSchemes() throws LBInvocationException;
	
	public List<CodingSchemeSummary> listAllResolvedValueSets() throws LBException;
		
	public abstract LexBIGServiceCodingSchemeWithType restrictToCodingSchemeName(String matchText) throws LBParameterException;
	
	public abstract LexBIGServiceCodingSchemeWithType restrictToCodingSchemeVersion(String matchText) throws LBParameterException;
	
	/**
     * Apply all of the restrictions, and return the result.
     * 
     * @return
     * @throws LBParameterException
     * @throws LBInvocationException
     */
    public abstract List<CodingSchemeSummary> resolve() throws LBParameterException, LBInvocationException;
    
	public abstract String search(Query query);
	
}
