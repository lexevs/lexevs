package org.LexGrid.LexBIG.Impl;

import java.util.ArrayList;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Impl.dataAccess.CodingSchemeWithTypeQuery;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceCodingSchemeWithType;
import org.LexGrid.LexBIG.Utility.logging.LgLoggerIF;
import org.apache.lucene.index.Term;
import org.apache.lucene.sandbox.queries.regex.RegexQuery;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.lexevs.locator.LexEvsServiceLocator;
import org.lexevs.logging.LoggerFactory;


/**
 * Lucene implementation of the LexBIGServiceCodingSchemeWithType interface.
 * 
 */
public class LexBIGServiceCodingSchemeWithTypeImpl implements LexBIGServiceCodingSchemeWithType {
    
    private static final long serialVersionUID = 1L;
    transient protected ArrayList<Query> queryClauses = new ArrayList<Query>();
    transient protected ArrayList<Term> termClauses = new ArrayList<Term>();
    
    private LgLoggerIF getLogger() {
        return LoggerFactory.getLogger();
    }
   
    @Override
    public List<CodingSchemeSummary> listAllCodingSchemes() throws LBInvocationException {
        getLogger().logMethod(new Object[] {});
        try {
            List<CodingSchemeSummary> list = LexEvsServiceLocator.getInstance().
                getIndexServiceManager().getCodingSchemeWithTypeIndexService().listCodingSchemeWithType();
                       
            return list;

        } catch (Exception e) {
            String id = getLogger().error("An unexpected error occurred while listing coding schemes.", e);
            throw new LBInvocationException(
                    "An unexpected error occurred while listing coding schemes.  See the log for more details",
                    id);
        }
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.LexGrid.LexBIG.LexBIGService.LexBIGServiceMetadata#restrictToValue
     * (java.lang.String, java.lang.String)
     */
    public LexBIGServiceCodingSchemeWithType restrictToValue(String matchText) throws LBParameterException {
        getLogger().logMethod(new Object[] {matchText});
        
        queryClauses.add(CodingSchemeWithTypeQuery.makeValueRestriction(matchText));
        return this;
    }

    @Override
    public String search(Query query) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public List<CodingSchemeSummary> resolve() throws LBParameterException, LBInvocationException {
        getLogger().logMethod(new Object[] {});
        try {
            if (queryClauses.size() + termClauses.size() < 1) {
                throw new LBParameterException("At leat one restriction must be applied before resolving");
            }

            BooleanQuery.Builder builder = new BooleanQuery.Builder();
            for (int i = 0; i < queryClauses.size(); i++) {
                builder.add(queryClauses.get(i), Occur.MUST);
            }
            for (int i = 0; i < termClauses.size(); i++) {
                builder.add(new RegexQuery(termClauses.get(i)), Occur.MUST);
            }

             return LexEvsServiceLocator.getInstance().
                    getIndexServiceManager().getCodingSchemeWithTypeIndexService().search(builder.build());            
        } catch (LBParameterException e) {
            throw e;
        } catch (Exception e) {
            String id = getLogger().error("An unexpected error occurred resolving the Coding Scheme with type search.", e);
            throw new LBInvocationException(
                    "An unexpected error occurred resolving the  Coding Scheme with type search.  See the log for more details", id);
        }
    }

    @Override
    public List<CodingSchemeSummary> listAllResolvedValueSets() throws LBException {
        getLogger().logMethod();
        
        queryClauses.add(CodingSchemeWithTypeQuery.makeResolvedValueSetRestriction());
        return resolve();
    }

    @Override
    public LexBIGServiceCodingSchemeWithType restrictToCodingSchemeName(String matchText) throws LBParameterException {
        getLogger().logMethod(new Object[] { matchText });
        
        queryClauses.add(CodingSchemeWithTypeQuery.makeCodingSchemeRestriction(matchText));
        return this;
    }

}
