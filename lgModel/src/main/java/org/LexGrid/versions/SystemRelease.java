/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions;

/**
 * A collection of coding schemes, value set definitions, pick list
 * definitions and/or revision records that are distributed as a
 * unit.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SystemRelease extends org.LexGrid.commonTypes.Describable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The label assigned to this release by the release agency.
     */
    private java.lang.String _releaseId;

    /**
     * The official URI of this release
     */
    private java.lang.String _releaseURI;

    /**
     * The official release data and time of this release.
     */
    private java.util.Date _releaseDate;

    /**
     * The URI of the agency responsible for this release
     */
    private java.lang.String _releaseAgency;

    /**
     * The URI of the release that logically preceeds this release
     */
    private java.lang.String _basedOnRelease;

    /**
     * A collection of coding schemes that are included in this
     * release. Each entry in this collection is a complete
     * representation of a coding scheme at a given revision.
     */
    private org.LexGrid.codingSchemes.CodingSchemes _codingSchemes;

    /**
     * A collection of value set definitions that are included in
     * this release. 
     */
    private org.LexGrid.valueSets.ValueSetDefinitions _valueSetDefinitions;

    /**
     * A collection of pick list definitions that are included in
     * this release. Each entry in this collection is a complete
     * representation of a pick list definition at a given revision.
     */
    private org.LexGrid.valueSets.PickListDefinitions _pickListDefinitions;

    /**
     * An ordered collection of revisions that describe the
     * transformations that were applied to create this release
     */
    private org.LexGrid.versions.EditHistory _editHistory;


      //----------------/
     //- Constructors -/
    //----------------/

    public SystemRelease() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'basedOnRelease'. The field
     * 'basedOnRelease' has the following description: The URI of
     * the release that logically preceeds this release
     * 
     * @return the value of field 'BasedOnRelease'.
     */
    public java.lang.String getBasedOnRelease(
    ) {
        return this._basedOnRelease;
    }

    /**
     * Returns the value of field 'codingSchemes'. The field
     * 'codingSchemes' has the following description: A collection
     * of coding schemes that are included in this release. Each
     * entry in this collection is a complete representation of a
     * coding scheme at a given revision.
     * 
     * @return the value of field 'CodingSchemes'.
     */
    public org.LexGrid.codingSchemes.CodingSchemes getCodingSchemes(
    ) {
        return this._codingSchemes;
    }

    /**
     * Returns the value of field 'editHistory'. The field
     * 'editHistory' has the following description: An ordered
     * collection of revisions that describe the transformations
     * that were applied to create this release
     * 
     * @return the value of field 'EditHistory'.
     */
    public org.LexGrid.versions.EditHistory getEditHistory(
    ) {
        return this._editHistory;
    }

    /**
     * Returns the value of field 'pickListDefinitions'. The field
     * 'pickListDefinitions' has the following description: A
     * collection of pick list definitions that are included in
     * this release. Each entry in this collection is a complete
     * representation of a pick list definition at a given
     * revision.
     * 
     * @return the value of field 'PickListDefinitions'.
     */
    public org.LexGrid.valueSets.PickListDefinitions getPickListDefinitions(
    ) {
        return this._pickListDefinitions;
    }

    /**
     * Returns the value of field 'releaseAgency'. The field
     * 'releaseAgency' has the following description: The URI of
     * the agency responsible for this release
     * 
     * @return the value of field 'ReleaseAgency'.
     */
    public java.lang.String getReleaseAgency(
    ) {
        return this._releaseAgency;
    }

    /**
     * Returns the value of field 'releaseDate'. The field
     * 'releaseDate' has the following description: The official
     * release data and time of this release.
     * 
     * @return the value of field 'ReleaseDate'.
     */
    public java.util.Date getReleaseDate(
    ) {
        return this._releaseDate;
    }

    /**
     * Returns the value of field 'releaseId'. The field
     * 'releaseId' has the following description: The label
     * assigned to this release by the release agency.
     * 
     * @return the value of field 'ReleaseId'.
     */
    public java.lang.String getReleaseId(
    ) {
        return this._releaseId;
    }

    /**
     * Returns the value of field 'releaseURI'. The field
     * 'releaseURI' has the following description: The official URI
     * of this release
     * 
     * @return the value of field 'ReleaseURI'.
     */
    public java.lang.String getReleaseURI(
    ) {
        return this._releaseURI;
    }

    /**
     * Returns the value of field 'valueSetDefinitions'. The field
     * 'valueSetDefinitions' has the following description: A
     * collection of value set definitions that are included in
     * this release. 
     * 
     * @return the value of field 'ValueSetDefinitions'.
     */
    public org.LexGrid.valueSets.ValueSetDefinitions getValueSetDefinitions(
    ) {
        return this._valueSetDefinitions;
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
     * Sets the value of field 'basedOnRelease'. The field
     * 'basedOnRelease' has the following description: The URI of
     * the release that logically preceeds this release
     * 
     * @param basedOnRelease the value of field 'basedOnRelease'.
     */
    public void setBasedOnRelease(
            final java.lang.String basedOnRelease) {
        this._basedOnRelease = basedOnRelease;
    }

    /**
     * Sets the value of field 'codingSchemes'. The field
     * 'codingSchemes' has the following description: A collection
     * of coding schemes that are included in this release. Each
     * entry in this collection is a complete representation of a
     * coding scheme at a given revision.
     * 
     * @param codingSchemes the value of field 'codingSchemes'.
     */
    public void setCodingSchemes(
            final org.LexGrid.codingSchemes.CodingSchemes codingSchemes) {
        this._codingSchemes = codingSchemes;
    }

    /**
     * Sets the value of field 'editHistory'. The field
     * 'editHistory' has the following description: An ordered
     * collection of revisions that describe the transformations
     * that were applied to create this release
     * 
     * @param editHistory the value of field 'editHistory'.
     */
    public void setEditHistory(
            final org.LexGrid.versions.EditHistory editHistory) {
        this._editHistory = editHistory;
    }

    /**
     * Sets the value of field 'pickListDefinitions'. The field
     * 'pickListDefinitions' has the following description: A
     * collection of pick list definitions that are included in
     * this release. Each entry in this collection is a complete
     * representation of a pick list definition at a given
     * revision.
     * 
     * @param pickListDefinitions the value of field
     * 'pickListDefinitions'.
     */
    public void setPickListDefinitions(
            final org.LexGrid.valueSets.PickListDefinitions pickListDefinitions) {
        this._pickListDefinitions = pickListDefinitions;
    }

    /**
     * Sets the value of field 'releaseAgency'. The field
     * 'releaseAgency' has the following description: The URI of
     * the agency responsible for this release
     * 
     * @param releaseAgency the value of field 'releaseAgency'.
     */
    public void setReleaseAgency(
            final java.lang.String releaseAgency) {
        this._releaseAgency = releaseAgency;
    }

    /**
     * Sets the value of field 'releaseDate'. The field
     * 'releaseDate' has the following description: The official
     * release data and time of this release.
     * 
     * @param releaseDate the value of field 'releaseDate'.
     */
    public void setReleaseDate(
            final java.util.Date releaseDate) {
        this._releaseDate = releaseDate;
    }

    /**
     * Sets the value of field 'releaseId'. The field 'releaseId'
     * has the following description: The label assigned to this
     * release by the release agency.
     * 
     * @param releaseId the value of field 'releaseId'.
     */
    public void setReleaseId(
            final java.lang.String releaseId) {
        this._releaseId = releaseId;
    }

    /**
     * Sets the value of field 'releaseURI'. The field 'releaseURI'
     * has the following description: The official URI of this
     * release
     * 
     * @param releaseURI the value of field 'releaseURI'.
     */
    public void setReleaseURI(
            final java.lang.String releaseURI) {
        this._releaseURI = releaseURI;
    }

    /**
     * Sets the value of field 'valueSetDefinitions'. The field
     * 'valueSetDefinitions' has the following description: A
     * collection of value set definitions that are included in
     * this release. 
     * 
     * @param valueSetDefinitions the value of field
     * 'valueSetDefinitions'.
     */
    public void setValueSetDefinitions(
            final org.LexGrid.valueSets.ValueSetDefinitions valueSetDefinitions) {
        this._valueSetDefinitions = valueSetDefinitions;
    }

    /**
     * Method unmarshalSystemRelease.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.versions.SystemRelease
     */
    public static org.LexGrid.versions.SystemRelease unmarshalSystemRelease(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.versions.SystemRelease) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.versions.SystemRelease.class, reader);
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
