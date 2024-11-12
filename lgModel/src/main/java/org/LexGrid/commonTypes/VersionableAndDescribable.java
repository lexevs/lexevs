/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * A resource that is both versionable and describable.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class VersionableAndDescribable extends org.LexGrid.commonTypes.Versionable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The description of the resource.
     */
    private org.LexGrid.commonTypes.EntityDescription _entityDescription;


      //----------------/
     //- Constructors -/
    //----------------/

    public VersionableAndDescribable() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: The
     * description of the resource.
     * 
     * @return the value of field 'EntityDescription'.
     */
    public org.LexGrid.commonTypes.EntityDescription getEntityDescription(
    ) {
        return this._entityDescription;
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
     * Sets the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: The
     * description of the resource.
     * 
     * @param entityDescription the value of field
     * 'entityDescription'.
     */
    public void setEntityDescription(
            final org.LexGrid.commonTypes.EntityDescription entityDescription) {
        this._entityDescription = entityDescription;
    }

    /**
     * Method unmarshalVersionableAndDescribable.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.commonTypes.VersionableAndDescribable
     */
    public static org.LexGrid.commonTypes.VersionableAndDescribable unmarshalVersionableAndDescribable(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.VersionableAndDescribable) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.VersionableAndDescribable.class, reader);
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
