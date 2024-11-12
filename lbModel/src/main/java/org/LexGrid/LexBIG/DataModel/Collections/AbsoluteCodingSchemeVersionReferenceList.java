/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class AbsoluteCodingSchemeVersionReferenceList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class AbsoluteCodingSchemeVersionReferenceList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _absoluteCodingSchemeVersionReferenceList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference> _absoluteCodingSchemeVersionReferenceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AbsoluteCodingSchemeVersionReferenceList() {
        super();
        this._absoluteCodingSchemeVersionReferenceList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAbsoluteCodingSchemeVersionReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAbsoluteCodingSchemeVersionReference(
            final org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference vAbsoluteCodingSchemeVersionReference)
    throws java.lang.IndexOutOfBoundsException {
        this._absoluteCodingSchemeVersionReferenceList.add(vAbsoluteCodingSchemeVersionReference);
    }

    /**
     * 
     * 
     * @param index
     * @param vAbsoluteCodingSchemeVersionReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAbsoluteCodingSchemeVersionReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference vAbsoluteCodingSchemeVersionReference)
    throws java.lang.IndexOutOfBoundsException {
        this._absoluteCodingSchemeVersionReferenceList.add(index, vAbsoluteCodingSchemeVersionReference);
    }

    /**
     * Method enumerateAbsoluteCodingSchemeVersionReference.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference> enumerateAbsoluteCodingSchemeVersionReference(
    ) {
        return java.util.Collections.enumeration(this._absoluteCodingSchemeVersionReferenceList);
    }

    /**
     * Method getAbsoluteCodingSchemeVersionReference.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference getAbsoluteCodingSchemeVersionReference(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._absoluteCodingSchemeVersionReferenceList.size()) {
            throw new IndexOutOfBoundsException("getAbsoluteCodingSchemeVersionReference: Index value '" + index + "' not in range [0.." + (this._absoluteCodingSchemeVersionReferenceList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference) _absoluteCodingSchemeVersionReferenceList.get(index);
    }

    /**
     * Method getAbsoluteCodingSchemeVersionReference.Returns the
     * contents of the collection in an Array.  <p>Note:  Just in
     * case the collection contents are changing in another thread,
     * we pass a 0-length Array of the correct type into the API
     * call.  This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference[] getAbsoluteCodingSchemeVersionReference(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference[] array = new org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference[0];
        return (org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference[]) this._absoluteCodingSchemeVersionReferenceList.toArray(array);
    }

    /**
     * Method getAbsoluteCodingSchemeVersionReferenceCount.
     * 
     * @return the size of this collection
     */
    public int getAbsoluteCodingSchemeVersionReferenceCount(
    ) {
        return this._absoluteCodingSchemeVersionReferenceList.size();
    }

    /**
     * Method iterateAbsoluteCodingSchemeVersionReference.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference> iterateAbsoluteCodingSchemeVersionReference(
    ) {
        return this._absoluteCodingSchemeVersionReferenceList.iterator();
    }

    /**
     * Method removeAbsoluteCodingSchemeVersionReference.
     * 
     * @param vAbsoluteCodingSchemeVersionReference
     * @return true if the object was removed from the collection.
     */
    public boolean removeAbsoluteCodingSchemeVersionReference(
            final org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference vAbsoluteCodingSchemeVersionReference) {
        boolean removed = _absoluteCodingSchemeVersionReferenceList.remove(vAbsoluteCodingSchemeVersionReference);
        return removed;
    }

    /**
     * Method removeAbsoluteCodingSchemeVersionReferenceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference removeAbsoluteCodingSchemeVersionReferenceAt(
            final int index) {
        java.lang.Object obj = this._absoluteCodingSchemeVersionReferenceList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference) obj;
    }

    /**
     */
    public void removeAllAbsoluteCodingSchemeVersionReference(
    ) {
        this._absoluteCodingSchemeVersionReferenceList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vAbsoluteCodingSchemeVersionReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAbsoluteCodingSchemeVersionReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference vAbsoluteCodingSchemeVersionReference)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._absoluteCodingSchemeVersionReferenceList.size()) {
            throw new IndexOutOfBoundsException("setAbsoluteCodingSchemeVersionReference: Index value '" + index + "' not in range [0.." + (this._absoluteCodingSchemeVersionReferenceList.size() - 1) + "]");
        }

        this._absoluteCodingSchemeVersionReferenceList.set(index, vAbsoluteCodingSchemeVersionReference);
    }

    /**
     * 
     * 
     * @param vAbsoluteCodingSchemeVersionReferenceArray
     */
    public void setAbsoluteCodingSchemeVersionReference(
            final org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference[] vAbsoluteCodingSchemeVersionReferenceArray) {
        //-- copy array
        _absoluteCodingSchemeVersionReferenceList.clear();

        for (int i = 0; i < vAbsoluteCodingSchemeVersionReferenceArray.length; i++) {
                this._absoluteCodingSchemeVersionReferenceList.add(vAbsoluteCodingSchemeVersionReferenceArray[i]);
        }
    }

}
