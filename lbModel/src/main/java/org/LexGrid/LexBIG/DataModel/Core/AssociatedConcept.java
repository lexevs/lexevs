/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * A concept reference that is the source or target of an
 *  association.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class AssociatedConcept extends org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * True means that the association with
     *  this concept has been explicitly asserted and can be used
     * for
     *  inferences. False means that the association was asserted
     * in the other
     *  direction and cannot be used. Default: true
     */
    private java.lang.Boolean _isNavigable;

    /**
     * Codes that qualify the complete association.
     *  Qualifiers may include "computed", degrees of certainty,
     *  etc.
     */
    private org.LexGrid.LexBIG.DataModel.Collections.NameAndValueList _associationQualifiers;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociatedConcept() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'associationQualifiers'. The
     * field 'associationQualifiers' has the following description:
     * Codes that qualify the complete association.
     *  Qualifiers may include "computed", degrees of certainty,
     *  etc.
     * 
     * @return the value of field 'AssociationQualifiers'.
     */
    public org.LexGrid.LexBIG.DataModel.Collections.NameAndValueList getAssociationQualifiers(
    ) {
        return this._associationQualifiers;
    }

    /**
     * Returns the value of field 'isNavigable'. The field
     * 'isNavigable' has the following description: True means that
     * the association with
     *  this concept has been explicitly asserted and can be used
     * for
     *  inferences. False means that the association was asserted
     * in the other
     *  direction and cannot be used. Default: true
     * 
     * @return the value of field 'IsNavigable'.
     */
    public java.lang.Boolean getIsNavigable(
    ) {
        return this._isNavigable;
    }

    /**
     * Returns the value of field 'isNavigable'. The field
     * 'isNavigable' has the following description: True means that
     * the association with
     *  this concept has been explicitly asserted and can be used
     * for
     *  inferences. False means that the association was asserted
     * in the other
     *  direction and cannot be used. Default: true
     * 
     * @return the value of field 'IsNavigable'.
     */
    public java.lang.Boolean isIsNavigable(
    ) {
        return this._isNavigable;
    }

    /**
     * Sets the value of field 'associationQualifiers'. The field
     * 'associationQualifiers' has the following description: Codes
     * that qualify the complete association.
     *  Qualifiers may include "computed", degrees of certainty,
     *  etc.
     * 
     * @param associationQualifiers the value of field
     * 'associationQualifiers'.
     */
    public void setAssociationQualifiers(
            final org.LexGrid.LexBIG.DataModel.Collections.NameAndValueList associationQualifiers) {
        this._associationQualifiers = associationQualifiers;
    }

    /**
     * Sets the value of field 'isNavigable'. The field
     * 'isNavigable' has the following description: True means that
     * the association with
     *  this concept has been explicitly asserted and can be used
     * for
     *  inferences. False means that the association was asserted
     * in the other
     *  direction and cannot be used. Default: true
     * 
     * @param isNavigable the value of field 'isNavigable'.
     */
    public void setIsNavigable(
            final java.lang.Boolean isNavigable) {
        this._isNavigable = isNavigable;
    }

}
