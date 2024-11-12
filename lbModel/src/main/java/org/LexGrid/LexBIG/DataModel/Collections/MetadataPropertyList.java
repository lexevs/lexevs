/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class MetadataPropertyList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class MetadataPropertyList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _metadataPropertyList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.MetadataProperty> _metadataPropertyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MetadataPropertyList() {
        super();
        this._metadataPropertyList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.MetadataProperty>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMetadataProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMetadataProperty(
            final org.LexGrid.LexBIG.DataModel.Core.MetadataProperty vMetadataProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._metadataPropertyList.add(vMetadataProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vMetadataProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMetadataProperty(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.MetadataProperty vMetadataProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._metadataPropertyList.add(index, vMetadataProperty);
    }

    /**
     * Method enumerateMetadataProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.MetadataProperty> enumerateMetadataProperty(
    ) {
        return java.util.Collections.enumeration(this._metadataPropertyList);
    }

    /**
     * Method getMetadataProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.MetadataProperty at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.MetadataProperty getMetadataProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._metadataPropertyList.size()) {
            throw new IndexOutOfBoundsException("getMetadataProperty: Index value '" + index + "' not in range [0.." + (this._metadataPropertyList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.MetadataProperty) _metadataPropertyList.get(index);
    }

    /**
     * Method getMetadataProperty.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.MetadataProperty[] getMetadataProperty(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.MetadataProperty[] array = new org.LexGrid.LexBIG.DataModel.Core.MetadataProperty[0];
        return (org.LexGrid.LexBIG.DataModel.Core.MetadataProperty[]) this._metadataPropertyList.toArray(array);
    }

    /**
     * Method getMetadataPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getMetadataPropertyCount(
    ) {
        return this._metadataPropertyList.size();
    }

    /**
     * Method iterateMetadataProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.MetadataProperty> iterateMetadataProperty(
    ) {
        return this._metadataPropertyList.iterator();
    }

    /**
     */
    public void removeAllMetadataProperty(
    ) {
        this._metadataPropertyList.clear();
    }

    /**
     * Method removeMetadataProperty.
     * 
     * @param vMetadataProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeMetadataProperty(
            final org.LexGrid.LexBIG.DataModel.Core.MetadataProperty vMetadataProperty) {
        boolean removed = _metadataPropertyList.remove(vMetadataProperty);
        return removed;
    }

    /**
     * Method removeMetadataPropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.MetadataProperty removeMetadataPropertyAt(
            final int index) {
        java.lang.Object obj = this._metadataPropertyList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.MetadataProperty) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMetadataProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMetadataProperty(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.MetadataProperty vMetadataProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._metadataPropertyList.size()) {
            throw new IndexOutOfBoundsException("setMetadataProperty: Index value '" + index + "' not in range [0.." + (this._metadataPropertyList.size() - 1) + "]");
        }

        this._metadataPropertyList.set(index, vMetadataProperty);
    }

    /**
     * 
     * 
     * @param vMetadataPropertyArray
     */
    public void setMetadataProperty(
            final org.LexGrid.LexBIG.DataModel.Core.MetadataProperty[] vMetadataPropertyArray) {
        //-- copy array
        _metadataPropertyList.clear();

        for (int i = 0; i < vMetadataPropertyArray.length; i++) {
                this._metadataPropertyList.add(vMetadataPropertyArray[i]);
        }
    }

}
