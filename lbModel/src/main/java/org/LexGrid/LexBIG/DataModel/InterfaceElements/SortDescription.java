/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * A description of of a LexBIG extension module.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SortDescription extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Indicates the context in which the sort algorithm can be
     * applied. If unspecified, all contexts are assumed to be
     *  valid.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext> _restrictToContextList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SortDescription() {
        super();
        this._restrictToContextList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRestrictToContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRestrictToContext(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext vRestrictToContext)
    throws java.lang.IndexOutOfBoundsException {
        this._restrictToContextList.add(vRestrictToContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vRestrictToContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRestrictToContext(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext vRestrictToContext)
    throws java.lang.IndexOutOfBoundsException {
        this._restrictToContextList.add(index, vRestrictToContext);
    }

    /**
     * Method enumerateRestrictToContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext> enumerateRestrictToContext(
    ) {
        return java.util.Collections.enumeration(this._restrictToContextList);
    }

    /**
     * Method getRestrictToContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext
     * at the given index
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext getRestrictToContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._restrictToContextList.size()) {
            throw new IndexOutOfBoundsException("getRestrictToContext: Index value '" + index + "' not in range [0.." + (this._restrictToContextList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext) _restrictToContextList.get(index);
    }

    /**
     * Method getRestrictToContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext[] getRestrictToContext(
    ) {
        org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext[] array = new org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext[0];
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext[]) this._restrictToContextList.toArray(array);
    }

    /**
     * Method getRestrictToContextCount.
     * 
     * @return the size of this collection
     */
    public int getRestrictToContextCount(
    ) {
        return this._restrictToContextList.size();
    }

    /**
     * Method iterateRestrictToContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext> iterateRestrictToContext(
    ) {
        return this._restrictToContextList.iterator();
    }

    /**
     */
    public void removeAllRestrictToContext(
    ) {
        this._restrictToContextList.clear();
    }

    /**
     * Method removeRestrictToContext.
     * 
     * @param vRestrictToContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeRestrictToContext(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext vRestrictToContext) {
        boolean removed = _restrictToContextList.remove(vRestrictToContext);
        return removed;
    }

    /**
     * Method removeRestrictToContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext removeRestrictToContextAt(
            final int index) {
        java.lang.Object obj = this._restrictToContextList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRestrictToContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRestrictToContext(
            final int index,
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext vRestrictToContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._restrictToContextList.size()) {
            throw new IndexOutOfBoundsException("setRestrictToContext: Index value '" + index + "' not in range [0.." + (this._restrictToContextList.size() - 1) + "]");
        }

        this._restrictToContextList.set(index, vRestrictToContext);
    }

    /**
     * 
     * 
     * @param vRestrictToContextArray
     */
    public void setRestrictToContext(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext[] vRestrictToContextArray) {
        //-- copy array
        _restrictToContextList.clear();

        for (int i = 0; i < vRestrictToContextArray.length; i++) {
                this._restrictToContextList.add(vRestrictToContextArray[i]);
        }
    }

}
