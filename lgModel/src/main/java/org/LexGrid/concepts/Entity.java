/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.concepts;

/**
 * A set of lexical assertions about the intended meaning of a
 * particular entity code.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Entity extends org.LexGrid.commonTypes.VersionableAndDescribable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The entity code being defined. 
     */
    private java.lang.String _entityCode;

    /**
     * Local identifier of the namespace of the entityCode.
     * entityCodeNamespace must match a local id of a
     * supportedNamespace in the corresponding mappings section. If
     * omitted, the URI of the defaultCodingScheme will be used as
     * the namespace for the entity code.
     */
    private java.lang.String _entityCodeNamespace;

    /**
     * True means that the entityCode is synthetic, and doesn't
     * actually exist in the namespace. isAnonymous is used for
     * synthetic top and bottom nodes as well as blank or anonymous
     * inner class definitions. Default: False
     */
    private java.lang.Boolean _isAnonymous;

    /**
     * True means that this entityCode is considered to be
     * completely defined (i.e. necessary and sufficient) within
     * the context of the containing code system. False means that
     * only the necessary components are present. If omitted, the
     * state of the entityCode definition is not known.
     */
    private java.lang.Boolean _isDefined;

    /**
     * The local identifiers of the entity types(s) represented by
     * this entity code. Must match a local id of a
     * supportedEntityType in the corresponding mappings section.
     */
    private java.util.List<java.lang.String> _entityTypeList;

    /**
     * The set of presentations for this entityCode that are
     * defined in the containing coding scheme.
     */
    private java.util.List<org.LexGrid.concepts.Presentation> _presentationList;

    /**
     * The set of definitions for this entityCode that are defined
     * in the containing coding scheme.
     */
    private java.util.List<org.LexGrid.concepts.Definition> _definitionList;

    /**
     * The set of comments for this entityCode that are defined in
     * the containing coding scheme.
     */
    private java.util.List<org.LexGrid.concepts.Comment> _commentList;

    /**
     * The set of properties of this entityCode that are defined in
     * the containing coding scheme.
     */
    private java.util.List<org.LexGrid.commonTypes.Property> _propertyList;

    /**
     * A link between two properties for the same coded entry.
     * Example: literal translation of, acronym of
     */
    private java.util.List<org.LexGrid.concepts.PropertyLink> _propertyLinkList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Entity() {
        super();
        this._entityTypeList = new java.util.ArrayList<java.lang.String>();
        this._presentationList = new java.util.ArrayList<org.LexGrid.concepts.Presentation>();
        this._definitionList = new java.util.ArrayList<org.LexGrid.concepts.Definition>();
        this._commentList = new java.util.ArrayList<org.LexGrid.concepts.Comment>();
        this._propertyList = new java.util.ArrayList<org.LexGrid.commonTypes.Property>();
        this._propertyLinkList = new java.util.ArrayList<org.LexGrid.concepts.PropertyLink>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vComment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComment(
            final org.LexGrid.concepts.Comment vComment)
    throws java.lang.IndexOutOfBoundsException {
        this._commentList.add(vComment);
    }

    /**
     * 
     * 
     * @param index
     * @param vComment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComment(
            final int index,
            final org.LexGrid.concepts.Comment vComment)
    throws java.lang.IndexOutOfBoundsException {
        this._commentList.add(index, vComment);
    }

    /**
     * 
     * 
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final org.LexGrid.concepts.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionList.add(vDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final int index,
            final org.LexGrid.concepts.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionList.add(index, vDefinition);
    }

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
     * 
     * 
     * @param vPresentation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPresentation(
            final org.LexGrid.concepts.Presentation vPresentation)
    throws java.lang.IndexOutOfBoundsException {
        this._presentationList.add(vPresentation);
    }

    /**
     * 
     * 
     * @param index
     * @param vPresentation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPresentation(
            final int index,
            final org.LexGrid.concepts.Presentation vPresentation)
    throws java.lang.IndexOutOfBoundsException {
        this._presentationList.add(index, vPresentation);
    }

    /**
     * 
     * 
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final org.LexGrid.commonTypes.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(vProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final int index,
            final org.LexGrid.commonTypes.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertyLink(
            final org.LexGrid.concepts.PropertyLink vPropertyLink)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyLinkList.add(vPropertyLink);
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertyLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertyLink(
            final int index,
            final org.LexGrid.concepts.PropertyLink vPropertyLink)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyLinkList.add(index, vPropertyLink);
    }

    /**
     * Method enumerateComment.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.concepts.Comment> enumerateComment(
    ) {
        return java.util.Collections.enumeration(this._commentList);
    }

    /**
     * Method enumerateDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.concepts.Definition> enumerateDefinition(
    ) {
        return java.util.Collections.enumeration(this._definitionList);
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
     * Method enumeratePresentation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.concepts.Presentation> enumeratePresentation(
    ) {
        return java.util.Collections.enumeration(this._presentationList);
    }

    /**
     * Method enumerateProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.commonTypes.Property> enumerateProperty(
    ) {
        return java.util.Collections.enumeration(this._propertyList);
    }

    /**
     * Method enumeratePropertyLink.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.concepts.PropertyLink> enumeratePropertyLink(
    ) {
        return java.util.Collections.enumeration(this._propertyLinkList);
    }

    /**
     * Method getComment.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.concepts.Comment at the
     * given index
     */
    public org.LexGrid.concepts.Comment getComment(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._commentList.size()) {
            throw new IndexOutOfBoundsException("getComment: Index value '" + index + "' not in range [0.." + (this._commentList.size() - 1) + "]");
        }

        return (org.LexGrid.concepts.Comment) _commentList.get(index);
    }

    /**
     * Method getComment.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.concepts.Comment[] getComment(
    ) {
        org.LexGrid.concepts.Comment[] array = new org.LexGrid.concepts.Comment[0];
        return (org.LexGrid.concepts.Comment[]) this._commentList.toArray(array);
    }

    /**
     * Method getCommentAsReference.Returns a reference to
     * '_commentList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.concepts.Comment> getCommentAsReference(
    ) {
        return this._commentList;
    }

    /**
     * Method getCommentCount.
     * 
     * @return the size of this collection
     */
    public int getCommentCount(
    ) {
        return this._commentList.size();
    }

    /**
     * Method getDefinition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.concepts.Definition at
     * the given index
     */
    public org.LexGrid.concepts.Definition getDefinition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("getDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }

        return (org.LexGrid.concepts.Definition) _definitionList.get(index);
    }

    /**
     * Method getDefinition.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.concepts.Definition[] getDefinition(
    ) {
        org.LexGrid.concepts.Definition[] array = new org.LexGrid.concepts.Definition[0];
        return (org.LexGrid.concepts.Definition[]) this._definitionList.toArray(array);
    }

    /**
     * Method getDefinitionAsReference.Returns a reference to
     * '_definitionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.concepts.Definition> getDefinitionAsReference(
    ) {
        return this._definitionList;
    }

    /**
     * Method getDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getDefinitionCount(
    ) {
        return this._definitionList.size();
    }

    /**
     * Returns the value of field 'entityCode'. The field
     * 'entityCode' has the following description: The entity code
     * being defined. 
     * 
     * @return the value of field 'EntityCode'.
     */
    public java.lang.String getEntityCode(
    ) {
        return this._entityCode;
    }

    /**
     * Returns the value of field 'entityCodeNamespace'. The field
     * 'entityCodeNamespace' has the following description: Local
     * identifier of the namespace of the entityCode.
     * entityCodeNamespace must match a local id of a
     * supportedNamespace in the corresponding mappings section. If
     * omitted, the URI of the defaultCodingScheme will be used as
     * the namespace for the entity code.
     * 
     * @return the value of field 'EntityCodeNamespace'.
     */
    public java.lang.String getEntityCodeNamespace(
    ) {
        return this._entityCodeNamespace;
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
     * Method getEntityTypeAsReference.Returns a reference to
     * '_entityTypeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getEntityTypeAsReference(
    ) {
        return this._entityTypeList;
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
     * Returns the value of field 'isAnonymous'. The field
     * 'isAnonymous' has the following description: True means that
     * the entityCode is synthetic, and doesn't actually exist in
     * the namespace. isAnonymous is used for synthetic top and
     * bottom nodes as well as blank or anonymous inner class
     * definitions. Default: False
     * 
     * @return the value of field 'IsAnonymous'.
     */
    public java.lang.Boolean getIsAnonymous(
    ) {
        return this._isAnonymous;
    }

    /**
     * Returns the value of field 'isDefined'. The field
     * 'isDefined' has the following description: True means that
     * this entityCode is considered to be completely defined (i.e.
     * necessary and sufficient) within the context of the
     * containing code system. False means that only the necessary
     * components are present. If omitted, the state of the
     * entityCode definition is not known.
     * 
     * @return the value of field 'IsDefined'.
     */
    public java.lang.Boolean getIsDefined(
    ) {
        return this._isDefined;
    }

    /**
     * Method getPresentation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.concepts.Presentation
     * at the given index
     */
    public org.LexGrid.concepts.Presentation getPresentation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._presentationList.size()) {
            throw new IndexOutOfBoundsException("getPresentation: Index value '" + index + "' not in range [0.." + (this._presentationList.size() - 1) + "]");
        }

        return (org.LexGrid.concepts.Presentation) _presentationList.get(index);
    }

    /**
     * Method getPresentation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.concepts.Presentation[] getPresentation(
    ) {
        org.LexGrid.concepts.Presentation[] array = new org.LexGrid.concepts.Presentation[0];
        return (org.LexGrid.concepts.Presentation[]) this._presentationList.toArray(array);
    }

    /**
     * Method getPresentationAsReference.Returns a reference to
     * '_presentationList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.concepts.Presentation> getPresentationAsReference(
    ) {
        return this._presentationList;
    }

    /**
     * Method getPresentationCount.
     * 
     * @return the size of this collection
     */
    public int getPresentationCount(
    ) {
        return this._presentationList.size();
    }

    /**
     * Method getProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.commonTypes.Property at
     * the given index
     */
    public org.LexGrid.commonTypes.Property getProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("getProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        return (org.LexGrid.commonTypes.Property) _propertyList.get(index);
    }

    /**
     * Method getProperty.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.commonTypes.Property[] getProperty(
    ) {
        org.LexGrid.commonTypes.Property[] array = new org.LexGrid.commonTypes.Property[0];
        return (org.LexGrid.commonTypes.Property[]) this._propertyList.toArray(array);
    }

    /**
     * Method getPropertyAsReference.Returns a reference to
     * '_propertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.commonTypes.Property> getPropertyAsReference(
    ) {
        return this._propertyList;
    }

    /**
     * Method getPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyCount(
    ) {
        return this._propertyList.size();
    }

    /**
     * Method getPropertyLink.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.concepts.PropertyLink
     * at the given index
     */
    public org.LexGrid.concepts.PropertyLink getPropertyLink(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyLinkList.size()) {
            throw new IndexOutOfBoundsException("getPropertyLink: Index value '" + index + "' not in range [0.." + (this._propertyLinkList.size() - 1) + "]");
        }

        return (org.LexGrid.concepts.PropertyLink) _propertyLinkList.get(index);
    }

    /**
     * Method getPropertyLink.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.concepts.PropertyLink[] getPropertyLink(
    ) {
        org.LexGrid.concepts.PropertyLink[] array = new org.LexGrid.concepts.PropertyLink[0];
        return (org.LexGrid.concepts.PropertyLink[]) this._propertyLinkList.toArray(array);
    }

    /**
     * Method getPropertyLinkAsReference.Returns a reference to
     * '_propertyLinkList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.concepts.PropertyLink> getPropertyLinkAsReference(
    ) {
        return this._propertyLinkList;
    }

    /**
     * Method getPropertyLinkCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyLinkCount(
    ) {
        return this._propertyLinkList.size();
    }

    /**
     * Returns the value of field 'isAnonymous'. The field
     * 'isAnonymous' has the following description: True means that
     * the entityCode is synthetic, and doesn't actually exist in
     * the namespace. isAnonymous is used for synthetic top and
     * bottom nodes as well as blank or anonymous inner class
     * definitions. Default: False
     * 
     * @return the value of field 'IsAnonymous'.
     */
    public java.lang.Boolean isIsAnonymous(
    ) {
        return this._isAnonymous;
    }

    /**
     * Returns the value of field 'isDefined'. The field
     * 'isDefined' has the following description: True means that
     * this entityCode is considered to be completely defined (i.e.
     * necessary and sufficient) within the context of the
     * containing code system. False means that only the necessary
     * components are present. If omitted, the state of the
     * entityCode definition is not known.
     * 
     * @return the value of field 'IsDefined'.
     */
    public java.lang.Boolean isIsDefined(
    ) {
        return this._isDefined;
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
     * Method iterateComment.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.concepts.Comment> iterateComment(
    ) {
        return this._commentList.iterator();
    }

    /**
     * Method iterateDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.concepts.Definition> iterateDefinition(
    ) {
        return this._definitionList.iterator();
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
     * Method iteratePresentation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.concepts.Presentation> iteratePresentation(
    ) {
        return this._presentationList.iterator();
    }

    /**
     * Method iterateProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.commonTypes.Property> iterateProperty(
    ) {
        return this._propertyList.iterator();
    }

    /**
     * Method iteratePropertyLink.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.concepts.PropertyLink> iteratePropertyLink(
    ) {
        return this._propertyLinkList.iterator();
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
    public void removeAllComment(
    ) {
        this._commentList.clear();
    }

    /**
     */
    public void removeAllDefinition(
    ) {
        this._definitionList.clear();
    }

    /**
     */
    public void removeAllEntityType(
    ) {
        this._entityTypeList.clear();
    }

    /**
     */
    public void removeAllPresentation(
    ) {
        this._presentationList.clear();
    }

    /**
     */
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     */
    public void removeAllPropertyLink(
    ) {
        this._propertyLinkList.clear();
    }

    /**
     * Method removeComment.
     * 
     * @param vComment
     * @return true if the object was removed from the collection.
     */
    public boolean removeComment(
            final org.LexGrid.concepts.Comment vComment) {
        boolean removed = _commentList.remove(vComment);
        return removed;
    }

    /**
     * Method removeCommentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.concepts.Comment removeCommentAt(
            final int index) {
        java.lang.Object obj = this._commentList.remove(index);
        return (org.LexGrid.concepts.Comment) obj;
    }

    /**
     * Method removeDefinition.
     * 
     * @param vDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefinition(
            final org.LexGrid.concepts.Definition vDefinition) {
        boolean removed = _definitionList.remove(vDefinition);
        return removed;
    }

    /**
     * Method removeDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.concepts.Definition removeDefinitionAt(
            final int index) {
        java.lang.Object obj = this._definitionList.remove(index);
        return (org.LexGrid.concepts.Definition) obj;
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
     * Method removePresentation.
     * 
     * @param vPresentation
     * @return true if the object was removed from the collection.
     */
    public boolean removePresentation(
            final org.LexGrid.concepts.Presentation vPresentation) {
        boolean removed = _presentationList.remove(vPresentation);
        return removed;
    }

    /**
     * Method removePresentationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.concepts.Presentation removePresentationAt(
            final int index) {
        java.lang.Object obj = this._presentationList.remove(index);
        return (org.LexGrid.concepts.Presentation) obj;
    }

    /**
     * Method removeProperty.
     * 
     * @param vProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeProperty(
            final org.LexGrid.commonTypes.Property vProperty) {
        boolean removed = _propertyList.remove(vProperty);
        return removed;
    }

    /**
     * Method removePropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.commonTypes.Property removePropertyAt(
            final int index) {
        java.lang.Object obj = this._propertyList.remove(index);
        return (org.LexGrid.commonTypes.Property) obj;
    }

    /**
     * Method removePropertyLink.
     * 
     * @param vPropertyLink
     * @return true if the object was removed from the collection.
     */
    public boolean removePropertyLink(
            final org.LexGrid.concepts.PropertyLink vPropertyLink) {
        boolean removed = _propertyLinkList.remove(vPropertyLink);
        return removed;
    }

    /**
     * Method removePropertyLinkAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.concepts.PropertyLink removePropertyLinkAt(
            final int index) {
        java.lang.Object obj = this._propertyLinkList.remove(index);
        return (org.LexGrid.concepts.PropertyLink) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vComment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComment(
            final int index,
            final org.LexGrid.concepts.Comment vComment)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._commentList.size()) {
            throw new IndexOutOfBoundsException("setComment: Index value '" + index + "' not in range [0.." + (this._commentList.size() - 1) + "]");
        }

        this._commentList.set(index, vComment);
    }

    /**
     * 
     * 
     * @param vCommentArray
     */
    public void setComment(
            final org.LexGrid.concepts.Comment[] vCommentArray) {
        //-- copy array
        _commentList.clear();

        for (int i = 0; i < vCommentArray.length; i++) {
                this._commentList.add(vCommentArray[i]);
        }
    }

    /**
     * Sets the value of '_commentList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCommentList the Vector to copy.
     */
    public void setComment(
            final java.util.List<org.LexGrid.concepts.Comment> vCommentList) {
        // copy vector
        this._commentList.clear();

        this._commentList.addAll(vCommentList);
    }

    /**
     * Sets the value of '_commentList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param commentList the Vector to set.
     */
    public void setCommentAsReference(
            final java.util.List<org.LexGrid.concepts.Comment> commentList) {
        this._commentList = commentList;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefinition(
            final int index,
            final org.LexGrid.concepts.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("setDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }

        this._definitionList.set(index, vDefinition);
    }

    /**
     * 
     * 
     * @param vDefinitionArray
     */
    public void setDefinition(
            final org.LexGrid.concepts.Definition[] vDefinitionArray) {
        //-- copy array
        _definitionList.clear();

        for (int i = 0; i < vDefinitionArray.length; i++) {
                this._definitionList.add(vDefinitionArray[i]);
        }
    }

    /**
     * Sets the value of '_definitionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDefinitionList the Vector to copy.
     */
    public void setDefinition(
            final java.util.List<org.LexGrid.concepts.Definition> vDefinitionList) {
        // copy vector
        this._definitionList.clear();

        this._definitionList.addAll(vDefinitionList);
    }

    /**
     * Sets the value of '_definitionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param definitionList the Vector to set.
     */
    public void setDefinitionAsReference(
            final java.util.List<org.LexGrid.concepts.Definition> definitionList) {
        this._definitionList = definitionList;
    }

    /**
     * Sets the value of field 'entityCode'. The field 'entityCode'
     * has the following description: The entity code being
     * defined. 
     * 
     * @param entityCode the value of field 'entityCode'.
     */
    public void setEntityCode(
            final java.lang.String entityCode) {
        this._entityCode = entityCode;
    }

    /**
     * Sets the value of field 'entityCodeNamespace'. The field
     * 'entityCodeNamespace' has the following description: Local
     * identifier of the namespace of the entityCode.
     * entityCodeNamespace must match a local id of a
     * supportedNamespace in the corresponding mappings section. If
     * omitted, the URI of the defaultCodingScheme will be used as
     * the namespace for the entity code.
     * 
     * @param entityCodeNamespace the value of field
     * 'entityCodeNamespace'.
     */
    public void setEntityCodeNamespace(
            final java.lang.String entityCodeNamespace) {
        this._entityCodeNamespace = entityCodeNamespace;
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

    /**
     * Sets the value of '_entityTypeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vEntityTypeList the Vector to copy.
     */
    public void setEntityType(
            final java.util.List<java.lang.String> vEntityTypeList) {
        // copy vector
        this._entityTypeList.clear();

        this._entityTypeList.addAll(vEntityTypeList);
    }

    /**
     * Sets the value of '_entityTypeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entityTypeList the Vector to set.
     */
    public void setEntityTypeAsReference(
            final java.util.List<java.lang.String> entityTypeList) {
        this._entityTypeList = entityTypeList;
    }

    /**
     * Sets the value of field 'isAnonymous'. The field
     * 'isAnonymous' has the following description: True means that
     * the entityCode is synthetic, and doesn't actually exist in
     * the namespace. isAnonymous is used for synthetic top and
     * bottom nodes as well as blank or anonymous inner class
     * definitions. Default: False
     * 
     * @param isAnonymous the value of field 'isAnonymous'.
     */
    public void setIsAnonymous(
            final java.lang.Boolean isAnonymous) {
        this._isAnonymous = isAnonymous;
    }

    /**
     * Sets the value of field 'isDefined'. The field 'isDefined'
     * has the following description: True means that this
     * entityCode is considered to be completely defined (i.e.
     * necessary and sufficient) within the context of the
     * containing code system. False means that only the necessary
     * components are present. If omitted, the state of the
     * entityCode definition is not known.
     * 
     * @param isDefined the value of field 'isDefined'.
     */
    public void setIsDefined(
            final java.lang.Boolean isDefined) {
        this._isDefined = isDefined;
    }

    /**
     * 
     * 
     * @param index
     * @param vPresentation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPresentation(
            final int index,
            final org.LexGrid.concepts.Presentation vPresentation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._presentationList.size()) {
            throw new IndexOutOfBoundsException("setPresentation: Index value '" + index + "' not in range [0.." + (this._presentationList.size() - 1) + "]");
        }

        this._presentationList.set(index, vPresentation);
    }

    /**
     * 
     * 
     * @param vPresentationArray
     */
    public void setPresentation(
            final org.LexGrid.concepts.Presentation[] vPresentationArray) {
        //-- copy array
        _presentationList.clear();

        for (int i = 0; i < vPresentationArray.length; i++) {
                this._presentationList.add(vPresentationArray[i]);
        }
    }

    /**
     * Sets the value of '_presentationList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPresentationList the Vector to copy.
     */
    public void setPresentation(
            final java.util.List<org.LexGrid.concepts.Presentation> vPresentationList) {
        // copy vector
        this._presentationList.clear();

        this._presentationList.addAll(vPresentationList);
    }

    /**
     * Sets the value of '_presentationList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param presentationList the Vector to set.
     */
    public void setPresentationAsReference(
            final java.util.List<org.LexGrid.concepts.Presentation> presentationList) {
        this._presentationList = presentationList;
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProperty(
            final int index,
            final org.LexGrid.commonTypes.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("setProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        this._propertyList.set(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyArray
     */
    public void setProperty(
            final org.LexGrid.commonTypes.Property[] vPropertyArray) {
        //-- copy array
        _propertyList.clear();

        for (int i = 0; i < vPropertyArray.length; i++) {
                this._propertyList.add(vPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_propertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyList the Vector to copy.
     */
    public void setProperty(
            final java.util.List<org.LexGrid.commonTypes.Property> vPropertyList) {
        // copy vector
        this._propertyList.clear();

        this._propertyList.addAll(vPropertyList);
    }

    /**
     * Sets the value of '_propertyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyList the Vector to set.
     */
    public void setPropertyAsReference(
            final java.util.List<org.LexGrid.commonTypes.Property> propertyList) {
        this._propertyList = propertyList;
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertyLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPropertyLink(
            final int index,
            final org.LexGrid.concepts.PropertyLink vPropertyLink)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyLinkList.size()) {
            throw new IndexOutOfBoundsException("setPropertyLink: Index value '" + index + "' not in range [0.." + (this._propertyLinkList.size() - 1) + "]");
        }

        this._propertyLinkList.set(index, vPropertyLink);
    }

    /**
     * 
     * 
     * @param vPropertyLinkArray
     */
    public void setPropertyLink(
            final org.LexGrid.concepts.PropertyLink[] vPropertyLinkArray) {
        //-- copy array
        _propertyLinkList.clear();

        for (int i = 0; i < vPropertyLinkArray.length; i++) {
                this._propertyLinkList.add(vPropertyLinkArray[i]);
        }
    }

    /**
     * Sets the value of '_propertyLinkList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyLinkList the Vector to copy.
     */
    public void setPropertyLink(
            final java.util.List<org.LexGrid.concepts.PropertyLink> vPropertyLinkList) {
        // copy vector
        this._propertyLinkList.clear();

        this._propertyLinkList.addAll(vPropertyLinkList);
    }

    /**
     * Sets the value of '_propertyLinkList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyLinkList the Vector to set.
     */
    public void setPropertyLinkAsReference(
            final java.util.List<org.LexGrid.concepts.PropertyLink> propertyLinkList) {
        this._propertyLinkList = propertyLinkList;
    }

    /**
     * Method unmarshalEntity.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.concepts.Entity
     */
    public static org.LexGrid.concepts.Entity unmarshalEntity(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.concepts.Entity) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.concepts.Entity.class, reader);
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


	/**
     * Returns all of the Properties (and subclasses of Property) contained by this Entity.
     * 
     * @return All of the Properties of this Entity.
     */
	public org.LexGrid.commonTypes.Property[] getAllProperties(){
		org.LexGrid.concepts.Definition[] definitions = this.getDefinition();
		org.LexGrid.concepts.Presentation[] presentations = this.getPresentation();
		org.LexGrid.concepts.Comment[] comments = this.getComment();
		org.LexGrid.commonTypes.Property[] properties = this.getProperty();
	
		java.util.List<org.LexGrid.commonTypes.Property> allProperties = 
			new java.util.ArrayList<org.LexGrid.commonTypes.Property>();
		allProperties.addAll(java.util.Arrays.asList(definitions));
		allProperties.addAll(java.util.Arrays.asList(presentations));
		allProperties.addAll(java.util.Arrays.asList(comments));
		allProperties.addAll(java.util.Arrays.asList(properties));
	
		org.LexGrid.commonTypes.Property[] array = new org.LexGrid.commonTypes.Property[0];
		return (org.LexGrid.commonTypes.Property[]) allProperties.toArray(array);
	}
	
	/**
     * Adds all of the Properties (or subclasses of Property) in a given List to this Entity. 
     * Used for batch-type Property insertion.
     * Subclasses of Property are accepted and directed to the correct Collection.
     * 
     * @param property The List of Properties to be added (List may contain subclass of Property).
     */
	public void addAnyProperties(java.util.List<org.LexGrid.commonTypes.Property> properties){
		for(org.LexGrid.commonTypes.Property property : properties){
		   if(property instanceof org.LexGrid.concepts.Presentation){
                this.addPresentation((org.LexGrid.concepts.Presentation)property);
            } else if (property instanceof org.LexGrid.concepts.Definition) {
                this.addDefinition((org.LexGrid.concepts.Definition)property);
            } else if (property instanceof org.LexGrid.concepts.Comment) {
                this.addComment((org.LexGrid.concepts.Comment)property);
            } else {
                this.addProperty(property);
            }
		}
	}	
	
	/**
     * Adds any Property to this Entity. Subclasses of Property are accepted
     * and directed to the correct Collection.
     * 
     * @param property The Property to be added (may be a subclass of Property).
     */
	public void addAnyProperty(org.LexGrid.commonTypes.Property property){
		java.util.List<org.LexGrid.commonTypes.Property> propertyList =
			new java.util.ArrayList<org.LexGrid.commonTypes.Property>();
		propertyList.add(property);
		this.addAnyProperties(propertyList);
	}
}