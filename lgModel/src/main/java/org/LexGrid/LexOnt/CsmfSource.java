/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt;

/**
 * Based on lgCommon:source.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CsmfSource extends org.LexGrid.commonTypes.Source 
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
     * If this flag is set to true, use the localId to check if the
     * entry already exists. If it exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     */
    private java.lang.Boolean _toUpdate = new java.lang.Boolean("true");


      //----------------/
     //- Constructors -/
    //----------------/

    public CsmfSource() {
        super();
        setContent("");
    }

    public CsmfSource(final java.lang.String defaultValue) {
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
     * Returns the value of field 'toUpdate'. The field 'toUpdate'
     * has the following description: If this flag is set to true,
     * use the localId to check if the entry already exists. If it
     * exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     * 
     * @return the value of field 'ToUpdate'.
     */
    public java.lang.Boolean getToUpdate(
    ) {
        return this._toUpdate;
    }

    /**
     * Returns the value of field 'toUpdate'. The field 'toUpdate'
     * has the following description: If this flag is set to true,
     * use the localId to check if the entry already exists. If it
     * exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     * 
     * @return the value of field 'ToUpdate'.
     */
    public java.lang.Boolean isToUpdate(
    ) {
        return this._toUpdate;
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
     * Sets the value of field 'toUpdate'. The field 'toUpdate' has
     * the following description: If this flag is set to true, use
     * the localId to check if the entry already exists. If it
     * exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     * 
     * @param toUpdate the value of field 'toUpdate'.
     */
    public void setToUpdate(
            final java.lang.Boolean toUpdate) {
        this._toUpdate = toUpdate;
    }

    /**
     * Method unmarshalCsmfSource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.LexOnt.CsmfSource
     */
    public static org.LexGrid.LexOnt.CsmfSource unmarshalCsmfSource(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.LexOnt.CsmfSource) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.LexOnt.CsmfSource.class, reader);
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
