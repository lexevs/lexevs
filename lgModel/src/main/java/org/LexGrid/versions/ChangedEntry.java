/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions;

/**
 * A top level versionable entry. A fix because XML schema doesn't
 * deal with inheritence.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangedEntry extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _changedCodingSchemeEntry.
     */
    private org.LexGrid.codingSchemes.CodingScheme _changedCodingSchemeEntry;

    /**
     * Field _changedPickListDefinitionEntry.
     */
    private org.LexGrid.valueSets.PickListDefinition _changedPickListDefinitionEntry;

    /**
     * Field _changedValueSetDefinitionEntry.
     */
    private org.LexGrid.valueSets.ValueSetDefinition _changedValueSetDefinitionEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangedEntry() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'changedCodingSchemeEntry'.
     * 
     * @return the value of field 'ChangedCodingSchemeEntry'.
     */
    public org.LexGrid.codingSchemes.CodingScheme getChangedCodingSchemeEntry(
    ) {
        return this._changedCodingSchemeEntry;
    }

    /**
     * Returns the value of field 'changedPickListDefinitionEntry'.
     * 
     * @return the value of field 'ChangedPickListDefinitionEntry'.
     */
    public org.LexGrid.valueSets.PickListDefinition getChangedPickListDefinitionEntry(
    ) {
        return this._changedPickListDefinitionEntry;
    }

    /**
     * Returns the value of field 'changedValueSetDefinitionEntry'.
     * 
     * @return the value of field 'ChangedValueSetDefinitionEntry'.
     */
    public org.LexGrid.valueSets.ValueSetDefinition getChangedValueSetDefinitionEntry(
    ) {
        return this._changedValueSetDefinitionEntry;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
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
     * Sets the value of field 'changedCodingSchemeEntry'.
     * 
     * @param changedCodingSchemeEntry the value of field
     * 'changedCodingSchemeEntry'.
     */
    public void setChangedCodingSchemeEntry(
            final org.LexGrid.codingSchemes.CodingScheme changedCodingSchemeEntry) {
        this._changedCodingSchemeEntry = changedCodingSchemeEntry;
        this._choiceValue = changedCodingSchemeEntry;
    }

    /**
     * Sets the value of field 'changedPickListDefinitionEntry'.
     * 
     * @param changedPickListDefinitionEntry the value of field
     * 'changedPickListDefinitionEntry'.
     */
    public void setChangedPickListDefinitionEntry(
            final org.LexGrid.valueSets.PickListDefinition changedPickListDefinitionEntry) {
        this._changedPickListDefinitionEntry = changedPickListDefinitionEntry;
        this._choiceValue = changedPickListDefinitionEntry;
    }

    /**
     * Sets the value of field 'changedValueSetDefinitionEntry'.
     * 
     * @param changedValueSetDefinitionEntry the value of field
     * 'changedValueSetDefinitionEntry'.
     */
    public void setChangedValueSetDefinitionEntry(
            final org.LexGrid.valueSets.ValueSetDefinition changedValueSetDefinitionEntry) {
        this._changedValueSetDefinitionEntry = changedValueSetDefinitionEntry;
        this._choiceValue = changedValueSetDefinitionEntry;
    }

    /**
     * Method unmarshalChangedEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.versions.ChangedEntry
     */
    public static org.LexGrid.versions.ChangedEntry unmarshalChangedEntry(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.versions.ChangedEntry) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.versions.ChangedEntry.class, reader);
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
