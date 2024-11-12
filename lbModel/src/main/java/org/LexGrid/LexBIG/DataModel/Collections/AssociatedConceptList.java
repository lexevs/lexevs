/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class AssociatedConceptList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class AssociatedConceptList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _associatedConceptList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept> _associatedConceptList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociatedConceptList() {
        super();
        this._associatedConceptList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociatedConcept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociatedConcept(
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept vAssociatedConcept)
    throws java.lang.IndexOutOfBoundsException {
        this._associatedConceptList.add(vAssociatedConcept);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociatedConcept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociatedConcept(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept vAssociatedConcept)
    throws java.lang.IndexOutOfBoundsException {
        this._associatedConceptList.add(index, vAssociatedConcept);
    }

    /**
     * Method enumerateAssociatedConcept.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept> enumerateAssociatedConcept(
    ) {
        return java.util.Collections.enumeration(this._associatedConceptList);
    }

    /**
     * Method getAssociatedConcept.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept getAssociatedConcept(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associatedConceptList.size()) {
            throw new IndexOutOfBoundsException("getAssociatedConcept: Index value '" + index + "' not in range [0.." + (this._associatedConceptList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept) _associatedConceptList.get(index);
    }

    /**
     * Method getAssociatedConcept.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept[] getAssociatedConcept(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept[] array = new org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept[0];
        return (org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept[]) this._associatedConceptList.toArray(array);
    }

    /**
     * Method getAssociatedConceptCount.
     * 
     * @return the size of this collection
     */
    public int getAssociatedConceptCount(
    ) {
        return this._associatedConceptList.size();
    }

    /**
     * Method iterateAssociatedConcept.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept> iterateAssociatedConcept(
    ) {
        return this._associatedConceptList.iterator();
    }

    /**
     */
    public void removeAllAssociatedConcept(
    ) {
        this._associatedConceptList.clear();
    }

    /**
     * Method removeAssociatedConcept.
     * 
     * @param vAssociatedConcept
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociatedConcept(
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept vAssociatedConcept) {
        boolean removed = _associatedConceptList.remove(vAssociatedConcept);
        return removed;
    }

    /**
     * Method removeAssociatedConceptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept removeAssociatedConceptAt(
            final int index) {
        java.lang.Object obj = this._associatedConceptList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociatedConcept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociatedConcept(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept vAssociatedConcept)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associatedConceptList.size()) {
            throw new IndexOutOfBoundsException("setAssociatedConcept: Index value '" + index + "' not in range [0.." + (this._associatedConceptList.size() - 1) + "]");
        }

        this._associatedConceptList.set(index, vAssociatedConcept);
    }

    /**
     * 
     * 
     * @param vAssociatedConceptArray
     */
    public void setAssociatedConcept(
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept[] vAssociatedConceptArray) {
        //-- copy array
        _associatedConceptList.clear();

        for (int i = 0; i < vAssociatedConceptArray.length; i++) {
                this._associatedConceptList.add(vAssociatedConceptArray[i]);
        }
    }

}
