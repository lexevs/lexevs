/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.concepts;

/**
 * A set of entity codes and their lexical descriptions
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Entities extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entityList.
     */
    private java.util.List<org.LexGrid.concepts.Entity> _entityList;

    /**
     * Field _associationEntityList.
     */
    private java.util.List<org.LexGrid.relations.AssociationEntity> _associationEntityList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Entities() {
        super();
        this._entityList = new java.util.ArrayList<org.LexGrid.concepts.Entity>();
        this._associationEntityList = new java.util.ArrayList<org.LexGrid.relations.AssociationEntity>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociationEntity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationEntity(
            final org.LexGrid.relations.AssociationEntity vAssociationEntity)
    throws java.lang.IndexOutOfBoundsException {
        this._associationEntityList.add(vAssociationEntity);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationEntity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationEntity(
            final int index,
            final org.LexGrid.relations.AssociationEntity vAssociationEntity)
    throws java.lang.IndexOutOfBoundsException {
        this._associationEntityList.add(index, vAssociationEntity);
    }

    /**
     * 
     * 
     * @param vEntity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntity(
            final org.LexGrid.concepts.Entity vEntity)
    throws java.lang.IndexOutOfBoundsException {
        this._entityList.add(vEntity);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntity(
            final int index,
            final org.LexGrid.concepts.Entity vEntity)
    throws java.lang.IndexOutOfBoundsException {
        this._entityList.add(index, vEntity);
    }

    /**
     * Method enumerateAssociationEntity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationEntity> enumerateAssociationEntity(
    ) {
        return java.util.Collections.enumeration(this._associationEntityList);
    }

    /**
     * Method enumerateEntity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.concepts.Entity> enumerateEntity(
    ) {
        return java.util.Collections.enumeration(this._entityList);
    }

    /**
     * Method getAssociationEntity.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationEntity at the given index
     */
    public org.LexGrid.relations.AssociationEntity getAssociationEntity(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationEntityList.size()) {
            throw new IndexOutOfBoundsException("getAssociationEntity: Index value '" + index + "' not in range [0.." + (this._associationEntityList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationEntity) _associationEntityList.get(index);
    }

    /**
     * Method getAssociationEntity.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.AssociationEntity[] getAssociationEntity(
    ) {
        org.LexGrid.relations.AssociationEntity[] array = new org.LexGrid.relations.AssociationEntity[0];
        return (org.LexGrid.relations.AssociationEntity[]) this._associationEntityList.toArray(array);
    }

    /**
     * Method getAssociationEntityAsReference.Returns a reference
     * to '_associationEntityList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationEntity> getAssociationEntityAsReference(
    ) {
        return this._associationEntityList;
    }

    /**
     * Method getAssociationEntityCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationEntityCount(
    ) {
        return this._associationEntityList.size();
    }

    /**
     * Method getEntity.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.concepts.Entity at the
     * given index
     */
    public org.LexGrid.concepts.Entity getEntity(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityList.size()) {
            throw new IndexOutOfBoundsException("getEntity: Index value '" + index + "' not in range [0.." + (this._entityList.size() - 1) + "]");
        }

        return (org.LexGrid.concepts.Entity) _entityList.get(index);
    }

    /**
     * Method getEntity.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.concepts.Entity[] getEntity(
    ) {
        org.LexGrid.concepts.Entity[] array = new org.LexGrid.concepts.Entity[0];
        return (org.LexGrid.concepts.Entity[]) this._entityList.toArray(array);
    }

    /**
     * Method getEntityAsReference.Returns a reference to
     * '_entityList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.concepts.Entity> getEntityAsReference(
    ) {
        return this._entityList;
    }

    /**
     * Method getEntityCount.
     * 
     * @return the size of this collection
     */
    public int getEntityCount(
    ) {
        return this._entityList.size();
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
     * Method iterateAssociationEntity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationEntity> iterateAssociationEntity(
    ) {
        return this._associationEntityList.iterator();
    }

    /**
     * Method iterateEntity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.concepts.Entity> iterateEntity(
    ) {
        return this._entityList.iterator();
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
    public void removeAllAssociationEntity(
    ) {
        this._associationEntityList.clear();
    }

    /**
     */
    public void removeAllEntity(
    ) {
        this._entityList.clear();
    }

    /**
     * Method removeAssociationEntity.
     * 
     * @param vAssociationEntity
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociationEntity(
            final org.LexGrid.relations.AssociationEntity vAssociationEntity) {
        boolean removed = _associationEntityList.remove(vAssociationEntity);
        return removed;
    }

    /**
     * Method removeAssociationEntityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationEntity removeAssociationEntityAt(
            final int index) {
        java.lang.Object obj = this._associationEntityList.remove(index);
        return (org.LexGrid.relations.AssociationEntity) obj;
    }

    /**
     * Method removeEntity.
     * 
     * @param vEntity
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntity(
            final org.LexGrid.concepts.Entity vEntity) {
        boolean removed = _entityList.remove(vEntity);
        return removed;
    }

    /**
     * Method removeEntityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.concepts.Entity removeEntityAt(
            final int index) {
        java.lang.Object obj = this._entityList.remove(index);
        return (org.LexGrid.concepts.Entity) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationEntity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociationEntity(
            final int index,
            final org.LexGrid.relations.AssociationEntity vAssociationEntity)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationEntityList.size()) {
            throw new IndexOutOfBoundsException("setAssociationEntity: Index value '" + index + "' not in range [0.." + (this._associationEntityList.size() - 1) + "]");
        }

        this._associationEntityList.set(index, vAssociationEntity);
    }

    /**
     * 
     * 
     * @param vAssociationEntityArray
     */
    public void setAssociationEntity(
            final org.LexGrid.relations.AssociationEntity[] vAssociationEntityArray) {
        //-- copy array
        _associationEntityList.clear();

        for (int i = 0; i < vAssociationEntityArray.length; i++) {
                this._associationEntityList.add(vAssociationEntityArray[i]);
        }
    }

    /**
     * Sets the value of '_associationEntityList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAssociationEntityList the Vector to copy.
     */
    public void setAssociationEntity(
            final java.util.List<org.LexGrid.relations.AssociationEntity> vAssociationEntityList) {
        // copy vector
        this._associationEntityList.clear();

        this._associationEntityList.addAll(vAssociationEntityList);
    }

    /**
     * Sets the value of '_associationEntityList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param associationEntityList the Vector to set.
     */
    public void setAssociationEntityAsReference(
            final java.util.List<org.LexGrid.relations.AssociationEntity> associationEntityList) {
        this._associationEntityList = associationEntityList;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntity(
            final int index,
            final org.LexGrid.concepts.Entity vEntity)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityList.size()) {
            throw new IndexOutOfBoundsException("setEntity: Index value '" + index + "' not in range [0.." + (this._entityList.size() - 1) + "]");
        }

        this._entityList.set(index, vEntity);
    }

    /**
     * 
     * 
     * @param vEntityArray
     */
    public void setEntity(
            final org.LexGrid.concepts.Entity[] vEntityArray) {
        //-- copy array
        _entityList.clear();

        for (int i = 0; i < vEntityArray.length; i++) {
                this._entityList.add(vEntityArray[i]);
        }
    }

    /**
     * Sets the value of '_entityList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEntityList the Vector to copy.
     */
    public void setEntity(
            final java.util.List<org.LexGrid.concepts.Entity> vEntityList) {
        // copy vector
        this._entityList.clear();

        this._entityList.addAll(vEntityList);
    }

    /**
     * Sets the value of '_entityList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entityList the Vector to set.
     */
    public void setEntityAsReference(
            final java.util.List<org.LexGrid.concepts.Entity> entityList) {
        this._entityList = entityList;
    }

    /**
     * Method unmarshalEntities.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.concepts.Entities
     */
    public static org.LexGrid.concepts.Entities unmarshalEntities(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.concepts.Entities) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.concepts.Entities.class, reader);
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
