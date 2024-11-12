/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class ConceptReferenceList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class ConceptReferenceList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _conceptReferenceList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.ConceptReference> _conceptReferenceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptReferenceList() {
        super();
        this._conceptReferenceList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.ConceptReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vConceptReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConceptReference(
            final org.LexGrid.LexBIG.DataModel.Core.ConceptReference vConceptReference)
    throws java.lang.IndexOutOfBoundsException {
        this._conceptReferenceList.add(vConceptReference);
    }

    /**
     * 
     * 
     * @param index
     * @param vConceptReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConceptReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.ConceptReference vConceptReference)
    throws java.lang.IndexOutOfBoundsException {
        this._conceptReferenceList.add(index, vConceptReference);
    }

    /**
     * Method enumerateConceptReference.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.ConceptReference> enumerateConceptReference(
    ) {
        return java.util.Collections.enumeration(this._conceptReferenceList);
    }

    /**
     * Method getConceptReference.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.ConceptReference at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.ConceptReference getConceptReference(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conceptReferenceList.size()) {
            throw new IndexOutOfBoundsException("getConceptReference: Index value '" + index + "' not in range [0.." + (this._conceptReferenceList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.ConceptReference) _conceptReferenceList.get(index);
    }

    /**
     * Method getConceptReference.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.ConceptReference[] getConceptReference(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.ConceptReference[] array = new org.LexGrid.LexBIG.DataModel.Core.ConceptReference[0];
        return (org.LexGrid.LexBIG.DataModel.Core.ConceptReference[]) this._conceptReferenceList.toArray(array);
    }

    /**
     * Method getConceptReferenceCount.
     * 
     * @return the size of this collection
     */
    public int getConceptReferenceCount(
    ) {
        return this._conceptReferenceList.size();
    }

    /**
     * Method iterateConceptReference.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.ConceptReference> iterateConceptReference(
    ) {
        return this._conceptReferenceList.iterator();
    }

    /**
     */
    public void removeAllConceptReference(
    ) {
        this._conceptReferenceList.clear();
    }

    /**
     * Method removeConceptReference.
     * 
     * @param vConceptReference
     * @return true if the object was removed from the collection.
     */
    public boolean removeConceptReference(
            final org.LexGrid.LexBIG.DataModel.Core.ConceptReference vConceptReference) {
        boolean removed = _conceptReferenceList.remove(vConceptReference);
        return removed;
    }

    /**
     * Method removeConceptReferenceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.ConceptReference removeConceptReferenceAt(
            final int index) {
        java.lang.Object obj = this._conceptReferenceList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.ConceptReference) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vConceptReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setConceptReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.ConceptReference vConceptReference)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conceptReferenceList.size()) {
            throw new IndexOutOfBoundsException("setConceptReference: Index value '" + index + "' not in range [0.." + (this._conceptReferenceList.size() - 1) + "]");
        }

        this._conceptReferenceList.set(index, vConceptReference);
    }

    /**
     * 
     * 
     * @param vConceptReferenceArray
     */
    public void setConceptReference(
            final org.LexGrid.LexBIG.DataModel.Core.ConceptReference[] vConceptReferenceArray) {
        //-- copy array
        _conceptReferenceList.clear();

        for (int i = 0; i < vConceptReferenceArray.length; i++) {
                this._conceptReferenceList.add(vConceptReferenceArray[i]);
        }
    }

}
