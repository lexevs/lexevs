/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * A namespaceName and the corresponding URI
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SupportedNamespace extends org.LexGrid.naming.URIMap 
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
     * The local identifier of a supportedCodingScheme that
     * correspondes with this namespace. In many models, the
     * namespace used to qualify a concept code has a direct
     * correlation to the coding scheme itself. If codingSchemeName
     * is present, it asserts that the defining information about
     * entryCodes in this namespace can be found in the
     * corresponding coding scheme.
     */
    private java.lang.String _equivalentCodingScheme;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedNamespace() {
        super();
        setContent("");
    }

    public SupportedNamespace(final java.lang.String defaultValue) {
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
     * Returns the value of field 'equivalentCodingScheme'. The
     * field 'equivalentCodingScheme' has the following
     * description: The local identifier of a supportedCodingScheme
     * that correspondes with this namespace. In many models, the
     * namespace used to qualify a concept code has a direct
     * correlation to the coding scheme itself. If codingSchemeName
     * is present, it asserts that the defining information about
     * entryCodes in this namespace can be found in the
     * corresponding coding scheme.
     * 
     * @return the value of field 'EquivalentCodingScheme'.
     */
    public java.lang.String getEquivalentCodingScheme(
    ) {
        return this._equivalentCodingScheme;
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
     * Sets the value of field 'equivalentCodingScheme'. The field
     * 'equivalentCodingScheme' has the following description: The
     * local identifier of a supportedCodingScheme that
     * correspondes with this namespace. In many models, the
     * namespace used to qualify a concept code has a direct
     * correlation to the coding scheme itself. If codingSchemeName
     * is present, it asserts that the defining information about
     * entryCodes in this namespace can be found in the
     * corresponding coding scheme.
     * 
     * @param equivalentCodingScheme the value of field
     * 'equivalentCodingScheme'.
     */
    public void setEquivalentCodingScheme(
            final java.lang.String equivalentCodingScheme) {
        this._equivalentCodingScheme = equivalentCodingScheme;
    }

    /**
     * Method unmarshalSupportedNamespace.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.naming.SupportedNamespace
     */
    public static org.LexGrid.naming.SupportedNamespace unmarshalSupportedNamespace(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.SupportedNamespace) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.SupportedNamespace.class, reader);
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
