/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * A resource that can undergo change over time while maintaining
 * its identity.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Versionable extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * True means that this resource is searchable and browsable if
     * the temporal context of the operation falls between
     * effectiveDate and expirationDate. False means that this
     * resource is only accessible if requested by id or by a
     * search that specifies that inactive retrievals are allowed.
     * Default: True
     */
    private java.lang.Boolean _isActive;

    /**
     * The status code associated with the particular resource. The
     * semantics and business rules of entryStatus are defined by
     * the containing system, but there needs to be a mapping into
     * isActive above.
     */
    private java.lang.String _status;

    /**
     * The date and time that this resource is considered to be
     * active. To be considered active, isActive must be true, and
     * the temporal context of the operation must be greater than
     * effectiveDate. If omitted, all temporal contexts are
     * considered to be valid.
     */
    private java.util.Date _effectiveDate;

    /**
     * The date and time that this resource is considered to become
     * inActive. To be considered active, isActive must be true,
     * and the temporal context of the operation must be less than
     * expirationDate. If omitted, all temporal contexts are
     * considered to be valid.
     */
    private java.util.Date _expirationDate;

    /**
     * The owner of the resource. The specific semantics of owner
     * is defined by the busniess rules of the implementor,
     * including the rules of the owner field is absent.
     */
    private java.lang.String _owner;

    /**
     * The description of the current state of the resource and its
     * change history.
     */
    private org.LexGrid.versions.EntryState _entryState;


      //----------------/
     //- Constructors -/
    //----------------/

    public Versionable() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'effectiveDate'. The field
     * 'effectiveDate' has the following description: The date and
     * time that this resource is considered to be active. To be
     * considered active, isActive must be true, and the temporal
     * context of the operation must be greater than effectiveDate.
     * If omitted, all temporal contexts are considered to be
     * valid.
     * 
     * @return the value of field 'EffectiveDate'.
     */
    public java.util.Date getEffectiveDate(
    ) {
        return this._effectiveDate;
    }

    /**
     * Returns the value of field 'entryState'. The field
     * 'entryState' has the following description: The description
     * of the current state of the resource and its change history.
     * 
     * @return the value of field 'EntryState'.
     */
    public org.LexGrid.versions.EntryState getEntryState(
    ) {
        return this._entryState;
    }

    /**
     * Returns the value of field 'expirationDate'. The field
     * 'expirationDate' has the following description: The date and
     * time that this resource is considered to become inActive. To
     * be considered active, isActive must be true, and the
     * temporal context of the operation must be less than
     * expirationDate. If omitted, all temporal contexts are
     * considered to be valid.
     * 
     * @return the value of field 'ExpirationDate'.
     */
    public java.util.Date getExpirationDate(
    ) {
        return this._expirationDate;
    }

    /**
     * Returns the value of field 'isActive'. The field 'isActive'
     * has the following description: True means that this resource
     * is searchable and browsable if the temporal context of the
     * operation falls between effectiveDate and expirationDate.
     * False means that this resource is only accessible if
     * requested by id or by a search that specifies that inactive
     * retrievals are allowed. Default: True
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.Boolean getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'owner'. The field 'owner' has
     * the following description: The owner of the resource. The
     * specific semantics of owner is defined by the busniess rules
     * of the implementor, including the rules of the owner field
     * is absent.
     * 
     * @return the value of field 'Owner'.
     */
    public java.lang.String getOwner(
    ) {
        return this._owner;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: The status code associated with
     * the particular resource. The semantics and business rules of
     * entryStatus are defined by the containing system, but there
     * needs to be a mapping into isActive above.
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'isActive'. The field 'isActive'
     * has the following description: True means that this resource
     * is searchable and browsable if the temporal context of the
     * operation falls between effectiveDate and expirationDate.
     * False means that this resource is only accessible if
     * requested by id or by a search that specifies that inactive
     * retrievals are allowed. Default: True
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.Boolean isIsActive(
    ) {
        return this._isActive;
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
     * Sets the value of field 'effectiveDate'. The field
     * 'effectiveDate' has the following description: The date and
     * time that this resource is considered to be active. To be
     * considered active, isActive must be true, and the temporal
     * context of the operation must be greater than effectiveDate.
     * If omitted, all temporal contexts are considered to be
     * valid.
     * 
     * @param effectiveDate the value of field 'effectiveDate'.
     */
    public void setEffectiveDate(
            final java.util.Date effectiveDate) {
        this._effectiveDate = effectiveDate;
    }

    /**
     * Sets the value of field 'entryState'. The field 'entryState'
     * has the following description: The description of the
     * current state of the resource and its change history.
     * 
     * @param entryState the value of field 'entryState'.
     */
    public void setEntryState(
            final org.LexGrid.versions.EntryState entryState) {
        this._entryState = entryState;
    }

    /**
     * Sets the value of field 'expirationDate'. The field
     * 'expirationDate' has the following description: The date and
     * time that this resource is considered to become inActive. To
     * be considered active, isActive must be true, and the
     * temporal context of the operation must be less than
     * expirationDate. If omitted, all temporal contexts are
     * considered to be valid.
     * 
     * @param expirationDate the value of field 'expirationDate'.
     */
    public void setExpirationDate(
            final java.util.Date expirationDate) {
        this._expirationDate = expirationDate;
    }

    /**
     * Sets the value of field 'isActive'. The field 'isActive' has
     * the following description: True means that this resource is
     * searchable and browsable if the temporal context of the
     * operation falls between effectiveDate and expirationDate.
     * False means that this resource is only accessible if
     * requested by id or by a search that specifies that inactive
     * retrievals are allowed. Default: True
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.Boolean isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'owner'. The field 'owner' has the
     * following description: The owner of the resource. The
     * specific semantics of owner is defined by the busniess rules
     * of the implementor, including the rules of the owner field
     * is absent.
     * 
     * @param owner the value of field 'owner'.
     */
    public void setOwner(
            final java.lang.String owner) {
        this._owner = owner;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: The status code associated with the
     * particular resource. The semantics and business rules of
     * entryStatus are defined by the containing system, but there
     * needs to be a mapping into isActive above.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Method unmarshalVersionable.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.commonTypes.Versionable
     */
    public static org.LexGrid.commonTypes.Versionable unmarshalVersionable(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.Versionable) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.Versionable.class, reader);
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
