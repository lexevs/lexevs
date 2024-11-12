/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.concepts;

/**
 * A property that defines the entity in a particular langage or
 * context.. The propertyType of definition must be "definition"
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Definition extends org.LexGrid.commonTypes.Property 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * True means this is the preferred definition for the given
     * language and context.
     */
    private java.lang.Boolean _isPreferred;


      //----------------/
     //- Constructors -/
    //----------------/

    public Definition() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'isPreferred'. The field
     * 'isPreferred' has the following description: True means this
     * is the preferred definition for the given language and
     * context.
     * 
     * @return the value of field 'IsPreferred'.
     */
    public java.lang.Boolean getIsPreferred(
    ) {
        return this._isPreferred;
    }

    /**
     * Returns the value of field 'isPreferred'. The field
     * 'isPreferred' has the following description: True means this
     * is the preferred definition for the given language and
     * context.
     * 
     * @return the value of field 'IsPreferred'.
     */
    public java.lang.Boolean isIsPreferred(
    ) {
        return this._isPreferred;
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
     * Sets the value of field 'isPreferred'. The field
     * 'isPreferred' has the following description: True means this
     * is the preferred definition for the given language and
     * context.
     * 
     * @param isPreferred the value of field 'isPreferred'.
     */
    public void setIsPreferred(
            final java.lang.Boolean isPreferred) {
        this._isPreferred = isPreferred;
    }

    /**
     * Method unmarshalDefinition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.concepts.Definition
     */
    public static org.LexGrid.concepts.Definition unmarshalDefinition(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.concepts.Definition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.concepts.Definition.class, reader);
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
