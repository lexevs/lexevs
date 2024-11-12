/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class AssociatedDataList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class AssociatedDataList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _associatedDataList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.AssociatedData> _associatedDataList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociatedDataList() {
        super();
        this._associatedDataList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.AssociatedData>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociatedData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociatedData(
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedData vAssociatedData)
    throws java.lang.IndexOutOfBoundsException {
        this._associatedDataList.add(vAssociatedData);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociatedData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociatedData(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedData vAssociatedData)
    throws java.lang.IndexOutOfBoundsException {
        this._associatedDataList.add(index, vAssociatedData);
    }

    /**
     * Method enumerateAssociatedData.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.AssociatedData> enumerateAssociatedData(
    ) {
        return java.util.Collections.enumeration(this._associatedDataList);
    }

    /**
     * Method getAssociatedData.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.AssociatedData at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.AssociatedData getAssociatedData(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associatedDataList.size()) {
            throw new IndexOutOfBoundsException("getAssociatedData: Index value '" + index + "' not in range [0.." + (this._associatedDataList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.AssociatedData) _associatedDataList.get(index);
    }

    /**
     * Method getAssociatedData.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.AssociatedData[] getAssociatedData(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.AssociatedData[] array = new org.LexGrid.LexBIG.DataModel.Core.AssociatedData[0];
        return (org.LexGrid.LexBIG.DataModel.Core.AssociatedData[]) this._associatedDataList.toArray(array);
    }

    /**
     * Method getAssociatedDataCount.
     * 
     * @return the size of this collection
     */
    public int getAssociatedDataCount(
    ) {
        return this._associatedDataList.size();
    }

    /**
     * Method iterateAssociatedData.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.AssociatedData> iterateAssociatedData(
    ) {
        return this._associatedDataList.iterator();
    }

    /**
     */
    public void removeAllAssociatedData(
    ) {
        this._associatedDataList.clear();
    }

    /**
     * Method removeAssociatedData.
     * 
     * @param vAssociatedData
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociatedData(
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedData vAssociatedData) {
        boolean removed = _associatedDataList.remove(vAssociatedData);
        return removed;
    }

    /**
     * Method removeAssociatedDataAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.AssociatedData removeAssociatedDataAt(
            final int index) {
        java.lang.Object obj = this._associatedDataList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.AssociatedData) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociatedData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociatedData(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedData vAssociatedData)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associatedDataList.size()) {
            throw new IndexOutOfBoundsException("setAssociatedData: Index value '" + index + "' not in range [0.." + (this._associatedDataList.size() - 1) + "]");
        }

        this._associatedDataList.set(index, vAssociatedData);
    }

    /**
     * 
     * 
     * @param vAssociatedDataArray
     */
    public void setAssociatedData(
            final org.LexGrid.LexBIG.DataModel.Core.AssociatedData[] vAssociatedDataArray) {
        //-- copy array
        _associatedDataList.clear();

        for (int i = 0; i < vAssociatedDataArray.length; i++) {
                this._associatedDataList.add(vAssociatedDataArray[i]);
        }
    }

}
