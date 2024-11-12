/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt;

/**
 * A name identifier based on lgBuiltin:tsCaseIgnoreIA5String.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CsmfLocalName extends org.mayo.edu.lgModel.LexGridBase 
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
     * If this flag is set to true, this value will be added to the
     * list of values (if not there already). 
     *  Otherwise, this value is treated as the default value and
     * used only if no other value is provided in the source file.
     */
    private java.lang.Boolean _toAdd = new java.lang.Boolean("true");


      //----------------/
     //- Constructors -/
    //----------------/

    public CsmfLocalName() {
        super();
        setContent("");
    }

    public CsmfLocalName(final java.lang.String defaultValue) {
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
     * Returns the value of field 'toAdd'. The field 'toAdd' has
     * the following description: If this flag is set to true, this
     * value will be added to the list of values (if not there
     * already). 
     *  Otherwise, this value is treated as the default value and
     * used only if no other value is provided in the source file.
     * 
     * @return the value of field 'ToAdd'.
     */
    public java.lang.Boolean getToAdd(
    ) {
        return this._toAdd;
    }

    /**
     * Returns the value of field 'toAdd'. The field 'toAdd' has
     * the following description: If this flag is set to true, this
     * value will be added to the list of values (if not there
     * already). 
     *  Otherwise, this value is treated as the default value and
     * used only if no other value is provided in the source file.
     * 
     * @return the value of field 'ToAdd'.
     */
    public java.lang.Boolean isToAdd(
    ) {
        return this._toAdd;
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
     * Sets the value of field 'toAdd'. The field 'toAdd' has the
     * following description: If this flag is set to true, this
     * value will be added to the list of values (if not there
     * already). 
     *  Otherwise, this value is treated as the default value and
     * used only if no other value is provided in the source file.
     * 
     * @param toAdd the value of field 'toAdd'.
     */
    public void setToAdd(
            final java.lang.Boolean toAdd) {
        this._toAdd = toAdd;
    }

    /**
     * Method unmarshalCsmfLocalName.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.LexOnt.CsmfLocalName
     */
    public static org.LexGrid.LexOnt.CsmfLocalName unmarshalCsmfLocalName(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.LexOnt.CsmfLocalName) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.LexOnt.CsmfLocalName.class, reader);
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
