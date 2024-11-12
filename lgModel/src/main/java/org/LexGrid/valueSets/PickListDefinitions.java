/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A collection of pick list definitions.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PickListDefinitions extends org.mayo.edu.lgModel.LexGridBase 
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
     * A pick list definition
     */
    private java.util.List<org.LexGrid.valueSets.PickListDefinition> _pickListDefinitionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PickListDefinitions() {
        super();
        this._pickListDefinitionList = new java.util.ArrayList<org.LexGrid.valueSets.PickListDefinition>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPickListDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPickListDefinition(
            final org.LexGrid.valueSets.PickListDefinition vPickListDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._pickListDefinitionList.add(vPickListDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vPickListDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPickListDefinition(
            final int index,
            final org.LexGrid.valueSets.PickListDefinition vPickListDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._pickListDefinitionList.add(index, vPickListDefinition);
    }

    /**
     * Method enumeratePickListDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.valueSets.PickListDefinition> enumeratePickListDefinition(
    ) {
        return java.util.Collections.enumeration(this._pickListDefinitionList);
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
     * Method getPickListDefinition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.valueSets.PickListDefinition at the given index
     */
    public org.LexGrid.valueSets.PickListDefinition getPickListDefinition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pickListDefinitionList.size()) {
            throw new IndexOutOfBoundsException("getPickListDefinition: Index value '" + index + "' not in range [0.." + (this._pickListDefinitionList.size() - 1) + "]");
        }

        return (org.LexGrid.valueSets.PickListDefinition) _pickListDefinitionList.get(index);
    }

    /**
     * Method getPickListDefinition.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.valueSets.PickListDefinition[] getPickListDefinition(
    ) {
        org.LexGrid.valueSets.PickListDefinition[] array = new org.LexGrid.valueSets.PickListDefinition[0];
        return (org.LexGrid.valueSets.PickListDefinition[]) this._pickListDefinitionList.toArray(array);
    }

    /**
     * Method getPickListDefinitionAsReference.Returns a reference
     * to '_pickListDefinitionList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.valueSets.PickListDefinition> getPickListDefinitionAsReference(
    ) {
        return this._pickListDefinitionList;
    }

    /**
     * Method getPickListDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getPickListDefinitionCount(
    ) {
        return this._pickListDefinitionList.size();
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
     * Method iteratePickListDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.valueSets.PickListDefinition> iteratePickListDefinition(
    ) {
        return this._pickListDefinitionList.iterator();
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
    public void removeAllPickListDefinition(
    ) {
        this._pickListDefinitionList.clear();
    }

    /**
     * Method removePickListDefinition.
     * 
     * @param vPickListDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removePickListDefinition(
            final org.LexGrid.valueSets.PickListDefinition vPickListDefinition) {
        boolean removed = _pickListDefinitionList.remove(vPickListDefinition);
        return removed;
    }

    /**
     * Method removePickListDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.valueSets.PickListDefinition removePickListDefinitionAt(
            final int index) {
        java.lang.Object obj = this._pickListDefinitionList.remove(index);
        return (org.LexGrid.valueSets.PickListDefinition) obj;
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
     * @param vPickListDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPickListDefinition(
            final int index,
            final org.LexGrid.valueSets.PickListDefinition vPickListDefinition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pickListDefinitionList.size()) {
            throw new IndexOutOfBoundsException("setPickListDefinition: Index value '" + index + "' not in range [0.." + (this._pickListDefinitionList.size() - 1) + "]");
        }

        this._pickListDefinitionList.set(index, vPickListDefinition);
    }

    /**
     * 
     * 
     * @param vPickListDefinitionArray
     */
    public void setPickListDefinition(
            final org.LexGrid.valueSets.PickListDefinition[] vPickListDefinitionArray) {
        //-- copy array
        _pickListDefinitionList.clear();

        for (int i = 0; i < vPickListDefinitionArray.length; i++) {
                this._pickListDefinitionList.add(vPickListDefinitionArray[i]);
        }
    }

    /**
     * Sets the value of '_pickListDefinitionList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vPickListDefinitionList the Vector to copy.
     */
    public void setPickListDefinition(
            final java.util.List<org.LexGrid.valueSets.PickListDefinition> vPickListDefinitionList) {
        // copy vector
        this._pickListDefinitionList.clear();

        this._pickListDefinitionList.addAll(vPickListDefinitionList);
    }

    /**
     * Sets the value of '_pickListDefinitionList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param pickListDefinitionList the Vector to set.
     */
    public void setPickListDefinitionAsReference(
            final java.util.List<org.LexGrid.valueSets.PickListDefinition> pickListDefinitionList) {
        this._pickListDefinitionList = pickListDefinitionList;
    }

    /**
     * Method unmarshalPickListDefinitions.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PickListDefinitions
     */
    public static org.LexGrid.valueSets.PickListDefinitions unmarshalPickListDefinitions(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PickListDefinitions) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PickListDefinitions.class, reader);
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
