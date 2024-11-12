/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions;

/**
 * An ordered collection of revisions
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EditHistory extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _revisionList.
     */
    private java.util.List<org.LexGrid.versions.Revision> _revisionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EditHistory() {
        super();
        this._revisionList = new java.util.ArrayList<org.LexGrid.versions.Revision>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRevision
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRevision(
            final org.LexGrid.versions.Revision vRevision)
    throws java.lang.IndexOutOfBoundsException {
        this._revisionList.add(vRevision);
    }

    /**
     * 
     * 
     * @param index
     * @param vRevision
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRevision(
            final int index,
            final org.LexGrid.versions.Revision vRevision)
    throws java.lang.IndexOutOfBoundsException {
        this._revisionList.add(index, vRevision);
    }

    /**
     * Method enumerateRevision.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.versions.Revision> enumerateRevision(
    ) {
        return java.util.Collections.enumeration(this._revisionList);
    }

    /**
     * Method getRevision.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.versions.Revision at
     * the given index
     */
    public org.LexGrid.versions.Revision getRevision(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._revisionList.size()) {
            throw new IndexOutOfBoundsException("getRevision: Index value '" + index + "' not in range [0.." + (this._revisionList.size() - 1) + "]");
        }

        return (org.LexGrid.versions.Revision) _revisionList.get(index);
    }

    /**
     * Method getRevision.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.versions.Revision[] getRevision(
    ) {
        org.LexGrid.versions.Revision[] array = new org.LexGrid.versions.Revision[0];
        return (org.LexGrid.versions.Revision[]) this._revisionList.toArray(array);
    }

    /**
     * Method getRevisionAsReference.Returns a reference to
     * '_revisionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.versions.Revision> getRevisionAsReference(
    ) {
        return this._revisionList;
    }

    /**
     * Method getRevisionCount.
     * 
     * @return the size of this collection
     */
    public int getRevisionCount(
    ) {
        return this._revisionList.size();
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
     * Method iterateRevision.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.versions.Revision> iterateRevision(
    ) {
        return this._revisionList.iterator();
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
    public void removeAllRevision(
    ) {
        this._revisionList.clear();
    }

    /**
     * Method removeRevision.
     * 
     * @param vRevision
     * @return true if the object was removed from the collection.
     */
    public boolean removeRevision(
            final org.LexGrid.versions.Revision vRevision) {
        boolean removed = _revisionList.remove(vRevision);
        return removed;
    }

    /**
     * Method removeRevisionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.versions.Revision removeRevisionAt(
            final int index) {
        java.lang.Object obj = this._revisionList.remove(index);
        return (org.LexGrid.versions.Revision) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRevision
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRevision(
            final int index,
            final org.LexGrid.versions.Revision vRevision)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._revisionList.size()) {
            throw new IndexOutOfBoundsException("setRevision: Index value '" + index + "' not in range [0.." + (this._revisionList.size() - 1) + "]");
        }

        this._revisionList.set(index, vRevision);
    }

    /**
     * 
     * 
     * @param vRevisionArray
     */
    public void setRevision(
            final org.LexGrid.versions.Revision[] vRevisionArray) {
        //-- copy array
        _revisionList.clear();

        for (int i = 0; i < vRevisionArray.length; i++) {
                this._revisionList.add(vRevisionArray[i]);
        }
    }

    /**
     * Sets the value of '_revisionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vRevisionList the Vector to copy.
     */
    public void setRevision(
            final java.util.List<org.LexGrid.versions.Revision> vRevisionList) {
        // copy vector
        this._revisionList.clear();

        this._revisionList.addAll(vRevisionList);
    }

    /**
     * Sets the value of '_revisionList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param revisionList the Vector to set.
     */
    public void setRevisionAsReference(
            final java.util.List<org.LexGrid.versions.Revision> revisionList) {
        this._revisionList = revisionList;
    }

    /**
     * Method unmarshalEditHistory.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.versions.EditHistory
     */
    public static org.LexGrid.versions.EditHistory unmarshalEditHistory(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.versions.EditHistory) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.versions.EditHistory.class, reader);
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
