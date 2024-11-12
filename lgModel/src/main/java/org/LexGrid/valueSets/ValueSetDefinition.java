/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A definition of a given value set. A value set definition can be
 * a simple description with no associated value set entries, or it
 * can consist of one or more definitionEntries that resolve to an
 * enumerated list of entityCodes when applied to one or more
 * codingScheme versions.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinition extends org.LexGrid.commonTypes.VersionableAndDescribable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The URI of this value set definition.
     */
    private java.lang.String _valueSetDefinitionURI;

    /**
     * The name of this value set definition, if any.
     */
    private java.lang.String _valueSetDefinitionName;

    /**
     * Local name of the primary coding scheme from which the value
     * set is drawn. defaultCodingScheme must match a local id of a
     * supportedCodingScheme in the mappings section.
     */
    private java.lang.String _defaultCodingScheme;

    /**
     * The local name of the concept domain this value set
     * definition binds to. conceptDomain must match a local id of
     * a supportedConceptDomain in the mappings section.
     */
    private java.lang.String _conceptDomain;

    /**
     * The mappings that are specific to this value set definition.
     * This set of mappings must be supplied when a value set
     * definition is included in a changedEntry and must be empty
     * when it is included in a valueSets collection, as the
     * collection itself carries the mappings
     */
    private org.LexGrid.naming.Mappings _mappings;

    /**
     * The local identifiers of the source(s) of this property.
     * Must match a local id of a supportedSource in the
     * corresponding mappings section.
     */
    private java.util.List<org.LexGrid.commonTypes.Source> _sourceList;

    /**
     * The local identifiers of the context(s) in which this value
     * set definition applies. Must match a local id of a
     * supportedContext in the corresponding mappings section.
     */
    private java.util.List<java.lang.String> _representsRealmOrContextList;

    /**
     * A list of properties used in the description of this value
     * set definition.
     */
    private org.LexGrid.commonTypes.Properties _properties;

    /**
     * A portion of the value set definition. Definition entries
     * are ordered.
     */
    private java.util.List<org.LexGrid.valueSets.DefinitionEntry> _definitionEntryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinition() {
        super();
        this._sourceList = new java.util.ArrayList<org.LexGrid.commonTypes.Source>();
        this._representsRealmOrContextList = new java.util.ArrayList<java.lang.String>();
        this._definitionEntryList = new java.util.ArrayList<org.LexGrid.valueSets.DefinitionEntry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDefinitionEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinitionEntry(
            final org.LexGrid.valueSets.DefinitionEntry vDefinitionEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionEntryList.add(vDefinitionEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinitionEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinitionEntry(
            final int index,
            final org.LexGrid.valueSets.DefinitionEntry vDefinitionEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionEntryList.add(index, vDefinitionEntry);
    }

    /**
     * 
     * 
     * @param vRepresentsRealmOrContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRepresentsRealmOrContext(
            final java.lang.String vRepresentsRealmOrContext)
    throws java.lang.IndexOutOfBoundsException {
        this._representsRealmOrContextList.add(vRepresentsRealmOrContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vRepresentsRealmOrContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRepresentsRealmOrContext(
            final int index,
            final java.lang.String vRepresentsRealmOrContext)
    throws java.lang.IndexOutOfBoundsException {
        this._representsRealmOrContextList.add(index, vRepresentsRealmOrContext);
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
     * Method enumerateDefinitionEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.valueSets.DefinitionEntry> enumerateDefinitionEntry(
    ) {
        return java.util.Collections.enumeration(this._definitionEntryList);
    }

    /**
     * Method enumerateRepresentsRealmOrContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateRepresentsRealmOrContext(
    ) {
        return java.util.Collections.enumeration(this._representsRealmOrContextList);
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
     * Returns the value of field 'conceptDomain'. The field
     * 'conceptDomain' has the following description: The local
     * name of the concept domain this value set definition binds
     * to. conceptDomain must match a local id of a
     * supportedConceptDomain in the mappings section.
     * 
     * @return the value of field 'ConceptDomain'.
     */
    public java.lang.String getConceptDomain(
    ) {
        return this._conceptDomain;
    }

    /**
     * Returns the value of field 'defaultCodingScheme'. The field
     * 'defaultCodingScheme' has the following description: Local
     * name of the primary coding scheme from which the value set
     * is drawn. defaultCodingScheme must match a local id of a
     * supportedCodingScheme in the mappings section.
     * 
     * @return the value of field 'DefaultCodingScheme'.
     */
    public java.lang.String getDefaultCodingScheme(
    ) {
        return this._defaultCodingScheme;
    }

    /**
     * Method getDefinitionEntry.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.valueSets.DefinitionEntry at the given index
     */
    public org.LexGrid.valueSets.DefinitionEntry getDefinitionEntry(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionEntryList.size()) {
            throw new IndexOutOfBoundsException("getDefinitionEntry: Index value '" + index + "' not in range [0.." + (this._definitionEntryList.size() - 1) + "]");
        }

        return (org.LexGrid.valueSets.DefinitionEntry) _definitionEntryList.get(index);
    }

    /**
     * Method getDefinitionEntry.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.valueSets.DefinitionEntry[] getDefinitionEntry(
    ) {
        org.LexGrid.valueSets.DefinitionEntry[] array = new org.LexGrid.valueSets.DefinitionEntry[0];
        return (org.LexGrid.valueSets.DefinitionEntry[]) this._definitionEntryList.toArray(array);
    }

    /**
     * Method getDefinitionEntryAsReference.Returns a reference to
     * '_definitionEntryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.valueSets.DefinitionEntry> getDefinitionEntryAsReference(
    ) {
        return this._definitionEntryList;
    }

    /**
     * Method getDefinitionEntryCount.
     * 
     * @return the size of this collection
     */
    public int getDefinitionEntryCount(
    ) {
        return this._definitionEntryList.size();
    }

    /**
     * Returns the value of field 'mappings'. The field 'mappings'
     * has the following description: The mappings that are
     * specific to this value set definition. This set of mappings
     * must be supplied when a value set definition is included in
     * a changedEntry and must be empty when it is included in a
     * valueSets collection, as the collection itself carries the
     * mappings
     * 
     * @return the value of field 'Mappings'.
     */
    public org.LexGrid.naming.Mappings getMappings(
    ) {
        return this._mappings;
    }

    /**
     * Returns the value of field 'properties'. The field
     * 'properties' has the following description: A list of
     * properties used in the description of this value set
     * definition.
     * 
     * @return the value of field 'Properties'.
     */
    public org.LexGrid.commonTypes.Properties getProperties(
    ) {
        return this._properties;
    }

    /**
     * Method getRepresentsRealmOrContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getRepresentsRealmOrContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._representsRealmOrContextList.size()) {
            throw new IndexOutOfBoundsException("getRepresentsRealmOrContext: Index value '" + index + "' not in range [0.." + (this._representsRealmOrContextList.size() - 1) + "]");
        }

        return (java.lang.String) _representsRealmOrContextList.get(index);
    }

    /**
     * Method getRepresentsRealmOrContext.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getRepresentsRealmOrContext(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._representsRealmOrContextList.toArray(array);
    }

    /**
     * Method getRepresentsRealmOrContextAsReference.Returns a
     * reference to '_representsRealmOrContextList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getRepresentsRealmOrContextAsReference(
    ) {
        return this._representsRealmOrContextList;
    }

    /**
     * Method getRepresentsRealmOrContextCount.
     * 
     * @return the size of this collection
     */
    public int getRepresentsRealmOrContextCount(
    ) {
        return this._representsRealmOrContextList.size();
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
     * Returns the value of field 'valueSetDefinitionName'. The
     * field 'valueSetDefinitionName' has the following
     * description: The name of this value set definition, if any.
     * 
     * @return the value of field 'ValueSetDefinitionName'.
     */
    public java.lang.String getValueSetDefinitionName(
    ) {
        return this._valueSetDefinitionName;
    }

    /**
     * Returns the value of field 'valueSetDefinitionURI'. The
     * field 'valueSetDefinitionURI' has the following description:
     * The URI of this value set definition.
     * 
     * @return the value of field 'ValueSetDefinitionURI'.
     */
    public java.lang.String getValueSetDefinitionURI(
    ) {
        return this._valueSetDefinitionURI;
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
     * Method iterateDefinitionEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.valueSets.DefinitionEntry> iterateDefinitionEntry(
    ) {
        return this._definitionEntryList.iterator();
    }

    /**
     * Method iterateRepresentsRealmOrContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateRepresentsRealmOrContext(
    ) {
        return this._representsRealmOrContextList.iterator();
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
    public void removeAllDefinitionEntry(
    ) {
        this._definitionEntryList.clear();
    }

    /**
     */
    public void removeAllRepresentsRealmOrContext(
    ) {
        this._representsRealmOrContextList.clear();
    }

    /**
     */
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     * Method removeDefinitionEntry.
     * 
     * @param vDefinitionEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefinitionEntry(
            final org.LexGrid.valueSets.DefinitionEntry vDefinitionEntry) {
        boolean removed = _definitionEntryList.remove(vDefinitionEntry);
        return removed;
    }

    /**
     * Method removeDefinitionEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.valueSets.DefinitionEntry removeDefinitionEntryAt(
            final int index) {
        java.lang.Object obj = this._definitionEntryList.remove(index);
        return (org.LexGrid.valueSets.DefinitionEntry) obj;
    }

    /**
     * Method removeRepresentsRealmOrContext.
     * 
     * @param vRepresentsRealmOrContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeRepresentsRealmOrContext(
            final java.lang.String vRepresentsRealmOrContext) {
        boolean removed = _representsRealmOrContextList.remove(vRepresentsRealmOrContext);
        return removed;
    }

    /**
     * Method removeRepresentsRealmOrContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeRepresentsRealmOrContextAt(
            final int index) {
        java.lang.Object obj = this._representsRealmOrContextList.remove(index);
        return (java.lang.String) obj;
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
     * Sets the value of field 'conceptDomain'. The field
     * 'conceptDomain' has the following description: The local
     * name of the concept domain this value set definition binds
     * to. conceptDomain must match a local id of a
     * supportedConceptDomain in the mappings section.
     * 
     * @param conceptDomain the value of field 'conceptDomain'.
     */
    public void setConceptDomain(
            final java.lang.String conceptDomain) {
        this._conceptDomain = conceptDomain;
    }

    /**
     * Sets the value of field 'defaultCodingScheme'. The field
     * 'defaultCodingScheme' has the following description: Local
     * name of the primary coding scheme from which the value set
     * is drawn. defaultCodingScheme must match a local id of a
     * supportedCodingScheme in the mappings section.
     * 
     * @param defaultCodingScheme the value of field
     * 'defaultCodingScheme'.
     */
    public void setDefaultCodingScheme(
            final java.lang.String defaultCodingScheme) {
        this._defaultCodingScheme = defaultCodingScheme;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinitionEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefinitionEntry(
            final int index,
            final org.LexGrid.valueSets.DefinitionEntry vDefinitionEntry)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionEntryList.size()) {
            throw new IndexOutOfBoundsException("setDefinitionEntry: Index value '" + index + "' not in range [0.." + (this._definitionEntryList.size() - 1) + "]");
        }

        this._definitionEntryList.set(index, vDefinitionEntry);
    }

    /**
     * 
     * 
     * @param vDefinitionEntryArray
     */
    public void setDefinitionEntry(
            final org.LexGrid.valueSets.DefinitionEntry[] vDefinitionEntryArray) {
        //-- copy array
        _definitionEntryList.clear();

        for (int i = 0; i < vDefinitionEntryArray.length; i++) {
                this._definitionEntryList.add(vDefinitionEntryArray[i]);
        }
    }

    /**
     * Sets the value of '_definitionEntryList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vDefinitionEntryList the Vector to copy.
     */
    public void setDefinitionEntry(
            final java.util.List<org.LexGrid.valueSets.DefinitionEntry> vDefinitionEntryList) {
        // copy vector
        this._definitionEntryList.clear();

        this._definitionEntryList.addAll(vDefinitionEntryList);
    }

    /**
     * Sets the value of '_definitionEntryList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param definitionEntryList the Vector to set.
     */
    public void setDefinitionEntryAsReference(
            final java.util.List<org.LexGrid.valueSets.DefinitionEntry> definitionEntryList) {
        this._definitionEntryList = definitionEntryList;
    }

    /**
     * Sets the value of field 'mappings'. The field 'mappings' has
     * the following description: The mappings that are specific to
     * this value set definition. This set of mappings must be
     * supplied when a value set definition is included in a
     * changedEntry and must be empty when it is included in a
     * valueSets collection, as the collection itself carries the
     * mappings
     * 
     * @param mappings the value of field 'mappings'.
     */
    public void setMappings(
            final org.LexGrid.naming.Mappings mappings) {
        this._mappings = mappings;
    }

    /**
     * Sets the value of field 'properties'. The field 'properties'
     * has the following description: A list of properties used in
     * the description of this value set definition.
     * 
     * @param properties the value of field 'properties'.
     */
    public void setProperties(
            final org.LexGrid.commonTypes.Properties properties) {
        this._properties = properties;
    }

    /**
     * 
     * 
     * @param index
     * @param vRepresentsRealmOrContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRepresentsRealmOrContext(
            final int index,
            final java.lang.String vRepresentsRealmOrContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._representsRealmOrContextList.size()) {
            throw new IndexOutOfBoundsException("setRepresentsRealmOrContext: Index value '" + index + "' not in range [0.." + (this._representsRealmOrContextList.size() - 1) + "]");
        }

        this._representsRealmOrContextList.set(index, vRepresentsRealmOrContext);
    }

    /**
     * 
     * 
     * @param vRepresentsRealmOrContextArray
     */
    public void setRepresentsRealmOrContext(
            final java.lang.String[] vRepresentsRealmOrContextArray) {
        //-- copy array
        _representsRealmOrContextList.clear();

        for (int i = 0; i < vRepresentsRealmOrContextArray.length; i++) {
                this._representsRealmOrContextList.add(vRepresentsRealmOrContextArray[i]);
        }
    }

    /**
     * Sets the value of '_representsRealmOrContextList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vRepresentsRealmOrContextList the Vector to copy.
     */
    public void setRepresentsRealmOrContext(
            final java.util.List<java.lang.String> vRepresentsRealmOrContextList) {
        // copy vector
        this._representsRealmOrContextList.clear();

        this._representsRealmOrContextList.addAll(vRepresentsRealmOrContextList);
    }

    /**
     * Sets the value of '_representsRealmOrContextList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param representsRealmOrContextList the Vector to set.
     */
    public void setRepresentsRealmOrContextAsReference(
            final java.util.List<java.lang.String> representsRealmOrContextList) {
        this._representsRealmOrContextList = representsRealmOrContextList;
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
     * Sets the value of field 'valueSetDefinitionName'. The field
     * 'valueSetDefinitionName' has the following description: The
     * name of this value set definition, if any.
     * 
     * @param valueSetDefinitionName the value of field
     * 'valueSetDefinitionName'.
     */
    public void setValueSetDefinitionName(
            final java.lang.String valueSetDefinitionName) {
        this._valueSetDefinitionName = valueSetDefinitionName;
    }

    /**
     * Sets the value of field 'valueSetDefinitionURI'. The field
     * 'valueSetDefinitionURI' has the following description: The
     * URI of this value set definition.
     * 
     * @param valueSetDefinitionURI the value of field
     * 'valueSetDefinitionURI'.
     */
    public void setValueSetDefinitionURI(
            final java.lang.String valueSetDefinitionURI) {
        this._valueSetDefinitionURI = valueSetDefinitionURI;
    }

    /**
     * Method unmarshalValueSetDefinition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.ValueSetDefinition
     */
    public static org.LexGrid.valueSets.ValueSetDefinition unmarshalValueSetDefinition(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.ValueSetDefinition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.ValueSetDefinition.class, reader);
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
