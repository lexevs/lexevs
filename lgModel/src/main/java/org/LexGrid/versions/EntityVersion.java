/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions;

/**
 * A static snapshot of the given entity.NOTE: This type is here
 * for backwards compatbility with the LexBIG API, and is not
 * otherwise used in the current LexGrid model. Do not reference or
 * use!
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityVersion extends org.LexGrid.commonTypes.Describable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * If true, this entity represents a complete copy of the
     * particular release. If false, it only carries a delta. 
     */
    private java.lang.Boolean _isComplete;

    /**
     * The unique version identifier.
     */
    private java.lang.String _version;

    /**
     * The relative order of this version within the surrounding
     * container. 
     */
    private java.lang.Long _versionOrder;

    /**
     * The end date for which this version is operative (considered
     * commited). 
     */
    private java.util.Date _versionDate;

    /**
     * The start date for which this version is operative
     * (considered active). 
     */
    private java.util.Date _effectiveDate;

    /**
     * URN of the release from which this version is drawn. 
     */
    private java.lang.String _releaseURN;

    /**
     * User documentation about this particular change. Format is
     * coding scheme specific. 
     */
    private org.LexGrid.commonTypes.Text _changeDocumentation;

    /**
     * Formal or semi-formal instructions on how to apply this
     * change. 
     */
    private org.LexGrid.commonTypes.Text _changeInstructions;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityVersion() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'changeDocumentation'. The field
     * 'changeDocumentation' has the following description: User
     * documentation about this particular change. Format is coding
     * scheme specific. 
     * 
     * @return the value of field 'ChangeDocumentation'.
     */
    public org.LexGrid.commonTypes.Text getChangeDocumentation(
    ) {
        return this._changeDocumentation;
    }

    /**
     * Returns the value of field 'changeInstructions'. The field
     * 'changeInstructions' has the following description: Formal
     * or semi-formal instructions on how to apply this change. 
     * 
     * @return the value of field 'ChangeInstructions'.
     */
    public org.LexGrid.commonTypes.Text getChangeInstructions(
    ) {
        return this._changeInstructions;
    }

    /**
     * Returns the value of field 'effectiveDate'. The field
     * 'effectiveDate' has the following description: The start
     * date for which this version is operative (considered
     * active). 
     * 
     * @return the value of field 'EffectiveDate'.
     */
    public java.util.Date getEffectiveDate(
    ) {
        return this._effectiveDate;
    }

    /**
     * Returns the value of field 'isComplete'. The field
     * 'isComplete' has the following description: If true, this
     * entity represents a complete copy of the particular release.
     * If false, it only carries a delta. 
     * 
     * @return the value of field 'IsComplete'.
     */
    public java.lang.Boolean getIsComplete(
    ) {
        return this._isComplete;
    }

    /**
     * Returns the value of field 'releaseURN'. The field
     * 'releaseURN' has the following description: URN of the
     * release from which this version is drawn. 
     * 
     * @return the value of field 'ReleaseURN'.
     */
    public java.lang.String getReleaseURN(
    ) {
        return this._releaseURN;
    }

    /**
     * Returns the value of field 'version'. The field 'version'
     * has the following description: The unique version
     * identifier.
     * 
     * @return the value of field 'Version'.
     */
    public java.lang.String getVersion(
    ) {
        return this._version;
    }

    /**
     * Returns the value of field 'versionDate'. The field
     * 'versionDate' has the following description: The end date
     * for which this version is operative (considered commited). 
     * 
     * @return the value of field 'VersionDate'.
     */
    public java.util.Date getVersionDate(
    ) {
        return this._versionDate;
    }

    /**
     * Returns the value of field 'versionOrder'. The field
     * 'versionOrder' has the following description: The relative
     * order of this version within the surrounding container. 
     * 
     * @return the value of field 'VersionOrder'.
     */
    public java.lang.Long getVersionOrder(
    ) {
        return this._versionOrder;
    }

    /**
     * Returns the value of field 'isComplete'. The field
     * 'isComplete' has the following description: If true, this
     * entity represents a complete copy of the particular release.
     * If false, it only carries a delta. 
     * 
     * @return the value of field 'IsComplete'.
     */
    public java.lang.Boolean isIsComplete(
    ) {
        return this._isComplete;
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
     * Sets the value of field 'changeDocumentation'. The field
     * 'changeDocumentation' has the following description: User
     * documentation about this particular change. Format is coding
     * scheme specific. 
     * 
     * @param changeDocumentation the value of field
     * 'changeDocumentation'.
     */
    public void setChangeDocumentation(
            final org.LexGrid.commonTypes.Text changeDocumentation) {
        this._changeDocumentation = changeDocumentation;
    }

    /**
     * Sets the value of field 'changeInstructions'. The field
     * 'changeInstructions' has the following description: Formal
     * or semi-formal instructions on how to apply this change. 
     * 
     * @param changeInstructions the value of field
     * 'changeInstructions'.
     */
    public void setChangeInstructions(
            final org.LexGrid.commonTypes.Text changeInstructions) {
        this._changeInstructions = changeInstructions;
    }

    /**
     * Sets the value of field 'effectiveDate'. The field
     * 'effectiveDate' has the following description: The start
     * date for which this version is operative (considered
     * active). 
     * 
     * @param effectiveDate the value of field 'effectiveDate'.
     */
    public void setEffectiveDate(
            final java.util.Date effectiveDate) {
        this._effectiveDate = effectiveDate;
    }

    /**
     * Sets the value of field 'isComplete'. The field 'isComplete'
     * has the following description: If true, this entity
     * represents a complete copy of the particular release. If
     * false, it only carries a delta. 
     * 
     * @param isComplete the value of field 'isComplete'.
     */
    public void setIsComplete(
            final java.lang.Boolean isComplete) {
        this._isComplete = isComplete;
    }

    /**
     * Sets the value of field 'releaseURN'. The field 'releaseURN'
     * has the following description: URN of the release from which
     * this version is drawn. 
     * 
     * @param releaseURN the value of field 'releaseURN'.
     */
    public void setReleaseURN(
            final java.lang.String releaseURN) {
        this._releaseURN = releaseURN;
    }

    /**
     * Sets the value of field 'version'. The field 'version' has
     * the following description: The unique version identifier.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final java.lang.String version) {
        this._version = version;
    }

    /**
     * Sets the value of field 'versionDate'. The field
     * 'versionDate' has the following description: The end date
     * for which this version is operative (considered commited). 
     * 
     * @param versionDate the value of field 'versionDate'.
     */
    public void setVersionDate(
            final java.util.Date versionDate) {
        this._versionDate = versionDate;
    }

    /**
     * Sets the value of field 'versionOrder'. The field
     * 'versionOrder' has the following description: The relative
     * order of this version within the surrounding container. 
     * 
     * @param versionOrder the value of field 'versionOrder'.
     */
    public void setVersionOrder(
            final java.lang.Long versionOrder) {
        this._versionOrder = versionOrder;
    }

    /**
     * Method unmarshalEntityVersion.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.versions.EntityVersion
     */
    public static org.LexGrid.versions.EntityVersion unmarshalEntityVersion(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.versions.EntityVersion) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.versions.EntityVersion.class, reader);
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
