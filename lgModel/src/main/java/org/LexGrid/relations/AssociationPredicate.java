/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * The local identifier of the relation itself. associationName
 * must match a local id of a supportedAssociationName in the
 * corresponding mappings section.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationPredicate extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local identifier of the relation itself. associationName
     * must match a local id of a supportedAssociationName in the
     * corresponding mappings section.
     */
    private java.lang.String _associationName;

    /**
     * The "from" set of entities that appear in this relation
     */
    private java.util.List<org.LexGrid.relations.AssociationSource> _sourceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationPredicate() {
        super();
        this._sourceList = new java.util.ArrayList<org.LexGrid.relations.AssociationSource>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final org.LexGrid.relations.AssociationSource vSource)
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
            final org.LexGrid.relations.AssociationSource vSource)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceList.add(index, vSource);
    }

    /**
     * Method enumerateSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationSource> enumerateSource(
    ) {
        return java.util.Collections.enumeration(this._sourceList);
    }

    /**
     * Returns the value of field 'associationName'. The field
     * 'associationName' has the following description: The local
     * identifier of the relation itself. associationName must
     * match a local id of a supportedAssociationName in the
     * corresponding mappings section.
     * 
     * @return the value of field 'AssociationName'.
     */
    public java.lang.String getAssociationName(
    ) {
        return this._associationName;
    }

    /**
     * Method getSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationSource at the given index
     */
    public org.LexGrid.relations.AssociationSource getSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("getSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationSource) _sourceList.get(index);
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
    public org.LexGrid.relations.AssociationSource[] getSource(
    ) {
        org.LexGrid.relations.AssociationSource[] array = new org.LexGrid.relations.AssociationSource[0];
        return (org.LexGrid.relations.AssociationSource[]) this._sourceList.toArray(array);
    }

    /**
     * Method getSourceAsReference.Returns a reference to
     * '_sourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationSource> getSourceAsReference(
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
     * Method iterateSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationSource> iterateSource(
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
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     * Method removeSource.
     * 
     * @param vSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeSource(
            final org.LexGrid.relations.AssociationSource vSource) {
        boolean removed = _sourceList.remove(vSource);
        return removed;
    }

    /**
     * Method removeSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationSource removeSourceAt(
            final int index) {
        java.lang.Object obj = this._sourceList.remove(index);
        return (org.LexGrid.relations.AssociationSource) obj;
    }

    /**
     * Sets the value of field 'associationName'. The field
     * 'associationName' has the following description: The local
     * identifier of the relation itself. associationName must
     * match a local id of a supportedAssociationName in the
     * corresponding mappings section.
     * 
     * @param associationName the value of field 'associationName'.
     */
    public void setAssociationName(
            final java.lang.String associationName) {
        this._associationName = associationName;
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
            final org.LexGrid.relations.AssociationSource vSource)
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
            final org.LexGrid.relations.AssociationSource[] vSourceArray) {
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
            final java.util.List<org.LexGrid.relations.AssociationSource> vSourceList) {
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
            final java.util.List<org.LexGrid.relations.AssociationSource> sourceList) {
        this._sourceList = sourceList;
    }

    /**
     * Method unmarshalAssociationPredicate.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.relations.AssociationPredicate
     */
    public static org.LexGrid.relations.AssociationPredicate unmarshalAssociationPredicate(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.AssociationPredicate) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.AssociationPredicate.class, reader);
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
