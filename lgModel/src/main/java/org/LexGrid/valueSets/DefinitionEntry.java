/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A reference to an entry code, a coding scheme or another value
 * set definition along with the instructions about how the
 * reference is applied. Definition entrys are applied in
 * entryOrder, with each successive entry either adding to or
 * subtracting from the final set of entity codes.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class DefinitionEntry extends org.LexGrid.commonTypes.Versionable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique identifier of the definition entry within the
     * definition as well as the relative order in which this entry
     * should be applied
     */
    private java.lang.Long _ruleOrder;

    /**
     * How this entry is to be applied to the value set definition
     */
    private org.LexGrid.valueSets.types.DefinitionOperator _operator;

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _entityReference.
     */
    private org.LexGrid.valueSets.EntityReference _entityReference;

    /**
     * Field _valueSetDefinitionReference.
     */
    private org.LexGrid.valueSets.ValueSetDefinitionReference _valueSetDefinitionReference;

    /**
     * Field _codingSchemeReference.
     */
    private org.LexGrid.valueSets.CodingSchemeReference _codingSchemeReference;

    /**
     * Field _propertyReference.
     */
    private org.LexGrid.valueSets.PropertyReference _propertyReference;


      //----------------/
     //- Constructors -/
    //----------------/

    public DefinitionEntry() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'codingSchemeReference'.
     * 
     * @return the value of field 'CodingSchemeReference'.
     */
    public org.LexGrid.valueSets.CodingSchemeReference getCodingSchemeReference(
    ) {
        return this._codingSchemeReference;
    }

    /**
     * Returns the value of field 'entityReference'.
     * 
     * @return the value of field 'EntityReference'.
     */
    public org.LexGrid.valueSets.EntityReference getEntityReference(
    ) {
        return this._entityReference;
    }

    /**
     * Returns the value of field 'operator'. The field 'operator'
     * has the following description: How this entry is to be
     * applied to the value set definition
     * 
     * @return the value of field 'Operator'.
     */
    public org.LexGrid.valueSets.types.DefinitionOperator getOperator(
    ) {
        return this._operator;
    }

    /**
     * Returns the value of field 'propertyReference'.
     * 
     * @return the value of field 'PropertyReference'.
     */
    public org.LexGrid.valueSets.PropertyReference getPropertyReference(
    ) {
        return this._propertyReference;
    }

    /**
     * Returns the value of field 'ruleOrder'. The field
     * 'ruleOrder' has the following description: The unique
     * identifier of the definition entry within the definition as
     * well as the relative order in which this entry should be
     * applied
     * 
     * @return the value of field 'RuleOrder'.
     */
    public java.lang.Long getRuleOrder(
    ) {
        return this._ruleOrder;
    }

    /**
     * Returns the value of field 'valueSetDefinitionReference'.
     * 
     * @return the value of field 'ValueSetDefinitionReference'.
     */
    public org.LexGrid.valueSets.ValueSetDefinitionReference getValueSetDefinitionReference(
    ) {
        return this._valueSetDefinitionReference;
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
     * Sets the value of field 'codingSchemeReference'.
     * 
     * @param codingSchemeReference the value of field
     * 'codingSchemeReference'.
     */
    public void setCodingSchemeReference(
            final org.LexGrid.valueSets.CodingSchemeReference codingSchemeReference) {
        this._codingSchemeReference = codingSchemeReference;
        this._choiceValue = codingSchemeReference;
    }

    /**
     * Sets the value of field 'entityReference'.
     * 
     * @param entityReference the value of field 'entityReference'.
     */
    public void setEntityReference(
            final org.LexGrid.valueSets.EntityReference entityReference) {
        this._entityReference = entityReference;
        this._choiceValue = entityReference;
    }

    /**
     * Sets the value of field 'operator'. The field 'operator' has
     * the following description: How this entry is to be applied
     * to the value set definition
     * 
     * @param operator the value of field 'operator'.
     */
    public void setOperator(
            final org.LexGrid.valueSets.types.DefinitionOperator operator) {
        this._operator = operator;
    }

    /**
     * Sets the value of field 'propertyReference'.
     * 
     * @param propertyReference the value of field
     * 'propertyReference'.
     */
    public void setPropertyReference(
            final org.LexGrid.valueSets.PropertyReference propertyReference) {
        this._propertyReference = propertyReference;
        this._choiceValue = propertyReference;
    }

    /**
     * Sets the value of field 'ruleOrder'. The field 'ruleOrder'
     * has the following description: The unique identifier of the
     * definition entry within the definition as well as the
     * relative order in which this entry should be applied
     * 
     * @param ruleOrder the value of field 'ruleOrder'.
     */
    public void setRuleOrder(
            final java.lang.Long ruleOrder) {
        this._ruleOrder = ruleOrder;
    }

    /**
     * Sets the value of field 'valueSetDefinitionReference'.
     * 
     * @param valueSetDefinitionReference the value of field
     * 'valueSetDefinitionReference'.
     */
    public void setValueSetDefinitionReference(
            final org.LexGrid.valueSets.ValueSetDefinitionReference valueSetDefinitionReference) {
        this._valueSetDefinitionReference = valueSetDefinitionReference;
        this._choiceValue = valueSetDefinitionReference;
    }

    /**
     * Method unmarshalDefinitionEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.valueSets.DefinitionEntry
     */
    public static org.LexGrid.valueSets.DefinitionEntry unmarshalDefinitionEntry(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.DefinitionEntry) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.DefinitionEntry.class, reader);
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
