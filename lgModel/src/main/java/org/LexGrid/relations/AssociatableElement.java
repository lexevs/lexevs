/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * Information common to both the entity and data form of the "to"
 * (or right hand) side of an association.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociatableElement extends org.LexGrid.commonTypes.Versionable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique identifier assigned to the particular relation,
     * from, to triple.
     */
    private java.lang.String _associationInstanceId;

    /**
     * True means that this association instance isn't asserted in
     * the scheme, but is inferred by a classifier. Default: false
     */
    private java.lang.Boolean _isInferred;

    /**
     * True means that this association instance is considered to
     * be part of the definition of source entity, false means that
     * it is an "accidental" characteristic. If omitted, this
     * information is not known. 
     */
    private java.lang.Boolean _isDefining;

    /**
     * The local identifiers of the context(s) in which this
     * association instance applies. Must match a local id of a
     * supportedContext in the corresponding mappings section.
     */
    private java.util.List<java.lang.String> _usageContextList;

    /**
     * A set of qualifers that server to modify or qualify this
     * association instance.
     */
    private java.util.List<org.LexGrid.relations.AssociationQualification> _associationQualificationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociatableElement() {
        super();
        this._usageContextList = new java.util.ArrayList<java.lang.String>();
        this._associationQualificationList = new java.util.ArrayList<org.LexGrid.relations.AssociationQualification>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociationQualification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationQualification(
            final org.LexGrid.relations.AssociationQualification vAssociationQualification)
    throws java.lang.IndexOutOfBoundsException {
        this._associationQualificationList.add(vAssociationQualification);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationQualification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationQualification(
            final int index,
            final org.LexGrid.relations.AssociationQualification vAssociationQualification)
    throws java.lang.IndexOutOfBoundsException {
        this._associationQualificationList.add(index, vAssociationQualification);
    }

    /**
     * 
     * 
     * @param vUsageContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsageContext(
            final java.lang.String vUsageContext)
    throws java.lang.IndexOutOfBoundsException {
        this._usageContextList.add(vUsageContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vUsageContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsageContext(
            final int index,
            final java.lang.String vUsageContext)
    throws java.lang.IndexOutOfBoundsException {
        this._usageContextList.add(index, vUsageContext);
    }

    /**
     * Method enumerateAssociationQualification.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.relations.AssociationQualification> enumerateAssociationQualification(
    ) {
        return java.util.Collections.enumeration(this._associationQualificationList);
    }

    /**
     * Method enumerateUsageContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateUsageContext(
    ) {
        return java.util.Collections.enumeration(this._usageContextList);
    }

    /**
     * Returns the value of field 'associationInstanceId'. The
     * field 'associationInstanceId' has the following description:
     * The unique identifier assigned to the particular relation,
     * from, to triple.
     * 
     * @return the value of field 'AssociationInstanceId'.
     */
    public java.lang.String getAssociationInstanceId(
    ) {
        return this._associationInstanceId;
    }

    /**
     * Method getAssociationQualification.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.relations.AssociationQualification at the given
     * index
     */
    public org.LexGrid.relations.AssociationQualification getAssociationQualification(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationQualificationList.size()) {
            throw new IndexOutOfBoundsException("getAssociationQualification: Index value '" + index + "' not in range [0.." + (this._associationQualificationList.size() - 1) + "]");
        }

        return (org.LexGrid.relations.AssociationQualification) _associationQualificationList.get(index);
    }

    /**
     * Method getAssociationQualification.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.relations.AssociationQualification[] getAssociationQualification(
    ) {
        org.LexGrid.relations.AssociationQualification[] array = new org.LexGrid.relations.AssociationQualification[0];
        return (org.LexGrid.relations.AssociationQualification[]) this._associationQualificationList.toArray(array);
    }

    /**
     * Method getAssociationQualificationAsReference.Returns a
     * reference to '_associationQualificationList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.relations.AssociationQualification> getAssociationQualificationAsReference(
    ) {
        return this._associationQualificationList;
    }

    /**
     * Method getAssociationQualificationCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationQualificationCount(
    ) {
        return this._associationQualificationList.size();
    }

    /**
     * Returns the value of field 'isDefining'. The field
     * 'isDefining' has the following description: True means that
     * this association instance is considered to be part of the
     * definition of source entity, false means that it is an
     * "accidental" characteristic. If omitted, this information is
     * not known. 
     * 
     * @return the value of field 'IsDefining'.
     */
    public java.lang.Boolean getIsDefining(
    ) {
        return this._isDefining;
    }

    /**
     * Returns the value of field 'isInferred'. The field
     * 'isInferred' has the following description: True means that
     * this association instance isn't asserted in the scheme, but
     * is inferred by a classifier. Default: false
     * 
     * @return the value of field 'IsInferred'.
     */
    public java.lang.Boolean getIsInferred(
    ) {
        return this._isInferred;
    }

    /**
     * Method getUsageContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getUsageContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usageContextList.size()) {
            throw new IndexOutOfBoundsException("getUsageContext: Index value '" + index + "' not in range [0.." + (this._usageContextList.size() - 1) + "]");
        }

        return (java.lang.String) _usageContextList.get(index);
    }

    /**
     * Method getUsageContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getUsageContext(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._usageContextList.toArray(array);
    }

    /**
     * Method getUsageContextAsReference.Returns a reference to
     * '_usageContextList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getUsageContextAsReference(
    ) {
        return this._usageContextList;
    }

    /**
     * Method getUsageContextCount.
     * 
     * @return the size of this collection
     */
    public int getUsageContextCount(
    ) {
        return this._usageContextList.size();
    }

    /**
     * Returns the value of field 'isDefining'. The field
     * 'isDefining' has the following description: True means that
     * this association instance is considered to be part of the
     * definition of source entity, false means that it is an
     * "accidental" characteristic. If omitted, this information is
     * not known. 
     * 
     * @return the value of field 'IsDefining'.
     */
    public java.lang.Boolean isIsDefining(
    ) {
        return this._isDefining;
    }

    /**
     * Returns the value of field 'isInferred'. The field
     * 'isInferred' has the following description: True means that
     * this association instance isn't asserted in the scheme, but
     * is inferred by a classifier. Default: false
     * 
     * @return the value of field 'IsInferred'.
     */
    public java.lang.Boolean isIsInferred(
    ) {
        return this._isInferred;
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
     * Method iterateAssociationQualification.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.relations.AssociationQualification> iterateAssociationQualification(
    ) {
        return this._associationQualificationList.iterator();
    }

    /**
     * Method iterateUsageContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateUsageContext(
    ) {
        return this._usageContextList.iterator();
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
    public void removeAllAssociationQualification(
    ) {
        this._associationQualificationList.clear();
    }

    /**
     */
    public void removeAllUsageContext(
    ) {
        this._usageContextList.clear();
    }

    /**
     * Method removeAssociationQualification.
     * 
     * @param vAssociationQualification
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociationQualification(
            final org.LexGrid.relations.AssociationQualification vAssociationQualification) {
        boolean removed = _associationQualificationList.remove(vAssociationQualification);
        return removed;
    }

    /**
     * Method removeAssociationQualificationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.relations.AssociationQualification removeAssociationQualificationAt(
            final int index) {
        java.lang.Object obj = this._associationQualificationList.remove(index);
        return (org.LexGrid.relations.AssociationQualification) obj;
    }

    /**
     * Method removeUsageContext.
     * 
     * @param vUsageContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeUsageContext(
            final java.lang.String vUsageContext) {
        boolean removed = _usageContextList.remove(vUsageContext);
        return removed;
    }

    /**
     * Method removeUsageContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeUsageContextAt(
            final int index) {
        java.lang.Object obj = this._usageContextList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'associationInstanceId'. The field
     * 'associationInstanceId' has the following description: The
     * unique identifier assigned to the particular relation, from,
     * to triple.
     * 
     * @param associationInstanceId the value of field
     * 'associationInstanceId'.
     */
    public void setAssociationInstanceId(
            final java.lang.String associationInstanceId) {
        this._associationInstanceId = associationInstanceId;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationQualification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociationQualification(
            final int index,
            final org.LexGrid.relations.AssociationQualification vAssociationQualification)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationQualificationList.size()) {
            throw new IndexOutOfBoundsException("setAssociationQualification: Index value '" + index + "' not in range [0.." + (this._associationQualificationList.size() - 1) + "]");
        }

        this._associationQualificationList.set(index, vAssociationQualification);
    }

    /**
     * 
     * 
     * @param vAssociationQualificationArray
     */
    public void setAssociationQualification(
            final org.LexGrid.relations.AssociationQualification[] vAssociationQualificationArray) {
        //-- copy array
        _associationQualificationList.clear();

        for (int i = 0; i < vAssociationQualificationArray.length; i++) {
                this._associationQualificationList.add(vAssociationQualificationArray[i]);
        }
    }

    /**
     * Sets the value of '_associationQualificationList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vAssociationQualificationList the Vector to copy.
     */
    public void setAssociationQualification(
            final java.util.List<org.LexGrid.relations.AssociationQualification> vAssociationQualificationList) {
        // copy vector
        this._associationQualificationList.clear();

        this._associationQualificationList.addAll(vAssociationQualificationList);
    }

    /**
     * Sets the value of '_associationQualificationList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param associationQualificationList the Vector to set.
     */
    public void setAssociationQualificationAsReference(
            final java.util.List<org.LexGrid.relations.AssociationQualification> associationQualificationList) {
        this._associationQualificationList = associationQualificationList;
    }

    /**
     * Sets the value of field 'isDefining'. The field 'isDefining'
     * has the following description: True means that this
     * association instance is considered to be part of the
     * definition of source entity, false means that it is an
     * "accidental" characteristic. If omitted, this information is
     * not known. 
     * 
     * @param isDefining the value of field 'isDefining'.
     */
    public void setIsDefining(
            final java.lang.Boolean isDefining) {
        this._isDefining = isDefining;
    }

    /**
     * Sets the value of field 'isInferred'. The field 'isInferred'
     * has the following description: True means that this
     * association instance isn't asserted in the scheme, but is
     * inferred by a classifier. Default: false
     * 
     * @param isInferred the value of field 'isInferred'.
     */
    public void setIsInferred(
            final java.lang.Boolean isInferred) {
        this._isInferred = isInferred;
    }

    /**
     * 
     * 
     * @param index
     * @param vUsageContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUsageContext(
            final int index,
            final java.lang.String vUsageContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usageContextList.size()) {
            throw new IndexOutOfBoundsException("setUsageContext: Index value '" + index + "' not in range [0.." + (this._usageContextList.size() - 1) + "]");
        }

        this._usageContextList.set(index, vUsageContext);
    }

    /**
     * 
     * 
     * @param vUsageContextArray
     */
    public void setUsageContext(
            final java.lang.String[] vUsageContextArray) {
        //-- copy array
        _usageContextList.clear();

        for (int i = 0; i < vUsageContextArray.length; i++) {
                this._usageContextList.add(vUsageContextArray[i]);
        }
    }

    /**
     * Sets the value of '_usageContextList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vUsageContextList the Vector to copy.
     */
    public void setUsageContext(
            final java.util.List<java.lang.String> vUsageContextList) {
        // copy vector
        this._usageContextList.clear();

        this._usageContextList.addAll(vUsageContextList);
    }

    /**
     * Sets the value of '_usageContextList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param usageContextList the Vector to set.
     */
    public void setUsageContextAsReference(
            final java.util.List<java.lang.String> usageContextList) {
        this._usageContextList = usageContextList;
    }

    /**
     * Method unmarshalAssociatableElement.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.relations.AssociatableElement
     */
    public static org.LexGrid.relations.AssociatableElement unmarshalAssociatableElement(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.AssociatableElement) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.AssociatableElement.class, reader);
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
