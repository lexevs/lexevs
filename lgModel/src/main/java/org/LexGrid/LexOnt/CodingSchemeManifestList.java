/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt;

/**
 * Class CodingSchemeManifestList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodingSchemeManifestList extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entryList.
     */
    private java.util.List<org.LexGrid.LexOnt.CodingSchemeManifest> _entryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeManifestList() {
        super();
        this._entryList = new java.util.ArrayList<org.LexGrid.LexOnt.CodingSchemeManifest>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final org.LexGrid.LexOnt.CodingSchemeManifest vEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._entryList.add(vEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final int index,
            final org.LexGrid.LexOnt.CodingSchemeManifest vEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._entryList.add(index, vEntry);
    }

    /**
     * Method enumerateEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexOnt.CodingSchemeManifest> enumerateEntry(
    ) {
        return java.util.Collections.enumeration(this._entryList);
    }

    /**
     * Method getEntry.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexOnt.CodingSchemeManifest at the given index
     */
    public org.LexGrid.LexOnt.CodingSchemeManifest getEntry(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("getEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        return (org.LexGrid.LexOnt.CodingSchemeManifest) _entryList.get(index);
    }

    /**
     * Method getEntry.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexOnt.CodingSchemeManifest[] getEntry(
    ) {
        org.LexGrid.LexOnt.CodingSchemeManifest[] array = new org.LexGrid.LexOnt.CodingSchemeManifest[0];
        return (org.LexGrid.LexOnt.CodingSchemeManifest[]) this._entryList.toArray(array);
    }

    /**
     * Method getEntryAsReference.Returns a reference to
     * '_entryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.LexOnt.CodingSchemeManifest> getEntryAsReference(
    ) {
        return this._entryList;
    }

    /**
     * Method getEntryCount.
     * 
     * @return the size of this collection
     */
    public int getEntryCount(
    ) {
        return this._entryList.size();
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
     * Method iterateEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexOnt.CodingSchemeManifest> iterateEntry(
    ) {
        return this._entryList.iterator();
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
    public void removeAllEntry(
    ) {
        this._entryList.clear();
    }

    /**
     * Method removeEntry.
     * 
     * @param vEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntry(
            final org.LexGrid.LexOnt.CodingSchemeManifest vEntry) {
        boolean removed = _entryList.remove(vEntry);
        return removed;
    }

    /**
     * Method removeEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexOnt.CodingSchemeManifest removeEntryAt(
            final int index) {
        java.lang.Object obj = this._entryList.remove(index);
        return (org.LexGrid.LexOnt.CodingSchemeManifest) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntry(
            final int index,
            final org.LexGrid.LexOnt.CodingSchemeManifest vEntry)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("setEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        this._entryList.set(index, vEntry);
    }

    /**
     * 
     * 
     * @param vEntryArray
     */
    public void setEntry(
            final org.LexGrid.LexOnt.CodingSchemeManifest[] vEntryArray) {
        //-- copy array
        _entryList.clear();

        for (int i = 0; i < vEntryArray.length; i++) {
                this._entryList.add(vEntryArray[i]);
        }
    }

    /**
     * Sets the value of '_entryList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEntryList the Vector to copy.
     */
    public void setEntry(
            final java.util.List<org.LexGrid.LexOnt.CodingSchemeManifest> vEntryList) {
        // copy vector
        this._entryList.clear();

        this._entryList.addAll(vEntryList);
    }

    /**
     * Sets the value of '_entryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entryList the Vector to set.
     */
    public void setEntryAsReference(
            final java.util.List<org.LexGrid.LexOnt.CodingSchemeManifest> entryList) {
        this._entryList = entryList;
    }

    /**
     * Method unmarshalCodingSchemeManifestList.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.LexOnt.CodingSchemeManifestList
     */
    public static org.LexGrid.LexOnt.CodingSchemeManifestList unmarshalCodingSchemeManifestList(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.LexOnt.CodingSchemeManifestList) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.LexOnt.CodingSchemeManifestList.class, reader);
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
