/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class SortDescriptionList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class SortDescriptionList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sortDescriptionList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription> _sortDescriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SortDescriptionList() {
        super();
        this._sortDescriptionList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSortDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSortDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription vSortDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._sortDescriptionList.add(vSortDescription);
    }

    /**
     * 
     * 
     * @param index
     * @param vSortDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSortDescription(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription vSortDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._sortDescriptionList.add(index, vSortDescription);
    }

    /**
     * Method enumerateSortDescription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription> enumerateSortDescription(
    ) {
        return java.util.Collections.enumeration(this._sortDescriptionList);
    }

    /**
     * Method getSortDescription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription getSortDescription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sortDescriptionList.size()) {
            throw new IndexOutOfBoundsException("getSortDescription: Index value '" + index + "' not in range [0.." + (this._sortDescriptionList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription) _sortDescriptionList.get(index);
    }

    /**
     * Method getSortDescription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription[] getSortDescription(
    ) {
        org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription[] array = new org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription[0];
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription[]) this._sortDescriptionList.toArray(array);
    }

    /**
     * Method getSortDescriptionCount.
     * 
     * @return the size of this collection
     */
    public int getSortDescriptionCount(
    ) {
        return this._sortDescriptionList.size();
    }

    /**
     * Method iterateSortDescription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription> iterateSortDescription(
    ) {
        return this._sortDescriptionList.iterator();
    }

    /**
     */
    public void removeAllSortDescription(
    ) {
        this._sortDescriptionList.clear();
    }

    /**
     * Method removeSortDescription.
     * 
     * @param vSortDescription
     * @return true if the object was removed from the collection.
     */
    public boolean removeSortDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription vSortDescription) {
        boolean removed = _sortDescriptionList.remove(vSortDescription);
        return removed;
    }

    /**
     * Method removeSortDescriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription removeSortDescriptionAt(
            final int index) {
        java.lang.Object obj = this._sortDescriptionList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSortDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSortDescription(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription vSortDescription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sortDescriptionList.size()) {
            throw new IndexOutOfBoundsException("setSortDescription: Index value '" + index + "' not in range [0.." + (this._sortDescriptionList.size() - 1) + "]");
        }

        this._sortDescriptionList.set(index, vSortDescription);
    }

    /**
     * 
     * 
     * @param vSortDescriptionArray
     */
    public void setSortDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.SortDescription[] vSortDescriptionArray) {
        //-- copy array
        _sortDescriptionList.clear();

        for (int i = 0; i < vSortDescriptionArray.length; i++) {
                this._sortDescriptionList.add(vSortDescriptionArray[i]);
        }
    }

}
