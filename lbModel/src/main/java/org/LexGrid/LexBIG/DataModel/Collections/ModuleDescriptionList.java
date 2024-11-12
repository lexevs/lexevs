/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class ModuleDescriptionList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class ModuleDescriptionList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _moduleDescriptionList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription> _moduleDescriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ModuleDescriptionList() {
        super();
        this._moduleDescriptionList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vModuleDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addModuleDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription vModuleDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._moduleDescriptionList.add(vModuleDescription);
    }

    /**
     * 
     * 
     * @param index
     * @param vModuleDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addModuleDescription(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription vModuleDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._moduleDescriptionList.add(index, vModuleDescription);
    }

    /**
     * Method enumerateModuleDescription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription> enumerateModuleDescription(
    ) {
        return java.util.Collections.enumeration(this._moduleDescriptionList);
    }

    /**
     * Method getModuleDescription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription getModuleDescription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._moduleDescriptionList.size()) {
            throw new IndexOutOfBoundsException("getModuleDescription: Index value '" + index + "' not in range [0.." + (this._moduleDescriptionList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription) _moduleDescriptionList.get(index);
    }

    /**
     * Method getModuleDescription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription[] getModuleDescription(
    ) {
        org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription[] array = new org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription[0];
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription[]) this._moduleDescriptionList.toArray(array);
    }

    /**
     * Method getModuleDescriptionCount.
     * 
     * @return the size of this collection
     */
    public int getModuleDescriptionCount(
    ) {
        return this._moduleDescriptionList.size();
    }

    /**
     * Method iterateModuleDescription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription> iterateModuleDescription(
    ) {
        return this._moduleDescriptionList.iterator();
    }

    /**
     */
    public void removeAllModuleDescription(
    ) {
        this._moduleDescriptionList.clear();
    }

    /**
     * Method removeModuleDescription.
     * 
     * @param vModuleDescription
     * @return true if the object was removed from the collection.
     */
    public boolean removeModuleDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription vModuleDescription) {
        boolean removed = _moduleDescriptionList.remove(vModuleDescription);
        return removed;
    }

    /**
     * Method removeModuleDescriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription removeModuleDescriptionAt(
            final int index) {
        java.lang.Object obj = this._moduleDescriptionList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vModuleDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setModuleDescription(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription vModuleDescription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._moduleDescriptionList.size()) {
            throw new IndexOutOfBoundsException("setModuleDescription: Index value '" + index + "' not in range [0.." + (this._moduleDescriptionList.size() - 1) + "]");
        }

        this._moduleDescriptionList.set(index, vModuleDescription);
    }

    /**
     * 
     * 
     * @param vModuleDescriptionArray
     */
    public void setModuleDescription(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription[] vModuleDescriptionArray) {
        //-- copy array
        _moduleDescriptionList.clear();

        for (int i = 0; i < vModuleDescriptionArray.length; i++) {
                this._moduleDescriptionList.add(vModuleDescriptionArray[i]);
        }
    }

}
