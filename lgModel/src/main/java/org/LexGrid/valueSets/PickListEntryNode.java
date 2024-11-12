/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * An inclusion (pickListEntry) or exclusion
 * (pickListEntryExclusion) in a pick list definition
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PickListEntryNode extends org.LexGrid.commonTypes.Versionable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Unique identifier of this node within the list.
     */
    private java.lang.String _pickListEntryId;

    /**
     * Field _pickListEntryNodeChoice.
     */
    private org.LexGrid.valueSets.PickListEntryNodeChoice _pickListEntryNodeChoice;

    /**
     * Additional properties associated with this particular entry
     * node
     */
    private org.LexGrid.commonTypes.Properties _properties;


      //----------------/
     //- Constructors -/
    //----------------/

    public PickListEntryNode() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'pickListEntryId'. The field
     * 'pickListEntryId' has the following description: Unique
     * identifier of this node within the list.
     * 
     * @return the value of field 'PickListEntryId'.
     */
    public java.lang.String getPickListEntryId(
    ) {
        return this._pickListEntryId;
    }

    /**
     * Returns the value of field 'pickListEntryNodeChoice'.
     * 
     * @return the value of field 'PickListEntryNodeChoice'.
     */
    public org.LexGrid.valueSets.PickListEntryNodeChoice getPickListEntryNodeChoice(
    ) {
        return this._pickListEntryNodeChoice;
    }

    /**
     * Returns the value of field 'properties'. The field
     * 'properties' has the following description: Additional
     * properties associated with this particular entry node
     * 
     * @return the value of field 'Properties'.
     */
    public org.LexGrid.commonTypes.Properties getProperties(
    ) {
        return this._properties;
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
     * Sets the value of field 'pickListEntryId'. The field
     * 'pickListEntryId' has the following description: Unique
     * identifier of this node within the list.
     * 
     * @param pickListEntryId the value of field 'pickListEntryId'.
     */
    public void setPickListEntryId(
            final java.lang.String pickListEntryId) {
        this._pickListEntryId = pickListEntryId;
    }

    /**
     * Sets the value of field 'pickListEntryNodeChoice'.
     * 
     * @param pickListEntryNodeChoice the value of field
     * 'pickListEntryNodeChoice'.
     */
    public void setPickListEntryNodeChoice(
            final org.LexGrid.valueSets.PickListEntryNodeChoice pickListEntryNodeChoice) {
        this._pickListEntryNodeChoice = pickListEntryNodeChoice;
    }

    /**
     * Sets the value of field 'properties'. The field 'properties'
     * has the following description: Additional properties
     * associated with this particular entry node
     * 
     * @param properties the value of field 'properties'.
     */
    public void setProperties(
            final org.LexGrid.commonTypes.Properties properties) {
        this._properties = properties;
    }

    /**
     * Method unmarshalPickListEntryNode.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PickListEntryNode
     */
    public static org.LexGrid.valueSets.PickListEntryNode unmarshalPickListEntryNode(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PickListEntryNode) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PickListEntryNode.class, reader);
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
