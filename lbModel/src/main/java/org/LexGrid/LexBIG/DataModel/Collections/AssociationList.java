/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class AssociationList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class AssociationList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _associationList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.Association> _associationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationList() {
        super();
        this._associationList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.Association>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociation(
            final org.LexGrid.LexBIG.DataModel.Core.Association vAssociation)
    throws java.lang.IndexOutOfBoundsException {
        this._associationList.add(vAssociation);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociation(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.Association vAssociation)
    throws java.lang.IndexOutOfBoundsException {
        this._associationList.add(index, vAssociation);
    }

    /**
     * Method enumerateAssociation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.Association> enumerateAssociation(
    ) {
        return java.util.Collections.enumeration(this._associationList);
    }

    /**
     * Method getAssociation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.Association at the given
     * index
     */
    public org.LexGrid.LexBIG.DataModel.Core.Association getAssociation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationList.size()) {
            throw new IndexOutOfBoundsException("getAssociation: Index value '" + index + "' not in range [0.." + (this._associationList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.Association) _associationList.get(index);
    }

    /**
     * Method getAssociation.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.Association[] getAssociation(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.Association[] array = new org.LexGrid.LexBIG.DataModel.Core.Association[0];
        return (org.LexGrid.LexBIG.DataModel.Core.Association[]) this._associationList.toArray(array);
    }

    /**
     * Method getAssociationCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationCount(
    ) {
        return this._associationList.size();
    }

    /**
     * Method iterateAssociation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.Association> iterateAssociation(
    ) {
        return this._associationList.iterator();
    }

    /**
     */
    public void removeAllAssociation(
    ) {
        this._associationList.clear();
    }

    /**
     * Method removeAssociation.
     * 
     * @param vAssociation
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociation(
            final org.LexGrid.LexBIG.DataModel.Core.Association vAssociation) {
        boolean removed = _associationList.remove(vAssociation);
        return removed;
    }

    /**
     * Method removeAssociationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.Association removeAssociationAt(
            final int index) {
        java.lang.Object obj = this._associationList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.Association) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociation(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.Association vAssociation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationList.size()) {
            throw new IndexOutOfBoundsException("setAssociation: Index value '" + index + "' not in range [0.." + (this._associationList.size() - 1) + "]");
        }

        this._associationList.set(index, vAssociation);
    }

    /**
     * 
     * 
     * @param vAssociationArray
     */
    public void setAssociation(
            final org.LexGrid.LexBIG.DataModel.Core.Association[] vAssociationArray) {
        //-- copy array
        _associationList.clear();

        for (int i = 0; i < vAssociationArray.length; i++) {
                this._associationList.add(vAssociationArray[i]);
        }
    }

}
