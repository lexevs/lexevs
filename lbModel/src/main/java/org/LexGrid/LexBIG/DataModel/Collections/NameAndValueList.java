/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class NameAndValueList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class NameAndValueList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nameAndValueList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.NameAndValue> _nameAndValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NameAndValueList() {
        super();
        this._nameAndValueList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.NameAndValue>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vNameAndValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNameAndValue(
            final org.LexGrid.LexBIG.DataModel.Core.NameAndValue vNameAndValue)
    throws java.lang.IndexOutOfBoundsException {
        this._nameAndValueList.add(vNameAndValue);
    }

    /**
     * 
     * 
     * @param index
     * @param vNameAndValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNameAndValue(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.NameAndValue vNameAndValue)
    throws java.lang.IndexOutOfBoundsException {
        this._nameAndValueList.add(index, vNameAndValue);
    }

    /**
     * Method enumerateNameAndValue.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.NameAndValue> enumerateNameAndValue(
    ) {
        return java.util.Collections.enumeration(this._nameAndValueList);
    }

    /**
     * Method getNameAndValue.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.NameAndValue at the given
     * index
     */
    public org.LexGrid.LexBIG.DataModel.Core.NameAndValue getNameAndValue(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nameAndValueList.size()) {
            throw new IndexOutOfBoundsException("getNameAndValue: Index value '" + index + "' not in range [0.." + (this._nameAndValueList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.NameAndValue) _nameAndValueList.get(index);
    }

    /**
     * Method getNameAndValue.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.NameAndValue[] getNameAndValue(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.NameAndValue[] array = new org.LexGrid.LexBIG.DataModel.Core.NameAndValue[0];
        return (org.LexGrid.LexBIG.DataModel.Core.NameAndValue[]) this._nameAndValueList.toArray(array);
    }

    /**
     * Method getNameAndValueCount.
     * 
     * @return the size of this collection
     */
    public int getNameAndValueCount(
    ) {
        return this._nameAndValueList.size();
    }

    /**
     * Method iterateNameAndValue.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.NameAndValue> iterateNameAndValue(
    ) {
        return this._nameAndValueList.iterator();
    }

    /**
     */
    public void removeAllNameAndValue(
    ) {
        this._nameAndValueList.clear();
    }

    /**
     * Method removeNameAndValue.
     * 
     * @param vNameAndValue
     * @return true if the object was removed from the collection.
     */
    public boolean removeNameAndValue(
            final org.LexGrid.LexBIG.DataModel.Core.NameAndValue vNameAndValue) {
        boolean removed = _nameAndValueList.remove(vNameAndValue);
        return removed;
    }

    /**
     * Method removeNameAndValueAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.NameAndValue removeNameAndValueAt(
            final int index) {
        java.lang.Object obj = this._nameAndValueList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.NameAndValue) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vNameAndValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNameAndValue(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.NameAndValue vNameAndValue)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nameAndValueList.size()) {
            throw new IndexOutOfBoundsException("setNameAndValue: Index value '" + index + "' not in range [0.." + (this._nameAndValueList.size() - 1) + "]");
        }

        this._nameAndValueList.set(index, vNameAndValue);
    }

    /**
     * 
     * 
     * @param vNameAndValueArray
     */
    public void setNameAndValue(
            final org.LexGrid.LexBIG.DataModel.Core.NameAndValue[] vNameAndValueArray) {
        //-- copy array
        _nameAndValueList.clear();

        for (int i = 0; i < vNameAndValueArray.length; i++) {
                this._nameAndValueList.add(vNameAndValueArray[i]);
        }
    }

}
