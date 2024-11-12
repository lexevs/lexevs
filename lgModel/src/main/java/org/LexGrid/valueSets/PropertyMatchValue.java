/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * Property matching value to be used to restrict entity property.
 * matchAlgorithm can be used in conjunction to get matching entity
 * properties.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertyMatchValue extends org.LexGrid.commonTypes.Text 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Algorithm to be used in conjunction with propertyValue.
     */
    private java.lang.String _matchAlgorithm;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertyMatchValue() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'matchAlgorithm'. The field
     * 'matchAlgorithm' has the following description: Algorithm to
     * be used in conjunction with propertyValue.
     * 
     * @return the value of field 'MatchAlgorithm'.
     */
    public java.lang.String getMatchAlgorithm(
    ) {
        return this._matchAlgorithm;
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
     * Sets the value of field 'matchAlgorithm'. The field
     * 'matchAlgorithm' has the following description: Algorithm to
     * be used in conjunction with propertyValue.
     * 
     * @param matchAlgorithm the value of field 'matchAlgorithm'.
     */
    public void setMatchAlgorithm(
            final java.lang.String matchAlgorithm) {
        this._matchAlgorithm = matchAlgorithm;
    }

    /**
     * Method unmarshalPropertyMatchValue.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PropertyMatchValue
     */
    public static org.LexGrid.valueSets.PropertyMatchValue unmarshalPropertyMatchValue(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PropertyMatchValue) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PropertyMatchValue.class, reader);
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
