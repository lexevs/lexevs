/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * The local identifier of a person, organization of bibliographic
 * resource that played a role in the creation or maintenance of a
 * resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Source extends org.mayo.edu.lgModel.LexGridBase 
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
     * The page, subheading, id or other localized information
     * within the source itself. Used to make a source reference
     * more precise. Must be absent in supportedSource.
     */
    private java.lang.String _subRef;

    /**
     * The role or purpose of the the source for this particular
     * resource (e.g. author, distributor). Must be absent in
     * supportedSource
     */
    private java.lang.String _role;


      //----------------/
     //- Constructors -/
    //----------------/

    public Source() {
        super();
        setContent("");
    }

    public Source(final java.lang.String defaultValue) {
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
     * Returns the value of field 'role'. The field 'role' has the
     * following description: The role or purpose of the the source
     * for this particular resource (e.g. author, distributor).
     * Must be absent in supportedSource
     * 
     * @return the value of field 'Role'.
     */
    public java.lang.String getRole(
    ) {
        return this._role;
    }

    /**
     * Returns the value of field 'subRef'. The field 'subRef' has
     * the following description: The page, subheading, id or other
     * localized information within the source itself. Used to make
     * a source reference more precise. Must be absent in
     * supportedSource.
     * 
     * @return the value of field 'SubRef'.
     */
    public java.lang.String getSubRef(
    ) {
        return this._subRef;
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
     * Sets the value of field 'role'. The field 'role' has the
     * following description: The role or purpose of the the source
     * for this particular resource (e.g. author, distributor).
     * Must be absent in supportedSource
     * 
     * @param role the value of field 'role'.
     */
    public void setRole(
            final java.lang.String role) {
        this._role = role;
    }

    /**
     * Sets the value of field 'subRef'. The field 'subRef' has the
     * following description: The page, subheading, id or other
     * localized information within the source itself. Used to make
     * a source reference more precise. Must be absent in
     * supportedSource.
     * 
     * @param subRef the value of field 'subRef'.
     */
    public void setSubRef(
            final java.lang.String subRef) {
        this._subRef = subRef;
    }

    /**
     * Method unmarshalSource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.commonTypes.Source
     */
    public static org.LexGrid.commonTypes.Source unmarshalSource(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.Source) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.Source.class, reader);
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
