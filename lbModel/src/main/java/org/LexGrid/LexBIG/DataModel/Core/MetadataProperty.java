/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Reference to a property name and value stored in the coding
 * scheme metadata.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class MetadataProperty implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The metadata property name.
     */
    private java.lang.String _name;

    /**
     * The metadata property value.
     */
    private java.lang.String _value;

    /**
     * The registered URI of the associated coding scheme.
     */
    private java.lang.String _codingSchemeURI;

    /**
     * The version of the associated coding scheme. Note that that
     * is the combination of the codingSchemeURN and the version
     * that uniquely represents a coding scheme in the system.
     */
    private java.lang.String _codingSchemeVersion;

    /**
     * Defines 0 or more named contexts for the property .
     */
    private java.util.List<java.lang.Object> _contextList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MetadataProperty() {
        super();
        this._contextList = new java.util.ArrayList<java.lang.Object>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContext(
            final java.lang.Object vContext)
    throws java.lang.IndexOutOfBoundsException {
        this._contextList.add(vContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContext(
            final int index,
            final java.lang.Object vContext)
    throws java.lang.IndexOutOfBoundsException {
        this._contextList.add(index, vContext);
    }

    /**
     * Method enumerateContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.Object> enumerateContext(
    ) {
        return java.util.Collections.enumeration(this._contextList);
    }

    /**
     * Returns the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The
     * registered URI of the associated coding scheme.
     * 
     * @return the value of field 'CodingSchemeURI'.
     */
    public java.lang.String getCodingSchemeURI(
    ) {
        return this._codingSchemeURI;
    }

    /**
     * Returns the value of field 'codingSchemeVersion'. The field
     * 'codingSchemeVersion' has the following description: The
     * version of the associated coding scheme. Note that that is
     * the combination of the codingSchemeURN and the version that
     * uniquely represents a coding scheme in the system.
     * 
     * @return the value of field 'CodingSchemeVersion'.
     */
    public java.lang.String getCodingSchemeVersion(
    ) {
        return this._codingSchemeVersion;
    }

    /**
     * Method getContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.Object at the given index
     */
    public java.lang.Object getContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contextList.size()) {
            throw new IndexOutOfBoundsException("getContext: Index value '" + index + "' not in range [0.." + (this._contextList.size() - 1) + "]");
        }

        return (java.lang.Object) _contextList.get(index);
    }

    /**
     * Method getContext.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.Object[] getContext(
    ) {
        java.lang.Object[] array = new java.lang.Object[0];
        return (java.lang.Object[]) this._contextList.toArray(array);
    }

    /**
     * Method getContextCount.
     * 
     * @return the size of this collection
     */
    public int getContextCount(
    ) {
        return this._contextList.size();
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The metadata property name.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: The metadata property value.
     * 
     * @return the value of field 'Value'.
     */
    public java.lang.String getValue(
    ) {
        return this._value;
    }

    /**
     * Method iterateContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.Object> iterateContext(
    ) {
        return this._contextList.iterator();
    }

    /**
     */
    public void removeAllContext(
    ) {
        this._contextList.clear();
    }

    /**
     * Method removeContext.
     * 
     * @param vContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeContext(
            final java.lang.Object vContext) {
        boolean removed = _contextList.remove(vContext);
        return removed;
    }

    /**
     * Method removeContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.Object removeContextAt(
            final int index) {
        java.lang.Object obj = this._contextList.remove(index);
        return (java.lang.Object) obj;
    }

    /**
     * Sets the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The
     * registered URI of the associated coding scheme.
     * 
     * @param codingSchemeURI the value of field 'codingSchemeURI'.
     */
    public void setCodingSchemeURI(
            final java.lang.String codingSchemeURI) {
        this._codingSchemeURI = codingSchemeURI;
    }

    /**
     * Sets the value of field 'codingSchemeVersion'. The field
     * 'codingSchemeVersion' has the following description: The
     * version of the associated coding scheme. Note that that is
     * the combination of the codingSchemeURN and the version that
     * uniquely represents a coding scheme in the system.
     * 
     * @param codingSchemeVersion the value of field
     * 'codingSchemeVersion'.
     */
    public void setCodingSchemeVersion(
            final java.lang.String codingSchemeVersion) {
        this._codingSchemeVersion = codingSchemeVersion;
    }

    /**
     * 
     * 
     * @param index
     * @param vContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setContext(
            final int index,
            final java.lang.Object vContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contextList.size()) {
            throw new IndexOutOfBoundsException("setContext: Index value '" + index + "' not in range [0.." + (this._contextList.size() - 1) + "]");
        }

        this._contextList.set(index, vContext);
    }

    /**
     * 
     * 
     * @param vContextArray
     */
    public void setContext(
            final java.lang.Object[] vContextArray) {
        //-- copy array
        _contextList.clear();

        for (int i = 0; i < vContextArray.length; i++) {
                this._contextList.add(vContextArray[i]);
        }
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The metadata property name.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: The metadata property value.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final java.lang.String value) {
        this._value = value;
    }

}
