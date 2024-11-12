/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class CodingSchemeSummaryList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class CodingSchemeSummaryList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codingSchemeSummaryList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary> _codingSchemeSummaryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeSummaryList() {
        super();
        this._codingSchemeSummaryList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCodingSchemeSummary
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodingSchemeSummary(
            final org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary vCodingSchemeSummary)
    throws java.lang.IndexOutOfBoundsException {
        this._codingSchemeSummaryList.add(vCodingSchemeSummary);
    }

    /**
     * 
     * 
     * @param index
     * @param vCodingSchemeSummary
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodingSchemeSummary(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary vCodingSchemeSummary)
    throws java.lang.IndexOutOfBoundsException {
        this._codingSchemeSummaryList.add(index, vCodingSchemeSummary);
    }

    /**
     * Method enumerateCodingSchemeSummary.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary> enumerateCodingSchemeSummary(
    ) {
        return java.util.Collections.enumeration(this._codingSchemeSummaryList);
    }

    /**
     * Method getCodingSchemeSummary.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary getCodingSchemeSummary(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codingSchemeSummaryList.size()) {
            throw new IndexOutOfBoundsException("getCodingSchemeSummary: Index value '" + index + "' not in range [0.." + (this._codingSchemeSummaryList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary) _codingSchemeSummaryList.get(index);
    }

    /**
     * Method getCodingSchemeSummary.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary[] getCodingSchemeSummary(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary[] array = new org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary[0];
        return (org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary[]) this._codingSchemeSummaryList.toArray(array);
    }

    /**
     * Method getCodingSchemeSummaryCount.
     * 
     * @return the size of this collection
     */
    public int getCodingSchemeSummaryCount(
    ) {
        return this._codingSchemeSummaryList.size();
    }

    /**
     * Method iterateCodingSchemeSummary.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary> iterateCodingSchemeSummary(
    ) {
        return this._codingSchemeSummaryList.iterator();
    }

    /**
     */
    public void removeAllCodingSchemeSummary(
    ) {
        this._codingSchemeSummaryList.clear();
    }

    /**
     * Method removeCodingSchemeSummary.
     * 
     * @param vCodingSchemeSummary
     * @return true if the object was removed from the collection.
     */
    public boolean removeCodingSchemeSummary(
            final org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary vCodingSchemeSummary) {
        boolean removed = _codingSchemeSummaryList.remove(vCodingSchemeSummary);
        return removed;
    }

    /**
     * Method removeCodingSchemeSummaryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary removeCodingSchemeSummaryAt(
            final int index) {
        java.lang.Object obj = this._codingSchemeSummaryList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCodingSchemeSummary
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCodingSchemeSummary(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary vCodingSchemeSummary)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codingSchemeSummaryList.size()) {
            throw new IndexOutOfBoundsException("setCodingSchemeSummary: Index value '" + index + "' not in range [0.." + (this._codingSchemeSummaryList.size() - 1) + "]");
        }

        this._codingSchemeSummaryList.set(index, vCodingSchemeSummary);
    }

    /**
     * 
     * 
     * @param vCodingSchemeSummaryArray
     */
    public void setCodingSchemeSummary(
            final org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary[] vCodingSchemeSummaryArray) {
        //-- copy array
        _codingSchemeSummaryList.clear();

        for (int i = 0; i < vCodingSchemeSummaryArray.length; i++) {
                this._codingSchemeSummaryList.add(vCodingSchemeSummaryArray[i]);
        }
    }

}
