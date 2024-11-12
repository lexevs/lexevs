/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * An entity code that is explicitly excluded from a pick list.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PickListEntryExclusion extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Entity code associated with this entry. 
     */
    private java.lang.String _entityCode;

    /**
     * Local identifier of the namespace of the entity code if
     * different than the pickListDefinition
     * defaultEntityCodeNamespace. entityCodeNamespace must match a
     * local id of a supportedNamespace in the mappings section.
     */
    private java.lang.String _entityCodeNamespace;


      //----------------/
     //- Constructors -/
    //----------------/

    public PickListEntryExclusion() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'entityCode'. The field
     * 'entityCode' has the following description: Entity code
     * associated with this entry. 
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
     * identifier of the namespace of the entity code if different
     * than the pickListDefinition defaultEntityCodeNamespace.
     * entityCodeNamespace must match a local id of a
     * supportedNamespace in the mappings section.
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
     * Sets the value of field 'entityCode'. The field 'entityCode'
     * has the following description: Entity code associated with
     * this entry. 
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
     * identifier of the namespace of the entity code if different
     * than the pickListDefinition defaultEntityCodeNamespace.
     * entityCodeNamespace must match a local id of a
     * supportedNamespace in the mappings section.
     * 
     * @param entityCodeNamespace the value of field
     * 'entityCodeNamespace'.
     */
    public void setEntityCodeNamespace(
            final java.lang.String entityCodeNamespace) {
        this._entityCodeNamespace = entityCodeNamespace;
    }

    /**
     * Method unmarshalPickListEntryExclusion.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PickListEntryExclusion
     */
    public static org.LexGrid.valueSets.PickListEntryExclusion unmarshalPickListEntryExclusion(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PickListEntryExclusion) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PickListEntryExclusion.class, reader);
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
