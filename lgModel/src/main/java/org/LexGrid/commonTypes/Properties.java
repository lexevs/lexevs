/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * A collection of properties.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Properties extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An entry in the property list.
     */
    private java.util.List<org.LexGrid.commonTypes.Property> _propertyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Properties() {
        super();
        this._propertyList = new java.util.ArrayList<org.LexGrid.commonTypes.Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final org.LexGrid.commonTypes.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(vProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final int index,
            final org.LexGrid.commonTypes.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(index, vProperty);
    }

    /**
     * Method enumerateProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.commonTypes.Property> enumerateProperty(
    ) {
        return java.util.Collections.enumeration(this._propertyList);
    }

    /**
     * Method getProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.commonTypes.Property at
     * the given index
     */
    public org.LexGrid.commonTypes.Property getProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("getProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        return (org.LexGrid.commonTypes.Property) _propertyList.get(index);
    }

    /**
     * Method getProperty.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.commonTypes.Property[] getProperty(
    ) {
        org.LexGrid.commonTypes.Property[] array = new org.LexGrid.commonTypes.Property[0];
        return (org.LexGrid.commonTypes.Property[]) this._propertyList.toArray(array);
    }

    /**
     * Method getPropertyAsReference.Returns a reference to
     * '_propertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.commonTypes.Property> getPropertyAsReference(
    ) {
        return this._propertyList;
    }

    /**
     * Method getPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyCount(
    ) {
        return this._propertyList.size();
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
     * Method iterateProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.commonTypes.Property> iterateProperty(
    ) {
        return this._propertyList.iterator();
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
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     * Method removeProperty.
     * 
     * @param vProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeProperty(
            final org.LexGrid.commonTypes.Property vProperty) {
        boolean removed = _propertyList.remove(vProperty);
        return removed;
    }

    /**
     * Method removePropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.commonTypes.Property removePropertyAt(
            final int index) {
        java.lang.Object obj = this._propertyList.remove(index);
        return (org.LexGrid.commonTypes.Property) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProperty(
            final int index,
            final org.LexGrid.commonTypes.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("setProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        this._propertyList.set(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyArray
     */
    public void setProperty(
            final org.LexGrid.commonTypes.Property[] vPropertyArray) {
        //-- copy array
        _propertyList.clear();

        for (int i = 0; i < vPropertyArray.length; i++) {
                this._propertyList.add(vPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_propertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyList the Vector to copy.
     */
    public void setProperty(
            final java.util.List<org.LexGrid.commonTypes.Property> vPropertyList) {
        // copy vector
        this._propertyList.clear();

        this._propertyList.addAll(vPropertyList);
    }

    /**
     * Sets the value of '_propertyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyList the Vector to set.
     */
    public void setPropertyAsReference(
            final java.util.List<org.LexGrid.commonTypes.Property> propertyList) {
        this._propertyList = propertyList;
    }

    /**
     * Method unmarshalProperties.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.commonTypes.Properties
     */
    public static org.LexGrid.commonTypes.Properties unmarshalProperties(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.Properties) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.Properties.class, reader);
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
