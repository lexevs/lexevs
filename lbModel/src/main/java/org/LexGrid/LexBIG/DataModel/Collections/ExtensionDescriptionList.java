/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class ExtensionDescriptionList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class ExtensionDescriptionList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _extensionDescriptionList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription> _extensionDescriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExtensionDescriptionList() {
        super();
        this._extensionDescriptionList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExtensionDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtensionDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription vExtensionDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._extensionDescriptionList.add(vExtensionDescription);
    }

    /**
     * 
     * 
     * @param index
     * @param vExtensionDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtensionDescription(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription vExtensionDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._extensionDescriptionList.add(index, vExtensionDescription);
    }

    /**
     * Method enumerateExtensionDescription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription> enumerateExtensionDescription(
    ) {
        return java.util.Collections.enumeration(this._extensionDescriptionList);
    }

    /**
     * Method getExtensionDescription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription getExtensionDescription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extensionDescriptionList.size()) {
            throw new IndexOutOfBoundsException("getExtensionDescription: Index value '" + index + "' not in range [0.." + (this._extensionDescriptionList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription) _extensionDescriptionList.get(index);
    }

    /**
     * Method getExtensionDescription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription[] getExtensionDescription(
    ) {
        org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription[] array = new org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription[0];
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription[]) this._extensionDescriptionList.toArray(array);
    }

    /**
     * Method getExtensionDescriptionCount.
     * 
     * @return the size of this collection
     */
    public int getExtensionDescriptionCount(
    ) {
        return this._extensionDescriptionList.size();
    }

    /**
     * Method iterateExtensionDescription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription> iterateExtensionDescription(
    ) {
        return this._extensionDescriptionList.iterator();
    }

    /**
     */
    public void removeAllExtensionDescription(
    ) {
        this._extensionDescriptionList.clear();
    }

    /**
     * Method removeExtensionDescription.
     * 
     * @param vExtensionDescription
     * @return true if the object was removed from the collection.
     */
    public boolean removeExtensionDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription vExtensionDescription) {
        boolean removed = _extensionDescriptionList.remove(vExtensionDescription);
        return removed;
    }

    /**
     * Method removeExtensionDescriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription removeExtensionDescriptionAt(
            final int index) {
        java.lang.Object obj = this._extensionDescriptionList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExtensionDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExtensionDescription(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription vExtensionDescription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extensionDescriptionList.size()) {
            throw new IndexOutOfBoundsException("setExtensionDescription: Index value '" + index + "' not in range [0.." + (this._extensionDescriptionList.size() - 1) + "]");
        }

        this._extensionDescriptionList.set(index, vExtensionDescription);
    }

    /**
     * 
     * 
     * @param vExtensionDescriptionArray
     */
    public void setExtensionDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription[] vExtensionDescriptionArray) {
        //-- copy array
        _extensionDescriptionList.clear();

        for (int i = 0; i < vExtensionDescriptionArray.length; i++) {
                this._extensionDescriptionList.add(vExtensionDescriptionArray[i]);
        }
    }

}
