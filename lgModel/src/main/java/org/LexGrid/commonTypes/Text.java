/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * The value of an entityDescription, property, etc.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Text extends org.LexGrid.builtins.TsAnyType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local identifier of the format or data type of the text.
     * Must match a local id of a supportedDataType in the
     * corresponding mappings section. Default:
     * tsCaseSensitiveIA5String
     */
    private java.lang.String _dataType;

    /**
     * internal content storage
     */
    private java.lang.String _content = "";


      //----------------/
     //- Constructors -/
    //----------------/

    public Text() {
        super();
        setContent("");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public java.lang.String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'dataType'. The field 'dataType'
     * has the following description: The local identifier of the
     * format or data type of the text. Must match a local id of a
     * supportedDataType in the corresponding mappings section.
     * Default: tsCaseSensitiveIA5String
     * 
     * @return the value of field 'DataType'.
     */
    public java.lang.String getDataType(
    ) {
        return this._dataType;
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.lang.String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'dataType'. The field 'dataType' has
     * the following description: The local identifier of the
     * format or data type of the text. Must match a local id of a
     * supportedDataType in the corresponding mappings section.
     * Default: tsCaseSensitiveIA5String
     * 
     * @param dataType the value of field 'dataType'.
     */
    public void setDataType(
            final java.lang.String dataType) {
        this._dataType = dataType;
    }

    /**
     * Method unmarshalText.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.commonTypes.Text
     */
    public static org.LexGrid.commonTypes.Text unmarshalText(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.Text) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.Text.class, reader);
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
