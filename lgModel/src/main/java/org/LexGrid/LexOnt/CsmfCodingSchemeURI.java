/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt;

/**
 * A name identifier based on lgCommon:registeredName.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CsmfCodingSchemeURI extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content;

    /**
     * If this flag is 'true', the value provided in the source
     * file will be replaced with this one. 
     *  Otherwise, this value is treated as a default value and
     * used only if the value is not provided in the source file.
     *  The default value of this is set to 'true'.
     */
    private java.lang.Boolean _toOverride = new java.lang.Boolean("true");


      //----------------/
     //- Constructors -/
    //----------------/

    public CsmfCodingSchemeURI() {
        super();
    }

    public CsmfCodingSchemeURI(final java.lang.String defaultValue) {
        try {
            setContent( new java.lang.String(defaultValue));
         } catch(Exception e) {
            throw new RuntimeException("Unable to cast default value for simple content!");
         } 
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
     * Returns the value of field 'toOverride'. The field
     * 'toOverride' has the following description: If this flag is
     * 'true', the value provided in the source file will be
     * replaced with this one. 
     *  Otherwise, this value is treated as a default value and
     * used only if the value is not provided in the source file.
     *  The default value of this is set to 'true'.
     * 
     * @return the value of field 'ToOverride'.
     */
    public java.lang.Boolean getToOverride(
    ) {
        return this._toOverride;
    }

    /**
     * Returns the value of field 'toOverride'. The field
     * 'toOverride' has the following description: If this flag is
     * 'true', the value provided in the source file will be
     * replaced with this one. 
     *  Otherwise, this value is treated as a default value and
     * used only if the value is not provided in the source file.
     *  The default value of this is set to 'true'.
     * 
     * @return the value of field 'ToOverride'.
     */
    public java.lang.Boolean isToOverride(
    ) {
        return this._toOverride;
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
     * Sets the value of field 'toOverride'. The field 'toOverride'
     * has the following description: If this flag is 'true', the
     * value provided in the source file will be replaced with this
     * one. 
     *  Otherwise, this value is treated as a default value and
     * used only if the value is not provided in the source file.
     *  The default value of this is set to 'true'.
     * 
     * @param toOverride the value of field 'toOverride'.
     */
    public void setToOverride(
            final java.lang.Boolean toOverride) {
        this._toOverride = toOverride;
    }

    /**
     * Method unmarshalCsmfCodingSchemeURI.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.LexOnt.CsmfCodingSchemeUR
     */
    public static org.LexGrid.LexOnt.CsmfCodingSchemeURI unmarshalCsmfCodingSchemeURI(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.LexOnt.CsmfCodingSchemeURI) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.LexOnt.CsmfCodingSchemeURI.class, reader);
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
