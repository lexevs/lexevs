/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A reference to a propertyName or propertyValue and matchAlgoritm
 * to use.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertyReference extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local identifier of the codingScheme that this
     * propertyreference will be resolved against. codingScheme
     * must match a local id of a supportedCodingscheme in the
     * corresponding mappings section.
     */
    private java.lang.String _codingScheme;

    /**
     * The local identifier to be used to restrict the entities to
     * have property with this name. Must match a local id of a
     * supportedProperty in the corresponding mappings section.
     */
    private java.lang.String _propertyName;

    /**
     * Value to be used to restrict entity property. matchAlgorithm
     * can be used in conjunction to get matching entity properties.
     */
    private org.LexGrid.valueSets.PropertyMatchValue _propertyMatchValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertyReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codingScheme'. The field
     * 'codingScheme' has the following description: The local
     * identifier of the codingScheme that this propertyreference
     * will be resolved against. codingScheme must match a local id
     * of a supportedCodingscheme in the corresponding mappings
     * section.
     * 
     * @return the value of field 'CodingScheme'.
     */
    public java.lang.String getCodingScheme(
    ) {
        return this._codingScheme;
    }

    /**
     * Returns the value of field 'propertyMatchValue'. The field
     * 'propertyMatchValue' has the following description: Value to
     * be used to restrict entity property. matchAlgorithm can be
     * used in conjunction to get matching entity properties.
     * 
     * @return the value of field 'PropertyMatchValue'.
     */
    public org.LexGrid.valueSets.PropertyMatchValue getPropertyMatchValue(
    ) {
        return this._propertyMatchValue;
    }

    /**
     * Returns the value of field 'propertyName'. The field
     * 'propertyName' has the following description: The local
     * identifier to be used to restrict the entities to have
     * property with this name. Must match a local id of a
     * supportedProperty in the corresponding mappings section.
     * 
     * @return the value of field 'PropertyName'.
     */
    public java.lang.String getPropertyName(
    ) {
        return this._propertyName;
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
     * Sets the value of field 'codingScheme'. The field
     * 'codingScheme' has the following description: The local
     * identifier of the codingScheme that this propertyreference
     * will be resolved against. codingScheme must match a local id
     * of a supportedCodingscheme in the corresponding mappings
     * section.
     * 
     * @param codingScheme the value of field 'codingScheme'.
     */
    public void setCodingScheme(
            final java.lang.String codingScheme) {
        this._codingScheme = codingScheme;
    }

    /**
     * Sets the value of field 'propertyMatchValue'. The field
     * 'propertyMatchValue' has the following description: Value to
     * be used to restrict entity property. matchAlgorithm can be
     * used in conjunction to get matching entity properties.
     * 
     * @param propertyMatchValue the value of field
     * 'propertyMatchValue'.
     */
    public void setPropertyMatchValue(
            final org.LexGrid.valueSets.PropertyMatchValue propertyMatchValue) {
        this._propertyMatchValue = propertyMatchValue;
    }

    /**
     * Sets the value of field 'propertyName'. The field
     * 'propertyName' has the following description: The local
     * identifier to be used to restrict the entities to have
     * property with this name. Must match a local id of a
     * supportedProperty in the corresponding mappings section.
     * 
     * @param propertyName the value of field 'propertyName'.
     */
    public void setPropertyName(
            final java.lang.String propertyName) {
        this._propertyName = propertyName;
    }

    /**
     * Method unmarshalPropertyReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PropertyReference
     */
    public static org.LexGrid.valueSets.PropertyReference unmarshalPropertyReference(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PropertyReference) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PropertyReference.class, reader);
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
