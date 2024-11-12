/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * A codingSchemeName and the URI of the defining resource
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SupportedCodingScheme extends org.LexGrid.naming.URIMap 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * True means, one or more entities of this coding scheme is
     * brought in when the ontology is loaded. 
     *  The containing coding scheme also has its import flag set
     * to true if it has one or more entities brought in. 
     *  False means, loaded ontology has only references to this
     * coding scheme. Default: true
     */
    private java.lang.Boolean _isImported = new java.lang.Boolean("true");


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedCodingScheme() {
        super();
        setContent("");
    }

    public SupportedCodingScheme(final java.lang.String defaultValue) {
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
     * Returns the value of field 'isImported'. The field
     * 'isImported' has the following description: True means, one
     * or more entities of this coding scheme is brought in when
     * the ontology is loaded. 
     *  The containing coding scheme also has its import flag set
     * to true if it has one or more entities brought in. 
     *  False means, loaded ontology has only references to this
     * coding scheme. Default: true
     * 
     * @return the value of field 'IsImported'.
     */
    public java.lang.Boolean getIsImported(
    ) {
        return this._isImported;
    }

    /**
     * Returns the value of field 'isImported'. The field
     * 'isImported' has the following description: True means, one
     * or more entities of this coding scheme is brought in when
     * the ontology is loaded. 
     *  The containing coding scheme also has its import flag set
     * to true if it has one or more entities brought in. 
     *  False means, loaded ontology has only references to this
     * coding scheme. Default: true
     * 
     * @return the value of field 'IsImported'.
     */
    public java.lang.Boolean isIsImported(
    ) {
        return this._isImported;
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
     * Sets the value of field 'isImported'. The field 'isImported'
     * has the following description: True means, one or more
     * entities of this coding scheme is brought in when the
     * ontology is loaded. 
     *  The containing coding scheme also has its import flag set
     * to true if it has one or more entities brought in. 
     *  False means, loaded ontology has only references to this
     * coding scheme. Default: true
     * 
     * @param isImported the value of field 'isImported'.
     */
    public void setIsImported(
            final java.lang.Boolean isImported) {
        this._isImported = isImported;
    }

    /**
     * Method unmarshalSupportedCodingScheme.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.naming.SupportedCodingScheme
     */
    public static org.LexGrid.naming.SupportedCodingScheme unmarshalSupportedCodingScheme(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.SupportedCodingScheme) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.SupportedCodingScheme.class, reader);
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
