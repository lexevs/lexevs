
package org.LexGrid.LexBIG.Impl.dataAccess;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
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
 * Class to make Lucene Query snippits for a metadata query.
 * 
 * @author <A HREF="mailto:armbrust.daniel@mayo.edu">Dan Armbrust</A>
 * @author <A HREF="mailto:kevin.peterson@mayo.edu">Kevin Peterson</A>
 * @version subversion $Revision: $ checked in on $Date: $
 */
public class MetaDataQuery {
    public static Query makeCodingSchemeRestriction(AbsoluteCodingSchemeVersionReference acsvr)
            throws LBParameterException {
        if (acsvr == null) {
            throw new LBParameterException("The coding scheme version reference is required");
        }

        if ((acsvr.getCodingSchemeURN() == null || acsvr.getCodingSchemeURN().length() == 0)
                && (acsvr.getCodingSchemeVersion() == null || acsvr.getCodingSchemeVersion().length() == 0)) {
            throw new LBParameterException("The coding name or version is required");
        }
        BooleanQuery.Builder builder = new BooleanQuery.Builder();

        if (acsvr.getCodingSchemeURN() != null && acsvr.getCodingSchemeURN().length() > 0) {
            builder.add(new BooleanClause(new TermQuery(
                    new Term("codingSchemeRegisteredName", acsvr.getCodingSchemeURN())), Occur.MUST));
        }

        if (acsvr.getCodingSchemeVersion() != null && acsvr.getCodingSchemeVersion().length() > 0) {
            builder.add(new BooleanClause(new TermQuery(new Term("codingSchemeVersion", acsvr.getCodingSchemeVersion())),
                    Occur.MUST));
        }

        return builder.build();

    }

    public static Query makePropertyRestriction(String[] properties) throws LBParameterException {
        if (properties == null || properties.length == 0) {
            throw new LBParameterException("At least one property name is required");
        }
        BooleanQuery.Builder builder = new BooleanQuery.Builder();
        for (int i = 0; i < properties.length; i++) {
            builder.add(new BooleanClause(new TermQuery(new Term("propertyName", properties[i])), Occur.MUST));
        }

        return builder.build();

    }

    public static Query makePropertyParentRestriction(String[] propertyParents) throws LBParameterException {
        if (propertyParents == null || propertyParents.length == 0) {
            throw new LBParameterException("At least one property parent is required");
        }
        BooleanQuery.Builder builder = new BooleanQuery.Builder();
        for (int i = 0; i < propertyParents.length; i++) {
            builder.add(new BooleanClause(new TermQuery(new Term("parentContainers", propertyParents[i])), Occur.MUST));
        }

        return builder.build();
    }

    public static Query makeValueRestriction(String matchText, String matchAlgorithm) throws LBParameterException {
        Search search =  ExtensionRegistryImpl.instance().getSearchAlgorithm(matchAlgorithm);
        return search.buildQuery(matchText);
    }
}