/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * A source and the URI of the defining resource. Source references
 * can also carry an additional compositional rule section that
 * describes how to combine a subpart such as a page number,
 * section name, etc. with the core URI in order to form a
 * meaningful URL. An optional role can also be specified.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SupportedSource extends org.LexGrid.naming.URIMap 
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
     * Rule for combining source-specific information such as page
     * numbers, sections and the like with the source URL. Syntax:
     * [ID] - names the identifier. Everythinng else is literal. 
     */
    private java.lang.String _assemblyRule;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedSource() {
        super();
        setContent("");
    }

    public SupportedSource(final java.lang.String defaultValue) {
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
     * Returns the value of field 'assemblyRule'. The field
     * 'assemblyRule' has the following description: Rule for
     * combining source-specific information such as page numbers,
     * sections and the like with the source URL. Syntax: [ID] -
     * names the identifier. Everythinng else is literal. 
     * 
     * @return the value of field 'AssemblyRule'.
     */
    public java.lang.String getAssemblyRule(
    ) {
        return this._assemblyRule;
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
     * Sets the value of field 'assemblyRule'. The field
     * 'assemblyRule' has the following description: Rule for
     * combining source-specific information such as page numbers,
     * sections and the like with the source URL. Syntax: [ID] -
     * names the identifier. Everythinng else is literal. 
     * 
     * @param assemblyRule the value of field 'assemblyRule'.
     */
    public void setAssemblyRule(
            final java.lang.String assemblyRule) {
        this._assemblyRule = assemblyRule;
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
     * Method unmarshalSupportedSource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.naming.SupportedSource
     */
    public static org.LexGrid.naming.SupportedSource unmarshalSupportedSource(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.SupportedSource) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.SupportedSource.class, reader);
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
