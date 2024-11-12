/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class SystemReleaseList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class SystemReleaseList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _systemReleaseList.
     */
    private java.util.List<org.LexGrid.versions.SystemRelease> _systemReleaseList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SystemReleaseList() {
        super();
        this._systemReleaseList = new java.util.ArrayList<org.LexGrid.versions.SystemRelease>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSystemRelease
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSystemRelease(
            final org.LexGrid.versions.SystemRelease vSystemRelease)
    throws java.lang.IndexOutOfBoundsException {
        this._systemReleaseList.add(vSystemRelease);
    }

    /**
     * 
     * 
     * @param index
     * @param vSystemRelease
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSystemRelease(
            final int index,
            final org.LexGrid.versions.SystemRelease vSystemRelease)
    throws java.lang.IndexOutOfBoundsException {
        this._systemReleaseList.add(index, vSystemRelease);
    }

    /**
     * Method enumerateSystemRelease.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.versions.SystemRelease> enumerateSystemRelease(
    ) {
        return java.util.Collections.enumeration(this._systemReleaseList);
    }

    /**
     * Method getSystemRelease.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.versions.SystemRelease
     * at the given index
     */
    public org.LexGrid.versions.SystemRelease getSystemRelease(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._systemReleaseList.size()) {
            throw new IndexOutOfBoundsException("getSystemRelease: Index value '" + index + "' not in range [0.." + (this._systemReleaseList.size() - 1) + "]");
        }

        return (org.LexGrid.versions.SystemRelease) _systemReleaseList.get(index);
    }

    /**
     * Method getSystemRelease.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.versions.SystemRelease[] getSystemRelease(
    ) {
        org.LexGrid.versions.SystemRelease[] array = new org.LexGrid.versions.SystemRelease[0];
        return (org.LexGrid.versions.SystemRelease[]) this._systemReleaseList.toArray(array);
    }

    /**
     * Method getSystemReleaseCount.
     * 
     * @return the size of this collection
     */
    public int getSystemReleaseCount(
    ) {
        return this._systemReleaseList.size();
    }

    /**
     * Method iterateSystemRelease.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.versions.SystemRelease> iterateSystemRelease(
    ) {
        return this._systemReleaseList.iterator();
    }

    /**
     */
    public void removeAllSystemRelease(
    ) {
        this._systemReleaseList.clear();
    }

    /**
     * Method removeSystemRelease.
     * 
     * @param vSystemRelease
     * @return true if the object was removed from the collection.
     */
    public boolean removeSystemRelease(
            final org.LexGrid.versions.SystemRelease vSystemRelease) {
        boolean removed = _systemReleaseList.remove(vSystemRelease);
        return removed;
    }

    /**
     * Method removeSystemReleaseAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.versions.SystemRelease removeSystemReleaseAt(
            final int index) {
        java.lang.Object obj = this._systemReleaseList.remove(index);
        return (org.LexGrid.versions.SystemRelease) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSystemRelease
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSystemRelease(
            final int index,
            final org.LexGrid.versions.SystemRelease vSystemRelease)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._systemReleaseList.size()) {
            throw new IndexOutOfBoundsException("setSystemRelease: Index value '" + index + "' not in range [0.." + (this._systemReleaseList.size() - 1) + "]");
        }

        this._systemReleaseList.set(index, vSystemRelease);
    }

    /**
     * 
     * 
     * @param vSystemReleaseArray
     */
    public void setSystemRelease(
            final org.LexGrid.versions.SystemRelease[] vSystemReleaseArray) {
        //-- copy array
        _systemReleaseList.clear();

        for (int i = 0; i < vSystemReleaseArray.length; i++) {
                this._systemReleaseList.add(vSystemReleaseArray[i]);
        }
    }

}
