/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * A reference to an entity in the coding scheme by code,
 *  optionally qualified by namespace and type.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class CodedNodeReference implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of the coding scheme containing the
     *  entity
     */
    private java.lang.String _codingSchemeName;

    /**
     * The code uniquely identifying the entity within the
     *  coding scheme.
     */
    private java.lang.String _code;

    /**
     * Local identifier of the code namespace. If omitted,
     *  namespace is implied from the URI of the coding scheme.
     */
    private java.lang.String _codeNamespace;

    /**
     * Local identifiers of the types(s) defining the
     *  referenced entity (e.g. 'concept', 'instance').
     */
    private java.util.List<java.lang.String> _entityTypeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodedNodeReference() {
        super();
        this._entityTypeList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntityType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityType(
            final java.lang.String vEntityType)
    throws java.lang.IndexOutOfBoundsException {
        this._entityTypeList.add(vEntityType);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityType(
            final int index,
            final java.lang.String vEntityType)
    throws java.lang.IndexOutOfBoundsException {
        this._entityTypeList.add(index, vEntityType);
    }

    /**
     * Method enumerateEntityType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateEntityType(
    ) {
        return java.util.Collections.enumeration(this._entityTypeList);
    }

    /**
     * Returns the value of field 'code'. The field 'code' has the
     * following description: The code uniquely identifying the
     * entity within the
     *  coding scheme.
     * 
     * @return the value of field 'Code'.
     */
    public java.lang.String getCode(
    ) {
        return this._code;
    }

    /**
     * Returns the value of field 'codeNamespace'. The field
     * 'codeNamespace' has the following description: Local
     * identifier of the code namespace. If omitted,
     *  namespace is implied from the URI of the coding scheme.
     * 
     * @return the value of field 'CodeNamespace'.
     */
    public java.lang.String getCodeNamespace(
    ) {
        return this._codeNamespace;
    }

    /**
     * Returns the value of field 'codingSchemeName'. The field
     * 'codingSchemeName' has the following description: The name
     * of the coding scheme containing the
     *  entity
     * 
     * @return the value of field 'CodingSchemeName'.
     */
    public java.lang.String getCodingSchemeName(
    ) {
        return this._codingSchemeName;
    }

    /**
     * Method getEntityType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getEntityType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityTypeList.size()) {
            throw new IndexOutOfBoundsException("getEntityType: Index value '" + index + "' not in range [0.." + (this._entityTypeList.size() - 1) + "]");
        }

        return (java.lang.String) _entityTypeList.get(index);
    }

    /**
     * Method getEntityType.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getEntityType(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._entityTypeList.toArray(array);
    }

    /**
     * Method getEntityTypeCount.
     * 
     * @return the size of this collection
     */
    public int getEntityTypeCount(
    ) {
        return this._entityTypeList.size();
    }

    /**
     * Method iterateEntityType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateEntityType(
    ) {
        return this._entityTypeList.iterator();
    }

    /**
     */
    public void removeAllEntityType(
    ) {
        this._entityTypeList.clear();
    }

    /**
     * Method removeEntityType.
     * 
     * @param vEntityType
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntityType(
            final java.lang.String vEntityType) {
        boolean removed = _entityTypeList.remove(vEntityType);
        return removed;
    }

    /**
     * Method removeEntityTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeEntityTypeAt(
            final int index) {
        java.lang.Object obj = this._entityTypeList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'code'. The field 'code' has the
     * following description: The code uniquely identifying the
     * entity within the
     *  coding scheme.
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(
            final java.lang.String code) {
        this._code = code;
    }

    /**
     * Sets the value of field 'codeNamespace'. The field
     * 'codeNamespace' has the following description: Local
     * identifier of the code namespace. If omitted,
     *  namespace is implied from the URI of the coding scheme.
     * 
     * @param codeNamespace the value of field 'codeNamespace'.
     */
    public void setCodeNamespace(
            final java.lang.String codeNamespace) {
        this._codeNamespace = codeNamespace;
    }

    /**
     * Sets the value of field 'codingSchemeName'. The field
     * 'codingSchemeName' has the following description: The name
     * of the coding scheme containing the
     *  entity
     * 
     * @param codingSchemeName the value of field 'codingSchemeName'
     */
    public void setCodingSchemeName(
            final java.lang.String codingSchemeName) {
        this._codingSchemeName = codingSchemeName;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntityType(
            final int index,
            final java.lang.String vEntityType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityTypeList.size()) {
            throw new IndexOutOfBoundsException("setEntityType: Index value '" + index + "' not in range [0.." + (this._entityTypeList.size() - 1) + "]");
        }

        this._entityTypeList.set(index, vEntityType);
    }

    /**
     * 
     * 
     * @param vEntityTypeArray
     */
    public void setEntityType(
            final java.lang.String[] vEntityTypeArray) {
        //-- copy array
        _entityTypeList.clear();

        for (int i = 0; i < vEntityTypeArray.length; i++) {
                this._entityTypeList.add(vEntityTypeArray[i]);
        }
    }

}
