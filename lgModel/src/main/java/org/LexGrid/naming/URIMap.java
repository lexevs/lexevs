/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * A local identifier that is used in a specific context (e.g.
 * language, property name, data type, etc) and an optional URI
 * that can be used to find the exact definition and meaning of the
 * local id. Note: the string portion of this entry can be used to
 * provide additional documentation or information, especially when
 * a URI is not supplied.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class URIMap extends org.mayo.edu.lgModel.LexGridBase 
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
     * An identifier that, in the context of the particular URIMap
     * type, assigns a meaning to how that property is used. As an
     * example, "en" might be used to identify English in the
     * context of language.
     */
    private java.lang.String _localId;

    /**
     * A URI that identifies the intended meaning of the localId.
     */
    private java.lang.String _uri;


      //----------------/
     //- Constructors -/
    //----------------/

    public URIMap() {
        super();
        setContent("");
    }

    public URIMap(final java.lang.String defaultValue) {
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
     * Returns the value of field 'localId'. The field 'localId'
     * has the following description: An identifier that, in the
     * context of the particular URIMap type, assigns a meaning to
     * how that property is used. As an example, "en" might be used
     * to identify English in the context of language.
     * 
     * @return the value of field 'LocalId'.
     */
    public java.lang.String getLocalId(
    ) {
        return this._localId;
    }

    /**
     * Returns the value of field 'uri'. The field 'uri' has the
     * following description: A URI that identifies the intended
     * meaning of the localId.
     * 
     * @return the value of field 'Uri'.
     */
    public java.lang.String getUri(
    ) {
        return this._uri;
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
     * Sets the value of field 'localId'. The field 'localId' has
     * the following description: An identifier that, in the
     * context of the particular URIMap type, assigns a meaning to
     * how that property is used. As an example, "en" might be used
     * to identify English in the context of language.
     * 
     * @param localId the value of field 'localId'.
     */
    public void setLocalId(
            final java.lang.String localId) {
        this._localId = localId;
    }

    /**
     * Sets the value of field 'uri'. The field 'uri' has the
     * following description: A URI that identifies the intended
     * meaning of the localId.
     * 
     * @param uri the value of field 'uri'.
     */
    public void setUri(
            final java.lang.String uri) {
        this._uri = uri;
    }

    /**
     * Method unmarshalURIMap.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.naming.URIMap
     */
    public static org.LexGrid.naming.URIMap unmarshalURIMap(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.URIMap) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.URIMap.class, reader);
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
