/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions;

/**
 * Represents a change that occurred between the current state of
 * the versionable entry and an immediately preceeding state of the
 * same entry.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntryState extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The revision that contains this particular entry state change
     */
    private java.lang.String _containingRevision;

    /**
     * The relative order that this state change should be applied
     * within the context of the containing revision.
     */
    private java.lang.Long _relativeOrder;

    /**
     * The type of change that occurred between this state and the
     * previous.
     */
    private org.LexGrid.versions.types.ChangeType _changeType;

    /**
     * The unique identifir of the state of this entry was at prior
     * to this change.
     */
    private java.lang.String _prevRevision;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntryState() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'changeType'. The field
     * 'changeType' has the following description: The type of
     * change that occurred between this state and the previous.
     * 
     * @return the value of field 'ChangeType'.
     */
    public org.LexGrid.versions.types.ChangeType getChangeType(
    ) {
        return this._changeType;
    }

    /**
     * Returns the value of field 'containingRevision'. The field
     * 'containingRevision' has the following description: The
     * revision that contains this particular entry state change.
     * 
     * @return the value of field 'ContainingRevision'.
     */
    public java.lang.String getContainingRevision(
    ) {
        return this._containingRevision;
    }

    /**
     * Returns the value of field 'prevRevision'. The field
     * 'prevRevision' has the following description: The unique
     * identifir of the state of this entry was at prior to this
     * change.
     * 
     * @return the value of field 'PrevRevision'.
     */
    public java.lang.String getPrevRevision(
    ) {
        return this._prevRevision;
    }

    /**
     * Returns the value of field 'relativeOrder'. The field
     * 'relativeOrder' has the following description: The relative
     * order that this state change should be applied within the
     * context of the containing revision.
     * 
     * @return the value of field 'RelativeOrder'.
     */
    public java.lang.Long getRelativeOrder(
    ) {
        return this._relativeOrder;
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
     * Sets the value of field 'changeType'. The field 'changeType'
     * has the following description: The type of change that
     * occurred between this state and the previous.
     * 
     * @param changeType the value of field 'changeType'.
     */
    public void setChangeType(
            final org.LexGrid.versions.types.ChangeType changeType) {
        this._changeType = changeType;
    }

    /**
     * Sets the value of field 'containingRevision'. The field
     * 'containingRevision' has the following description: The
     * revision that contains this particular entry state change.
     * 
     * @param containingRevision the value of field
     * 'containingRevision'.
     */
    public void setContainingRevision(
            final java.lang.String containingRevision) {
        this._containingRevision = containingRevision;
    }

    /**
     * Sets the value of field 'prevRevision'. The field
     * 'prevRevision' has the following description: The unique
     * identifir of the state of this entry was at prior to this
     * change.
     * 
     * @param prevRevision the value of field 'prevRevision'.
     */
    public void setPrevRevision(
            final java.lang.String prevRevision) {
        this._prevRevision = prevRevision;
    }

    /**
     * Sets the value of field 'relativeOrder'. The field
     * 'relativeOrder' has the following description: The relative
     * order that this state change should be applied within the
     * context of the containing revision.
     * 
     * @param relativeOrder the value of field 'relativeOrder'.
     */
    public void setRelativeOrder(
            final java.lang.Long relativeOrder) {
        this._relativeOrder = relativeOrder;
    }

    /**
     * Method unmarshalEntryState.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.versions.EntryState
     */
    public static org.LexGrid.versions.EntryState unmarshalEntryState(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.versions.EntryState) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.versions.EntryState.class, reader);
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
