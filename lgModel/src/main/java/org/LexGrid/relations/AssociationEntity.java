/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * A binary relation from a set of entities to a set of entities
 * and/or data. The entityType for the class concept must be
 * "association".
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationEntity extends org.LexGrid.concepts.Entity 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name or role that the "from" entity plays with respect
     * to the "to" entry. Should be phrased in terms of the default
     * language of the association and imply direction.
     */
    private java.lang.String _forwardName;

    /**
     * The name or role that the "to" entity plays with respect to
     * the "from" entry. Should be phrased in terms of the default
     * language of the association and imply direction.
     */
    private java.lang.String _reverseName;

    /**
     * True means that the reverse direction of the association is
     * "navigable", meaning that it is makes sense to represent the
     * target to source side of the association.
     */
    private java.lang.Boolean _isNavigable = new java.lang.Boolean("true");

    /**
     * True means that association is transitive ( r(a,b), r(b,c)
     * -> r(a,c)). False means not transitive. If absent,
     * transitivity is unknown or not applicable.
     */
    private java.lang.Boolean _isTransitive;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationEntity() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'forwardName'. The field
     * 'forwardName' has the following description: The name or
     * role that the "from" entity plays with respect to the "to"
     * entry. Should be phrased in terms of the default language of
     * the association and imply direction.
     * 
     * @return the value of field 'ForwardName'.
     */
    public java.lang.String getForwardName(
    ) {
        return this._forwardName;
    }

    /**
     * Returns the value of field 'isNavigable'. The field
     * 'isNavigable' has the following description: True means that
     * the reverse direction of the association is "navigable",
     * meaning that it is makes sense to represent the target to
     * source side of the association.
     * 
     * @return the value of field 'IsNavigable'.
     */
    public java.lang.Boolean getIsNavigable(
    ) {
        return this._isNavigable;
    }

    /**
     * Returns the value of field 'isTransitive'. The field
     * 'isTransitive' has the following description: True means
     * that association is transitive ( r(a,b), r(b,c) -> r(a,c)).
     * False means not transitive. If absent, transitivity is
     * unknown or not applicable.
     * 
     * @return the value of field 'IsTransitive'.
     */
    public java.lang.Boolean getIsTransitive(
    ) {
        return this._isTransitive;
    }

    /**
     * Returns the value of field 'reverseName'. The field
     * 'reverseName' has the following description: The name or
     * role that the "to" entity plays with respect to the "from"
     * entry. Should be phrased in terms of the default language of
     * the association and imply direction.
     * 
     * @return the value of field 'ReverseName'.
     */
    public java.lang.String getReverseName(
    ) {
        return this._reverseName;
    }

    /**
     * Returns the value of field 'isNavigable'. The field
     * 'isNavigable' has the following description: True means that
     * the reverse direction of the association is "navigable",
     * meaning that it is makes sense to represent the target to
     * source side of the association.
     * 
     * @return the value of field 'IsNavigable'.
     */
    public java.lang.Boolean isIsNavigable(
    ) {
        return this._isNavigable;
    }

    /**
     * Returns the value of field 'isTransitive'. The field
     * 'isTransitive' has the following description: True means
     * that association is transitive ( r(a,b), r(b,c) -> r(a,c)).
     * False means not transitive. If absent, transitivity is
     * unknown or not applicable.
     * 
     * @return the value of field 'IsTransitive'.
     */
    public java.lang.Boolean isIsTransitive(
    ) {
        return this._isTransitive;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'forwardName'. The field
     * 'forwardName' has the following description: The name or
     * role that the "from" entity plays with respect to the "to"
     * entry. Should be phrased in terms of the default language of
     * the association and imply direction.
     * 
     * @param forwardName the value of field 'forwardName'.
     */
    public void setForwardName(
            final java.lang.String forwardName) {
        this._forwardName = forwardName;
    }

    /**
     * Sets the value of field 'isNavigable'. The field
     * 'isNavigable' has the following description: True means that
     * the reverse direction of the association is "navigable",
     * meaning that it is makes sense to represent the target to
     * source side of the association.
     * 
     * @param isNavigable the value of field 'isNavigable'.
     */
    public void setIsNavigable(
            final java.lang.Boolean isNavigable) {
        this._isNavigable = isNavigable;
    }

    /**
     * Sets the value of field 'isTransitive'. The field
     * 'isTransitive' has the following description: True means
     * that association is transitive ( r(a,b), r(b,c) -> r(a,c)).
     * False means not transitive. If absent, transitivity is
     * unknown or not applicable.
     * 
     * @param isTransitive the value of field 'isTransitive'.
     */
    public void setIsTransitive(
            final java.lang.Boolean isTransitive) {
        this._isTransitive = isTransitive;
    }

    /**
     * Sets the value of field 'reverseName'. The field
     * 'reverseName' has the following description: The name or
     * role that the "to" entity plays with respect to the "from"
     * entry. Should be phrased in terms of the default language of
     * the association and imply direction.
     * 
     * @param reverseName the value of field 'reverseName'.
     */
    public void setReverseName(
            final java.lang.String reverseName) {
        this._reverseName = reverseName;
    }

    /**
     * Method unmarshalAssociationEntity.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.relations.AssociationEntity
     */
    public static org.LexGrid.relations.AssociationEntity unmarshalAssociationEntity(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.AssociationEntity) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.AssociationEntity.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
