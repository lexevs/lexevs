/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A collection of value set definitions.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitions extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local names and corresponding URIs used in this collectio
     */
    private org.LexGrid.naming.Mappings _mappings;

    /**
     * A value set definition
     */
    private java.util.List<org.LexGrid.valueSets.ValueSetDefinition> _valueSetDefinitionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitions() {
        super();
        this._valueSetDefinitionList = new java.util.ArrayList<org.LexGrid.valueSets.ValueSetDefinition>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vValueSetDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValueSetDefinition(
            final org.LexGrid.valueSets.ValueSetDefinition vValueSetDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._valueSetDefinitionList.add(vValueSetDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vValueSetDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValueSetDefinition(
            final int index,
            final org.LexGrid.valueSets.ValueSetDefinition vValueSetDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._valueSetDefinitionList.add(index, vValueSetDefinition);
    }

    /**
     * Method enumerateValueSetDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.valueSets.ValueSetDefinition> enumerateValueSetDefinition(
    ) {
        return java.util.Collections.enumeration(this._valueSetDefinitionList);
    }

    /**
     * Returns the value of field 'mappings'. The field 'mappings'
     * has the following description: The local names and
     * corresponding URIs used in this collection
     * 
     * @return the value of field 'Mappings'.
     */
    public org.LexGrid.naming.Mappings getMappings(
    ) {
        return this._mappings;
    }

    /**
     * Method getValueSetDefinition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.valueSets.ValueSetDefinition at the given index
     */
    public org.LexGrid.valueSets.ValueSetDefinition getValueSetDefinition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueSetDefinitionList.size()) {
            throw new IndexOutOfBoundsException("getValueSetDefinition: Index value '" + index + "' not in range [0.." + (this._valueSetDefinitionList.size() - 1) + "]");
        }

        return (org.LexGrid.valueSets.ValueSetDefinition) _valueSetDefinitionList.get(index);
    }

    /**
     * Method getValueSetDefinition.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.valueSets.ValueSetDefinition[] getValueSetDefinition(
    ) {
        org.LexGrid.valueSets.ValueSetDefinition[] array = new org.LexGrid.valueSets.ValueSetDefinition[0];
        return (org.LexGrid.valueSets.ValueSetDefinition[]) this._valueSetDefinitionList.toArray(array);
    }

    /**
     * Method getValueSetDefinitionAsReference.Returns a reference
     * to '_valueSetDefinitionList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.valueSets.ValueSetDefinition> getValueSetDefinitionAsReference(
    ) {
        return this._valueSetDefinitionList;
    }

    /**
     * Method getValueSetDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getValueSetDefinitionCount(
    ) {
        return this._valueSetDefinitionList.size();
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
     * Method iterateValueSetDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.valueSets.ValueSetDefinition> iterateValueSetDefinition(
    ) {
        return this._valueSetDefinitionList.iterator();
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
     */
    public void removeAllValueSetDefinition(
    ) {
        this._valueSetDefinitionList.clear();
    }

    /**
     * Method removeValueSetDefinition.
     * 
     * @param vValueSetDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removeValueSetDefinition(
            final org.LexGrid.valueSets.ValueSetDefinition vValueSetDefinition) {
        boolean removed = _valueSetDefinitionList.remove(vValueSetDefinition);
        return removed;
    }

    /**
     * Method removeValueSetDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.valueSets.ValueSetDefinition removeValueSetDefinitionAt(
            final int index) {
        java.lang.Object obj = this._valueSetDefinitionList.remove(index);
        return (org.LexGrid.valueSets.ValueSetDefinition) obj;
    }

    /**
     * Sets the value of field 'mappings'. The field 'mappings' has
     * the following description: The local names and corresponding
     * URIs used in this collection
     * 
     * @param mappings the value of field 'mappings'.
     */
    public void setMappings(
            final org.LexGrid.naming.Mappings mappings) {
        this._mappings = mappings;
    }

    /**
     * 
     * 
     * @param index
     * @param vValueSetDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValueSetDefinition(
            final int index,
            final org.LexGrid.valueSets.ValueSetDefinition vValueSetDefinition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueSetDefinitionList.size()) {
            throw new IndexOutOfBoundsException("setValueSetDefinition: Index value '" + index + "' not in range [0.." + (this._valueSetDefinitionList.size() - 1) + "]");
        }

        this._valueSetDefinitionList.set(index, vValueSetDefinition);
    }

    /**
     * 
     * 
     * @param vValueSetDefinitionArray
     */
    public void setValueSetDefinition(
            final org.LexGrid.valueSets.ValueSetDefinition[] vValueSetDefinitionArray) {
        //-- copy array
        _valueSetDefinitionList.clear();

        for (int i = 0; i < vValueSetDefinitionArray.length; i++) {
                this._valueSetDefinitionList.add(vValueSetDefinitionArray[i]);
        }
    }

    /**
     * Sets the value of '_valueSetDefinitionList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vValueSetDefinitionList the Vector to copy.
     */
    public void setValueSetDefinition(
            final java.util.List<org.LexGrid.valueSets.ValueSetDefinition> vValueSetDefinitionList) {
        // copy vector
        this._valueSetDefinitionList.clear();

        this._valueSetDefinitionList.addAll(vValueSetDefinitionList);
    }

    /**
     * Sets the value of '_valueSetDefinitionList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param valueSetDefinitionList the Vector to set.
     */
    public void setValueSetDefinitionAsReference(
            final java.util.List<org.LexGrid.valueSets.ValueSetDefinition> valueSetDefinitionList) {
        this._valueSetDefinitionList = valueSetDefinitionList;
    }

    /**
     * Method unmarshalValueSetDefinitions.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.ValueSetDefinitions
     */
    public static org.LexGrid.valueSets.ValueSetDefinitions unmarshalValueSetDefinitions(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.ValueSetDefinitions) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.ValueSetDefinitions.class, reader);
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
