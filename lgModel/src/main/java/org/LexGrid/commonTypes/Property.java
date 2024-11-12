/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes;

/**
 * A description, definition, annotation or other attribute that
 * serves to further define or identify an resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Property extends org.LexGrid.commonTypes.Versionable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local identifier that defines the meaning of this
     * particular property entry. Must match a local id of a
     * supportedProperty in the corresponding mappings section.
     */
    private java.lang.String _propertyName;

    /**
     * A unique identifier of this particular
     * propert/resource/value instance.
     */
    private java.lang.String _propertyId;

    /**
     * The LexGrid model element that this property represents. As
     * an example, the codingScheme "copyright" attribute could be
     * represented by a property with a propertyType that mapped to
     * lgCS:copyRight. Must match a local id of a
     * supportedPropertyType in the corresponding mappings section.
     */
    private java.lang.String _propertyType;

    /**
     * The local identifier of the language of the property value.
     * Must match a local id of a supportedLanguage in the
     * corresponding mappings section. If omitted, and language is
     * applicable to this property, the defaultLanguage of the
     * surrounding resource is used.
     */
    private java.lang.String _language;

    /**
     * The local identifiers of the source(s) of this property.
     * Must match a local id of a supportedSource in the
     * corresponding mappings section.
     */
    private java.util.List<org.LexGrid.commonTypes.Source> _sourceList;

    /**
     * The local identifiers of the context(s) in which this
     * property applies. Must match a local id of a
     * supportedContext in the corresponding mappings section.
     */
    private java.util.List<java.lang.String> _usageContextList;

    /**
     * A qualifier that provides additional information about this
     * particular property and/or its association with the resource.
     */
    private java.util.List<org.LexGrid.commonTypes.PropertyQualifier> _propertyQualifierList;

    /**
     * The value of the property associated with this particular
     * resource. Note that "text" may be any type, including a URI,
     * html fragment, etc.
     */
    private org.LexGrid.commonTypes.Text _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public Property() {
        super();
        this._sourceList = new java.util.ArrayList<org.LexGrid.commonTypes.Source>();
        this._usageContextList = new java.util.ArrayList<java.lang.String>();
        this._propertyQualifierList = new java.util.ArrayList<org.LexGrid.commonTypes.PropertyQualifier>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPropertyQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertyQualifier(
            final org.LexGrid.commonTypes.PropertyQualifier vPropertyQualifier)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyQualifierList.add(vPropertyQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertyQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertyQualifier(
            final int index,
            final org.LexGrid.commonTypes.PropertyQualifier vPropertyQualifier)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyQualifierList.add(index, vPropertyQualifier);
    }

    /**
     * 
     * 
     * @param vSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final org.LexGrid.commonTypes.Source vSource)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceList.add(vSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final int index,
            final org.LexGrid.commonTypes.Source vSource)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceList.add(index, vSource);
    }

    /**
     * 
     * 
     * @param vUsageContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsageContext(
            final java.lang.String vUsageContext)
    throws java.lang.IndexOutOfBoundsException {
        this._usageContextList.add(vUsageContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vUsageContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsageContext(
            final int index,
            final java.lang.String vUsageContext)
    throws java.lang.IndexOutOfBoundsException {
        this._usageContextList.add(index, vUsageContext);
    }

    /**
     * Method enumeratePropertyQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.commonTypes.PropertyQualifier> enumeratePropertyQualifier(
    ) {
        return java.util.Collections.enumeration(this._propertyQualifierList);
    }

    /**
     * Method enumerateSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.commonTypes.Source> enumerateSource(
    ) {
        return java.util.Collections.enumeration(this._sourceList);
    }

    /**
     * Method enumerateUsageContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateUsageContext(
    ) {
        return java.util.Collections.enumeration(this._usageContextList);
    }

    /**
     * Returns the value of field 'language'. The field 'language'
     * has the following description: The local identifier of the
     * language of the property value. Must match a local id of a
     * supportedLanguage in the corresponding mappings section. If
     * omitted, and language is applicable to this property, the
     * defaultLanguage of the surrounding resource is used.
     * 
     * @return the value of field 'Language'.
     */
    public java.lang.String getLanguage(
    ) {
        return this._language;
    }

    /**
     * Returns the value of field 'propertyId'. The field
     * 'propertyId' has the following description: A unique
     * identifier of this particular propert/resource/value
     * instance.
     * 
     * @return the value of field 'PropertyId'.
     */
    public java.lang.String getPropertyId(
    ) {
        return this._propertyId;
    }

    /**
     * Returns the value of field 'propertyName'. The field
     * 'propertyName' has the following description: The local
     * identifier that defines the meaning of this particular
     * property entry. Must match a local id of a supportedProperty
     * in the corresponding mappings section.
     * 
     * @return the value of field 'PropertyName'.
     */
    public java.lang.String getPropertyName(
    ) {
        return this._propertyName;
    }

    /**
     * Method getPropertyQualifier.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.commonTypes.PropertyQualifier at the given index
     */
    public org.LexGrid.commonTypes.PropertyQualifier getPropertyQualifier(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyQualifierList.size()) {
            throw new IndexOutOfBoundsException("getPropertyQualifier: Index value '" + index + "' not in range [0.." + (this._propertyQualifierList.size() - 1) + "]");
        }

        return (org.LexGrid.commonTypes.PropertyQualifier) _propertyQualifierList.get(index);
    }

    /**
     * Method getPropertyQualifier.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.commonTypes.PropertyQualifier[] getPropertyQualifier(
    ) {
        org.LexGrid.commonTypes.PropertyQualifier[] array = new org.LexGrid.commonTypes.PropertyQualifier[0];
        return (org.LexGrid.commonTypes.PropertyQualifier[]) this._propertyQualifierList.toArray(array);
    }

    /**
     * Method getPropertyQualifierAsReference.Returns a reference
     * to '_propertyQualifierList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.commonTypes.PropertyQualifier> getPropertyQualifierAsReference(
    ) {
        return this._propertyQualifierList;
    }

    /**
     * Method getPropertyQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyQualifierCount(
    ) {
        return this._propertyQualifierList.size();
    }

    /**
     * Returns the value of field 'propertyType'. The field
     * 'propertyType' has the following description: The LexGrid
     * model element that this property represents. As an example,
     * the codingScheme "copyright" attribute could be represented
     * by a property with a propertyType that mapped to
     * lgCS:copyRight. Must match a local id of a
     * supportedPropertyType in the corresponding mappings section.
     * 
     * @return the value of field 'PropertyType'.
     */
    public java.lang.String getPropertyType(
    ) {
        return this._propertyType;
    }

    /**
     * Method getSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.commonTypes.Source at
     * the given index
     */
    public org.LexGrid.commonTypes.Source getSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("getSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        return (org.LexGrid.commonTypes.Source) _sourceList.get(index);
    }

    /**
     * Method getSource.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.commonTypes.Source[] getSource(
    ) {
        org.LexGrid.commonTypes.Source[] array = new org.LexGrid.commonTypes.Source[0];
        return (org.LexGrid.commonTypes.Source[]) this._sourceList.toArray(array);
    }

    /**
     * Method getSourceAsReference.Returns a reference to
     * '_sourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.commonTypes.Source> getSourceAsReference(
    ) {
        return this._sourceList;
    }

    /**
     * Method getSourceCount.
     * 
     * @return the size of this collection
     */
    public int getSourceCount(
    ) {
        return this._sourceList.size();
    }

    /**
     * Method getUsageContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getUsageContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usageContextList.size()) {
            throw new IndexOutOfBoundsException("getUsageContext: Index value '" + index + "' not in range [0.." + (this._usageContextList.size() - 1) + "]");
        }

        return (java.lang.String) _usageContextList.get(index);
    }

    /**
     * Method getUsageContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getUsageContext(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._usageContextList.toArray(array);
    }

    /**
     * Method getUsageContextAsReference.Returns a reference to
     * '_usageContextList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getUsageContextAsReference(
    ) {
        return this._usageContextList;
    }

    /**
     * Method getUsageContextCount.
     * 
     * @return the size of this collection
     */
    public int getUsageContextCount(
    ) {
        return this._usageContextList.size();
    }

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: The value of the property
     * associated with this particular resource. Note that "text"
     * may be any type, including a URI, html fragment, etc.
     * 
     * @return the value of field 'Value'.
     */
    public org.LexGrid.commonTypes.Text getValue(
    ) {
        return this._value;
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
     * Method iteratePropertyQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.commonTypes.PropertyQualifier> iteratePropertyQualifier(
    ) {
        return this._propertyQualifierList.iterator();
    }

    /**
     * Method iterateSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.commonTypes.Source> iterateSource(
    ) {
        return this._sourceList.iterator();
    }

    /**
     * Method iterateUsageContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateUsageContext(
    ) {
        return this._usageContextList.iterator();
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
    public void removeAllPropertyQualifier(
    ) {
        this._propertyQualifierList.clear();
    }

    /**
     */
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     */
    public void removeAllUsageContext(
    ) {
        this._usageContextList.clear();
    }

    /**
     * Method removePropertyQualifier.
     * 
     * @param vPropertyQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removePropertyQualifier(
            final org.LexGrid.commonTypes.PropertyQualifier vPropertyQualifier) {
        boolean removed = _propertyQualifierList.remove(vPropertyQualifier);
        return removed;
    }

    /**
     * Method removePropertyQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.commonTypes.PropertyQualifier removePropertyQualifierAt(
            final int index) {
        java.lang.Object obj = this._propertyQualifierList.remove(index);
        return (org.LexGrid.commonTypes.PropertyQualifier) obj;
    }

    /**
     * Method removeSource.
     * 
     * @param vSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeSource(
            final org.LexGrid.commonTypes.Source vSource) {
        boolean removed = _sourceList.remove(vSource);
        return removed;
    }

    /**
     * Method removeSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.commonTypes.Source removeSourceAt(
            final int index) {
        java.lang.Object obj = this._sourceList.remove(index);
        return (org.LexGrid.commonTypes.Source) obj;
    }

    /**
     * Method removeUsageContext.
     * 
     * @param vUsageContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeUsageContext(
            final java.lang.String vUsageContext) {
        boolean removed = _usageContextList.remove(vUsageContext);
        return removed;
    }

    /**
     * Method removeUsageContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeUsageContextAt(
            final int index) {
        java.lang.Object obj = this._usageContextList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'language'. The field 'language' has
     * the following description: The local identifier of the
     * language of the property value. Must match a local id of a
     * supportedLanguage in the corresponding mappings section. If
     * omitted, and language is applicable to this property, the
     * defaultLanguage of the surrounding resource is used.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(
            final java.lang.String language) {
        this._language = language;
    }

    /**
     * Sets the value of field 'propertyId'. The field 'propertyId'
     * has the following description: A unique identifier of this
     * particular propert/resource/value instance.
     * 
     * @param propertyId the value of field 'propertyId'.
     */
    public void setPropertyId(
            final java.lang.String propertyId) {
        this._propertyId = propertyId;
    }

    /**
     * Sets the value of field 'propertyName'. The field
     * 'propertyName' has the following description: The local
     * identifier that defines the meaning of this particular
     * property entry. Must match a local id of a supportedProperty
     * in the corresponding mappings section.
     * 
     * @param propertyName the value of field 'propertyName'.
     */
    public void setPropertyName(
            final java.lang.String propertyName) {
        this._propertyName = propertyName;
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertyQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPropertyQualifier(
            final int index,
            final org.LexGrid.commonTypes.PropertyQualifier vPropertyQualifier)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyQualifierList.size()) {
            throw new IndexOutOfBoundsException("setPropertyQualifier: Index value '" + index + "' not in range [0.." + (this._propertyQualifierList.size() - 1) + "]");
        }

        this._propertyQualifierList.set(index, vPropertyQualifier);
    }

    /**
     * 
     * 
     * @param vPropertyQualifierArray
     */
    public void setPropertyQualifier(
            final org.LexGrid.commonTypes.PropertyQualifier[] vPropertyQualifierArray) {
        //-- copy array
        _propertyQualifierList.clear();

        for (int i = 0; i < vPropertyQualifierArray.length; i++) {
                this._propertyQualifierList.add(vPropertyQualifierArray[i]);
        }
    }

    /**
     * Sets the value of '_propertyQualifierList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyQualifierList the Vector to copy.
     */
    public void setPropertyQualifier(
            final java.util.List<org.LexGrid.commonTypes.PropertyQualifier> vPropertyQualifierList) {
        // copy vector
        this._propertyQualifierList.clear();

        this._propertyQualifierList.addAll(vPropertyQualifierList);
    }

    /**
     * Sets the value of '_propertyQualifierList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyQualifierList the Vector to set.
     */
    public void setPropertyQualifierAsReference(
            final java.util.List<org.LexGrid.commonTypes.PropertyQualifier> propertyQualifierList) {
        this._propertyQualifierList = propertyQualifierList;
    }

    /**
     * Sets the value of field 'propertyType'. The field
     * 'propertyType' has the following description: The LexGrid
     * model element that this property represents. As an example,
     * the codingScheme "copyright" attribute could be represented
     * by a property with a propertyType that mapped to
     * lgCS:copyRight. Must match a local id of a
     * supportedPropertyType in the corresponding mappings section.
     * 
     * @param propertyType the value of field 'propertyType'.
     */
    public void setPropertyType(
            final java.lang.String propertyType) {
        this._propertyType = propertyType;
    }

    /**
     * 
     * 
     * @param index
     * @param vSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSource(
            final int index,
            final org.LexGrid.commonTypes.Source vSource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("setSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        this._sourceList.set(index, vSource);
    }

    /**
     * 
     * 
     * @param vSourceArray
     */
    public void setSource(
            final org.LexGrid.commonTypes.Source[] vSourceArray) {
        //-- copy array
        _sourceList.clear();

        for (int i = 0; i < vSourceArray.length; i++) {
                this._sourceList.add(vSourceArray[i]);
        }
    }

    /**
     * Sets the value of '_sourceList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vSourceList the Vector to copy.
     */
    public void setSource(
            final java.util.List<org.LexGrid.commonTypes.Source> vSourceList) {
        // copy vector
        this._sourceList.clear();

        this._sourceList.addAll(vSourceList);
    }

    /**
     * Sets the value of '_sourceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sourceList the Vector to set.
     */
    public void setSourceAsReference(
            final java.util.List<org.LexGrid.commonTypes.Source> sourceList) {
        this._sourceList = sourceList;
    }

    /**
     * 
     * 
     * @param index
     * @param vUsageContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUsageContext(
            final int index,
            final java.lang.String vUsageContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usageContextList.size()) {
            throw new IndexOutOfBoundsException("setUsageContext: Index value '" + index + "' not in range [0.." + (this._usageContextList.size() - 1) + "]");
        }

        this._usageContextList.set(index, vUsageContext);
    }

    /**
     * 
     * 
     * @param vUsageContextArray
     */
    public void setUsageContext(
            final java.lang.String[] vUsageContextArray) {
        //-- copy array
        _usageContextList.clear();

        for (int i = 0; i < vUsageContextArray.length; i++) {
                this._usageContextList.add(vUsageContextArray[i]);
        }
    }

    /**
     * Sets the value of '_usageContextList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vUsageContextList the Vector to copy.
     */
    public void setUsageContext(
            final java.util.List<java.lang.String> vUsageContextList) {
        // copy vector
        this._usageContextList.clear();

        this._usageContextList.addAll(vUsageContextList);
    }

    /**
     * Sets the value of '_usageContextList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param usageContextList the Vector to set.
     */
    public void setUsageContextAsReference(
            final java.util.List<java.lang.String> usageContextList) {
        this._usageContextList = usageContextList;
    }

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: The value of the property associated
     * with this particular resource. Note that "text" may be any
     * type, including a URI, html fragment, etc.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final org.LexGrid.commonTypes.Text value) {
        this._value = value;
    }

    /**
     * Method unmarshalProperty.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.commonTypes.Property
     */
    public static org.LexGrid.commonTypes.Property unmarshalProperty(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.commonTypes.Property) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.commonTypes.Property.class, reader);
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
