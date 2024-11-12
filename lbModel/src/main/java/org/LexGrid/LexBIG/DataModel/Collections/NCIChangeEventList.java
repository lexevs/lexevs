/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class NCIChangeEventList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class NCIChangeEventList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entryList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent> _entryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NCIChangeEventList() {
        super();
        this._entryList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent vEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._entryList.add(vEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final int index,
            final org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent vEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._entryList.add(index, vEntry);
    }

    /**
     * Method enumerateEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent> enumerateEntry(
    ) {
        return java.util.Collections.enumeration(this._entryList);
    }

    /**
     * Method getEntry.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent at
     * the given index
     */
    public org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent getEntry(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("getEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent) _entryList.get(index);
    }

    /**
     * Method getEntry.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent[] getEntry(
    ) {
        org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent[] array = new org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent[0];
        return (org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent[]) this._entryList.toArray(array);
    }

    /**
     * Method getEntryCount.
     * 
     * @return the size of this collection
     */
    public int getEntryCount(
    ) {
        return this._entryList.size();
    }

    /**
     * Method iterateEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent> iterateEntry(
    ) {
        return this._entryList.iterator();
    }

    /**
     */
    public void removeAllEntry(
    ) {
        this._entryList.clear();
    }

    /**
     * Method removeEntry.
     * 
     * @param vEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntry(
            final org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent vEntry) {
        boolean removed = _entryList.remove(vEntry);
        return removed;
    }

    /**
     * Method removeEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent removeEntryAt(
            final int index) {
        java.lang.Object obj = this._entryList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntry(
            final int index,
            final org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent vEntry)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("setEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        this._entryList.set(index, vEntry);
    }

    /**
     * 
     * 
     * @param vEntryArray
     */
    public void setEntry(
            final org.LexGrid.LexBIG.DataModel.NCIHistory.NCIChangeEvent[] vEntryArray) {
        //-- copy array
        _entryList.clear();

        for (int i = 0; i < vEntryArray.length; i++) {
                this._entryList.add(vEntryArray[i]);
        }
    }

}
