/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt;

/**
 * Class CodingSchemeManifest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodingSchemeManifest extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The key for the coding scheme manifest values. Normally this
     * identifier is coding scheme's namespace.
     */
    private java.lang.String _id;

    /**
     * An identifier for the coding scheme.
     */
    private org.LexGrid.LexOnt.CsmfCodingSchemeName _codingScheme;

    /**
     * Coding scheme description text.
     */
    private org.LexGrid.LexOnt.CsmfEntityDescription _entityDescription;

    /**
     * Official or published name of the coding scheme.
     */
    private org.LexGrid.LexOnt.CsmfFormalName _formalName;

    /**
     * Registered name of the coding scheme.
     */
    private org.LexGrid.LexOnt.CsmfCodingSchemeURI _codingSchemeURI;

    /**
     * Local name of the language to use if not otherwise specified.
     */
    private org.LexGrid.LexOnt.CsmfDefaultLanguage _defaultLanguage;

    /**
     * The coding scheme version currently represented by this
     * entity.
     */
    private org.LexGrid.LexOnt.CsmfVersion _representsVersion;

    /**
     * Name that can be used to reference the coding scheme within 
     *  the context of the service.
     */
    private java.util.List<org.LexGrid.LexOnt.CsmfLocalName> _localNameList;

    /**
     * The source or orginator of the coding scheme.
     */
    private java.util.List<org.LexGrid.LexOnt.CsmfSource> _sourceList;

    /**
     * Copyright notice text.
     */
    private org.LexGrid.LexOnt.CsmfText _copyright;

    /**
     * Field _mappings.
     */
    private org.LexGrid.LexOnt.CsmfMappings _mappings;

    /**
     * Field _associationDefinitions.
     */
    private org.LexGrid.LexOnt.CsmfAssociationDefinition _associationDefinitions;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeManifest() {
        super();
        this._localNameList = new java.util.ArrayList<org.LexGrid.LexOnt.CsmfLocalName>();
        this._sourceList = new java.util.ArrayList<org.LexGrid.LexOnt.CsmfSource>();
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
            final org.LexGrid.LexOnt.CsmfLocalName vLocalName)
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
            final org.LexGrid.LexOnt.CsmfLocalName vLocalName)
    throws java.lang.IndexOutOfBoundsException {
        this._localNameList.add(index, vLocalName);
    }

    /**
     * 
     * 
     * @param vSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final org.LexGrid.LexOnt.CsmfSource vSource)
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
            final org.LexGrid.LexOnt.CsmfSource vSource)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceList.add(index, vSource);
    }

    /**
     * Method enumerateLocalName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexOnt.CsmfLocalName> enumerateLocalName(
    ) {
        return java.util.Collections.enumeration(this._localNameList);
    }

    /**
     * Method enumerateSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexOnt.CsmfSource> enumerateSource(
    ) {
        return java.util.Collections.enumeration(this._sourceList);
    }

    /**
     * Returns the value of field 'associationDefinitions'.
     * 
     * @return the value of field 'AssociationDefinitions'.
     */
    public org.LexGrid.LexOnt.CsmfAssociationDefinition getAssociationDefinitions(
    ) {
        return this._associationDefinitions;
    }

    /**
     * Returns the value of field 'codingScheme'. The field
     * 'codingScheme' has the following description: An identifier
     * for the coding scheme.
     * 
     * @return the value of field 'CodingScheme'.
     */
    public org.LexGrid.LexOnt.CsmfCodingSchemeName getCodingScheme(
    ) {
        return this._codingScheme;
    }

    /**
     * Returns the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: Registered
     * name of the coding scheme.
     * 
     * @return the value of field 'CodingSchemeURI'.
     */
    public org.LexGrid.LexOnt.CsmfCodingSchemeURI getCodingSchemeURI(
    ) {
        return this._codingSchemeURI;
    }

    /**
     * Returns the value of field 'copyright'. The field
     * 'copyright' has the following description: Copyright notice
     * text.
     * 
     * @return the value of field 'Copyright'.
     */
    public org.LexGrid.LexOnt.CsmfText getCopyright(
    ) {
        return this._copyright;
    }

    /**
     * Returns the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: Local name
     * of the language to use if not otherwise specified.
     * 
     * @return the value of field 'DefaultLanguage'.
     */
    public org.LexGrid.LexOnt.CsmfDefaultLanguage getDefaultLanguage(
    ) {
        return this._defaultLanguage;
    }

    /**
     * Returns the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: Coding
     * scheme description text.
     * 
     * @return the value of field 'EntityDescription'.
     */
    public org.LexGrid.LexOnt.CsmfEntityDescription getEntityDescription(
    ) {
        return this._entityDescription;
    }

    /**
     * Returns the value of field 'formalName'. The field
     * 'formalName' has the following description: Official or
     * published name of the coding scheme.
     * 
     * @return the value of field 'FormalName'.
     */
    public org.LexGrid.LexOnt.CsmfFormalName getFormalName(
    ) {
        return this._formalName;
    }

    /**
     * Returns the value of field 'id'. The field 'id' has the
     * following description: The key for the coding scheme
     * manifest values. Normally this identifier is coding scheme's
     * namespace.
     * 
     * @return the value of field 'Id'.
     */
    public java.lang.String getId(
    ) {
        return this._id;
    }

    /**
     * Method getLocalName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.LexOnt.CsmfLocalName at
     * the given index
     */
    public org.LexGrid.LexOnt.CsmfLocalName getLocalName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._localNameList.size()) {
            throw new IndexOutOfBoundsException("getLocalName: Index value '" + index + "' not in range [0.." + (this._localNameList.size() - 1) + "]");
        }

        return (org.LexGrid.LexOnt.CsmfLocalName) _localNameList.get(index);
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
    public org.LexGrid.LexOnt.CsmfLocalName[] getLocalName(
    ) {
        org.LexGrid.LexOnt.CsmfLocalName[] array = new org.LexGrid.LexOnt.CsmfLocalName[0];
        return (org.LexGrid.LexOnt.CsmfLocalName[]) this._localNameList.toArray(array);
    }

    /**
     * Method getLocalNameAsReference.Returns a reference to
     * '_localNameList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.LexOnt.CsmfLocalName> getLocalNameAsReference(
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
     * Returns the value of field 'mappings'.
     * 
     * @return the value of field 'Mappings'.
     */
    public org.LexGrid.LexOnt.CsmfMappings getMappings(
    ) {
        return this._mappings;
    }

    /**
     * Returns the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * coding scheme version currently represented by this entity.
     * 
     * @return the value of field 'RepresentsVersion'.
     */
    public org.LexGrid.LexOnt.CsmfVersion getRepresentsVersion(
    ) {
        return this._representsVersion;
    }

    /**
     * Method getSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.LexOnt.CsmfSource at
     * the given index
     */
    public org.LexGrid.LexOnt.CsmfSource getSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("getSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        return (org.LexGrid.LexOnt.CsmfSource) _sourceList.get(index);
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
    public org.LexGrid.LexOnt.CsmfSource[] getSource(
    ) {
        org.LexGrid.LexOnt.CsmfSource[] array = new org.LexGrid.LexOnt.CsmfSource[0];
        return (org.LexGrid.LexOnt.CsmfSource[]) this._sourceList.toArray(array);
    }

    /**
     * Method getSourceAsReference.Returns a reference to
     * '_sourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.LexOnt.CsmfSource> getSourceAsReference(
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
    public java.util.Iterator<? extends org.LexGrid.LexOnt.CsmfLocalName> iterateLocalName(
    ) {
        return this._localNameList.iterator();
    }

    /**
     * Method iterateSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexOnt.CsmfSource> iterateSource(
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
            final org.LexGrid.LexOnt.CsmfLocalName vLocalName) {
        boolean removed = _localNameList.remove(vLocalName);
        return removed;
    }

    /**
     * Method removeLocalNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexOnt.CsmfLocalName removeLocalNameAt(
            final int index) {
        java.lang.Object obj = this._localNameList.remove(index);
        return (org.LexGrid.LexOnt.CsmfLocalName) obj;
    }

    /**
     * Method removeSource.
     * 
     * @param vSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeSource(
            final org.LexGrid.LexOnt.CsmfSource vSource) {
        boolean removed = _sourceList.remove(vSource);
        return removed;
    }

    /**
     * Method removeSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexOnt.CsmfSource removeSourceAt(
            final int index) {
        java.lang.Object obj = this._sourceList.remove(index);
        return (org.LexGrid.LexOnt.CsmfSource) obj;
    }

    /**
     * Sets the value of field 'associationDefinitions'.
     * 
     * @param associationDefinitions the value of field
     * 'associationDefinitions'.
     */
    public void setAssociationDefinitions(
            final org.LexGrid.LexOnt.CsmfAssociationDefinition associationDefinitions) {
        this._associationDefinitions = associationDefinitions;
    }

    /**
     * Sets the value of field 'codingScheme'. The field
     * 'codingScheme' has the following description: An identifier
     * for the coding scheme.
     * 
     * @param codingScheme the value of field 'codingScheme'.
     */
    public void setCodingScheme(
            final org.LexGrid.LexOnt.CsmfCodingSchemeName codingScheme) {
        this._codingScheme = codingScheme;
    }

    /**
     * Sets the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: Registered
     * name of the coding scheme.
     * 
     * @param codingSchemeURI the value of field 'codingSchemeURI'.
     */
    public void setCodingSchemeURI(
            final org.LexGrid.LexOnt.CsmfCodingSchemeURI codingSchemeURI) {
        this._codingSchemeURI = codingSchemeURI;
    }

    /**
     * Sets the value of field 'copyright'. The field 'copyright'
     * has the following description: Copyright notice text.
     * 
     * @param copyright the value of field 'copyright'.
     */
    public void setCopyright(
            final org.LexGrid.LexOnt.CsmfText copyright) {
        this._copyright = copyright;
    }

    /**
     * Sets the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: Local name
     * of the language to use if not otherwise specified.
     * 
     * @param defaultLanguage the value of field 'defaultLanguage'.
     */
    public void setDefaultLanguage(
            final org.LexGrid.LexOnt.CsmfDefaultLanguage defaultLanguage) {
        this._defaultLanguage = defaultLanguage;
    }

    /**
     * Sets the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: Coding
     * scheme description text.
     * 
     * @param entityDescription the value of field
     * 'entityDescription'.
     */
    public void setEntityDescription(
            final org.LexGrid.LexOnt.CsmfEntityDescription entityDescription) {
        this._entityDescription = entityDescription;
    }

    /**
     * Sets the value of field 'formalName'. The field 'formalName'
     * has the following description: Official or published name of
     * the coding scheme.
     * 
     * @param formalName the value of field 'formalName'.
     */
    public void setFormalName(
            final org.LexGrid.LexOnt.CsmfFormalName formalName) {
        this._formalName = formalName;
    }

    /**
     * Sets the value of field 'id'. The field 'id' has the
     * following description: The key for the coding scheme
     * manifest values. Normally this identifier is coding scheme's
     * namespace.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(
            final java.lang.String id) {
        this._id = id;
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
            final org.LexGrid.LexOnt.CsmfLocalName vLocalName)
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
            final org.LexGrid.LexOnt.CsmfLocalName[] vLocalNameArray) {
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
            final java.util.List<org.LexGrid.LexOnt.CsmfLocalName> vLocalNameList) {
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
            final java.util.List<org.LexGrid.LexOnt.CsmfLocalName> localNameList) {
        this._localNameList = localNameList;
    }

    /**
     * Sets the value of field 'mappings'.
     * 
     * @param mappings the value of field 'mappings'.
     */
    public void setMappings(
            final org.LexGrid.LexOnt.CsmfMappings mappings) {
        this._mappings = mappings;
    }

    /**
     * Sets the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * coding scheme version currently represented by this entity.
     * 
     * @param representsVersion the value of field
     * 'representsVersion'.
     */
    public void setRepresentsVersion(
            final org.LexGrid.LexOnt.CsmfVersion representsVersion) {
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
            final org.LexGrid.LexOnt.CsmfSource vSource)
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
            final org.LexGrid.LexOnt.CsmfSource[] vSourceArray) {
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
            final java.util.List<org.LexGrid.LexOnt.CsmfSource> vSourceList) {
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
            final java.util.List<org.LexGrid.LexOnt.CsmfSource> sourceList) {
        this._sourceList = sourceList;
    }

    /**
     * Method unmarshalCodingSchemeManifest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.LexOnt.CodingSchemeManifest
     */
    public static org.LexGrid.LexOnt.CodingSchemeManifest unmarshalCodingSchemeManifest(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.LexOnt.CodingSchemeManifest) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.LexOnt.CodingSchemeManifest.class, reader);
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
