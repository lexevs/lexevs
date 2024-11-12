/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * An associationName and the URI of the defining resource. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SupportedAssociation extends org.LexGrid.naming.URIMap 
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
     * The local name of the coding scheme that defines the
     * association. Default: the containing coding scheme.
     */
    private java.lang.String _codingScheme;

    /**
     * Local identifier of the namespace that defines the
     * association. Default: the containing coding scheme.
     */
    private java.lang.String _entityCodeNamespace;

    /**
     * The entity code of the association within the coding scheme.
     * Default: local name of the association.
     */
    private java.lang.String _entityCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedAssociation() {
        super();
        setContent("");
    }

    public SupportedAssociation(final java.lang.String defaultValue) {
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
     * Returns the value of field 'codingScheme'. The field
     * 'codingScheme' has the following description: The local name
     * of the coding scheme that defines the association. Default:
     * the containing coding scheme.
     * 
     * @return the value of field 'CodingScheme'.
     */
    public java.lang.String getCodingScheme(
    ) {
        return this._codingScheme;
    }

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
     * Returns the value of field 'entityCode'. The field
     * 'entityCode' has the following description: The entity code
     * of the association within the coding scheme. Default: local
     * name of the association.
     * 
     * @return the value of field 'EntityCode'.
     */
    public java.lang.String getEntityCode(
    ) {
        return this._entityCode;
    }

    /**
     * Returns the value of field 'entityCodeNamespace'. The field
     * 'entityCodeNamespace' has the following description: Local
     * identifier of the namespace that defines the association.
     * Default: the containing coding scheme.
     * 
     * @return the value of field 'EntityCodeNamespace'.
     */
    public java.lang.String getEntityCodeNamespace(
    ) {
        return this._entityCodeNamespace;
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
     * 'codingScheme' has the following description: The local name
     * of the coding scheme that defines the association. Default:
     * the containing coding scheme.
     * 
     * @param codingScheme the value of field 'codingScheme'.
     */
    public void setCodingScheme(
            final java.lang.String codingScheme) {
        this._codingScheme = codingScheme;
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
     * Sets the value of field 'entityCode'. The field 'entityCode'
     * has the following description: The entity code of the
     * association within the coding scheme. Default: local name of
     * the association.
     * 
     * @param entityCode the value of field 'entityCode'.
     */
    public void setEntityCode(
            final java.lang.String entityCode) {
        this._entityCode = entityCode;
    }

    /**
     * Sets the value of field 'entityCodeNamespace'. The field
     * 'entityCodeNamespace' has the following description: Local
     * identifier of the namespace that defines the association.
     * Default: the containing coding scheme.
     * 
     * @param entityCodeNamespace the value of field
     * 'entityCodeNamespace'.
     */
    public void setEntityCodeNamespace(
            final java.lang.String entityCodeNamespace) {
        this._entityCodeNamespace = entityCodeNamespace;
    }

    /**
     * Method unmarshalSupportedAssociation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.naming.SupportedAssociation
     */
    public static org.LexGrid.naming.SupportedAssociation unmarshalSupportedAssociation(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.SupportedAssociation) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.SupportedAssociation.class, reader);
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
