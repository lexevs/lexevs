/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * The combination of a system release and all of the
 * entityVersions that accompanied that release.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SystemReleaseDetail implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The set of applicable entity versions associated with this
     * release
     */
    private java.util.List<org.LexGrid.versions.EntityVersion> _entityVersionsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SystemReleaseDetail() {
        super();
        this._entityVersionsList = new java.util.ArrayList<org.LexGrid.versions.EntityVersion>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntityVersions
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityVersions(
            final org.LexGrid.versions.EntityVersion vEntityVersions)
    throws java.lang.IndexOutOfBoundsException {
        this._entityVersionsList.add(vEntityVersions);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityVersions
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityVersions(
            final int index,
            final org.LexGrid.versions.EntityVersion vEntityVersions)
    throws java.lang.IndexOutOfBoundsException {
        this._entityVersionsList.add(index, vEntityVersions);
    }

    /**
     * Method enumerateEntityVersions.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.versions.EntityVersion> enumerateEntityVersions(
    ) {
        return java.util.Collections.enumeration(this._entityVersionsList);
    }

    /**
     * Method getEntityVersions.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.versions.EntityVersion
     * at the given index
     */
    public org.LexGrid.versions.EntityVersion getEntityVersions(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityVersionsList.size()) {
            throw new IndexOutOfBoundsException("getEntityVersions: Index value '" + index + "' not in range [0.." + (this._entityVersionsList.size() - 1) + "]");
        }

        return (org.LexGrid.versions.EntityVersion) _entityVersionsList.get(index);
    }

    /**
     * Method getEntityVersions.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.versions.EntityVersion[] getEntityVersions(
    ) {
        org.LexGrid.versions.EntityVersion[] array = new org.LexGrid.versions.EntityVersion[0];
        return (org.LexGrid.versions.EntityVersion[]) this._entityVersionsList.toArray(array);
    }

    /**
     * Method getEntityVersionsCount.
     * 
     * @return the size of this collection
     */
    public int getEntityVersionsCount(
    ) {
        return this._entityVersionsList.size();
    }

    /**
     * Method iterateEntityVersions.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.versions.EntityVersion> iterateEntityVersions(
    ) {
        return this._entityVersionsList.iterator();
    }

    /**
     */
    public void removeAllEntityVersions(
    ) {
        this._entityVersionsList.clear();
    }

    /**
     * Method removeEntityVersions.
     * 
     * @param vEntityVersions
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntityVersions(
            final org.LexGrid.versions.EntityVersion vEntityVersions) {
        boolean removed = _entityVersionsList.remove(vEntityVersions);
        return removed;
    }

    /**
     * Method removeEntityVersionsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.versions.EntityVersion removeEntityVersionsAt(
            final int index) {
        java.lang.Object obj = this._entityVersionsList.remove(index);
        return (org.LexGrid.versions.EntityVersion) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityVersions
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntityVersions(
            final int index,
            final org.LexGrid.versions.EntityVersion vEntityVersions)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityVersionsList.size()) {
            throw new IndexOutOfBoundsException("setEntityVersions: Index value '" + index + "' not in range [0.." + (this._entityVersionsList.size() - 1) + "]");
        }

        this._entityVersionsList.set(index, vEntityVersions);
    }

    /**
     * 
     * 
     * @param vEntityVersionsArray
     */
    public void setEntityVersions(
            final org.LexGrid.versions.EntityVersion[] vEntityVersionsArray) {
        //-- copy array
        _entityVersionsList.clear();

        for (int i = 0; i < vEntityVersionsArray.length; i++) {
                this._entityVersionsList.add(vEntityVersionsArray[i]);
        }
    }

}
