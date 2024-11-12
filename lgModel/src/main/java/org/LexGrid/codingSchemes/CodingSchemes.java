/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.codingSchemes;

/**
 * A collection of one or more coding schemes.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodingSchemes extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An individual coding scheme in the collection.
     */
    private java.util.List<org.LexGrid.codingSchemes.CodingScheme> _codingSchemeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemes() {
        super();
        this._codingSchemeList = new java.util.ArrayList<org.LexGrid.codingSchemes.CodingScheme>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCodingScheme
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodingScheme(
            final org.LexGrid.codingSchemes.CodingScheme vCodingScheme)
    throws java.lang.IndexOutOfBoundsException {
        this._codingSchemeList.add(vCodingScheme);
    }

    /**
     * 
     * 
     * @param index
     * @param vCodingScheme
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodingScheme(
            final int index,
            final org.LexGrid.codingSchemes.CodingScheme vCodingScheme)
    throws java.lang.IndexOutOfBoundsException {
        this._codingSchemeList.add(index, vCodingScheme);
    }

    /**
     * Method enumerateCodingScheme.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.codingSchemes.CodingScheme> enumerateCodingScheme(
    ) {
        return java.util.Collections.enumeration(this._codingSchemeList);
    }

    /**
     * Method getCodingScheme.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.codingSchemes.CodingScheme at the given index
     */
    public org.LexGrid.codingSchemes.CodingScheme getCodingScheme(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codingSchemeList.size()) {
            throw new IndexOutOfBoundsException("getCodingScheme: Index value '" + index + "' not in range [0.." + (this._codingSchemeList.size() - 1) + "]");
        }

        return (org.LexGrid.codingSchemes.CodingScheme) _codingSchemeList.get(index);
    }

    /**
     * Method getCodingScheme.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.codingSchemes.CodingScheme[] getCodingScheme(
    ) {
        org.LexGrid.codingSchemes.CodingScheme[] array = new org.LexGrid.codingSchemes.CodingScheme[0];
        return (org.LexGrid.codingSchemes.CodingScheme[]) this._codingSchemeList.toArray(array);
    }

    /**
     * Method getCodingSchemeAsReference.Returns a reference to
     * '_codingSchemeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.codingSchemes.CodingScheme> getCodingSchemeAsReference(
    ) {
        return this._codingSchemeList;
    }

    /**
     * Method getCodingSchemeCount.
     * 
     * @return the size of this collection
     */
    public int getCodingSchemeCount(
    ) {
        return this._codingSchemeList.size();
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
     * Method iterateCodingScheme.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.codingSchemes.CodingScheme> iterateCodingScheme(
    ) {
        return this._codingSchemeList.iterator();
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
    public void removeAllCodingScheme(
    ) {
        this._codingSchemeList.clear();
    }

    /**
     * Method removeCodingScheme.
     * 
     * @param vCodingScheme
     * @return true if the object was removed from the collection.
     */
    public boolean removeCodingScheme(
            final org.LexGrid.codingSchemes.CodingScheme vCodingScheme) {
        boolean removed = _codingSchemeList.remove(vCodingScheme);
        return removed;
    }

    /**
     * Method removeCodingSchemeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.codingSchemes.CodingScheme removeCodingSchemeAt(
            final int index) {
        java.lang.Object obj = this._codingSchemeList.remove(index);
        return (org.LexGrid.codingSchemes.CodingScheme) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCodingScheme
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCodingScheme(
            final int index,
            final org.LexGrid.codingSchemes.CodingScheme vCodingScheme)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codingSchemeList.size()) {
            throw new IndexOutOfBoundsException("setCodingScheme: Index value '" + index + "' not in range [0.." + (this._codingSchemeList.size() - 1) + "]");
        }

        this._codingSchemeList.set(index, vCodingScheme);
    }

    /**
     * 
     * 
     * @param vCodingSchemeArray
     */
    public void setCodingScheme(
            final org.LexGrid.codingSchemes.CodingScheme[] vCodingSchemeArray) {
        //-- copy array
        _codingSchemeList.clear();

        for (int i = 0; i < vCodingSchemeArray.length; i++) {
                this._codingSchemeList.add(vCodingSchemeArray[i]);
        }
    }

    /**
     * Sets the value of '_codingSchemeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCodingSchemeList the Vector to copy.
     */
    public void setCodingScheme(
            final java.util.List<org.LexGrid.codingSchemes.CodingScheme> vCodingSchemeList) {
        // copy vector
        this._codingSchemeList.clear();

        this._codingSchemeList.addAll(vCodingSchemeList);
    }

    /**
     * Sets the value of '_codingSchemeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param codingSchemeList the Vector to set.
     */
    public void setCodingSchemeAsReference(
            final java.util.List<org.LexGrid.codingSchemes.CodingScheme> codingSchemeList) {
        this._codingSchemeList = codingSchemeList;
    }

    /**
     * Method unmarshalCodingSchemes.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.codingSchemes.CodingSchemes
     */
    public static org.LexGrid.codingSchemes.CodingSchemes unmarshalCodingSchemes(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.codingSchemes.CodingSchemes) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.codingSchemes.CodingSchemes.class, reader);
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
