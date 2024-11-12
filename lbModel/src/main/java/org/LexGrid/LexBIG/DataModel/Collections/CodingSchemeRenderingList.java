/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class CodingSchemeRenderingList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class CodingSchemeRenderingList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codingSchemeRenderingList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering> _codingSchemeRenderingList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeRenderingList() {
        super();
        this._codingSchemeRenderingList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCodingSchemeRendering
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodingSchemeRendering(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering vCodingSchemeRendering)
    throws java.lang.IndexOutOfBoundsException {
        this._codingSchemeRenderingList.add(vCodingSchemeRendering);
    }

    /**
     * 
     * 
     * @param index
     * @param vCodingSchemeRendering
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodingSchemeRendering(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering vCodingSchemeRendering)
    throws java.lang.IndexOutOfBoundsException {
        this._codingSchemeRenderingList.add(index, vCodingSchemeRendering);
    }

    /**
     * Method enumerateCodingSchemeRendering.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering> enumerateCodingSchemeRendering(
    ) {
        return java.util.Collections.enumeration(this._codingSchemeRenderingList);
    }

    /**
     * Method getCodingSchemeRendering.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering getCodingSchemeRendering(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codingSchemeRenderingList.size()) {
            throw new IndexOutOfBoundsException("getCodingSchemeRendering: Index value '" + index + "' not in range [0.." + (this._codingSchemeRenderingList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering) _codingSchemeRenderingList.get(index);
    }

    /**
     * Method getCodingSchemeRendering.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering[] getCodingSchemeRendering(
    ) {
        org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering[] array = new org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering[0];
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering[]) this._codingSchemeRenderingList.toArray(array);
    }

    /**
     * Method getCodingSchemeRenderingCount.
     * 
     * @return the size of this collection
     */
    public int getCodingSchemeRenderingCount(
    ) {
        return this._codingSchemeRenderingList.size();
    }

    /**
     * Method iterateCodingSchemeRendering.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering> iterateCodingSchemeRendering(
    ) {
        return this._codingSchemeRenderingList.iterator();
    }

    /**
     */
    public void removeAllCodingSchemeRendering(
    ) {
        this._codingSchemeRenderingList.clear();
    }

    /**
     * Method removeCodingSchemeRendering.
     * 
     * @param vCodingSchemeRendering
     * @return true if the object was removed from the collection.
     */
    public boolean removeCodingSchemeRendering(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering vCodingSchemeRendering) {
        boolean removed = _codingSchemeRenderingList.remove(vCodingSchemeRendering);
        return removed;
    }

    /**
     * Method removeCodingSchemeRenderingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering removeCodingSchemeRenderingAt(
            final int index) {
        java.lang.Object obj = this._codingSchemeRenderingList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCodingSchemeRendering
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCodingSchemeRendering(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering vCodingSchemeRendering)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codingSchemeRenderingList.size()) {
            throw new IndexOutOfBoundsException("setCodingSchemeRendering: Index value '" + index + "' not in range [0.." + (this._codingSchemeRenderingList.size() - 1) + "]");
        }

        this._codingSchemeRenderingList.set(index, vCodingSchemeRendering);
    }

    /**
     * 
     * 
     * @param vCodingSchemeRenderingArray
     */
    public void setCodingSchemeRendering(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering[] vCodingSchemeRenderingArray) {
        //-- copy array
        _codingSchemeRenderingList.clear();

        for (int i = 0; i < vCodingSchemeRenderingArray.length; i++) {
                this._codingSchemeRenderingList.add(vCodingSchemeRenderingArray[i]);
        }
    }

}
