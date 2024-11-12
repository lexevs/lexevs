/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences;

/**
 * Class TransitiveInverseAssociatinNames.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class TransitiveInverseAssociatinNames implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Indicates a list of associations that are otherwise
     * designated as transitive relations
     *  but have a potential inverse relation this list designates
     * any of those names that would
     *  be the inverse relation, with association direction going
     * the opposite of it's transitive
     *  opposite
     *  
     */
    private java.util.List<java.lang.String> _nameList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TransitiveInverseAssociatinNames() {
        super();
        this._nameList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addName(
            final java.lang.String vName)
    throws java.lang.IndexOutOfBoundsException {
        this._nameList.add(vName);
    }

    /**
     * 
     * 
     * @param index
     * @param vName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addName(
            final int index,
            final java.lang.String vName)
    throws java.lang.IndexOutOfBoundsException {
        this._nameList.add(index, vName);
    }

    /**
     * Method enumerateName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateName(
    ) {
        return java.util.Collections.enumeration(this._nameList);
    }

    /**
     * Method getName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nameList.size()) {
            throw new IndexOutOfBoundsException("getName: Index value '" + index + "' not in range [0.." + (this._nameList.size() - 1) + "]");
        }

        return (java.lang.String) _nameList.get(index);
    }

    /**
     * Method getName.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getName(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._nameList.toArray(array);
    }

    /**
     * Method getNameCount.
     * 
     * @return the size of this collection
     */
    public int getNameCount(
    ) {
        return this._nameList.size();
    }

    /**
     * Method iterateName.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateName(
    ) {
        return this._nameList.iterator();
    }

    /**
     */
    public void removeAllName(
    ) {
        this._nameList.clear();
    }

    /**
     * Method removeName.
     * 
     * @param vName
     * @return true if the object was removed from the collection.
     */
    public boolean removeName(
            final java.lang.String vName) {
        boolean removed = _nameList.remove(vName);
        return removed;
    }

    /**
     * Method removeNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeNameAt(
            final int index) {
        java.lang.Object obj = this._nameList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setName(
            final int index,
            final java.lang.String vName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nameList.size()) {
            throw new IndexOutOfBoundsException("setName: Index value '" + index + "' not in range [0.." + (this._nameList.size() - 1) + "]");
        }

        this._nameList.set(index, vName);
    }

    /**
     * 
     * 
     * @param vNameArray
     */
    public void setName(
            final java.lang.String[] vNameArray) {
        //-- copy array
        _nameList.clear();

        for (int i = 0; i < vNameArray.length; i++) {
                this._nameList.add(vNameArray[i]);
        }
    }

}
