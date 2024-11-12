/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * A list of associations that can be browsed hierarchically.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SupportedHierarchy extends org.LexGrid.naming.URIMap 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Identifiers for hierarchical relationships available for
     * navigation within a coding scheme
     */
    private java.util.List<java.lang.String> _associationNamesList;

    /**
     * "@" for coding scheme that are top-down (ROOT) in hierarchy;
     * "@@" for coding scheme that are bottom-up (TAIL) hierarchy
     */
    private java.lang.String _rootCode;

    /**
     * "true" if coding scheme hierarchy is top-down; "false" for
     * bottom-up
     */
    private java.lang.Boolean _isForwardNavigable;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedHierarchy() {
        super();
        setContent("");
        this._associationNamesList = new java.util.ArrayList<java.lang.String>();
    }

    public SupportedHierarchy(final java.lang.String defaultValue) {
        try {
            setContent( new java.lang.String(defaultValue));
         } catch(Exception e) {
            throw new RuntimeException("Unable to cast default value for simple content!");
         } 
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociationNames
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationNames(
            final java.lang.String vAssociationNames)
    throws java.lang.IndexOutOfBoundsException {
        this._associationNamesList.add(vAssociationNames);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationNames
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationNames(
            final int index,
            final java.lang.String vAssociationNames)
    throws java.lang.IndexOutOfBoundsException {
        this._associationNamesList.add(index, vAssociationNames);
    }

    /**
     * Method enumerateAssociationNames.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateAssociationNames(
    ) {
        return java.util.Collections.enumeration(this._associationNamesList);
    }

    /**
     * Method getAssociationNames.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getAssociationNames(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationNamesList.size()) {
            throw new IndexOutOfBoundsException("getAssociationNames: Index value '" + index + "' not in range [0.." + (this._associationNamesList.size() - 1) + "]");
        }

        return (java.lang.String) _associationNamesList.get(index);
    }

    /**
     * Method getAssociationNames.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getAssociationNames(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._associationNamesList.toArray(array);
    }

    /**
     * Method getAssociationNamesAsReference.Returns a reference to
     * '_associationNamesList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getAssociationNamesAsReference(
    ) {
        return this._associationNamesList;
    }

    /**
     * Method getAssociationNamesCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationNamesCount(
    ) {
        return this._associationNamesList.size();
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public java.lang.String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'isForwardNavigable'. The field
     * 'isForwardNavigable' has the following description: "true"
     * if coding scheme hierarchy is top-down; "false" for
     * bottom-up
     * 
     * @return the value of field 'IsForwardNavigable'.
     */
    public java.lang.Boolean getIsForwardNavigable(
    ) {
        return this._isForwardNavigable;
    }

    /**
     * Returns the value of field 'rootCode'. The field 'rootCode'
     * has the following description: "@" for coding scheme that
     * are top-down (ROOT) in hierarchy; "@@" for coding scheme
     * that are bottom-up (TAIL) hierarchy
     * 
     * @return the value of field 'RootCode'.
     */
    public java.lang.String getRootCode(
    ) {
        return this._rootCode;
    }

    /**
     * Returns the value of field 'isForwardNavigable'. The field
     * 'isForwardNavigable' has the following description: "true"
     * if coding scheme hierarchy is top-down; "false" for
     * bottom-up
     * 
     * @return the value of field 'IsForwardNavigable'.
     */
    public java.lang.Boolean isIsForwardNavigable(
    ) {
        return this._isForwardNavigable;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateAssociationNames.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateAssociationNames(
    ) {
        return this._associationNamesList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllAssociationNames(
    ) {
        this._associationNamesList.clear();
    }

    /**
     * Method removeAssociationNames.
     * 
     * @param vAssociationNames
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociationNames(
            final java.lang.String vAssociationNames) {
        boolean removed = _associationNamesList.remove(vAssociationNames);
        return removed;
    }

    /**
     * Method removeAssociationNamesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeAssociationNamesAt(
            final int index) {
        java.lang.Object obj = this._associationNamesList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationNames
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociationNames(
            final int index,
            final java.lang.String vAssociationNames)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationNamesList.size()) {
            throw new IndexOutOfBoundsException("setAssociationNames: Index value '" + index + "' not in range [0.." + (this._associationNamesList.size() - 1) + "]");
        }

        this._associationNamesList.set(index, vAssociationNames);
    }

    /**
     * 
     * 
     * @param vAssociationNamesArray
     */
    public void setAssociationNames(
            final java.lang.String[] vAssociationNamesArray) {
        //-- copy array
        _associationNamesList.clear();

        for (int i = 0; i < vAssociationNamesArray.length; i++) {
                this._associationNamesList.add(vAssociationNamesArray[i]);
        }
    }

    /**
     * Sets the value of '_associationNamesList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAssociationNamesList the Vector to copy.
     */
    public void setAssociationNames(
            final java.util.List<java.lang.String> vAssociationNamesList) {
        // copy vector
        this._associationNamesList.clear();

        this._associationNamesList.addAll(vAssociationNamesList);
    }

    /**
     * Sets the value of '_associationNamesList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param associationNamesList the Vector to set.
     */
    public void setAssociationNamesAsReference(
            final java.util.List<java.lang.String> associationNamesList) {
        this._associationNamesList = associationNamesList;
    }

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.lang.String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'isForwardNavigable'. The field
     * 'isForwardNavigable' has the following description: "true"
     * if coding scheme hierarchy is top-down; "false" for
     * bottom-up
     * 
     * @param isForwardNavigable the value of field
     * 'isForwardNavigable'.
     */
    public void setIsForwardNavigable(
            final java.lang.Boolean isForwardNavigable) {
        this._isForwardNavigable = isForwardNavigable;
    }

    /**
     * Sets the value of field 'rootCode'. The field 'rootCode' has
     * the following description: "@" for coding scheme that are
     * top-down (ROOT) in hierarchy; "@@" for coding scheme that
     * are bottom-up (TAIL) hierarchy
     * 
     * @param rootCode the value of field 'rootCode'.
     */
    public void setRootCode(
            final java.lang.String rootCode) {
        this._rootCode = rootCode;
    }

    /**
     * Method unmarshalSupportedHierarchy.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.naming.SupportedHierarchy
     */
    public static org.LexGrid.naming.SupportedHierarchy unmarshalSupportedHierarchy(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.SupportedHierarchy) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.SupportedHierarchy.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
