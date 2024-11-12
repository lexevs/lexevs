/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt;

/**
 * Class CsmfAssociationDefinition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CsmfAssociationDefinition extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * If this flag is set to true, use the localId to check if the
     * entry already exists. If it exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     */
    private java.lang.Boolean _toUpdate = new java.lang.Boolean("true");

    /**
     * Field _assocList.
     */
    private java.util.List<org.LexGrid.relations.AssociationEntity> _assocList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CsmfAssociationDefinition() {
        super();
        this._assocList = new java.util.ArrayList<org.LexGrid.relations.AssociationEntity>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssoc
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssoc(
            final org.LexGrid.relations.AssociationEntity vAssoc)
    throws java.lang.IndexOutOfBoundsException {
        this._assocList.add(vAssoc);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssoc
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssoc(
            final int index,
            final org.LexGrid.relations.AssociationEntity vAssoc)
    throws java.lang.IndexOutOfBoundsException {
        this._assocList.add(index, vAssoc);
    }

    /**
     * Method enumerateAssoc.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationEntity> enumerateAssoc(
    ) {
        return java.util.Collections.enumeration(this._assocList);
    }

    /**
     * Method getAssoc.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationEntity at the given index
     */
    public org.LexGrid.relations.AssociationEntity getAssoc(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assocList.size()) {
            throw new IndexOutOfBoundsException("getAssoc: Index value '" + index + "' not in range [0.." + (this._assocList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationEntity) _assocList.get(index);
    }

    /**
     * Method getAssoc.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.AssociationEntity[] getAssoc(
    ) {
        org.LexGrid.relations.AssociationEntity[] array = new org.LexGrid.relations.AssociationEntity[0];
        return (org.LexGrid.relations.AssociationEntity[]) this._assocList.toArray(array);
    }

    /**
     * Method getAssocAsReference.Returns a reference to
     * '_assocList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationEntity> getAssocAsReference(
    ) {
        return this._assocList;
    }

    /**
     * Method getAssocCount.
     * 
     * @return the size of this collection
     */
    public int getAssocCount(
    ) {
        return this._assocList.size();
    }

    /**
     * Returns the value of field 'toUpdate'. The field 'toUpdate'
     * has the following description: If this flag is set to true,
     * use the localId to check if the entry already exists. If it
     * exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     * 
     * @return the value of field 'ToUpdate'.
     */
    public java.lang.Boolean getToUpdate(
    ) {
        return this._toUpdate;
    }

    /**
     * Returns the value of field 'toUpdate'. The field 'toUpdate'
     * has the following description: If this flag is set to true,
     * use the localId to check if the entry already exists. If it
     * exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     * 
     * @return the value of field 'ToUpdate'.
     */
    public java.lang.Boolean isToUpdate(
    ) {
        return this._toUpdate;
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
     * Method iterateAssoc.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationEntity> iterateAssoc(
    ) {
        return this._assocList.iterator();
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
    public void removeAllAssoc(
    ) {
        this._assocList.clear();
    }

    /**
     * Method removeAssoc.
     * 
     * @param vAssoc
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssoc(
            final org.LexGrid.relations.AssociationEntity vAssoc) {
        boolean removed = _assocList.remove(vAssoc);
        return removed;
    }

    /**
     * Method removeAssocAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationEntity removeAssocAt(
            final int index) {
        java.lang.Object obj = this._assocList.remove(index);
        return (org.LexGrid.relations.AssociationEntity) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssoc
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssoc(
            final int index,
            final org.LexGrid.relations.AssociationEntity vAssoc)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assocList.size()) {
            throw new IndexOutOfBoundsException("setAssoc: Index value '" + index + "' not in range [0.." + (this._assocList.size() - 1) + "]");
        }

        this._assocList.set(index, vAssoc);
    }

    /**
     * 
     * 
     * @param vAssocArray
     */
    public void setAssoc(
            final org.LexGrid.relations.AssociationEntity[] vAssocArray) {
        //-- copy array
        _assocList.clear();

        for (int i = 0; i < vAssocArray.length; i++) {
                this._assocList.add(vAssocArray[i]);
        }
    }

    /**
     * Sets the value of '_assocList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vAssocList the Vector to copy.
     */
    public void setAssoc(
            final java.util.List<org.LexGrid.relations.AssociationEntity> vAssocList) {
        // copy vector
        this._assocList.clear();

        this._assocList.addAll(vAssocList);
    }

    /**
     * Sets the value of '_assocList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param assocList the Vector to set.
     */
    public void setAssocAsReference(
            final java.util.List<org.LexGrid.relations.AssociationEntity> assocList) {
        this._assocList = assocList;
    }

    /**
     * Sets the value of field 'toUpdate'. The field 'toUpdate' has
     * the following description: If this flag is set to true, use
     * the localId to check if the entry already exists. If it
     * exists, update 
     *  that entry with the manifest information. If the entry
     * doesn't exist, add it. If the flag is false, use the localId
     * to 
     *  check it entry already exists. If it doesn't exist, add it.
     * If it exists, do nothing.
     *  
     * 
     * @param toUpdate the value of field 'toUpdate'.
     */
    public void setToUpdate(
            final java.lang.Boolean toUpdate) {
        this._toUpdate = toUpdate;
    }

    /**
     * Method unmarshalCsmfAssociationDefinition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.LexOnt.CsmfAssociationDefinition
     */
    public static org.LexGrid.LexOnt.CsmfAssociationDefinition unmarshalCsmfAssociationDefinition(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.LexOnt.CsmfAssociationDefinition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.LexOnt.CsmfAssociationDefinition.class, reader);
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
