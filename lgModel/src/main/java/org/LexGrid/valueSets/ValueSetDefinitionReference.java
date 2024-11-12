/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A reference to the set of codes defined in another value set
 * definition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitionReference extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The URI of the value set definition to apply the operator
     * to. This value set definition may be contained within the
     * local service or may need to be resolved externally.
     */
    private java.lang.String _valueSetDefinitionURI;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitionReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'valueSetDefinitionURI'. The
     * field 'valueSetDefinitionURI' has the following description:
     * The URI of the value set definition to apply the operator
     * to. This value set definition may be contained within the
     * local service or may need to be resolved externally.
     * 
     * @return the value of field 'ValueSetDefinitionURI'.
     */
    public java.lang.String getValueSetDefinitionURI(
    ) {
        return this._valueSetDefinitionURI;
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
     * Sets the value of field 'valueSetDefinitionURI'. The field
     * 'valueSetDefinitionURI' has the following description: The
     * URI of the value set definition to apply the operator to.
     * This value set definition may be contained within the local
     * service or may need to be resolved externally.
     * 
     * @param valueSetDefinitionURI the value of field
     * 'valueSetDefinitionURI'.
     */
    public void setValueSetDefinitionURI(
            final java.lang.String valueSetDefinitionURI) {
        this._valueSetDefinitionURI = valueSetDefinitionURI;
    }

    /**
     * Method unmarshalValueSetDefinitionReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.ValueSetDefinitionReference
     */
    public static org.LexGrid.valueSets.ValueSetDefinitionReference unmarshalValueSetDefinitionReference(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.ValueSetDefinitionReference) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.ValueSetDefinitionReference.class, reader);
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
