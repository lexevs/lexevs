/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * A collection of relations that represent a particular point of
 * view or community.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Relations extends org.LexGrid.commonTypes.VersionableAndDescribable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique identifier of this collection. Required if there
     * is more than one collection of relations in a coding scheme
     */
    private java.lang.String _containerName;

    /**
     * The version of the particular container (mapping) that the
     * relations entry represents
     */
    private java.lang.String _representsVersion;

    /**
     * True means that this set of relations are considered mapping
     * between sourceCodingScheme and targetCodingScheme.
     */
    private java.lang.Boolean _isMapping;

    /**
     * Local name of the coding scheme that is used as a source for
     * this set of relations. sourceCodingScheme must match a local
     * id of a supportedCodingScheme in the mappings section.
     */
    private java.lang.String _sourceCodingScheme;

    /**
     * Version of the source coding scheme used in mappings.
     */
    private java.lang.String _sourceCodingSchemeVersion;

    /**
     * Local name of the coding scheme that is used as a target for
     * this set of relations. targetCodingScheme must match a local
     * id of a supportedCodingScheme in the mappings section.
     */
    private java.lang.String _targetCodingScheme;

    /**
     * Version of the target coding scheme used in mappings.
     */
    private java.lang.String _targetCodingSchemeVersion;

    /**
     * The collection of relations that are represented.
     */
    private java.util.List<org.LexGrid.relations.AssociationPredicate> _associationPredicateList;

    /**
     * A list of propeties used in the description of this relation.
     */
    private org.LexGrid.commonTypes.Properties _properties;


      //----------------/
     //- Constructors -/
    //----------------/

    public Relations() {
        super();
        this._associationPredicateList = new java.util.ArrayList<org.LexGrid.relations.AssociationPredicate>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociationPredicate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationPredicate(
            final org.LexGrid.relations.AssociationPredicate vAssociationPredicate)
    throws java.lang.IndexOutOfBoundsException {
        this._associationPredicateList.add(vAssociationPredicate);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationPredicate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationPredicate(
            final int index,
            final org.LexGrid.relations.AssociationPredicate vAssociationPredicate)
    throws java.lang.IndexOutOfBoundsException {
        this._associationPredicateList.add(index, vAssociationPredicate);
    }

    /**
     * Method enumerateAssociationPredicate.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationPredicate> enumerateAssociationPredicate(
    ) {
        return java.util.Collections.enumeration(this._associationPredicateList);
    }

    /**
     * Method getAssociationPredicate.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationPredicate at the given index
     */
    public org.LexGrid.relations.AssociationPredicate getAssociationPredicate(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationPredicateList.size()) {
            throw new IndexOutOfBoundsException("getAssociationPredicate: Index value '" + index + "' not in range [0.." + (this._associationPredicateList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationPredicate) _associationPredicateList.get(index);
    }

    /**
     * Method getAssociationPredicate.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.AssociationPredicate[] getAssociationPredicate(
    ) {
        org.LexGrid.relations.AssociationPredicate[] array = new org.LexGrid.relations.AssociationPredicate[0];
        return (org.LexGrid.relations.AssociationPredicate[]) this._associationPredicateList.toArray(array);
    }

    /**
     * Method getAssociationPredicateAsReference.Returns a
     * reference to '_associationPredicateList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationPredicate> getAssociationPredicateAsReference(
    ) {
        return this._associationPredicateList;
    }

    /**
     * Method getAssociationPredicateCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationPredicateCount(
    ) {
        return this._associationPredicateList.size();
    }

    /**
     * Returns the value of field 'containerName'. The field
     * 'containerName' has the following description: The unique
     * identifier of this collection. Required if there is more
     * than one collection of relations in a coding scheme
     * 
     * @return the value of field 'ContainerName'.
     */
    public java.lang.String getContainerName(
    ) {
        return this._containerName;
    }

    /**
     * Returns the value of field 'isMapping'. The field
     * 'isMapping' has the following description: True means that
     * this set of relations are considered mapping between
     * sourceCodingScheme and targetCodingScheme.
     * 
     * @return the value of field 'IsMapping'.
     */
    public java.lang.Boolean getIsMapping(
    ) {
        return this._isMapping;
    }

    /**
     * Returns the value of field 'properties'. The field
     * 'properties' has the following description: A list of
     * propeties used in the description of this relation.
     * 
     * @return the value of field 'Properties'.
     */
    public org.LexGrid.commonTypes.Properties getProperties(
    ) {
        return this._properties;
    }

    /**
     * Returns the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * version of the particular container (mapping) that the
     * relations entry represents
     * 
     * @return the value of field 'RepresentsVersion'.
     */
    public java.lang.String getRepresentsVersion(
    ) {
        return this._representsVersion;
    }

    /**
     * Returns the value of field 'sourceCodingScheme'. The field
     * 'sourceCodingScheme' has the following description: Local
     * name of the coding scheme that is used as a source for this
     * set of relations. sourceCodingScheme must match a local id
     * of a supportedCodingScheme in the mappings section.
     * 
     * @return the value of field 'SourceCodingScheme'.
     */
    public java.lang.String getSourceCodingScheme(
    ) {
        return this._sourceCodingScheme;
    }

    /**
     * Returns the value of field 'sourceCodingSchemeVersion'. The
     * field 'sourceCodingSchemeVersion' has the following
     * description: Version of the source coding scheme used in
     * mappings.
     * 
     * @return the value of field 'SourceCodingSchemeVersion'.
     */
    public java.lang.String getSourceCodingSchemeVersion(
    ) {
        return this._sourceCodingSchemeVersion;
    }

    /**
     * Returns the value of field 'targetCodingScheme'. The field
     * 'targetCodingScheme' has the following description: Local
     * name of the coding scheme that is used as a target for this
     * set of relations. targetCodingScheme must match a local id
     * of a supportedCodingScheme in the mappings section.
     * 
     * @return the value of field 'TargetCodingScheme'.
     */
    public java.lang.String getTargetCodingScheme(
    ) {
        return this._targetCodingScheme;
    }

    /**
     * Returns the value of field 'targetCodingSchemeVersion'. The
     * field 'targetCodingSchemeVersion' has the following
     * description: Version of the target coding scheme used in
     * mappings.
     * 
     * @return the value of field 'TargetCodingSchemeVersion'.
     */
    public java.lang.String getTargetCodingSchemeVersion(
    ) {
        return this._targetCodingSchemeVersion;
    }

    /**
     * Returns the value of field 'isMapping'. The field
     * 'isMapping' has the following description: True means that
     * this set of relations are considered mapping between
     * sourceCodingScheme and targetCodingScheme.
     * 
     * @return the value of field 'IsMapping'.
     */
    public java.lang.Boolean isIsMapping(
    ) {
        return this._isMapping;
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
     * Method iterateAssociationPredicate.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationPredicate> iterateAssociationPredicate(
    ) {
        return this._associationPredicateList.iterator();
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
    public void removeAllAssociationPredicate(
    ) {
        this._associationPredicateList.clear();
    }

    /**
     * Method removeAssociationPredicate.
     * 
     * @param vAssociationPredicate
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociationPredicate(
            final org.LexGrid.relations.AssociationPredicate vAssociationPredicate) {
        boolean removed = _associationPredicateList.remove(vAssociationPredicate);
        return removed;
    }

    /**
     * Method removeAssociationPredicateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationPredicate removeAssociationPredicateAt(
            final int index) {
        java.lang.Object obj = this._associationPredicateList.remove(index);
        return (org.LexGrid.relations.AssociationPredicate) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationPredicate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociationPredicate(
            final int index,
            final org.LexGrid.relations.AssociationPredicate vAssociationPredicate)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationPredicateList.size()) {
            throw new IndexOutOfBoundsException("setAssociationPredicate: Index value '" + index + "' not in range [0.." + (this._associationPredicateList.size() - 1) + "]");
        }

        this._associationPredicateList.set(index, vAssociationPredicate);
    }

    /**
     * 
     * 
     * @param vAssociationPredicateArray
     */
    public void setAssociationPredicate(
            final org.LexGrid.relations.AssociationPredicate[] vAssociationPredicateArray) {
        //-- copy array
        _associationPredicateList.clear();

        for (int i = 0; i < vAssociationPredicateArray.length; i++) {
                this._associationPredicateList.add(vAssociationPredicateArray[i]);
        }
    }

    /**
     * Sets the value of '_associationPredicateList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAssociationPredicateList the Vector to copy.
     */
    public void setAssociationPredicate(
            final java.util.List<org.LexGrid.relations.AssociationPredicate> vAssociationPredicateList) {
        // copy vector
        this._associationPredicateList.clear();

        this._associationPredicateList.addAll(vAssociationPredicateList);
    }

    /**
     * Sets the value of '_associationPredicateList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param associationPredicateList the Vector to set.
     */
    public void setAssociationPredicateAsReference(
            final java.util.List<org.LexGrid.relations.AssociationPredicate> associationPredicateList) {
        this._associationPredicateList = associationPredicateList;
    }

    /**
     * Sets the value of field 'containerName'. The field
     * 'containerName' has the following description: The unique
     * identifier of this collection. Required if there is more
     * than one collection of relations in a coding scheme
     * 
     * @param containerName the value of field 'containerName'.
     */
    public void setContainerName(
            final java.lang.String containerName) {
        this._containerName = containerName;
    }

    /**
     * Sets the value of field 'isMapping'. The field 'isMapping'
     * has the following description: True means that this set of
     * relations are considered mapping between sourceCodingScheme
     * and targetCodingScheme.
     * 
     * @param isMapping the value of field 'isMapping'.
     */
    public void setIsMapping(
            final java.lang.Boolean isMapping) {
        this._isMapping = isMapping;
    }

    /**
     * Sets the value of field 'properties'. The field 'properties'
     * has the following description: A list of propeties used in
     * the description of this relation.
     * 
     * @param properties the value of field 'properties'.
     */
    public void setProperties(
            final org.LexGrid.commonTypes.Properties properties) {
        this._properties = properties;
    }

    /**
     * Sets the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * version of the particular container (mapping) that the
     * relations entry represents
     * 
     * @param representsVersion the value of field
     * 'representsVersion'.
     */
    public void setRepresentsVersion(
            final java.lang.String representsVersion) {
        this._representsVersion = representsVersion;
    }

    /**
     * Sets the value of field 'sourceCodingScheme'. The field
     * 'sourceCodingScheme' has the following description: Local
     * name of the coding scheme that is used as a source for this
     * set of relations. sourceCodingScheme must match a local id
     * of a supportedCodingScheme in the mappings section.
     * 
     * @param sourceCodingScheme the value of field
     * 'sourceCodingScheme'.
     */
    public void setSourceCodingScheme(
            final java.lang.String sourceCodingScheme) {
        this._sourceCodingScheme = sourceCodingScheme;
    }

    /**
     * Sets the value of field 'sourceCodingSchemeVersion'. The
     * field 'sourceCodingSchemeVersion' has the following
     * description: Version of the source coding scheme used in
     * mappings.
     * 
     * @param sourceCodingSchemeVersion the value of field
     * 'sourceCodingSchemeVersion'.
     */
    public void setSourceCodingSchemeVersion(
            final java.lang.String sourceCodingSchemeVersion) {
        this._sourceCodingSchemeVersion = sourceCodingSchemeVersion;
    }

    /**
     * Sets the value of field 'targetCodingScheme'. The field
     * 'targetCodingScheme' has the following description: Local
     * name of the coding scheme that is used as a target for this
     * set of relations. targetCodingScheme must match a local id
     * of a supportedCodingScheme in the mappings section.
     * 
     * @param targetCodingScheme the value of field
     * 'targetCodingScheme'.
     */
    public void setTargetCodingScheme(
            final java.lang.String targetCodingScheme) {
        this._targetCodingScheme = targetCodingScheme;
    }

    /**
     * Sets the value of field 'targetCodingSchemeVersion'. The
     * field 'targetCodingSchemeVersion' has the following
     * description: Version of the target coding scheme used in
     * mappings.
     * 
     * @param targetCodingSchemeVersion the value of field
     * 'targetCodingSchemeVersion'.
     */
    public void setTargetCodingSchemeVersion(
            final java.lang.String targetCodingSchemeVersion) {
        this._targetCodingSchemeVersion = targetCodingSchemeVersion;
    }

    /**
     * Method unmarshalRelations.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.relations.Relations
     */
    public static org.LexGrid.relations.Relations unmarshalRelations(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.Relations) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.Relations.class, reader);
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
