/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class CodingSchemeTagList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class CodingSchemeTagList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tagList.
     */
    private java.util.List<java.lang.String> _tagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeTagList() {
        super();
        this._tagList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTag
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTag(
            final java.lang.String vTag)
    throws java.lang.IndexOutOfBoundsException {
        this._tagList.add(vTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vTag
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTag(
            final int index,
            final java.lang.String vTag)
    throws java.lang.IndexOutOfBoundsException {
        this._tagList.add(index, vTag);
    }

    /**
     * Method enumerateTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateTag(
    ) {
        return java.util.Collections.enumeration(this._tagList);
    }

    /**
     * Method getTag.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getTag(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tagList.size()) {
            throw new IndexOutOfBoundsException("getTag: Index value '" + index + "' not in range [0.." + (this._tagList.size() - 1) + "]");
        }

        return (java.lang.String) _tagList.get(index);
    }

    /**
     * Method getTag.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getTag(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._tagList.toArray(array);
    }

    /**
     * Method getTagCount.
     * 
     * @return the size of this collection
     */
    public int getTagCount(
    ) {
        return this._tagList.size();
    }

    /**
     * Method iterateTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateTag(
    ) {
        return this._tagList.iterator();
    }

    /**
     */
    public void removeAllTag(
    ) {
        this._tagList.clear();
    }

    /**
     * Method removeTag.
     * 
     * @param vTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeTag(
            final java.lang.String vTag) {
        boolean removed = _tagList.remove(vTag);
        return removed;
    }

    /**
     * Method removeTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeTagAt(
            final int index) {
        java.lang.Object obj = this._tagList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTag
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTag(
            final int index,
            final java.lang.String vTag)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tagList.size()) {
            throw new IndexOutOfBoundsException("setTag: Index value '" + index + "' not in range [0.." + (this._tagList.size() - 1) + "]");
        }

        this._tagList.set(index, vTag);
    }

    /**
     * 
     * 
     * @param vTagArray
     */
    public void setTag(
            final java.lang.String[] vTagArray) {
        //-- copy array
        _tagList.clear();

        for (int i = 0; i < vTagArray.length; i++) {
                this._tagList.add(vTagArray[i]);
        }
    }

}
