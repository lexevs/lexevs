
package org.LexGrid.LexBIG.Impl.codedNodeSetOperations;

import org.LexGrid.LexBIG.DataModel.Collections.ConceptReferenceList;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Impl.codedNodeSetOperations.interfaces.AbstractJoinQueryRestriction;
import org.LexGrid.LexBIG.Impl.dataAccess.RestrictionImplementations;
import org.LexGrid.annotations.LgClientSideSafe;
import org.apache.lucene.search.Query;
import org.lexevs.exceptions.InternalException;

/**
 * Holder for the RestrictToCodes operation.
 * 
 * @author <A HREF="mailto:armbrust.daniel@mayo.edu">Dan Armbrust</A>
 * @author <A HREF="mailto:erdmann.jesse@mayo.edu">Jesse Erdmann</A>
 * @version subversion $Revision: $ checked in on $Date: $
 */
public class RestrictToCodes extends AbstractJoinQueryRestriction {

    private static final long serialVersionUID = -8005913414543273170L;
    private ConceptReferenceList conceptReferenceList_;

    @LgClientSideSafe
    public ConceptReferenceList getConceptReferenceList() {
        return this.conceptReferenceList_;
    }

    public RestrictToCodes(ConceptReferenceList codeList) throws LBParameterException {
        try {
            if (codeList == null || codeList.getConceptReferenceCount() == 0) {
                throw new LBParameterException("The parameter is required", "codeList");
            }

            conceptReferenceList_ = codeList;
        } catch (LBParameterException e) {
            throw e;
        }
    }

    @Override
    protected Query doGetQuery() throws LBException, InternalException {
        return RestrictionImplementations.getQuery(this);
    }

    /**
     * Do not use this method. Its here as a hack to make a restriction to only
     * active codes work when they didn't provided any other restrictions.
     */
    public RestrictToCodes() {
        conceptReferenceList_ = null;
    }
}