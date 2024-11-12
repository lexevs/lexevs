/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class ResolvedConceptReferenceList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class ResolvedConceptReferenceList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * True means that the maxToReturn or some other limit resulted
     * in the list being incomplete. Default: false
     */
    private java.lang.Boolean _incomplete = new java.lang.Boolean("false");

    /**
     * Field _resolvedConceptReferenceList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference> _resolvedConceptReferenceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedConceptReferenceList() {
        super();
        this._resolvedConceptReferenceList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResolvedConceptReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResolvedConceptReference(
            final org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference vResolvedConceptReference)
    throws java.lang.IndexOutOfBoundsException {
        this._resolvedConceptReferenceList.add(vResolvedConceptReference);
    }

    /**
     * 
     * 
     * @param index
     * @param vResolvedConceptReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResolvedConceptReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference vResolvedConceptReference)
    throws java.lang.IndexOutOfBoundsException {
        this._resolvedConceptReferenceList.add(index, vResolvedConceptReference);
    }

    /**
     * Method enumerateResolvedConceptReference.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference> enumerateResolvedConceptReference(
    ) {
        return java.util.Collections.enumeration(this._resolvedConceptReferenceList);
    }

    /**
     * Returns the value of field 'incomplete'. The field
     * 'incomplete' has the following description: True means that
     * the maxToReturn or some other limit resulted in the list
     * being incomplete. Default: false
     * 
     * @return the value of field 'Incomplete'.
     */
    public java.lang.Boolean getIncomplete(
    ) {
        return this._incomplete;
    }

    /**
     * Method getResolvedConceptReference.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference getResolvedConceptReference(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resolvedConceptReferenceList.size()) {
            throw new IndexOutOfBoundsException("getResolvedConceptReference: Index value '" + index + "' not in range [0.." + (this._resolvedConceptReferenceList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference) _resolvedConceptReferenceList.get(index);
    }

    /**
     * Method getResolvedConceptReference.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference[] getResolvedConceptReference(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference[] array = new org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference[0];
        return (org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference[]) this._resolvedConceptReferenceList.toArray(array);
    }

    /**
     * Method getResolvedConceptReferenceCount.
     * 
     * @return the size of this collection
     */
    public int getResolvedConceptReferenceCount(
    ) {
        return this._resolvedConceptReferenceList.size();
    }

    /**
     * Returns the value of field 'incomplete'. The field
     * 'incomplete' has the following description: True means that
     * the maxToReturn or some other limit resulted in the list
     * being incomplete. Default: false
     * 
     * @return the value of field 'Incomplete'.
     */
    public java.lang.Boolean isIncomplete(
    ) {
        return this._incomplete;
    }

    /**
     * Method iterateResolvedConceptReference.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference> iterateResolvedConceptReference(
    ) {
        return this._resolvedConceptReferenceList.iterator();
    }

    /**
     */
    public void removeAllResolvedConceptReference(
    ) {
        this._resolvedConceptReferenceList.clear();
    }

    /**
     * Method removeResolvedConceptReference.
     * 
     * @param vResolvedConceptReference
     * @return true if the object was removed from the collection.
     */
    public boolean removeResolvedConceptReference(
            final org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference vResolvedConceptReference) {
        boolean removed = _resolvedConceptReferenceList.remove(vResolvedConceptReference);
        return removed;
    }

    /**
     * Method removeResolvedConceptReferenceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference removeResolvedConceptReferenceAt(
            final int index) {
        java.lang.Object obj = this._resolvedConceptReferenceList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference) obj;
    }

    /**
     * Sets the value of field 'incomplete'. The field 'incomplete'
     * has the following description: True means that the
     * maxToReturn or some other limit resulted in the list being
     * incomplete. Default: false
     * 
     * @param incomplete the value of field 'incomplete'.
     */
    public void setIncomplete(
            final java.lang.Boolean incomplete) {
        this._incomplete = incomplete;
    }

    /**
     * 
     * 
     * @param index
     * @param vResolvedConceptReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResolvedConceptReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference vResolvedConceptReference)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resolvedConceptReferenceList.size()) {
            throw new IndexOutOfBoundsException("setResolvedConceptReference: Index value '" + index + "' not in range [0.." + (this._resolvedConceptReferenceList.size() - 1) + "]");
        }

        this._resolvedConceptReferenceList.set(index, vResolvedConceptReference);
    }

    /**
     * 
     * 
     * @param vResolvedConceptReferenceArray
     */
    public void setResolvedConceptReference(
            final org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference[] vResolvedConceptReferenceArray) {
        //-- copy array
        _resolvedConceptReferenceList.clear();

        for (int i = 0; i < vResolvedConceptReferenceArray.length; i++) {
                this._resolvedConceptReferenceList.add(vResolvedConceptReferenceArray[i]);
        }
    }

}
