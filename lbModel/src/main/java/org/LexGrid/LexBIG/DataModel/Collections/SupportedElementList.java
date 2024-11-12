/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class SupportedElementList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class SupportedElementList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _supportedElementList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.SupportedElement> _supportedElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedElementList() {
        super();
        this._supportedElementList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.SupportedElement>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedElement(
            final org.LexGrid.LexBIG.DataModel.Core.SupportedElement vSupportedElement)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedElementList.add(vSupportedElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedElement(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.SupportedElement vSupportedElement)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedElementList.add(index, vSupportedElement);
    }

    /**
     * Method enumerateSupportedElement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.SupportedElement> enumerateSupportedElement(
    ) {
        return java.util.Collections.enumeration(this._supportedElementList);
    }

    /**
     * Method getSupportedElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.SupportedElement at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.SupportedElement getSupportedElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedElementList.size()) {
            throw new IndexOutOfBoundsException("getSupportedElement: Index value '" + index + "' not in range [0.." + (this._supportedElementList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.SupportedElement) _supportedElementList.get(index);
    }

    /**
     * Method getSupportedElement.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.SupportedElement[] getSupportedElement(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.SupportedElement[] array = new org.LexGrid.LexBIG.DataModel.Core.SupportedElement[0];
        return (org.LexGrid.LexBIG.DataModel.Core.SupportedElement[]) this._supportedElementList.toArray(array);
    }

    /**
     * Method getSupportedElementCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedElementCount(
    ) {
        return this._supportedElementList.size();
    }

    /**
     * Method iterateSupportedElement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.SupportedElement> iterateSupportedElement(
    ) {
        return this._supportedElementList.iterator();
    }

    /**
     */
    public void removeAllSupportedElement(
    ) {
        this._supportedElementList.clear();
    }

    /**
     * Method removeSupportedElement.
     * 
     * @param vSupportedElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedElement(
            final org.LexGrid.LexBIG.DataModel.Core.SupportedElement vSupportedElement) {
        boolean removed = _supportedElementList.remove(vSupportedElement);
        return removed;
    }

    /**
     * Method removeSupportedElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.SupportedElement removeSupportedElementAt(
            final int index) {
        java.lang.Object obj = this._supportedElementList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.SupportedElement) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedElement(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.SupportedElement vSupportedElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedElementList.size()) {
            throw new IndexOutOfBoundsException("setSupportedElement: Index value '" + index + "' not in range [0.." + (this._supportedElementList.size() - 1) + "]");
        }

        this._supportedElementList.set(index, vSupportedElement);
    }

    /**
     * 
     * 
     * @param vSupportedElementArray
     */
    public void setSupportedElement(
            final org.LexGrid.LexBIG.DataModel.Core.SupportedElement[] vSupportedElementArray) {
        //-- copy array
        _supportedElementList.clear();

        for (int i = 0; i < vSupportedElementArray.length; i++) {
                this._supportedElementList.add(vSupportedElementArray[i]);
        }
    }

}
