package org.LexGrid.LexBIG.Impl.dataAccess;

import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Extensions.Query.Search;
import org.LexGrid.LexBIG.Impl.Extensions.ExtensionRegistryImpl;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.BooleanClause.Occur;

/**
 * Class to make Lucene Query snippits for a Coding Scheme with type query.
 * 
 */
public class CodingSchemeWithTypeQuery {

    public static Query makeValueRestriction(String matchText) throws LBParameterException {
        Search search = ExtensionRegistryImpl.instance().getSearchAlgorithm("exactMatch");
        return search.buildQuery(matchText);
    }
    
    public static Query makeCodingSchemeRestriction(String matchText) throws LBParameterException {
        BooleanQuery.Builder builder = new BooleanQuery.Builder();        
        builder.add(new BooleanClause(new TermQuery(new Term("codingSchemeRegisteredName", matchText)), Occur.MUST));
        
        return builder.build();
    }
    
    
    public static Query makeResolvedValueSetRestriction() throws LBParameterException {
        BooleanQuery.Builder builder = new BooleanQuery.Builder();
        builder.add(new BooleanClause(new TermQuery(new Term("codingSchemeIsResolvedValueSet", "true")), Occur.MUST));
        
        return builder.build();
    }
}
