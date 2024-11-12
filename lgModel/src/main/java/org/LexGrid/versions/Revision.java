/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions;

/**
 * An ordered collection of state changes that define the
 * transformation of a set of resources from one consistent state
 * to another.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Revision extends org.LexGrid.commonTypes.Describable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique identifier of this revision.
     */
    private java.lang.String _revisionId;

    /**
     * The end date for which this version is operative (considered
     * commited).
     */
    private java.util.Date _revisionDate;

    /**
     * The relative order that this revision is to be applied if in
     * a systemRelease.
     */
    private java.lang.Long _editOrder;

    /**
     * The local identifiers of the source(s) that participated in
     * this particular change. changeAgent must match a local id of
     * a supportedSource in the corresponding mappings section.
     */
    private java.lang.String _changeAgent;

    /**
     * A human or machine readable set of instructions on how to
     * apply this change
     */
    private org.LexGrid.commonTypes.Text _changeInstructions;

    /**
     * An ordered list of top level versionable elements.
     */
    private java.util.List<org.LexGrid.versions.ChangedEntry> _changedEntryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Revision() {
        super();
        this._changedEntryList = new java.util.ArrayList<org.LexGrid.versions.ChangedEntry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vChangedEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addChangedEntry(
            final org.LexGrid.versions.ChangedEntry vChangedEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._changedEntryList.add(vChangedEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vChangedEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addChangedEntry(
            final int index,
            final org.LexGrid.versions.ChangedEntry vChangedEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._changedEntryList.add(index, vChangedEntry);
    }

    /**
     * Method enumerateChangedEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.versions.ChangedEntry> enumerateChangedEntry(
    ) {
        return java.util.Collections.enumeration(this._changedEntryList);
    }

    /**
     * Returns the value of field 'changeAgent'. The field
     * 'changeAgent' has the following description: The local
     * identifiers of the source(s) that participated in this
     * particular change. changeAgent must match a local id of a
     * supportedSource in the corresponding mappings section.
     * 
     * @return the value of field 'ChangeAgent'.
     */
    public java.lang.String getChangeAgent(
    ) {
        return this._changeAgent;
    }

    /**
     * Returns the value of field 'changeInstructions'. The field
     * 'changeInstructions' has the following description: A human
     * or machine readable set of instructions on how to apply this
     * change
     * 
     * @return the value of field 'ChangeInstructions'.
     */
    public org.LexGrid.commonTypes.Text getChangeInstructions(
    ) {
        return this._changeInstructions;
    }

    /**
     * Method getChangedEntry.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.versions.ChangedEntry
     * at the given index
     */
    public org.LexGrid.versions.ChangedEntry getChangedEntry(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._changedEntryList.size()) {
            throw new IndexOutOfBoundsException("getChangedEntry: Index value '" + index + "' not in range [0.." + (this._changedEntryList.size() - 1) + "]");
        }

        return (org.LexGrid.versions.ChangedEntry) _changedEntryList.get(index);
    }

    /**
     * Method getChangedEntry.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.versions.ChangedEntry[] getChangedEntry(
    ) {
        org.LexGrid.versions.ChangedEntry[] array = new org.LexGrid.versions.ChangedEntry[0];
        return (org.LexGrid.versions.ChangedEntry[]) this._changedEntryList.toArray(array);
    }

    /**
     * Method getChangedEntryAsReference.Returns a reference to
     * '_changedEntryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.versions.ChangedEntry> getChangedEntryAsReference(
    ) {
        return this._changedEntryList;
    }

    /**
     * Method getChangedEntryCount.
     * 
     * @return the size of this collection
     */
    public int getChangedEntryCount(
    ) {
        return this._changedEntryList.size();
    }

    /**
     * Returns the value of field 'editOrder'. The field
     * 'editOrder' has the following description: The relative
     * order that this revision is to be applied if in a
     * systemRelease.
     * 
     * @return the value of field 'EditOrder'.
     */
    public java.lang.Long getEditOrder(
    ) {
        return this._editOrder;
    }

    /**
     * Returns the value of field 'revisionDate'. The field
     * 'revisionDate' has the following description: The end date
     * for which this version is operative (considered commited).
     * 
     * @return the value of field 'RevisionDate'.
     */
    public java.util.Date getRevisionDate(
    ) {
        return this._revisionDate;
    }

    /**
     * Returns the value of field 'revisionId'. The field
     * 'revisionId' has the following description: The unique
     * identifier of this revision.
     * 
     * @return the value of field 'RevisionId'.
     */
    public java.lang.String getRevisionId(
    ) {
        return this._revisionId;
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
     * Method iterateChangedEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.versions.ChangedEntry> iterateChangedEntry(
    ) {
        return this._changedEntryList.iterator();
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
    public void removeAllChangedEntry(
    ) {
        this._changedEntryList.clear();
    }

    /**
     * Method removeChangedEntry.
     * 
     * @param vChangedEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeChangedEntry(
            final org.LexGrid.versions.ChangedEntry vChangedEntry) {
        boolean removed = _changedEntryList.remove(vChangedEntry);
        return removed;
    }

    /**
     * Method removeChangedEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.versions.ChangedEntry removeChangedEntryAt(
            final int index) {
        java.lang.Object obj = this._changedEntryList.remove(index);
        return (org.LexGrid.versions.ChangedEntry) obj;
    }

    /**
     * Sets the value of field 'changeAgent'. The field
     * 'changeAgent' has the following description: The local
     * identifiers of the source(s) that participated in this
     * particular change. changeAgent must match a local id of a
     * supportedSource in the corresponding mappings section.
     * 
     * @param changeAgent the value of field 'changeAgent'.
     */
    public void setChangeAgent(
            final java.lang.String changeAgent) {
        this._changeAgent = changeAgent;
    }

    /**
     * Sets the value of field 'changeInstructions'. The field
     * 'changeInstructions' has the following description: A human
     * or machine readable set of instructions on how to apply this
     * change
     * 
     * @param changeInstructions the value of field
     * 'changeInstructions'.
     */
    public void setChangeInstructions(
            final org.LexGrid.commonTypes.Text changeInstructions) {
        this._changeInstructions = changeInstructions;
    }

    /**
     * 
     * 
     * @param index
     * @param vChangedEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setChangedEntry(
            final int index,
            final org.LexGrid.versions.ChangedEntry vChangedEntry)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._changedEntryList.size()) {
            throw new IndexOutOfBoundsException("setChangedEntry: Index value '" + index + "' not in range [0.." + (this._changedEntryList.size() - 1) + "]");
        }

        this._changedEntryList.set(index, vChangedEntry);
    }

    /**
     * 
     * 
     * @param vChangedEntryArray
     */
    public void setChangedEntry(
            final org.LexGrid.versions.ChangedEntry[] vChangedEntryArray) {
        //-- copy array
        _changedEntryList.clear();

        for (int i = 0; i < vChangedEntryArray.length; i++) {
                this._changedEntryList.add(vChangedEntryArray[i]);
        }
    }

    /**
     * Sets the value of '_changedEntryList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vChangedEntryList the Vector to copy.
     */
    public void setChangedEntry(
            final java.util.List<org.LexGrid.versions.ChangedEntry> vChangedEntryList) {
        // copy vector
        this._changedEntryList.clear();

        this._changedEntryList.addAll(vChangedEntryList);
    }

    /**
     * Sets the value of '_changedEntryList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param changedEntryList the Vector to set.
     */
    public void setChangedEntryAsReference(
            final java.util.List<org.LexGrid.versions.ChangedEntry> changedEntryList) {
        this._changedEntryList = changedEntryList;
    }

    /**
     * Sets the value of field 'editOrder'. The field 'editOrder'
     * has the following description: The relative order that this
     * revision is to be applied if in a systemRelease.
     * 
     * @param editOrder the value of field 'editOrder'.
     */
    public void setEditOrder(
            final java.lang.Long editOrder) {
        this._editOrder = editOrder;
    }

    /**
     * Sets the value of field 'revisionDate'. The field
     * 'revisionDate' has the following description: The end date
     * for which this version is operative (considered commited).
     * 
     * @param revisionDate the value of field 'revisionDate'.
     */
    public void setRevisionDate(
            final java.util.Date revisionDate) {
        this._revisionDate = revisionDate;
    }

    /**
     * Sets the value of field 'revisionId'. The field 'revisionId'
     * has the following description: The unique identifier of this
     * revision.
     * 
     * @param revisionId the value of field 'revisionId'.
     */
    public void setRevisionId(
            final java.lang.String revisionId) {
        this._revisionId = revisionId;
    }

    /**
     * Method unmarshalRevision.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.versions.Revision
     */
    public static org.LexGrid.versions.Revision unmarshalRevision(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.versions.Revision) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.versions.Revision.class, reader);
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
