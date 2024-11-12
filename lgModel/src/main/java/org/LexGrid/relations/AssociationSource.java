/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * An entity that occurs in one or more instances of a relation on
 * the "from" (or left hand) side of a particular relation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationSource extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Local name of the namespace of the sourceEntityCode.
     * sourceEntityCodeNamespace must match a local id of a
     * supportedNamespace in the corresponding mappings section. If
     * omitted, the URI of sourceEntityCode namespace is the
     * codingSchemeURI of the containing coding scheme.
     */
    private java.lang.String _sourceEntityCodeNamespace;

    /**
     * The entity code of the source entity.
     */
    private java.lang.String _sourceEntityCode;

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * The set of all entities that appear on the "to" (or right
     * hand) side of a particular relation.
     */
    private java.util.List<org.LexGrid.relations.AssociationTarget> _targetList;

    /**
     * The set of data instances that appear on the "to" (or right
     * hand) side of a particular relation.
     */
    private java.util.List<org.LexGrid.relations.AssociationData> _targetDataList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationSource() {
        super();
        this._targetList = new java.util.ArrayList<org.LexGrid.relations.AssociationTarget>();
        this._targetDataList = new java.util.ArrayList<org.LexGrid.relations.AssociationData>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final org.LexGrid.relations.AssociationTarget vTarget)
    throws java.lang.IndexOutOfBoundsException {
        this._targetList.add(vTarget);
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final int index,
            final org.LexGrid.relations.AssociationTarget vTarget)
    throws java.lang.IndexOutOfBoundsException {
        this._targetList.add(index, vTarget);
    }

    /**
     * 
     * 
     * @param vTargetData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTargetData(
            final org.LexGrid.relations.AssociationData vTargetData)
    throws java.lang.IndexOutOfBoundsException {
        this._targetDataList.add(vTargetData);
    }

    /**
     * 
     * 
     * @param index
     * @param vTargetData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTargetData(
            final int index,
            final org.LexGrid.relations.AssociationData vTargetData)
    throws java.lang.IndexOutOfBoundsException {
        this._targetDataList.add(index, vTargetData);
    }

    /**
     * Method enumerateTarget.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationTarget> enumerateTarget(
    ) {
        return java.util.Collections.enumeration(this._targetList);
    }

    /**
     * Method enumerateTargetData.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationData> enumerateTargetData(
    ) {
        return java.util.Collections.enumeration(this._targetDataList);
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'sourceEntityCode'. The field
     * 'sourceEntityCode' has the following description: The entity
     * code of the source entity.
     * 
     * @return the value of field 'SourceEntityCode'.
     */
    public java.lang.String getSourceEntityCode(
    ) {
        return this._sourceEntityCode;
    }

    /**
     * Returns the value of field 'sourceEntityCodeNamespace'. The
     * field 'sourceEntityCodeNamespace' has the following
     * description: Local name of the namespace of the
     * sourceEntityCode. sourceEntityCodeNamespace must match a
     * local id of a supportedNamespace in the corresponding
     * mappings section. If omitted, the URI of sourceEntityCode
     * namespace is the codingSchemeURI of the containing coding
     * scheme.
     * 
     * @return the value of field 'SourceEntityCodeNamespace'.
     */
    public java.lang.String getSourceEntityCodeNamespace(
    ) {
        return this._sourceEntityCodeNamespace;
    }

    /**
     * Method getTarget.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationTarget at the given index
     */
    public org.LexGrid.relations.AssociationTarget getTarget(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("getTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationTarget) _targetList.get(index);
    }

    /**
     * Method getTarget.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.AssociationTarget[] getTarget(
    ) {
        org.LexGrid.relations.AssociationTarget[] array = new org.LexGrid.relations.AssociationTarget[0];
        return (org.LexGrid.relations.AssociationTarget[]) this._targetList.toArray(array);
    }

    /**
     * Method getTargetAsReference.Returns a reference to
     * '_targetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationTarget> getTargetAsReference(
    ) {
        return this._targetList;
    }

    /**
     * Method getTargetCount.
     * 
     * @return the size of this collection
     */
    public int getTargetCount(
    ) {
        return this._targetList.size();
    }

    /**
     * Method getTargetData.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationData at the given index
     */
    public org.LexGrid.relations.AssociationData getTargetData(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetDataList.size()) {
            throw new IndexOutOfBoundsException("getTargetData: Index value '" + index + "' not in range [0.." + (this._targetDataList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationData) _targetDataList.get(index);
    }

    /**
     * Method getTargetData.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.AssociationData[] getTargetData(
    ) {
        org.LexGrid.relations.AssociationData[] array = new org.LexGrid.relations.AssociationData[0];
        return (org.LexGrid.relations.AssociationData[]) this._targetDataList.toArray(array);
    }

    /**
     * Method getTargetDataAsReference.Returns a reference to
     * '_targetDataList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationData> getTargetDataAsReference(
    ) {
        return this._targetDataList;
    }

    /**
     * Method getTargetDataCount.
     * 
     * @return the size of this collection
     */
    public int getTargetDataCount(
    ) {
        return this._targetDataList.size();
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
     * Method iterateTarget.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationTarget> iterateTarget(
    ) {
        return this._targetList.iterator();
    }

    /**
     * Method iterateTargetData.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationData> iterateTargetData(
    ) {
        return this._targetDataList.iterator();
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
    public void removeAllTarget(
    ) {
        this._targetList.clear();
    }

    /**
     */
    public void removeAllTargetData(
    ) {
        this._targetDataList.clear();
    }

    /**
     * Method removeTarget.
     * 
     * @param vTarget
     * @return true if the object was removed from the collection.
     */
    public boolean removeTarget(
            final org.LexGrid.relations.AssociationTarget vTarget) {
        boolean removed = _targetList.remove(vTarget);
        return removed;
    }

    /**
     * Method removeTargetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationTarget removeTargetAt(
            final int index) {
        java.lang.Object obj = this._targetList.remove(index);
        return (org.LexGrid.relations.AssociationTarget) obj;
    }

    /**
     * Method removeTargetData.
     * 
     * @param vTargetData
     * @return true if the object was removed from the collection.
     */
    public boolean removeTargetData(
            final org.LexGrid.relations.AssociationData vTargetData) {
        boolean removed = _targetDataList.remove(vTargetData);
        return removed;
    }

    /**
     * Method removeTargetDataAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationData removeTargetDataAt(
            final int index) {
        java.lang.Object obj = this._targetDataList.remove(index);
        return (org.LexGrid.relations.AssociationData) obj;
    }

    /**
     * Sets the value of field 'sourceEntityCode'. The field
     * 'sourceEntityCode' has the following description: The entity
     * code of the source entity.
     * 
     * @param sourceEntityCode the value of field 'sourceEntityCode'
     */
    public void setSourceEntityCode(
            final java.lang.String sourceEntityCode) {
        this._sourceEntityCode = sourceEntityCode;
    }

    /**
     * Sets the value of field 'sourceEntityCodeNamespace'. The
     * field 'sourceEntityCodeNamespace' has the following
     * description: Local name of the namespace of the
     * sourceEntityCode. sourceEntityCodeNamespace must match a
     * local id of a supportedNamespace in the corresponding
     * mappings section. If omitted, the URI of sourceEntityCode
     * namespace is the codingSchemeURI of the containing coding
     * scheme.
     * 
     * @param sourceEntityCodeNamespace the value of field
     * 'sourceEntityCodeNamespace'.
     */
    public void setSourceEntityCodeNamespace(
            final java.lang.String sourceEntityCodeNamespace) {
        this._sourceEntityCodeNamespace = sourceEntityCodeNamespace;
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTarget(
            final int index,
            final org.LexGrid.relations.AssociationTarget vTarget)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("setTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }

        this._targetList.set(index, vTarget);
    }

    /**
     * 
     * 
     * @param vTargetArray
     */
    public void setTarget(
            final org.LexGrid.relations.AssociationTarget[] vTargetArray) {
        //-- copy array
        _targetList.clear();

        for (int i = 0; i < vTargetArray.length; i++) {
                this._targetList.add(vTargetArray[i]);
        }
    }

    /**
     * Sets the value of '_targetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vTargetList the Vector to copy.
     */
    public void setTarget(
            final java.util.List<org.LexGrid.relations.AssociationTarget> vTargetList) {
        // copy vector
        this._targetList.clear();

        this._targetList.addAll(vTargetList);
    }

    /**
     * Sets the value of '_targetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param targetList the Vector to set.
     */
    public void setTargetAsReference(
            final java.util.List<org.LexGrid.relations.AssociationTarget> targetList) {
        this._targetList = targetList;
    }

    /**
     * 
     * 
     * @param index
     * @param vTargetData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTargetData(
            final int index,
            final org.LexGrid.relations.AssociationData vTargetData)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetDataList.size()) {
            throw new IndexOutOfBoundsException("setTargetData: Index value '" + index + "' not in range [0.." + (this._targetDataList.size() - 1) + "]");
        }

        this._targetDataList.set(index, vTargetData);
    }

    /**
     * 
     * 
     * @param vTargetDataArray
     */
    public void setTargetData(
            final org.LexGrid.relations.AssociationData[] vTargetDataArray) {
        //-- copy array
        _targetDataList.clear();

        for (int i = 0; i < vTargetDataArray.length; i++) {
                this._targetDataList.add(vTargetDataArray[i]);
        }
    }

    /**
     * Sets the value of '_targetDataList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vTargetDataList the Vector to copy.
     */
    public void setTargetData(
            final java.util.List<org.LexGrid.relations.AssociationData> vTargetDataList) {
        // copy vector
        this._targetDataList.clear();

        this._targetDataList.addAll(vTargetDataList);
    }

    /**
     * Sets the value of '_targetDataList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param targetDataList the Vector to set.
     */
    public void setTargetDataAsReference(
            final java.util.List<org.LexGrid.relations.AssociationData> targetDataList) {
        this._targetDataList = targetDataList;
    }

    /**
     * Method unmarshalAssociationSource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.relations.AssociationSource
     */
    public static org.LexGrid.relations.AssociationSource unmarshalAssociationSource(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.AssociationSource) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.AssociationSource.class, reader);
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
