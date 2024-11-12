/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.concepts;

/**
 * A link between two properties for an entity.. Examples include
 * acronymFor, abbreviationOf, spellingVariantOf, etc. Must be in
 * supportedPropertyLink.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertyLink extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The identifier of the first property in the link.
     */
    private java.lang.String _sourceProperty;

    /**
     * The local name of the type of linke between properties.
     * propertyLink must match a local id of a
     * supportedPropertyLink in the corresponding mappings section
     */
    private java.lang.String _propertyLink;

    /**
     * The identifier of the second property in the link.
     */
    private java.lang.String _targetProperty;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertyLink() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'propertyLink'. The field
     * 'propertyLink' has the following description: The local name
     * of the type of linke between properties. propertyLink must
     * match a local id of a supportedPropertyLink in the
     * corresponding mappings section
     * 
     * @return the value of field 'PropertyLink'.
     */
    public java.lang.String getPropertyLink(
    ) {
        return this._propertyLink;
    }

    /**
     * Returns the value of field 'sourceProperty'. The field
     * 'sourceProperty' has the following description: The
     * identifier of the first property in the link.
     * 
     * @return the value of field 'SourceProperty'.
     */
    public java.lang.String getSourceProperty(
    ) {
        return this._sourceProperty;
    }

    /**
     * Returns the value of field 'targetProperty'. The field
     * 'targetProperty' has the following description: The
     * identifier of the second property in the link.
     * 
     * @return the value of field 'TargetProperty'.
     */
    public java.lang.String getTargetProperty(
    ) {
        return this._targetProperty;
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
     * Sets the value of field 'propertyLink'. The field
     * 'propertyLink' has the following description: The local name
     * of the type of linke between properties. propertyLink must
     * match a local id of a supportedPropertyLink in the
     * corresponding mappings section
     * 
     * @param propertyLink the value of field 'propertyLink'.
     */
    public void setPropertyLink(
            final java.lang.String propertyLink) {
        this._propertyLink = propertyLink;
    }

    /**
     * Sets the value of field 'sourceProperty'. The field
     * 'sourceProperty' has the following description: The
     * identifier of the first property in the link.
     * 
     * @param sourceProperty the value of field 'sourceProperty'.
     */
    public void setSourceProperty(
            final java.lang.String sourceProperty) {
        this._sourceProperty = sourceProperty;
    }

    /**
     * Sets the value of field 'targetProperty'. The field
     * 'targetProperty' has the following description: The
     * identifier of the second property in the link.
     * 
     * @param targetProperty the value of field 'targetProperty'.
     */
    public void setTargetProperty(
            final java.lang.String targetProperty) {
        this._targetProperty = targetProperty;
    }

    /**
     * Method unmarshalPropertyLink.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.concepts.PropertyLink
     */
    public static org.LexGrid.concepts.PropertyLink unmarshalPropertyLink(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.concepts.PropertyLink) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.concepts.PropertyLink.class, reader);
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
