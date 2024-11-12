/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * An ordered list of entity codes and corresponding presentations
 * drawn from a value set definition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PickListDefinition extends org.LexGrid.commonTypes.VersionableAndDescribable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An identifier that uniquely names this list within the
     * context of the collection.
     */
    private java.lang.String _pickListId;

    /**
     * The URI of the value set definition that is represented by
     * this pick list
     */
    private java.lang.String _representsValueSetDefinition;

    /**
     * Local name of the namespace to which the entry codes in this
     * list belong. defaultEntityCodeNamespace must match a local
     * id of a supportedNamespace in the mappings section.
     */
    private java.lang.String _defaultEntityCodeNamespace;

    /**
     * The local identifier of the language that is used to
     * generate the text of this pick list if not otherwise
     * specified. Note that this language does NOT necessarily have
     * any coorelation with the language of a pickListEntry itself
     * or the language of the target user. defaultLanguage must
     * match a local id of a supportedLanguage in the mappings
     * section. 
     */
    private java.lang.String _defaultLanguage;

    /**
     * The local identifier of a sort order that is used as the
     * default in the definition of the pick list
     */
    private java.lang.String _defaultSortOrder;

    /**
     * True means that this pick list should represent all of the
     * entries in the value set definition. Any active entity codes
     * that aren't in the specific pick list entries are added to
     * the end, using the designations identified by the
     * defaultLanguage, defaultSortOrder and defaultPickContext.
     * Default: false
     */
    private java.lang.Boolean _completeSet;

    /**
     * The mappings that are specific to this pick list definition.
     * This set of mappings must be supplied when a pick list
     * definition is included in a changedEntry and must be empty
     * when it is included in a pickLists collection, as the
     * collection itself carries the mappings
     */
    private org.LexGrid.naming.Mappings _mappings;

    /**
     * An entry in the list
     */
    private java.util.List<org.LexGrid.valueSets.PickListEntryNode> _pickListEntryNodeList;

    /**
     * The local identifiers of the source(s) of this pick list
     * definition. Must match a local id of a supportedSource in
     * the corresponding mappings section. 
     */
    private java.util.List<org.LexGrid.commonTypes.Source> _sourceList;

    /**
     * The local identifiers of the context used in the definition
     * of the pick list.
     */
    private java.util.List<java.lang.String> _defaultPickContextList;

    /**
     * A list of propeties used in the description of this pick list
     */
    private org.LexGrid.commonTypes.Properties _properties;


      //----------------/
     //- Constructors -/
    //----------------/

    public PickListDefinition() {
        super();
        this._pickListEntryNodeList = new java.util.ArrayList<org.LexGrid.valueSets.PickListEntryNode>();
        this._sourceList = new java.util.ArrayList<org.LexGrid.commonTypes.Source>();
        this._defaultPickContextList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDefaultPickContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefaultPickContext(
            final java.lang.String vDefaultPickContext)
    throws java.lang.IndexOutOfBoundsException {
        this._defaultPickContextList.add(vDefaultPickContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefaultPickContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefaultPickContext(
            final int index,
            final java.lang.String vDefaultPickContext)
    throws java.lang.IndexOutOfBoundsException {
        this._defaultPickContextList.add(index, vDefaultPickContext);
    }

    /**
     * 
     * 
     * @param vPickListEntryNode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPickListEntryNode(
            final org.LexGrid.valueSets.PickListEntryNode vPickListEntryNode)
    throws java.lang.IndexOutOfBoundsException {
        this._pickListEntryNodeList.add(vPickListEntryNode);
    }

    /**
     * 
     * 
     * @param index
     * @param vPickListEntryNode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPickListEntryNode(
            final int index,
            final org.LexGrid.valueSets.PickListEntryNode vPickListEntryNode)
    throws java.lang.IndexOutOfBoundsException {
        this._pickListEntryNodeList.add(index, vPickListEntryNode);
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
     * Method enumerateDefaultPickContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateDefaultPickContext(
    ) {
        return java.util.Collections.enumeration(this._defaultPickContextList);
    }

    /**
     * Method enumeratePickListEntryNode.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.valueSets.PickListEntryNode> enumeratePickListEntryNode(
    ) {
        return java.util.Collections.enumeration(this._pickListEntryNodeList);
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
     * Returns the value of field 'completeSet'. The field
     * 'completeSet' has the following description: True means that
     * this pick list should represent all of the entries in the
     * value set definition. Any active entity codes that aren't in
     * the specific pick list entries are added to the end, using
     * the designations identified by the defaultLanguage,
     * defaultSortOrder and defaultPickContext. Default: false
     * 
     * @return the value of field 'CompleteSet'.
     */
    public java.lang.Boolean getCompleteSet(
    ) {
        return this._completeSet;
    }

    /**
     * Returns the value of field 'defaultEntityCodeNamespace'. The
     * field 'defaultEntityCodeNamespace' has the following
     * description: Local name of the namespace to which the entry
     * codes in this list belong. defaultEntityCodeNamespace must
     * match a local id of a supportedNamespace in the mappings
     * section.
     * 
     * @return the value of field 'DefaultEntityCodeNamespace'.
     */
    public java.lang.String getDefaultEntityCodeNamespace(
    ) {
        return this._defaultEntityCodeNamespace;
    }

    /**
     * Returns the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: The local
     * identifier of the language that is used to generate the text
     * of this pick list if not otherwise specified. Note that this
     * language does NOT necessarily have any coorelation with the
     * language of a pickListEntry itself or the language of the
     * target user. defaultLanguage must match a local id of a
     * supportedLanguage in the mappings section. 
     * 
     * @return the value of field 'DefaultLanguage'.
     */
    public java.lang.String getDefaultLanguage(
    ) {
        return this._defaultLanguage;
    }

    /**
     * Method getDefaultPickContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getDefaultPickContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._defaultPickContextList.size()) {
            throw new IndexOutOfBoundsException("getDefaultPickContext: Index value '" + index + "' not in range [0.." + (this._defaultPickContextList.size() - 1) + "]");
        }

        return (java.lang.String) _defaultPickContextList.get(index);
    }

    /**
     * Method getDefaultPickContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getDefaultPickContext(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._defaultPickContextList.toArray(array);
    }

    /**
     * Method getDefaultPickContextAsReference.Returns a reference
     * to '_defaultPickContextList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getDefaultPickContextAsReference(
    ) {
        return this._defaultPickContextList;
    }

    /**
     * Method getDefaultPickContextCount.
     * 
     * @return the size of this collection
     */
    public int getDefaultPickContextCount(
    ) {
        return this._defaultPickContextList.size();
    }

    /**
     * Returns the value of field 'defaultSortOrder'. The field
     * 'defaultSortOrder' has the following description: The local
     * identifier of a sort order that is used as the default in
     * the definition of the pick list
     * 
     * @return the value of field 'DefaultSortOrder'.
     */
    public java.lang.String getDefaultSortOrder(
    ) {
        return this._defaultSortOrder;
    }

    /**
     * Returns the value of field 'mappings'. The field 'mappings'
     * has the following description: The mappings that are
     * specific to this pick list definition. This set of mappings
     * must be supplied when a pick list definition is included in
     * a changedEntry and must be empty when it is included in a
     * pickLists collection, as the collection itself carries the
     * mappings
     * 
     * @return the value of field 'Mappings'.
     */
    public org.LexGrid.naming.Mappings getMappings(
    ) {
        return this._mappings;
    }

    /**
     * Method getPickListEntryNode.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.valueSets.PickListEntryNode at the given index
     */
    public org.LexGrid.valueSets.PickListEntryNode getPickListEntryNode(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pickListEntryNodeList.size()) {
            throw new IndexOutOfBoundsException("getPickListEntryNode: Index value '" + index + "' not in range [0.." + (this._pickListEntryNodeList.size() - 1) + "]");
        }

        return (org.LexGrid.valueSets.PickListEntryNode) _pickListEntryNodeList.get(index);
    }

    /**
     * Method getPickListEntryNode.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.valueSets.PickListEntryNode[] getPickListEntryNode(
    ) {
        org.LexGrid.valueSets.PickListEntryNode[] array = new org.LexGrid.valueSets.PickListEntryNode[0];
        return (org.LexGrid.valueSets.PickListEntryNode[]) this._pickListEntryNodeList.toArray(array);
    }

    /**
     * Method getPickListEntryNodeAsReference.Returns a reference
     * to '_pickListEntryNodeList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.valueSets.PickListEntryNode> getPickListEntryNodeAsReference(
    ) {
        return this._pickListEntryNodeList;
    }

    /**
     * Method getPickListEntryNodeCount.
     * 
     * @return the size of this collection
     */
    public int getPickListEntryNodeCount(
    ) {
        return this._pickListEntryNodeList.size();
    }

    /**
     * Returns the value of field 'pickListId'. The field
     * 'pickListId' has the following description: An identifier
     * that uniquely names this list within the context of the
     * collection.
     * 
     * @return the value of field 'PickListId'.
     */
    public java.lang.String getPickListId(
    ) {
        return this._pickListId;
    }

    /**
     * Returns the value of field 'properties'. The field
     * 'properties' has the following description: A list of
     * propeties used in the description of this pick list.
     * 
     * @return the value of field 'Properties'.
     */
    public org.LexGrid.commonTypes.Properties getProperties(
    ) {
        return this._properties;
    }

    /**
     * Returns the value of field 'representsValueSetDefinition'.
     * The field 'representsValueSetDefinition' has the following
     * description: The URI of the value set definition that is
     * represented by this pick list
     * 
     * @return the value of field 'RepresentsValueSetDefinition'.
     */
    public java.lang.String getRepresentsValueSetDefinition(
    ) {
        return this._representsValueSetDefinition;
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
     * Returns the value of field 'completeSet'. The field
     * 'completeSet' has the following description: True means that
     * this pick list should represent all of the entries in the
     * value set definition. Any active entity codes that aren't in
     * the specific pick list entries are added to the end, using
     * the designations identified by the defaultLanguage,
     * defaultSortOrder and defaultPickContext. Default: false
     * 
     * @return the value of field 'CompleteSet'.
     */
    public java.lang.Boolean isCompleteSet(
    ) {
        return this._completeSet;
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
     * Method iterateDefaultPickContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateDefaultPickContext(
    ) {
        return this._defaultPickContextList.iterator();
    }

    /**
     * Method iteratePickListEntryNode.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.valueSets.PickListEntryNode> iteratePickListEntryNode(
    ) {
        return this._pickListEntryNodeList.iterator();
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
    public void removeAllDefaultPickContext(
    ) {
        this._defaultPickContextList.clear();
    }

    /**
     */
    public void removeAllPickListEntryNode(
    ) {
        this._pickListEntryNodeList.clear();
    }

    /**
     */
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     * Method removeDefaultPickContext.
     * 
     * @param vDefaultPickContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefaultPickContext(
            final java.lang.String vDefaultPickContext) {
        boolean removed = _defaultPickContextList.remove(vDefaultPickContext);
        return removed;
    }

    /**
     * Method removeDefaultPickContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeDefaultPickContextAt(
            final int index) {
        java.lang.Object obj = this._defaultPickContextList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removePickListEntryNode.
     * 
     * @param vPickListEntryNode
     * @return true if the object was removed from the collection.
     */
    public boolean removePickListEntryNode(
            final org.LexGrid.valueSets.PickListEntryNode vPickListEntryNode) {
        boolean removed = _pickListEntryNodeList.remove(vPickListEntryNode);
        return removed;
    }

    /**
     * Method removePickListEntryNodeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.valueSets.PickListEntryNode removePickListEntryNodeAt(
            final int index) {
        java.lang.Object obj = this._pickListEntryNodeList.remove(index);
        return (org.LexGrid.valueSets.PickListEntryNode) obj;
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
     * Sets the value of field 'completeSet'. The field
     * 'completeSet' has the following description: True means that
     * this pick list should represent all of the entries in the
     * value set definition. Any active entity codes that aren't in
     * the specific pick list entries are added to the end, using
     * the designations identified by the defaultLanguage,
     * defaultSortOrder and defaultPickContext. Default: false
     * 
     * @param completeSet the value of field 'completeSet'.
     */
    public void setCompleteSet(
            final java.lang.Boolean completeSet) {
        this._completeSet = completeSet;
    }

    /**
     * Sets the value of field 'defaultEntityCodeNamespace'. The
     * field 'defaultEntityCodeNamespace' has the following
     * description: Local name of the namespace to which the entry
     * codes in this list belong. defaultEntityCodeNamespace must
     * match a local id of a supportedNamespace in the mappings
     * section.
     * 
     * @param defaultEntityCodeNamespace the value of field
     * 'defaultEntityCodeNamespace'.
     */
    public void setDefaultEntityCodeNamespace(
            final java.lang.String defaultEntityCodeNamespace) {
        this._defaultEntityCodeNamespace = defaultEntityCodeNamespace;
    }

    /**
     * Sets the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: The local
     * identifier of the language that is used to generate the text
     * of this pick list if not otherwise specified. Note that this
     * language does NOT necessarily have any coorelation with the
     * language of a pickListEntry itself or the language of the
     * target user. defaultLanguage must match a local id of a
     * supportedLanguage in the mappings section. 
     * 
     * @param defaultLanguage the value of field 'defaultLanguage'.
     */
    public void setDefaultLanguage(
            final java.lang.String defaultLanguage) {
        this._defaultLanguage = defaultLanguage;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefaultPickContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefaultPickContext(
            final int index,
            final java.lang.String vDefaultPickContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._defaultPickContextList.size()) {
            throw new IndexOutOfBoundsException("setDefaultPickContext: Index value '" + index + "' not in range [0.." + (this._defaultPickContextList.size() - 1) + "]");
        }

        this._defaultPickContextList.set(index, vDefaultPickContext);
    }

    /**
     * 
     * 
     * @param vDefaultPickContextArray
     */
    public void setDefaultPickContext(
            final java.lang.String[] vDefaultPickContextArray) {
        //-- copy array
        _defaultPickContextList.clear();

        for (int i = 0; i < vDefaultPickContextArray.length; i++) {
                this._defaultPickContextList.add(vDefaultPickContextArray[i]);
        }
    }

    /**
     * Sets the value of '_defaultPickContextList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vDefaultPickContextList the Vector to copy.
     */
    public void setDefaultPickContext(
            final java.util.List<java.lang.String> vDefaultPickContextList) {
        // copy vector
        this._defaultPickContextList.clear();

        this._defaultPickContextList.addAll(vDefaultPickContextList);
    }

    /**
     * Sets the value of '_defaultPickContextList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param defaultPickContextList the Vector to set.
     */
    public void setDefaultPickContextAsReference(
            final java.util.List<java.lang.String> defaultPickContextList) {
        this._defaultPickContextList = defaultPickContextList;
    }

    /**
     * Sets the value of field 'defaultSortOrder'. The field
     * 'defaultSortOrder' has the following description: The local
     * identifier of a sort order that is used as the default in
     * the definition of the pick list
     * 
     * @param defaultSortOrder the value of field 'defaultSortOrder'
     */
    public void setDefaultSortOrder(
            final java.lang.String defaultSortOrder) {
        this._defaultSortOrder = defaultSortOrder;
    }

    /**
     * Sets the value of field 'mappings'. The field 'mappings' has
     * the following description: The mappings that are specific to
     * this pick list definition. This set of mappings must be
     * supplied when a pick list definition is included in a
     * changedEntry and must be empty when it is included in a
     * pickLists collection, as the collection itself carries the
     * mappings
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
     * @param vPickListEntryNode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPickListEntryNode(
            final int index,
            final org.LexGrid.valueSets.PickListEntryNode vPickListEntryNode)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pickListEntryNodeList.size()) {
            throw new IndexOutOfBoundsException("setPickListEntryNode: Index value '" + index + "' not in range [0.." + (this._pickListEntryNodeList.size() - 1) + "]");
        }

        this._pickListEntryNodeList.set(index, vPickListEntryNode);
    }

    /**
     * 
     * 
     * @param vPickListEntryNodeArray
     */
    public void setPickListEntryNode(
            final org.LexGrid.valueSets.PickListEntryNode[] vPickListEntryNodeArray) {
        //-- copy array
        _pickListEntryNodeList.clear();

        for (int i = 0; i < vPickListEntryNodeArray.length; i++) {
                this._pickListEntryNodeList.add(vPickListEntryNodeArray[i]);
        }
    }

    /**
     * Sets the value of '_pickListEntryNodeList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vPickListEntryNodeList the Vector to copy.
     */
    public void setPickListEntryNode(
            final java.util.List<org.LexGrid.valueSets.PickListEntryNode> vPickListEntryNodeList) {
        // copy vector
        this._pickListEntryNodeList.clear();

        this._pickListEntryNodeList.addAll(vPickListEntryNodeList);
    }

    /**
     * Sets the value of '_pickListEntryNodeList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param pickListEntryNodeList the Vector to set.
     */
    public void setPickListEntryNodeAsReference(
            final java.util.List<org.LexGrid.valueSets.PickListEntryNode> pickListEntryNodeList) {
        this._pickListEntryNodeList = pickListEntryNodeList;
    }

    /**
     * Sets the value of field 'pickListId'. The field 'pickListId'
     * has the following description: An identifier that uniquely
     * names this list within the context of the collection.
     * 
     * @param pickListId the value of field 'pickListId'.
     */
    public void setPickListId(
            final java.lang.String pickListId) {
        this._pickListId = pickListId;
    }

    /**
     * Sets the value of field 'properties'. The field 'properties'
     * has the following description: A list of propeties used in
     * the description of this pick list.
     * 
     * @param properties the value of field 'properties'.
     */
    public void setProperties(
            final org.LexGrid.commonTypes.Properties properties) {
        this._properties = properties;
    }

    /**
     * Sets the value of field 'representsValueSetDefinition'. The
     * field 'representsValueSetDefinition' has the following
     * description: The URI of the value set definition that is
     * represented by this pick list
     * 
     * @param representsValueSetDefinition the value of field
     * 'representsValueSetDefinition'.
     */
    public void setRepresentsValueSetDefinition(
            final java.lang.String representsValueSetDefinition) {
        this._representsValueSetDefinition = representsValueSetDefinition;
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
     * Method unmarshalPickListDefinition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PickListDefinition
     */
    public static org.LexGrid.valueSets.PickListDefinition unmarshalPickListDefinition(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PickListDefinition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PickListDefinition.class, reader);
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
