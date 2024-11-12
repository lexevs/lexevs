/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * Additional information about the property and/or its association
 * with the resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertyQualifier extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local name of the qualifier. Must match a local id of a
     * supportedPropertyQualifier in the corresponding mappings
     * section.
     */
    private java.lang.String _propertyQualifierName;

    /**
     * The local name of the qualifier type. Must match a local id
     * of a supportedPropertyQualifierType in the corresponding
     * mappings section.
     */
    private java.lang.String _propertyQualifierType;

    /**
     * Field _value.
     */
    private org.LexGrid.commonTypes.Text _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertyQualifier() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'propertyQualifierName'. The
     * field 'propertyQualifierName' has the following description:
     * The local name of the qualifier. Must match a local id of a
     * supportedPropertyQualifier in the corresponding mappings
     * section.
     * 
     * @return the value of field 'PropertyQualifierName'.
     */
    public java.lang.String getPropertyQualifierName(
    ) {
        return this._propertyQualifierName;
    }

    /**
     * Returns the value of field 'propertyQualifierType'. The
     * field 'propertyQualifierType' has the following description:
     * The local name of the qualifier type. Must match a local id
     * of a supportedPropertyQualifierType in the corresponding
     * mappings section.
     * 
     * @return the value of field 'PropertyQualifierType'.
     */
    public java.lang.String getPropertyQualifierType(
    ) {
        return this._propertyQualifierType;
    }

    /**
     * Returns the value of field 'value'.
     * 
     * @return the value of field 'Value'.
     */
    public org.LexGrid.commonTypes.Text getValue(
    ) {
        return this._value;
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
     * Sets the value of field 'propertyQualifierName'. The field
     * 'propertyQualifierName' has the following description: The
     * local name of the qualifier. Must match a local id of a
     * supportedPropertyQualifier in the corresponding mappings
     * section.
     * 
     * @param propertyQualifierName the value of field
     * 'propertyQualifierName'.
     */
    public void setPropertyQualifierName(
            final java.lang.String propertyQualifierName) {
        this._propertyQualifierName = propertyQualifierName;
    }

    /**
     * Sets the value of field 'propertyQualifierType'. The field
     * 'propertyQualifierType' has the following description: The
     * local name of the qualifier type. Must match a local id of a
     * supportedPropertyQualifierType in the corresponding mappings
     * section.
     * 
     * @param propertyQualifierType the value of field
     * 'propertyQualifierType'.
     */
    public void setPropertyQualifierType(
            final java.lang.String propertyQualifierType) {
        this._propertyQualifierType = propertyQualifierType;
    }

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final org.LexGrid.commonTypes.Text value) {
        this._value = value;
    }

    /**
     * Method unmarshalPropertyQualifier.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.commonTypes.PropertyQualifier
     */
    public static org.LexGrid.commonTypes.PropertyQualifier unmarshalPropertyQualifier(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.PropertyQualifier) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.PropertyQualifier.class, reader);
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
