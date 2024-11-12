/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Resolved information for a concept. Maintained for
 *  backward compatibility, but no longer enhanced in favor of the
 * more
 *  flexible ResolvedCodedNodeReference.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class ResolvedConceptReference extends org.LexGrid.LexBIG.DataModel.Core.ResolvedCodedNodeReference 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The resolved concept, if present.
     *  Alias for ResolvedCodedNodeReference:entity
     */
    private org.LexGrid.concepts.Entity _referencedEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedConceptReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'referencedEntry'. The field
     * 'referencedEntry' has the following description: The
     * resolved concept, if present.
     *  Alias for ResolvedCodedNodeReference:entity
     * 
     * @return the value of field 'ReferencedEntry'.
     */
    public org.LexGrid.concepts.Entity getReferencedEntry(
    ) {
        return this.getEntity() instanceof org.LexGrid.concepts.Entity ? (org.LexGrid.concepts.Entity) this.getEntity() : null;
    }

    /**
     * Sets the value of field 'referencedEntry'. The field
     * 'referencedEntry' has the following description: The
     * resolved concept, if present.
     *  Alias for ResolvedCodedNodeReference:entity
     * 
     * @param referencedEntry the value of field 'referencedEntry'.
     */
    public void setReferencedEntry(
            final org.LexGrid.concepts.Entity referencedEntry) {
        this.setEntity(referencedEntry);
    }

}
