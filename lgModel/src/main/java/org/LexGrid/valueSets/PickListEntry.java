/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * An entity code and corresponding textual representation. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PickListEntry extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Relative order of this entry in the list. pickListEntries
     * without a supplied order follow the all entries with an
     * order, and the order is not defined.
     */
    private java.lang.Long _entryOrder;

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

    /**
     * The property identifier associated with the entityCode and
     * entityCodeNamespace that the pickText was derived from. If
     * absent, the pick text can be anything. Some terminologies
     * may have business rules requiring this attribute to be
     * present.
     */
    private java.lang.String _propertyId;

    /**
     * True means that this is the default entry for the supplied
     * language and context.
     */
    private java.lang.Boolean _isDefault;

    /**
     * True means that this entry can be used if no contexts are
     * supplied, even though pickContext ispresent.
     */
    private java.lang.Boolean _matchIfNoContext;

    /**
     * The local name of the language to be used when the
     * application/user supplies a selection language matches. If
     * absent, this matches all languages. language must match a
     * local id od of a supportedLanguage in the mappings section.
     */
    private java.lang.String _language;

    /**
     * The text that represents this node in the pick list. Some
     * business rules may require that this string match a
     * presentation associated with the entityCode
     */
    private java.lang.String _pickText;

    /**
     * The local identifiers of the context(s) in which this entry
     * applies. pickContext must match a local id of a
     * supportedContext in the mappings section 
     */
    private java.util.List<java.lang.String> _pickContextList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PickListEntry() {
        super();
        this._pickContextList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPickContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPickContext(
            final java.lang.String vPickContext)
    throws java.lang.IndexOutOfBoundsException {
        this._pickContextList.add(vPickContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vPickContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPickContext(
            final int index,
            final java.lang.String vPickContext)
    throws java.lang.IndexOutOfBoundsException {
        this._pickContextList.add(index, vPickContext);
    }

    /**
     * Method enumeratePickContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumeratePickContext(
    ) {
        return java.util.Collections.enumeration(this._pickContextList);
    }

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
     * Returns the value of field 'entryOrder'. The field
     * 'entryOrder' has the following description: Relative order
     * of this entry in the list. pickListEntries without a
     * supplied order follow the all entries with an order, and the
     * order is not defined.
     * 
     * @return the value of field 'EntryOrder'.
     */
    public java.lang.Long getEntryOrder(
    ) {
        return this._entryOrder;
    }

    /**
     * Returns the value of field 'isDefault'. The field
     * 'isDefault' has the following description: True means that
     * this is the default entry for the supplied language and
     * context.
     * 
     * @return the value of field 'IsDefault'.
     */
    public java.lang.Boolean getIsDefault(
    ) {
        return this._isDefault;
    }

    /**
     * Returns the value of field 'language'. The field 'language'
     * has the following description: The local name of the
     * language to be used when the application/user supplies a
     * selection language matches. If absent, this matches all
     * languages. language must match a local id od of a
     * supportedLanguage in the mappings section.
     * 
     * @return the value of field 'Language'.
     */
    public java.lang.String getLanguage(
    ) {
        return this._language;
    }

    /**
     * Returns the value of field 'matchIfNoContext'. The field
     * 'matchIfNoContext' has the following description: True means
     * that this entry can be used if no contexts are supplied,
     * even though pickContext ispresent.
     * 
     * @return the value of field 'MatchIfNoContext'.
     */
    public java.lang.Boolean getMatchIfNoContext(
    ) {
        return this._matchIfNoContext;
    }

    /**
     * Method getPickContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getPickContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pickContextList.size()) {
            throw new IndexOutOfBoundsException("getPickContext: Index value '" + index + "' not in range [0.." + (this._pickContextList.size() - 1) + "]");
        }

        return (java.lang.String) _pickContextList.get(index);
    }

    /**
     * Method getPickContext.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getPickContext(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._pickContextList.toArray(array);
    }

    /**
     * Method getPickContextAsReference.Returns a reference to
     * '_pickContextList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getPickContextAsReference(
    ) {
        return this._pickContextList;
    }

    /**
     * Method getPickContextCount.
     * 
     * @return the size of this collection
     */
    public int getPickContextCount(
    ) {
        return this._pickContextList.size();
    }

    /**
     * Returns the value of field 'pickText'. The field 'pickText'
     * has the following description: The text that represents this
     * node in the pick list. Some business rules may require that
     * this string match a presentation associated with the
     * entityCode
     * 
     * @return the value of field 'PickText'.
     */
    public java.lang.String getPickText(
    ) {
        return this._pickText;
    }

    /**
     * Returns the value of field 'propertyId'. The field
     * 'propertyId' has the following description: The property
     * identifier associated with the entityCode and
     * entityCodeNamespace that the pickText was derived from. If
     * absent, the pick text can be anything. Some terminologies
     * may have business rules requiring this attribute to be
     * present.
     * 
     * @return the value of field 'PropertyId'.
     */
    public java.lang.String getPropertyId(
    ) {
        return this._propertyId;
    }

    /**
     * Returns the value of field 'isDefault'. The field
     * 'isDefault' has the following description: True means that
     * this is the default entry for the supplied language and
     * context.
     * 
     * @return the value of field 'IsDefault'.
     */
    public java.lang.Boolean isIsDefault(
    ) {
        return this._isDefault;
    }

    /**
     * Returns the value of field 'matchIfNoContext'. The field
     * 'matchIfNoContext' has the following description: True means
     * that this entry can be used if no contexts are supplied,
     * even though pickContext ispresent.
     * 
     * @return the value of field 'MatchIfNoContext'.
     */
    public java.lang.Boolean isMatchIfNoContext(
    ) {
        return this._matchIfNoContext;
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
     * Method iteratePickContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iteratePickContext(
    ) {
        return this._pickContextList.iterator();
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
    public void removeAllPickContext(
    ) {
        this._pickContextList.clear();
    }

    /**
     * Method removePickContext.
     * 
     * @param vPickContext
     * @return true if the object was removed from the collection.
     */
    public boolean removePickContext(
            final java.lang.String vPickContext) {
        boolean removed = _pickContextList.remove(vPickContext);
        return removed;
    }

    /**
     * Method removePickContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removePickContextAt(
            final int index) {
        java.lang.Object obj = this._pickContextList.remove(index);
        return (java.lang.String) obj;
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
     * Sets the value of field 'entryOrder'. The field 'entryOrder'
     * has the following description: Relative order of this entry
     * in the list. pickListEntries without a supplied order follow
     * the all entries with an order, and the order is not defined.
     * 
     * @param entryOrder the value of field 'entryOrder'.
     */
    public void setEntryOrder(
            final java.lang.Long entryOrder) {
        this._entryOrder = entryOrder;
    }

    /**
     * Sets the value of field 'isDefault'. The field 'isDefault'
     * has the following description: True means that this is the
     * default entry for the supplied language and context.
     * 
     * @param isDefault the value of field 'isDefault'.
     */
    public void setIsDefault(
            final java.lang.Boolean isDefault) {
        this._isDefault = isDefault;
    }

    /**
     * Sets the value of field 'language'. The field 'language' has
     * the following description: The local name of the language to
     * be used when the application/user supplies a selection
     * language matches. If absent, this matches all languages.
     * language must match a local id od of a supportedLanguage in
     * the mappings section.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(
            final java.lang.String language) {
        this._language = language;
    }

    /**
     * Sets the value of field 'matchIfNoContext'. The field
     * 'matchIfNoContext' has the following description: True means
     * that this entry can be used if no contexts are supplied,
     * even though pickContext ispresent.
     * 
     * @param matchIfNoContext the value of field 'matchIfNoContext'
     */
    public void setMatchIfNoContext(
            final java.lang.Boolean matchIfNoContext) {
        this._matchIfNoContext = matchIfNoContext;
    }

    /**
     * 
     * 
     * @param index
     * @param vPickContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPickContext(
            final int index,
            final java.lang.String vPickContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pickContextList.size()) {
            throw new IndexOutOfBoundsException("setPickContext: Index value '" + index + "' not in range [0.." + (this._pickContextList.size() - 1) + "]");
        }

        this._pickContextList.set(index, vPickContext);
    }

    /**
     * 
     * 
     * @param vPickContextArray
     */
    public void setPickContext(
            final java.lang.String[] vPickContextArray) {
        //-- copy array
        _pickContextList.clear();

        for (int i = 0; i < vPickContextArray.length; i++) {
                this._pickContextList.add(vPickContextArray[i]);
        }
    }

    /**
     * Sets the value of '_pickContextList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPickContextList the Vector to copy.
     */
    public void setPickContext(
            final java.util.List<java.lang.String> vPickContextList) {
        // copy vector
        this._pickContextList.clear();

        this._pickContextList.addAll(vPickContextList);
    }

    /**
     * Sets the value of '_pickContextList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param pickContextList the Vector to set.
     */
    public void setPickContextAsReference(
            final java.util.List<java.lang.String> pickContextList) {
        this._pickContextList = pickContextList;
    }

    /**
     * Sets the value of field 'pickText'. The field 'pickText' has
     * the following description: The text that represents this
     * node in the pick list. Some business rules may require that
     * this string match a presentation associated with the
     * entityCode
     * 
     * @param pickText the value of field 'pickText'.
     */
    public void setPickText(
            final java.lang.String pickText) {
        this._pickText = pickText;
    }

    /**
     * Sets the value of field 'propertyId'. The field 'propertyId'
     * has the following description: The property identifier
     * associated with the entityCode and entityCodeNamespace that
     * the pickText was derived from. If absent, the pick text can
     * be anything. Some terminologies may have business rules
     * requiring this attribute to be present.
     * 
     * @param propertyId the value of field 'propertyId'.
     */
    public void setPropertyId(
            final java.lang.String propertyId) {
        this._propertyId = propertyId;
    }

    /**
     * Method unmarshalPickListEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.valueSets.PickListEntry
     */
    public static org.LexGrid.valueSets.PickListEntry unmarshalPickListEntry(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PickListEntry) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PickListEntry.class, reader);
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
