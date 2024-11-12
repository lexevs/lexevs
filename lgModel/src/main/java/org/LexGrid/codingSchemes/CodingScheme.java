/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.codingSchemes;

/**
 * A resource that makes assertions about a collection of
 * terminological entities.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodingScheme extends org.LexGrid.commonTypes.VersionableAndDescribable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique local identifier used to uniquely reference this
     * coding scheme within the context of a message or container.
     * codingSchemeName must match a local id of a
     * supportedCodingScheme in the mappings section.
     */
    private java.lang.String _codingSchemeName;

    /**
     * The official URI for this coding scheme . This URI must also
     * be present in the supportedCodingScheme entry that matches
     * the codingSchemeName.
     */
    private java.lang.String _codingSchemeURI;

    /**
     * The official or common name by which this coding scheme is
     * known. (optional)
     */
    private java.lang.String _formalName;

    /**
     * The local identifier of the language that is used in all
     * presentations, descriptions, etc. in this coding scheme if
     * not otherwise specified. defaultLanguage must match a local
     * id of a supportedLanguage in the mappings section.
     */
    private java.lang.String _defaultLanguage;

    /**
     * The approximate number of entries in the lexical portion of
     * this scheme. This is used as a hint for browsers and services
     */
    private java.lang.Long _approxNumConcepts;

    /**
     * The specific version of the resource represented by this
     * coding scheme.
     */
    private java.lang.String _representsVersion;

    /**
     * Name that can be used to reference the coding scheme within
     * the context of a given service. 
     */
    private java.util.List<java.lang.String> _localNameList;

    /**
     * The local identifiers of the source(s) of this coding
     * scheme. Must match a local id of a supportedSource in the
     * corresponding mappings section.
     */
    private java.util.List<org.LexGrid.commonTypes.Source> _sourceList;

    /**
     * Information about rights held in and over the resource.
     * Typically, copyright information includes a statement about
     * various property rights associated with the resource,
     * including intellectual property rights.
     */
    private org.LexGrid.commonTypes.Text _copyright;

    /**
     * A list of the local identifiers used in this resource along
     * with the corresponding URI's, if known.
     */
    private org.LexGrid.naming.Mappings _mappings;

    /**
     * A list of propeties used in the description of this coding
     * scheme.
     */
    private org.LexGrid.commonTypes.Properties _properties;

    /**
     * The set of lexical assertions made by this coding scheme.
     */
    private org.LexGrid.concepts.Entities _entities;

    /**
     * The set of semantic assertions made by this coding scheme.
     */
    private java.util.List<org.LexGrid.relations.Relations> _relationsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingScheme() {
        super();
        this._localNameList = new java.util.ArrayList<java.lang.String>();
        this._sourceList = new java.util.ArrayList<org.LexGrid.commonTypes.Source>();
        this._relationsList = new java.util.ArrayList<org.LexGrid.relations.Relations>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLocalName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLocalName(
            final java.lang.String vLocalName)
    throws java.lang.IndexOutOfBoundsException {
        this._localNameList.add(vLocalName);
    }

    /**
     * 
     * 
     * @param index
     * @param vLocalName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLocalName(
            final int index,
            final java.lang.String vLocalName)
    throws java.lang.IndexOutOfBoundsException {
        this._localNameList.add(index, vLocalName);
    }

    /**
     * 
     * 
     * @param vRelations
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelations(
            final org.LexGrid.relations.Relations vRelations)
    throws java.lang.IndexOutOfBoundsException {
        this._relationsList.add(vRelations);
    }

    /**
     * 
     * 
     * @param index
     * @param vRelations
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelations(
            final int index,
            final org.LexGrid.relations.Relations vRelations)
    throws java.lang.IndexOutOfBoundsException {
        this._relationsList.add(index, vRelations);
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
     * Method enumerateLocalName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateLocalName(
    ) {
        return java.util.Collections.enumeration(this._localNameList);
    }

    /**
     * Method enumerateRelations.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.Relations> enumerateRelations(
    ) {
        return java.util.Collections.enumeration(this._relationsList);
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
     * Returns the value of field 'approxNumConcepts'. The field
     * 'approxNumConcepts' has the following description: The
     * approximate number of entries in the lexical portion of this
     * scheme. This is used as a hint for browsers and services.
     * 
     * @return the value of field 'ApproxNumConcepts'.
     */
    public java.lang.Long getApproxNumConcepts(
    ) {
        return this._approxNumConcepts;
    }

    /**
     * Returns the value of field 'codingSchemeName'. The field
     * 'codingSchemeName' has the following description: The unique
     * local identifier used to uniquely reference this coding
     * scheme within the context of a message or container.
     * codingSchemeName must match a local id of a
     * supportedCodingScheme in the mappings section.
     * 
     * @return the value of field 'CodingSchemeName'.
     */
    public java.lang.String getCodingSchemeName(
    ) {
        return this._codingSchemeName;
    }

    /**
     * Returns the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The
     * official URI for this coding scheme . This URI must also be
     * present in the supportedCodingScheme entry that matches the
     * codingSchemeName.
     * 
     * @return the value of field 'CodingSchemeURI'.
     */
    public java.lang.String getCodingSchemeURI(
    ) {
        return this._codingSchemeURI;
    }

    /**
     * Returns the value of field 'copyright'. The field
     * 'copyright' has the following description: Information about
     * rights held in and over the resource. Typically, copyright
     * information includes a statement about various property
     * rights associated with the resource, including intellectual
     * property rights.
     * 
     * @return the value of field 'Copyright'.
     */
    public org.LexGrid.commonTypes.Text getCopyright(
    ) {
        return this._copyright;
    }

    /**
     * Returns the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: The local
     * identifier of the language that is used in all
     * presentations, descriptions, etc. in this coding scheme if
     * not otherwise specified. defaultLanguage must match a local
     * id of a supportedLanguage in the mappings section.
     * 
     * @return the value of field 'DefaultLanguage'.
     */
    public java.lang.String getDefaultLanguage(
    ) {
        return this._defaultLanguage;
    }

    /**
     * Returns the value of field 'entities'. The field 'entities'
     * has the following description: The set of lexical assertions
     * made by this coding scheme.
     * 
     * @return the value of field 'Entities'.
     */
    public org.LexGrid.concepts.Entities getEntities(
    ) {
        return this._entities;
    }

    /**
     * Returns the value of field 'formalName'. The field
     * 'formalName' has the following description: The official or
     * common name by which this coding scheme is known. (optional)
     * 
     * @return the value of field 'FormalName'.
     */
    public java.lang.String getFormalName(
    ) {
        return this._formalName;
    }

    /**
     * Method getLocalName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getLocalName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._localNameList.size()) {
            throw new IndexOutOfBoundsException("getLocalName: Index value '" + index + "' not in range [0.." + (this._localNameList.size() - 1) + "]");
        }

        return (java.lang.String) _localNameList.get(index);
    }

    /**
     * Method getLocalName.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getLocalName(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._localNameList.toArray(array);
    }

    /**
     * Method getLocalNameAsReference.Returns a reference to
     * '_localNameList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getLocalNameAsReference(
    ) {
        return this._localNameList;
    }

    /**
     * Method getLocalNameCount.
     * 
     * @return the size of this collection
     */
    public int getLocalNameCount(
    ) {
        return this._localNameList.size();
    }

    /**
     * Returns the value of field 'mappings'. The field 'mappings'
     * has the following description: A list of the local
     * identifiers used in this resource along with the
     * corresponding URI's, if known.
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
     * propeties used in the description of this coding scheme.
     * 
     * @return the value of field 'Properties'.
     */
    public org.LexGrid.commonTypes.Properties getProperties(
    ) {
        return this._properties;
    }

    /**
     * Method getRelations.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.relations.Relations at
     * the given index
     */
    public org.LexGrid.relations.Relations getRelations(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relationsList.size()) {
            throw new IndexOutOfBoundsException("getRelations: Index value '" + index + "' not in range [0.." + (this._relationsList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.Relations) _relationsList.get(index);
    }

    /**
     * Method getRelations.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.Relations[] getRelations(
    ) {
        org.LexGrid.relations.Relations[] array = new org.LexGrid.relations.Relations[0];
        return (org.LexGrid.relations.Relations[]) this._relationsList.toArray(array);
    }

    /**
     * Method getRelationsAsReference.Returns a reference to
     * '_relationsList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.Relations> getRelationsAsReference(
    ) {
        return this._relationsList;
    }

    /**
     * Method getRelationsCount.
     * 
     * @return the size of this collection
     */
    public int getRelationsCount(
    ) {
        return this._relationsList.size();
    }

    /**
     * Returns the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * specific version of the resource represented by this coding
     * scheme.
     * 
     * @return the value of field 'RepresentsVersion'.
     */
    public java.lang.String getRepresentsVersion(
    ) {
        return this._representsVersion;
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
     * Method iterateLocalName.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateLocalName(
    ) {
        return this._localNameList.iterator();
    }

    /**
     * Method iterateRelations.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.Relations> iterateRelations(
    ) {
        return this._relationsList.iterator();
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
    public void removeAllLocalName(
    ) {
        this._localNameList.clear();
    }

    /**
     */
    public void removeAllRelations(
    ) {
        this._relationsList.clear();
    }

    /**
     */
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     * Method removeLocalName.
     * 
     * @param vLocalName
     * @return true if the object was removed from the collection.
     */
    public boolean removeLocalName(
            final java.lang.String vLocalName) {
        boolean removed = _localNameList.remove(vLocalName);
        return removed;
    }

    /**
     * Method removeLocalNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeLocalNameAt(
            final int index) {
        java.lang.Object obj = this._localNameList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeRelations.
     * 
     * @param vRelations
     * @return true if the object was removed from the collection.
     */
    public boolean removeRelations(
            final org.LexGrid.relations.Relations vRelations) {
        boolean removed = _relationsList.remove(vRelations);
        return removed;
    }

    /**
     * Method removeRelationsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.Relations removeRelationsAt(
            final int index) {
        java.lang.Object obj = this._relationsList.remove(index);
        return (org.LexGrid.relations.Relations) obj;
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
     * Sets the value of field 'approxNumConcepts'. The field
     * 'approxNumConcepts' has the following description: The
     * approximate number of entries in the lexical portion of this
     * scheme. This is used as a hint for browsers and services.
     * 
     * @param approxNumConcepts the value of field
     * 'approxNumConcepts'.
     */
    public void setApproxNumConcepts(
            final java.lang.Long approxNumConcepts) {
        this._approxNumConcepts = approxNumConcepts;
    }

    /**
     * Sets the value of field 'codingSchemeName'. The field
     * 'codingSchemeName' has the following description: The unique
     * local identifier used to uniquely reference this coding
     * scheme within the context of a message or container.
     * codingSchemeName must match a local id of a
     * supportedCodingScheme in the mappings section.
     * 
     * @param codingSchemeName the value of field 'codingSchemeName'
     */
    public void setCodingSchemeName(
            final java.lang.String codingSchemeName) {
        this._codingSchemeName = codingSchemeName;
    }

    /**
     * Sets the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The
     * official URI for this coding scheme . This URI must also be
     * present in the supportedCodingScheme entry that matches the
     * codingSchemeName.
     * 
     * @param codingSchemeURI the value of field 'codingSchemeURI'.
     */
    public void setCodingSchemeURI(
            final java.lang.String codingSchemeURI) {
        this._codingSchemeURI = codingSchemeURI;
    }

    /**
     * Sets the value of field 'copyright'. The field 'copyright'
     * has the following description: Information about rights held
     * in and over the resource. Typically, copyright information
     * includes a statement about various property rights
     * associated with the resource, including intellectual
     * property rights.
     * 
     * @param copyright the value of field 'copyright'.
     */
    public void setCopyright(
            final org.LexGrid.commonTypes.Text copyright) {
        this._copyright = copyright;
    }

    /**
     * Sets the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: The local
     * identifier of the language that is used in all
     * presentations, descriptions, etc. in this coding scheme if
     * not otherwise specified. defaultLanguage must match a local
     * id of a supportedLanguage in the mappings section.
     * 
     * @param defaultLanguage the value of field 'defaultLanguage'.
     */
    public void setDefaultLanguage(
            final java.lang.String defaultLanguage) {
        this._defaultLanguage = defaultLanguage;
    }

    /**
     * Sets the value of field 'entities'. The field 'entities' has
     * the following description: The set of lexical assertions
     * made by this coding scheme.
     * 
     * @param entities the value of field 'entities'.
     */
    public void setEntities(
            final org.LexGrid.concepts.Entities entities) {
        this._entities = entities;
    }

    /**
     * Sets the value of field 'formalName'. The field 'formalName'
     * has the following description: The official or common name
     * by which this coding scheme is known. (optional)
     * 
     * @param formalName the value of field 'formalName'.
     */
    public void setFormalName(
            final java.lang.String formalName) {
        this._formalName = formalName;
    }

    /**
     * 
     * 
     * @param index
     * @param vLocalName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLocalName(
            final int index,
            final java.lang.String vLocalName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._localNameList.size()) {
            throw new IndexOutOfBoundsException("setLocalName: Index value '" + index + "' not in range [0.." + (this._localNameList.size() - 1) + "]");
        }

        this._localNameList.set(index, vLocalName);
    }

    /**
     * 
     * 
     * @param vLocalNameArray
     */
    public void setLocalName(
            final java.lang.String[] vLocalNameArray) {
        //-- copy array
        _localNameList.clear();

        for (int i = 0; i < vLocalNameArray.length; i++) {
                this._localNameList.add(vLocalNameArray[i]);
        }
    }

    /**
     * Sets the value of '_localNameList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vLocalNameList the Vector to copy.
     */
    public void setLocalName(
            final java.util.List<java.lang.String> vLocalNameList) {
        // copy vector
        this._localNameList.clear();

        this._localNameList.addAll(vLocalNameList);
    }

    /**
     * Sets the value of '_localNameList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param localNameList the Vector to set.
     */
    public void setLocalNameAsReference(
            final java.util.List<java.lang.String> localNameList) {
        this._localNameList = localNameList;
    }

    /**
     * Sets the value of field 'mappings'. The field 'mappings' has
     * the following description: A list of the local identifiers
     * used in this resource along with the corresponding URI's, if
     * known.
     * 
     * @param mappings the value of field 'mappings'.
     */
    public void setMappings(
            final org.LexGrid.naming.Mappings mappings) {
        this._mappings = mappings;
    }

    /**
     * Sets the value of field 'properties'. The field 'properties'
     * has the following description: A list of propeties used in
     * the description of this coding scheme.
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
     * @param vRelations
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRelations(
            final int index,
            final org.LexGrid.relations.Relations vRelations)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relationsList.size()) {
            throw new IndexOutOfBoundsException("setRelations: Index value '" + index + "' not in range [0.." + (this._relationsList.size() - 1) + "]");
        }

        this._relationsList.set(index, vRelations);
    }

    /**
     * 
     * 
     * @param vRelationsArray
     */
    public void setRelations(
            final org.LexGrid.relations.Relations[] vRelationsArray) {
        //-- copy array
        _relationsList.clear();

        for (int i = 0; i < vRelationsArray.length; i++) {
                this._relationsList.add(vRelationsArray[i]);
        }
    }

    /**
     * Sets the value of '_relationsList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vRelationsList the Vector to copy.
     */
    public void setRelations(
            final java.util.List<org.LexGrid.relations.Relations> vRelationsList) {
        // copy vector
        this._relationsList.clear();

        this._relationsList.addAll(vRelationsList);
    }

    /**
     * Sets the value of '_relationsList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param relationsList the Vector to set.
     */
    public void setRelationsAsReference(
            final java.util.List<org.LexGrid.relations.Relations> relationsList) {
        this._relationsList = relationsList;
    }

    /**
     * Sets the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * specific version of the resource represented by this coding
     * scheme.
     * 
     * @param representsVersion the value of field
     * 'representsVersion'.
     */
    public void setRepresentsVersion(
            final java.lang.String representsVersion) {
        this._representsVersion = representsVersion;
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
     * Method unmarshalCodingScheme.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.codingSchemes.CodingSchem
     */
    public static org.LexGrid.codingSchemes.CodingScheme unmarshalCodingScheme(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.codingSchemes.CodingScheme) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.codingSchemes.CodingScheme.class, reader);
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
