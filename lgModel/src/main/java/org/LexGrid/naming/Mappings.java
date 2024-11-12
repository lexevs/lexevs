/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming;

/**
 * A list of all of the local identifiers and defining URI's that
 * are used in the associated resource
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Mappings extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An association(relation) referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedAssociation> _supportedAssociationList;

    /**
     * An association qualifier referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedAssociationQualifier> _supportedAssociationQualifierList;

    /**
     * Any coding scheme that is referenced in the resource,
     * inclulding the containing scheme itself. Rule: There must be
     * a supportedCodingScheme entry for each local name in the
     * codingScheme object, with the URN set to the coding scheme
     * registered name. 
     */
    private java.util.List<org.LexGrid.naming.SupportedCodingScheme> _supportedCodingSchemeList;

    /**
     * Any concept domain that is referenced in the resource.
     */
    private java.util.List<org.LexGrid.naming.SupportedConceptDomain> _supportedConceptDomainList;

    /**
     * A relations container that appears in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedContainerName> _supportedContainerNameList;

    /**
     * A context referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedContext> _supportedContextList;

    /**
     * A data type referenced by a text element in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedDataType> _supportedDataTypeList;

    /**
     * A degree of fidelity referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedDegreeOfFidelity> _supportedDegreeOfFidelityList;

    /**
     * An entityType referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedEntityType> _supportedEntityTypeList;

    /**
     * Description of hierarchies used in the resource.
     */
    private java.util.List<org.LexGrid.naming.SupportedHierarchy> _supportedHierarchyList;

    /**
     * A language that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedLanguage> _supportedLanguageList;

    /**
     * A namespace that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedNamespace> _supportedNamespaceList;

    /**
     * A property that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedProperty> _supportedPropertyList;

    /**
     * A property type that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedPropertyType> _supportedPropertyTypeList;

    /**
     * A property link that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedPropertyLink> _supportedPropertyLinkList;

    /**
     * A property qualifier that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedPropertyQualifier> _supportedPropertyQualifierList;

    /**
     * A property qualifier type that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedPropertyQualifierType> _supportedPropertyQualifierTypeList;

    /**
     * A representational form that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedRepresentationalForm> _supportedRepresentationalFormList;

    /**
     * A sort order that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedSortOrder> _supportedSortOrderList;

    /**
     * A source that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedSource> _supportedSourceList;

    /**
     * A source role that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedSourceRole> _supportedSourceRoleList;

    /**
     * A status that is referenced in the resource
     */
    private java.util.List<org.LexGrid.naming.SupportedStatus> _supportedStatusList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Mappings() {
        super();
        this._supportedAssociationList = new java.util.ArrayList<org.LexGrid.naming.SupportedAssociation>();
        this._supportedAssociationQualifierList = new java.util.ArrayList<org.LexGrid.naming.SupportedAssociationQualifier>();
        this._supportedCodingSchemeList = new java.util.ArrayList<org.LexGrid.naming.SupportedCodingScheme>();
        this._supportedConceptDomainList = new java.util.ArrayList<org.LexGrid.naming.SupportedConceptDomain>();
        this._supportedContainerNameList = new java.util.ArrayList<org.LexGrid.naming.SupportedContainerName>();
        this._supportedContextList = new java.util.ArrayList<org.LexGrid.naming.SupportedContext>();
        this._supportedDataTypeList = new java.util.ArrayList<org.LexGrid.naming.SupportedDataType>();
        this._supportedDegreeOfFidelityList = new java.util.ArrayList<org.LexGrid.naming.SupportedDegreeOfFidelity>();
        this._supportedEntityTypeList = new java.util.ArrayList<org.LexGrid.naming.SupportedEntityType>();
        this._supportedHierarchyList = new java.util.ArrayList<org.LexGrid.naming.SupportedHierarchy>();
        this._supportedLanguageList = new java.util.ArrayList<org.LexGrid.naming.SupportedLanguage>();
        this._supportedNamespaceList = new java.util.ArrayList<org.LexGrid.naming.SupportedNamespace>();
        this._supportedPropertyList = new java.util.ArrayList<org.LexGrid.naming.SupportedProperty>();
        this._supportedPropertyTypeList = new java.util.ArrayList<org.LexGrid.naming.SupportedPropertyType>();
        this._supportedPropertyLinkList = new java.util.ArrayList<org.LexGrid.naming.SupportedPropertyLink>();
        this._supportedPropertyQualifierList = new java.util.ArrayList<org.LexGrid.naming.SupportedPropertyQualifier>();
        this._supportedPropertyQualifierTypeList = new java.util.ArrayList<org.LexGrid.naming.SupportedPropertyQualifierType>();
        this._supportedRepresentationalFormList = new java.util.ArrayList<org.LexGrid.naming.SupportedRepresentationalForm>();
        this._supportedSortOrderList = new java.util.ArrayList<org.LexGrid.naming.SupportedSortOrder>();
        this._supportedSourceList = new java.util.ArrayList<org.LexGrid.naming.SupportedSource>();
        this._supportedSourceRoleList = new java.util.ArrayList<org.LexGrid.naming.SupportedSourceRole>();
        this._supportedStatusList = new java.util.ArrayList<org.LexGrid.naming.SupportedStatus>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedAssociation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedAssociation(
            final org.LexGrid.naming.SupportedAssociation vSupportedAssociation)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedAssociationList.add(vSupportedAssociation);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedAssociation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedAssociation(
            final int index,
            final org.LexGrid.naming.SupportedAssociation vSupportedAssociation)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedAssociationList.add(index, vSupportedAssociation);
    }

    /**
     * 
     * 
     * @param vSupportedAssociationQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedAssociationQualifier(
            final org.LexGrid.naming.SupportedAssociationQualifier vSupportedAssociationQualifier)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedAssociationQualifierList.add(vSupportedAssociationQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedAssociationQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedAssociationQualifier(
            final int index,
            final org.LexGrid.naming.SupportedAssociationQualifier vSupportedAssociationQualifier)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedAssociationQualifierList.add(index, vSupportedAssociationQualifier);
    }

    /**
     * 
     * 
     * @param vSupportedCodingScheme
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedCodingScheme(
            final org.LexGrid.naming.SupportedCodingScheme vSupportedCodingScheme)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedCodingSchemeList.add(vSupportedCodingScheme);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedCodingScheme
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedCodingScheme(
            final int index,
            final org.LexGrid.naming.SupportedCodingScheme vSupportedCodingScheme)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedCodingSchemeList.add(index, vSupportedCodingScheme);
    }

    /**
     * 
     * 
     * @param vSupportedConceptDomain
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedConceptDomain(
            final org.LexGrid.naming.SupportedConceptDomain vSupportedConceptDomain)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedConceptDomainList.add(vSupportedConceptDomain);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedConceptDomain
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedConceptDomain(
            final int index,
            final org.LexGrid.naming.SupportedConceptDomain vSupportedConceptDomain)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedConceptDomainList.add(index, vSupportedConceptDomain);
    }

    /**
     * 
     * 
     * @param vSupportedContainerName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedContainerName(
            final org.LexGrid.naming.SupportedContainerName vSupportedContainerName)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedContainerNameList.add(vSupportedContainerName);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedContainerName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedContainerName(
            final int index,
            final org.LexGrid.naming.SupportedContainerName vSupportedContainerName)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedContainerNameList.add(index, vSupportedContainerName);
    }

    /**
     * 
     * 
     * @param vSupportedContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedContext(
            final org.LexGrid.naming.SupportedContext vSupportedContext)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedContextList.add(vSupportedContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedContext(
            final int index,
            final org.LexGrid.naming.SupportedContext vSupportedContext)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedContextList.add(index, vSupportedContext);
    }

    /**
     * 
     * 
     * @param vSupportedDataType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedDataType(
            final org.LexGrid.naming.SupportedDataType vSupportedDataType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedDataTypeList.add(vSupportedDataType);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedDataType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedDataType(
            final int index,
            final org.LexGrid.naming.SupportedDataType vSupportedDataType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedDataTypeList.add(index, vSupportedDataType);
    }

    /**
     * 
     * 
     * @param vSupportedDegreeOfFidelity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedDegreeOfFidelity(
            final org.LexGrid.naming.SupportedDegreeOfFidelity vSupportedDegreeOfFidelity)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedDegreeOfFidelityList.add(vSupportedDegreeOfFidelity);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedDegreeOfFidelity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedDegreeOfFidelity(
            final int index,
            final org.LexGrid.naming.SupportedDegreeOfFidelity vSupportedDegreeOfFidelity)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedDegreeOfFidelityList.add(index, vSupportedDegreeOfFidelity);
    }

    /**
     * 
     * 
     * @param vSupportedEntityType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedEntityType(
            final org.LexGrid.naming.SupportedEntityType vSupportedEntityType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedEntityTypeList.add(vSupportedEntityType);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedEntityType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedEntityType(
            final int index,
            final org.LexGrid.naming.SupportedEntityType vSupportedEntityType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedEntityTypeList.add(index, vSupportedEntityType);
    }

    /**
     * 
     * 
     * @param vSupportedHierarchy
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedHierarchy(
            final org.LexGrid.naming.SupportedHierarchy vSupportedHierarchy)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedHierarchyList.add(vSupportedHierarchy);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedHierarchy
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedHierarchy(
            final int index,
            final org.LexGrid.naming.SupportedHierarchy vSupportedHierarchy)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedHierarchyList.add(index, vSupportedHierarchy);
    }

    /**
     * 
     * 
     * @param vSupportedLanguage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedLanguage(
            final org.LexGrid.naming.SupportedLanguage vSupportedLanguage)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedLanguageList.add(vSupportedLanguage);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedLanguage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedLanguage(
            final int index,
            final org.LexGrid.naming.SupportedLanguage vSupportedLanguage)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedLanguageList.add(index, vSupportedLanguage);
    }

    /**
     * 
     * 
     * @param vSupportedNamespace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedNamespace(
            final org.LexGrid.naming.SupportedNamespace vSupportedNamespace)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedNamespaceList.add(vSupportedNamespace);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedNamespace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedNamespace(
            final int index,
            final org.LexGrid.naming.SupportedNamespace vSupportedNamespace)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedNamespaceList.add(index, vSupportedNamespace);
    }

    /**
     * 
     * 
     * @param vSupportedProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedProperty(
            final org.LexGrid.naming.SupportedProperty vSupportedProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyList.add(vSupportedProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedProperty(
            final int index,
            final org.LexGrid.naming.SupportedProperty vSupportedProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyList.add(index, vSupportedProperty);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyLink(
            final org.LexGrid.naming.SupportedPropertyLink vSupportedPropertyLink)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyLinkList.add(vSupportedPropertyLink);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyLink(
            final int index,
            final org.LexGrid.naming.SupportedPropertyLink vSupportedPropertyLink)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyLinkList.add(index, vSupportedPropertyLink);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyQualifier(
            final org.LexGrid.naming.SupportedPropertyQualifier vSupportedPropertyQualifier)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyQualifierList.add(vSupportedPropertyQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyQualifier(
            final int index,
            final org.LexGrid.naming.SupportedPropertyQualifier vSupportedPropertyQualifier)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyQualifierList.add(index, vSupportedPropertyQualifier);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyQualifierType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyQualifierType(
            final org.LexGrid.naming.SupportedPropertyQualifierType vSupportedPropertyQualifierType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyQualifierTypeList.add(vSupportedPropertyQualifierType);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyQualifierType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyQualifierType(
            final int index,
            final org.LexGrid.naming.SupportedPropertyQualifierType vSupportedPropertyQualifierType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyQualifierTypeList.add(index, vSupportedPropertyQualifierType);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyType(
            final org.LexGrid.naming.SupportedPropertyType vSupportedPropertyType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyTypeList.add(vSupportedPropertyType);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedPropertyType(
            final int index,
            final org.LexGrid.naming.SupportedPropertyType vSupportedPropertyType)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedPropertyTypeList.add(index, vSupportedPropertyType);
    }

    /**
     * 
     * 
     * @param vSupportedRepresentationalForm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedRepresentationalForm(
            final org.LexGrid.naming.SupportedRepresentationalForm vSupportedRepresentationalForm)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedRepresentationalFormList.add(vSupportedRepresentationalForm);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedRepresentationalForm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedRepresentationalForm(
            final int index,
            final org.LexGrid.naming.SupportedRepresentationalForm vSupportedRepresentationalForm)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedRepresentationalFormList.add(index, vSupportedRepresentationalForm);
    }

    /**
     * 
     * 
     * @param vSupportedSortOrder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSortOrder(
            final org.LexGrid.naming.SupportedSortOrder vSupportedSortOrder)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedSortOrderList.add(vSupportedSortOrder);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSortOrder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSortOrder(
            final int index,
            final org.LexGrid.naming.SupportedSortOrder vSupportedSortOrder)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedSortOrderList.add(index, vSupportedSortOrder);
    }

    /**
     * 
     * 
     * @param vSupportedSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSource(
            final org.LexGrid.naming.SupportedSource vSupportedSource)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedSourceList.add(vSupportedSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSource(
            final int index,
            final org.LexGrid.naming.SupportedSource vSupportedSource)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedSourceList.add(index, vSupportedSource);
    }

    /**
     * 
     * 
     * @param vSupportedSourceRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSourceRole(
            final org.LexGrid.naming.SupportedSourceRole vSupportedSourceRole)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedSourceRoleList.add(vSupportedSourceRole);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSourceRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSourceRole(
            final int index,
            final org.LexGrid.naming.SupportedSourceRole vSupportedSourceRole)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedSourceRoleList.add(index, vSupportedSourceRole);
    }

    /**
     * 
     * 
     * @param vSupportedStatus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedStatus(
            final org.LexGrid.naming.SupportedStatus vSupportedStatus)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedStatusList.add(vSupportedStatus);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedStatus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedStatus(
            final int index,
            final org.LexGrid.naming.SupportedStatus vSupportedStatus)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedStatusList.add(index, vSupportedStatus);
    }

    /**
     * Method enumerateSupportedAssociation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedAssociation> enumerateSupportedAssociation(
    ) {
        return java.util.Collections.enumeration(this._supportedAssociationList);
    }

    /**
     * Method enumerateSupportedAssociationQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedAssociationQualifier> enumerateSupportedAssociationQualifier(
    ) {
        return java.util.Collections.enumeration(this._supportedAssociationQualifierList);
    }

    /**
     * Method enumerateSupportedCodingScheme.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedCodingScheme> enumerateSupportedCodingScheme(
    ) {
        return java.util.Collections.enumeration(this._supportedCodingSchemeList);
    }

    /**
     * Method enumerateSupportedConceptDomain.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedConceptDomain> enumerateSupportedConceptDomain(
    ) {
        return java.util.Collections.enumeration(this._supportedConceptDomainList);
    }

    /**
     * Method enumerateSupportedContainerName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedContainerName> enumerateSupportedContainerName(
    ) {
        return java.util.Collections.enumeration(this._supportedContainerNameList);
    }

    /**
     * Method enumerateSupportedContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedContext> enumerateSupportedContext(
    ) {
        return java.util.Collections.enumeration(this._supportedContextList);
    }

    /**
     * Method enumerateSupportedDataType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedDataType> enumerateSupportedDataType(
    ) {
        return java.util.Collections.enumeration(this._supportedDataTypeList);
    }

    /**
     * Method enumerateSupportedDegreeOfFidelity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedDegreeOfFidelity> enumerateSupportedDegreeOfFidelity(
    ) {
        return java.util.Collections.enumeration(this._supportedDegreeOfFidelityList);
    }

    /**
     * Method enumerateSupportedEntityType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedEntityType> enumerateSupportedEntityType(
    ) {
        return java.util.Collections.enumeration(this._supportedEntityTypeList);
    }

    /**
     * Method enumerateSupportedHierarchy.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedHierarchy> enumerateSupportedHierarchy(
    ) {
        return java.util.Collections.enumeration(this._supportedHierarchyList);
    }

    /**
     * Method enumerateSupportedLanguage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedLanguage> enumerateSupportedLanguage(
    ) {
        return java.util.Collections.enumeration(this._supportedLanguageList);
    }

    /**
     * Method enumerateSupportedNamespace.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedNamespace> enumerateSupportedNamespace(
    ) {
        return java.util.Collections.enumeration(this._supportedNamespaceList);
    }

    /**
     * Method enumerateSupportedProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedProperty> enumerateSupportedProperty(
    ) {
        return java.util.Collections.enumeration(this._supportedPropertyList);
    }

    /**
     * Method enumerateSupportedPropertyLink.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedPropertyLink> enumerateSupportedPropertyLink(
    ) {
        return java.util.Collections.enumeration(this._supportedPropertyLinkList);
    }

    /**
     * Method enumerateSupportedPropertyQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedPropertyQualifier> enumerateSupportedPropertyQualifier(
    ) {
        return java.util.Collections.enumeration(this._supportedPropertyQualifierList);
    }

    /**
     * Method enumerateSupportedPropertyQualifierType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedPropertyQualifierType> enumerateSupportedPropertyQualifierType(
    ) {
        return java.util.Collections.enumeration(this._supportedPropertyQualifierTypeList);
    }

    /**
     * Method enumerateSupportedPropertyType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedPropertyType> enumerateSupportedPropertyType(
    ) {
        return java.util.Collections.enumeration(this._supportedPropertyTypeList);
    }

    /**
     * Method enumerateSupportedRepresentationalForm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedRepresentationalForm> enumerateSupportedRepresentationalForm(
    ) {
        return java.util.Collections.enumeration(this._supportedRepresentationalFormList);
    }

    /**
     * Method enumerateSupportedSortOrder.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedSortOrder> enumerateSupportedSortOrder(
    ) {
        return java.util.Collections.enumeration(this._supportedSortOrderList);
    }

    /**
     * Method enumerateSupportedSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedSource> enumerateSupportedSource(
    ) {
        return java.util.Collections.enumeration(this._supportedSourceList);
    }

    /**
     * Method enumerateSupportedSourceRole.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedSourceRole> enumerateSupportedSourceRole(
    ) {
        return java.util.Collections.enumeration(this._supportedSourceRoleList);
    }

    /**
     * Method enumerateSupportedStatus.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.naming.SupportedStatus> enumerateSupportedStatus(
    ) {
        return java.util.Collections.enumeration(this._supportedStatusList);
    }

    /**
     * Method getSupportedAssociation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedAssociation at the given index
     */
    public org.LexGrid.naming.SupportedAssociation getSupportedAssociation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedAssociationList.size()) {
            throw new IndexOutOfBoundsException("getSupportedAssociation: Index value '" + index + "' not in range [0.." + (this._supportedAssociationList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedAssociation) _supportedAssociationList.get(index);
    }

    /**
     * Method getSupportedAssociation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedAssociation[] getSupportedAssociation(
    ) {
        org.LexGrid.naming.SupportedAssociation[] array = new org.LexGrid.naming.SupportedAssociation[0];
        return (org.LexGrid.naming.SupportedAssociation[]) this._supportedAssociationList.toArray(array);
    }

    /**
     * Method getSupportedAssociationAsReference.Returns a
     * reference to '_supportedAssociationList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedAssociation> getSupportedAssociationAsReference(
    ) {
        return this._supportedAssociationList;
    }

    /**
     * Method getSupportedAssociationCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedAssociationCount(
    ) {
        return this._supportedAssociationList.size();
    }

    /**
     * Method getSupportedAssociationQualifier.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedAssociationQualifier at the
     * given index
     */
    public org.LexGrid.naming.SupportedAssociationQualifier getSupportedAssociationQualifier(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedAssociationQualifierList.size()) {
            throw new IndexOutOfBoundsException("getSupportedAssociationQualifier: Index value '" + index + "' not in range [0.." + (this._supportedAssociationQualifierList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedAssociationQualifier) _supportedAssociationQualifierList.get(index);
    }

    /**
     * Method getSupportedAssociationQualifier.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedAssociationQualifier[] getSupportedAssociationQualifier(
    ) {
        org.LexGrid.naming.SupportedAssociationQualifier[] array = new org.LexGrid.naming.SupportedAssociationQualifier[0];
        return (org.LexGrid.naming.SupportedAssociationQualifier[]) this._supportedAssociationQualifierList.toArray(array);
    }

    /**
     * Method getSupportedAssociationQualifierAsReference.Returns a
     * reference to '_supportedAssociationQualifierList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedAssociationQualifier> getSupportedAssociationQualifierAsReference(
    ) {
        return this._supportedAssociationQualifierList;
    }

    /**
     * Method getSupportedAssociationQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedAssociationQualifierCount(
    ) {
        return this._supportedAssociationQualifierList.size();
    }

    /**
     * Method getSupportedCodingScheme.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedCodingScheme at the given index
     */
    public org.LexGrid.naming.SupportedCodingScheme getSupportedCodingScheme(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedCodingSchemeList.size()) {
            throw new IndexOutOfBoundsException("getSupportedCodingScheme: Index value '" + index + "' not in range [0.." + (this._supportedCodingSchemeList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedCodingScheme) _supportedCodingSchemeList.get(index);
    }

    /**
     * Method getSupportedCodingScheme.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedCodingScheme[] getSupportedCodingScheme(
    ) {
        org.LexGrid.naming.SupportedCodingScheme[] array = new org.LexGrid.naming.SupportedCodingScheme[0];
        return (org.LexGrid.naming.SupportedCodingScheme[]) this._supportedCodingSchemeList.toArray(array);
    }

    /**
     * Method getSupportedCodingSchemeAsReference.Returns a
     * reference to '_supportedCodingSchemeList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedCodingScheme> getSupportedCodingSchemeAsReference(
    ) {
        return this._supportedCodingSchemeList;
    }

    /**
     * Method getSupportedCodingSchemeCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedCodingSchemeCount(
    ) {
        return this._supportedCodingSchemeList.size();
    }

    /**
     * Method getSupportedConceptDomain.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedConceptDomain at the given index
     */
    public org.LexGrid.naming.SupportedConceptDomain getSupportedConceptDomain(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedConceptDomainList.size()) {
            throw new IndexOutOfBoundsException("getSupportedConceptDomain: Index value '" + index + "' not in range [0.." + (this._supportedConceptDomainList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedConceptDomain) _supportedConceptDomainList.get(index);
    }

    /**
     * Method getSupportedConceptDomain.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedConceptDomain[] getSupportedConceptDomain(
    ) {
        org.LexGrid.naming.SupportedConceptDomain[] array = new org.LexGrid.naming.SupportedConceptDomain[0];
        return (org.LexGrid.naming.SupportedConceptDomain[]) this._supportedConceptDomainList.toArray(array);
    }

    /**
     * Method getSupportedConceptDomainAsReference.Returns a
     * reference to '_supportedConceptDomainList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedConceptDomain> getSupportedConceptDomainAsReference(
    ) {
        return this._supportedConceptDomainList;
    }

    /**
     * Method getSupportedConceptDomainCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedConceptDomainCount(
    ) {
        return this._supportedConceptDomainList.size();
    }

    /**
     * Method getSupportedContainerName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedContainerName at the given index
     */
    public org.LexGrid.naming.SupportedContainerName getSupportedContainerName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedContainerNameList.size()) {
            throw new IndexOutOfBoundsException("getSupportedContainerName: Index value '" + index + "' not in range [0.." + (this._supportedContainerNameList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedContainerName) _supportedContainerNameList.get(index);
    }

    /**
     * Method getSupportedContainerName.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedContainerName[] getSupportedContainerName(
    ) {
        org.LexGrid.naming.SupportedContainerName[] array = new org.LexGrid.naming.SupportedContainerName[0];
        return (org.LexGrid.naming.SupportedContainerName[]) this._supportedContainerNameList.toArray(array);
    }

    /**
     * Method getSupportedContainerNameAsReference.Returns a
     * reference to '_supportedContainerNameList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedContainerName> getSupportedContainerNameAsReference(
    ) {
        return this._supportedContainerNameList;
    }

    /**
     * Method getSupportedContainerNameCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedContainerNameCount(
    ) {
        return this._supportedContainerNameList.size();
    }

    /**
     * Method getSupportedContext.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.naming.SupportedContext
     * at the given index
     */
    public org.LexGrid.naming.SupportedContext getSupportedContext(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedContextList.size()) {
            throw new IndexOutOfBoundsException("getSupportedContext: Index value '" + index + "' not in range [0.." + (this._supportedContextList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedContext) _supportedContextList.get(index);
    }

    /**
     * Method getSupportedContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedContext[] getSupportedContext(
    ) {
        org.LexGrid.naming.SupportedContext[] array = new org.LexGrid.naming.SupportedContext[0];
        return (org.LexGrid.naming.SupportedContext[]) this._supportedContextList.toArray(array);
    }

    /**
     * Method getSupportedContextAsReference.Returns a reference to
     * '_supportedContextList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedContext> getSupportedContextAsReference(
    ) {
        return this._supportedContextList;
    }

    /**
     * Method getSupportedContextCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedContextCount(
    ) {
        return this._supportedContextList.size();
    }

    /**
     * Method getSupportedDataType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedDataType at the given index
     */
    public org.LexGrid.naming.SupportedDataType getSupportedDataType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedDataTypeList.size()) {
            throw new IndexOutOfBoundsException("getSupportedDataType: Index value '" + index + "' not in range [0.." + (this._supportedDataTypeList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedDataType) _supportedDataTypeList.get(index);
    }

    /**
     * Method getSupportedDataType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedDataType[] getSupportedDataType(
    ) {
        org.LexGrid.naming.SupportedDataType[] array = new org.LexGrid.naming.SupportedDataType[0];
        return (org.LexGrid.naming.SupportedDataType[]) this._supportedDataTypeList.toArray(array);
    }

    /**
     * Method getSupportedDataTypeAsReference.Returns a reference
     * to '_supportedDataTypeList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedDataType> getSupportedDataTypeAsReference(
    ) {
        return this._supportedDataTypeList;
    }

    /**
     * Method getSupportedDataTypeCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedDataTypeCount(
    ) {
        return this._supportedDataTypeList.size();
    }

    /**
     * Method getSupportedDegreeOfFidelity.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedDegreeOfFidelity at the given
     * index
     */
    public org.LexGrid.naming.SupportedDegreeOfFidelity getSupportedDegreeOfFidelity(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedDegreeOfFidelityList.size()) {
            throw new IndexOutOfBoundsException("getSupportedDegreeOfFidelity: Index value '" + index + "' not in range [0.." + (this._supportedDegreeOfFidelityList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedDegreeOfFidelity) _supportedDegreeOfFidelityList.get(index);
    }

    /**
     * Method getSupportedDegreeOfFidelity.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedDegreeOfFidelity[] getSupportedDegreeOfFidelity(
    ) {
        org.LexGrid.naming.SupportedDegreeOfFidelity[] array = new org.LexGrid.naming.SupportedDegreeOfFidelity[0];
        return (org.LexGrid.naming.SupportedDegreeOfFidelity[]) this._supportedDegreeOfFidelityList.toArray(array);
    }

    /**
     * Method getSupportedDegreeOfFidelityAsReference.Returns a
     * reference to '_supportedDegreeOfFidelityList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedDegreeOfFidelity> getSupportedDegreeOfFidelityAsReference(
    ) {
        return this._supportedDegreeOfFidelityList;
    }

    /**
     * Method getSupportedDegreeOfFidelityCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedDegreeOfFidelityCount(
    ) {
        return this._supportedDegreeOfFidelityList.size();
    }

    /**
     * Method getSupportedEntityType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedEntityType at the given index
     */
    public org.LexGrid.naming.SupportedEntityType getSupportedEntityType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedEntityTypeList.size()) {
            throw new IndexOutOfBoundsException("getSupportedEntityType: Index value '" + index + "' not in range [0.." + (this._supportedEntityTypeList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedEntityType) _supportedEntityTypeList.get(index);
    }

    /**
     * Method getSupportedEntityType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedEntityType[] getSupportedEntityType(
    ) {
        org.LexGrid.naming.SupportedEntityType[] array = new org.LexGrid.naming.SupportedEntityType[0];
        return (org.LexGrid.naming.SupportedEntityType[]) this._supportedEntityTypeList.toArray(array);
    }

    /**
     * Method getSupportedEntityTypeAsReference.Returns a reference
     * to '_supportedEntityTypeList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedEntityType> getSupportedEntityTypeAsReference(
    ) {
        return this._supportedEntityTypeList;
    }

    /**
     * Method getSupportedEntityTypeCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedEntityTypeCount(
    ) {
        return this._supportedEntityTypeList.size();
    }

    /**
     * Method getSupportedHierarchy.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedHierarchy at the given index
     */
    public org.LexGrid.naming.SupportedHierarchy getSupportedHierarchy(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedHierarchyList.size()) {
            throw new IndexOutOfBoundsException("getSupportedHierarchy: Index value '" + index + "' not in range [0.." + (this._supportedHierarchyList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedHierarchy) _supportedHierarchyList.get(index);
    }

    /**
     * Method getSupportedHierarchy.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedHierarchy[] getSupportedHierarchy(
    ) {
        org.LexGrid.naming.SupportedHierarchy[] array = new org.LexGrid.naming.SupportedHierarchy[0];
        return (org.LexGrid.naming.SupportedHierarchy[]) this._supportedHierarchyList.toArray(array);
    }

    /**
     * Method getSupportedHierarchyAsReference.Returns a reference
     * to '_supportedHierarchyList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedHierarchy> getSupportedHierarchyAsReference(
    ) {
        return this._supportedHierarchyList;
    }

    /**
     * Method getSupportedHierarchyCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedHierarchyCount(
    ) {
        return this._supportedHierarchyList.size();
    }

    /**
     * Method getSupportedLanguage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedLanguage at the given index
     */
    public org.LexGrid.naming.SupportedLanguage getSupportedLanguage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedLanguageList.size()) {
            throw new IndexOutOfBoundsException("getSupportedLanguage: Index value '" + index + "' not in range [0.." + (this._supportedLanguageList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedLanguage) _supportedLanguageList.get(index);
    }

    /**
     * Method getSupportedLanguage.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedLanguage[] getSupportedLanguage(
    ) {
        org.LexGrid.naming.SupportedLanguage[] array = new org.LexGrid.naming.SupportedLanguage[0];
        return (org.LexGrid.naming.SupportedLanguage[]) this._supportedLanguageList.toArray(array);
    }

    /**
     * Method getSupportedLanguageAsReference.Returns a reference
     * to '_supportedLanguageList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedLanguage> getSupportedLanguageAsReference(
    ) {
        return this._supportedLanguageList;
    }

    /**
     * Method getSupportedLanguageCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedLanguageCount(
    ) {
        return this._supportedLanguageList.size();
    }

    /**
     * Method getSupportedNamespace.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedNamespace at the given index
     */
    public org.LexGrid.naming.SupportedNamespace getSupportedNamespace(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedNamespaceList.size()) {
            throw new IndexOutOfBoundsException("getSupportedNamespace: Index value '" + index + "' not in range [0.." + (this._supportedNamespaceList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedNamespace) _supportedNamespaceList.get(index);
    }

    /**
     * Method getSupportedNamespace.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedNamespace[] getSupportedNamespace(
    ) {
        org.LexGrid.naming.SupportedNamespace[] array = new org.LexGrid.naming.SupportedNamespace[0];
        return (org.LexGrid.naming.SupportedNamespace[]) this._supportedNamespaceList.toArray(array);
    }

    /**
     * Method getSupportedNamespaceAsReference.Returns a reference
     * to '_supportedNamespaceList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedNamespace> getSupportedNamespaceAsReference(
    ) {
        return this._supportedNamespaceList;
    }

    /**
     * Method getSupportedNamespaceCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedNamespaceCount(
    ) {
        return this._supportedNamespaceList.size();
    }

    /**
     * Method getSupportedProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedProperty at the given index
     */
    public org.LexGrid.naming.SupportedProperty getSupportedProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyList.size()) {
            throw new IndexOutOfBoundsException("getSupportedProperty: Index value '" + index + "' not in range [0.." + (this._supportedPropertyList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedProperty) _supportedPropertyList.get(index);
    }

    /**
     * Method getSupportedProperty.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedProperty[] getSupportedProperty(
    ) {
        org.LexGrid.naming.SupportedProperty[] array = new org.LexGrid.naming.SupportedProperty[0];
        return (org.LexGrid.naming.SupportedProperty[]) this._supportedPropertyList.toArray(array);
    }

    /**
     * Method getSupportedPropertyAsReference.Returns a reference
     * to '_supportedPropertyList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedProperty> getSupportedPropertyAsReference(
    ) {
        return this._supportedPropertyList;
    }

    /**
     * Method getSupportedPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedPropertyCount(
    ) {
        return this._supportedPropertyList.size();
    }

    /**
     * Method getSupportedPropertyLink.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedPropertyLink at the given index
     */
    public org.LexGrid.naming.SupportedPropertyLink getSupportedPropertyLink(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyLinkList.size()) {
            throw new IndexOutOfBoundsException("getSupportedPropertyLink: Index value '" + index + "' not in range [0.." + (this._supportedPropertyLinkList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedPropertyLink) _supportedPropertyLinkList.get(index);
    }

    /**
     * Method getSupportedPropertyLink.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedPropertyLink[] getSupportedPropertyLink(
    ) {
        org.LexGrid.naming.SupportedPropertyLink[] array = new org.LexGrid.naming.SupportedPropertyLink[0];
        return (org.LexGrid.naming.SupportedPropertyLink[]) this._supportedPropertyLinkList.toArray(array);
    }

    /**
     * Method getSupportedPropertyLinkAsReference.Returns a
     * reference to '_supportedPropertyLinkList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedPropertyLink> getSupportedPropertyLinkAsReference(
    ) {
        return this._supportedPropertyLinkList;
    }

    /**
     * Method getSupportedPropertyLinkCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedPropertyLinkCount(
    ) {
        return this._supportedPropertyLinkList.size();
    }

    /**
     * Method getSupportedPropertyQualifier.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedPropertyQualifier at the given
     * index
     */
    public org.LexGrid.naming.SupportedPropertyQualifier getSupportedPropertyQualifier(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyQualifierList.size()) {
            throw new IndexOutOfBoundsException("getSupportedPropertyQualifier: Index value '" + index + "' not in range [0.." + (this._supportedPropertyQualifierList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedPropertyQualifier) _supportedPropertyQualifierList.get(index);
    }

    /**
     * Method getSupportedPropertyQualifier.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedPropertyQualifier[] getSupportedPropertyQualifier(
    ) {
        org.LexGrid.naming.SupportedPropertyQualifier[] array = new org.LexGrid.naming.SupportedPropertyQualifier[0];
        return (org.LexGrid.naming.SupportedPropertyQualifier[]) this._supportedPropertyQualifierList.toArray(array);
    }

    /**
     * Method getSupportedPropertyQualifierAsReference.Returns a
     * reference to '_supportedPropertyQualifierList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedPropertyQualifier> getSupportedPropertyQualifierAsReference(
    ) {
        return this._supportedPropertyQualifierList;
    }

    /**
     * Method getSupportedPropertyQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedPropertyQualifierCount(
    ) {
        return this._supportedPropertyQualifierList.size();
    }

    /**
     * Method getSupportedPropertyQualifierType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedPropertyQualifierType at the
     * given index
     */
    public org.LexGrid.naming.SupportedPropertyQualifierType getSupportedPropertyQualifierType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyQualifierTypeList.size()) {
            throw new IndexOutOfBoundsException("getSupportedPropertyQualifierType: Index value '" + index + "' not in range [0.." + (this._supportedPropertyQualifierTypeList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedPropertyQualifierType) _supportedPropertyQualifierTypeList.get(index);
    }

    /**
     * Method getSupportedPropertyQualifierType.Returns the
     * contents of the collection in an Array.  <p>Note:  Just in
     * case the collection contents are changing in another thread,
     * we pass a 0-length Array of the correct type into the API
     * call.  This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedPropertyQualifierType[] getSupportedPropertyQualifierType(
    ) {
        org.LexGrid.naming.SupportedPropertyQualifierType[] array = new org.LexGrid.naming.SupportedPropertyQualifierType[0];
        return (org.LexGrid.naming.SupportedPropertyQualifierType[]) this._supportedPropertyQualifierTypeList.toArray(array);
    }

    /**
     * Method getSupportedPropertyQualifierTypeAsReference.Returns
     * a reference to '_supportedPropertyQualifierTypeList'. No
     * type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedPropertyQualifierType> getSupportedPropertyQualifierTypeAsReference(
    ) {
        return this._supportedPropertyQualifierTypeList;
    }

    /**
     * Method getSupportedPropertyQualifierTypeCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedPropertyQualifierTypeCount(
    ) {
        return this._supportedPropertyQualifierTypeList.size();
    }

    /**
     * Method getSupportedPropertyType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedPropertyType at the given index
     */
    public org.LexGrid.naming.SupportedPropertyType getSupportedPropertyType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyTypeList.size()) {
            throw new IndexOutOfBoundsException("getSupportedPropertyType: Index value '" + index + "' not in range [0.." + (this._supportedPropertyTypeList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedPropertyType) _supportedPropertyTypeList.get(index);
    }

    /**
     * Method getSupportedPropertyType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedPropertyType[] getSupportedPropertyType(
    ) {
        org.LexGrid.naming.SupportedPropertyType[] array = new org.LexGrid.naming.SupportedPropertyType[0];
        return (org.LexGrid.naming.SupportedPropertyType[]) this._supportedPropertyTypeList.toArray(array);
    }

    /**
     * Method getSupportedPropertyTypeAsReference.Returns a
     * reference to '_supportedPropertyTypeList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedPropertyType> getSupportedPropertyTypeAsReference(
    ) {
        return this._supportedPropertyTypeList;
    }

    /**
     * Method getSupportedPropertyTypeCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedPropertyTypeCount(
    ) {
        return this._supportedPropertyTypeList.size();
    }

    /**
     * Method getSupportedRepresentationalForm.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedRepresentationalForm at the
     * given index
     */
    public org.LexGrid.naming.SupportedRepresentationalForm getSupportedRepresentationalForm(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedRepresentationalFormList.size()) {
            throw new IndexOutOfBoundsException("getSupportedRepresentationalForm: Index value '" + index + "' not in range [0.." + (this._supportedRepresentationalFormList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedRepresentationalForm) _supportedRepresentationalFormList.get(index);
    }

    /**
     * Method getSupportedRepresentationalForm.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedRepresentationalForm[] getSupportedRepresentationalForm(
    ) {
        org.LexGrid.naming.SupportedRepresentationalForm[] array = new org.LexGrid.naming.SupportedRepresentationalForm[0];
        return (org.LexGrid.naming.SupportedRepresentationalForm[]) this._supportedRepresentationalFormList.toArray(array);
    }

    /**
     * Method getSupportedRepresentationalFormAsReference.Returns a
     * reference to '_supportedRepresentationalFormList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedRepresentationalForm> getSupportedRepresentationalFormAsReference(
    ) {
        return this._supportedRepresentationalFormList;
    }

    /**
     * Method getSupportedRepresentationalFormCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedRepresentationalFormCount(
    ) {
        return this._supportedRepresentationalFormList.size();
    }

    /**
     * Method getSupportedSortOrder.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedSortOrder at the given index
     */
    public org.LexGrid.naming.SupportedSortOrder getSupportedSortOrder(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSortOrderList.size()) {
            throw new IndexOutOfBoundsException("getSupportedSortOrder: Index value '" + index + "' not in range [0.." + (this._supportedSortOrderList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedSortOrder) _supportedSortOrderList.get(index);
    }

    /**
     * Method getSupportedSortOrder.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedSortOrder[] getSupportedSortOrder(
    ) {
        org.LexGrid.naming.SupportedSortOrder[] array = new org.LexGrid.naming.SupportedSortOrder[0];
        return (org.LexGrid.naming.SupportedSortOrder[]) this._supportedSortOrderList.toArray(array);
    }

    /**
     * Method getSupportedSortOrderAsReference.Returns a reference
     * to '_supportedSortOrderList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedSortOrder> getSupportedSortOrderAsReference(
    ) {
        return this._supportedSortOrderList;
    }

    /**
     * Method getSupportedSortOrderCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedSortOrderCount(
    ) {
        return this._supportedSortOrderList.size();
    }

    /**
     * Method getSupportedSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.naming.SupportedSource
     * at the given index
     */
    public org.LexGrid.naming.SupportedSource getSupportedSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceList.size()) {
            throw new IndexOutOfBoundsException("getSupportedSource: Index value '" + index + "' not in range [0.." + (this._supportedSourceList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedSource) _supportedSourceList.get(index);
    }

    /**
     * Method getSupportedSource.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedSource[] getSupportedSource(
    ) {
        org.LexGrid.naming.SupportedSource[] array = new org.LexGrid.naming.SupportedSource[0];
        return (org.LexGrid.naming.SupportedSource[]) this._supportedSourceList.toArray(array);
    }

    /**
     * Method getSupportedSourceAsReference.Returns a reference to
     * '_supportedSourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedSource> getSupportedSourceAsReference(
    ) {
        return this._supportedSourceList;
    }

    /**
     * Method getSupportedSourceCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedSourceCount(
    ) {
        return this._supportedSourceList.size();
    }

    /**
     * Method getSupportedSourceRole.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.naming.SupportedSourceRole at the given index
     */
    public org.LexGrid.naming.SupportedSourceRole getSupportedSourceRole(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceRoleList.size()) {
            throw new IndexOutOfBoundsException("getSupportedSourceRole: Index value '" + index + "' not in range [0.." + (this._supportedSourceRoleList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedSourceRole) _supportedSourceRoleList.get(index);
    }

    /**
     * Method getSupportedSourceRole.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedSourceRole[] getSupportedSourceRole(
    ) {
        org.LexGrid.naming.SupportedSourceRole[] array = new org.LexGrid.naming.SupportedSourceRole[0];
        return (org.LexGrid.naming.SupportedSourceRole[]) this._supportedSourceRoleList.toArray(array);
    }

    /**
     * Method getSupportedSourceRoleAsReference.Returns a reference
     * to '_supportedSourceRoleList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedSourceRole> getSupportedSourceRoleAsReference(
    ) {
        return this._supportedSourceRoleList;
    }

    /**
     * Method getSupportedSourceRoleCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedSourceRoleCount(
    ) {
        return this._supportedSourceRoleList.size();
    }

    /**
     * Method getSupportedStatus.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.LexGrid.naming.SupportedStatus
     * at the given index
     */
    public org.LexGrid.naming.SupportedStatus getSupportedStatus(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedStatusList.size()) {
            throw new IndexOutOfBoundsException("getSupportedStatus: Index value '" + index + "' not in range [0.." + (this._supportedStatusList.size() - 1) + "]");
        }

        return (org.LexGrid.naming.SupportedStatus) _supportedStatusList.get(index);
    }

    /**
     * Method getSupportedStatus.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.naming.SupportedStatus[] getSupportedStatus(
    ) {
        org.LexGrid.naming.SupportedStatus[] array = new org.LexGrid.naming.SupportedStatus[0];
        return (org.LexGrid.naming.SupportedStatus[]) this._supportedStatusList.toArray(array);
    }

    /**
     * Method getSupportedStatusAsReference.Returns a reference to
     * '_supportedStatusList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.LexGrid.naming.SupportedStatus> getSupportedStatusAsReference(
    ) {
        return this._supportedStatusList;
    }

    /**
     * Method getSupportedStatusCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedStatusCount(
    ) {
        return this._supportedStatusList.size();
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
     * Method iterateSupportedAssociation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedAssociation> iterateSupportedAssociation(
    ) {
        return this._supportedAssociationList.iterator();
    }

    /**
     * Method iterateSupportedAssociationQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedAssociationQualifier> iterateSupportedAssociationQualifier(
    ) {
        return this._supportedAssociationQualifierList.iterator();
    }

    /**
     * Method iterateSupportedCodingScheme.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedCodingScheme> iterateSupportedCodingScheme(
    ) {
        return this._supportedCodingSchemeList.iterator();
    }

    /**
     * Method iterateSupportedConceptDomain.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedConceptDomain> iterateSupportedConceptDomain(
    ) {
        return this._supportedConceptDomainList.iterator();
    }

    /**
     * Method iterateSupportedContainerName.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedContainerName> iterateSupportedContainerName(
    ) {
        return this._supportedContainerNameList.iterator();
    }

    /**
     * Method iterateSupportedContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedContext> iterateSupportedContext(
    ) {
        return this._supportedContextList.iterator();
    }

    /**
     * Method iterateSupportedDataType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedDataType> iterateSupportedDataType(
    ) {
        return this._supportedDataTypeList.iterator();
    }

    /**
     * Method iterateSupportedDegreeOfFidelity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedDegreeOfFidelity> iterateSupportedDegreeOfFidelity(
    ) {
        return this._supportedDegreeOfFidelityList.iterator();
    }

    /**
     * Method iterateSupportedEntityType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedEntityType> iterateSupportedEntityType(
    ) {
        return this._supportedEntityTypeList.iterator();
    }

    /**
     * Method iterateSupportedHierarchy.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedHierarchy> iterateSupportedHierarchy(
    ) {
        return this._supportedHierarchyList.iterator();
    }

    /**
     * Method iterateSupportedLanguage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedLanguage> iterateSupportedLanguage(
    ) {
        return this._supportedLanguageList.iterator();
    }

    /**
     * Method iterateSupportedNamespace.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedNamespace> iterateSupportedNamespace(
    ) {
        return this._supportedNamespaceList.iterator();
    }

    /**
     * Method iterateSupportedProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedProperty> iterateSupportedProperty(
    ) {
        return this._supportedPropertyList.iterator();
    }

    /**
     * Method iterateSupportedPropertyLink.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedPropertyLink> iterateSupportedPropertyLink(
    ) {
        return this._supportedPropertyLinkList.iterator();
    }

    /**
     * Method iterateSupportedPropertyQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedPropertyQualifier> iterateSupportedPropertyQualifier(
    ) {
        return this._supportedPropertyQualifierList.iterator();
    }

    /**
     * Method iterateSupportedPropertyQualifierType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedPropertyQualifierType> iterateSupportedPropertyQualifierType(
    ) {
        return this._supportedPropertyQualifierTypeList.iterator();
    }

    /**
     * Method iterateSupportedPropertyType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedPropertyType> iterateSupportedPropertyType(
    ) {
        return this._supportedPropertyTypeList.iterator();
    }

    /**
     * Method iterateSupportedRepresentationalForm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedRepresentationalForm> iterateSupportedRepresentationalForm(
    ) {
        return this._supportedRepresentationalFormList.iterator();
    }

    /**
     * Method iterateSupportedSortOrder.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedSortOrder> iterateSupportedSortOrder(
    ) {
        return this._supportedSortOrderList.iterator();
    }

    /**
     * Method iterateSupportedSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedSource> iterateSupportedSource(
    ) {
        return this._supportedSourceList.iterator();
    }

    /**
     * Method iterateSupportedSourceRole.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedSourceRole> iterateSupportedSourceRole(
    ) {
        return this._supportedSourceRoleList.iterator();
    }

    /**
     * Method iterateSupportedStatus.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.naming.SupportedStatus> iterateSupportedStatus(
    ) {
        return this._supportedStatusList.iterator();
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
    public void removeAllSupportedAssociation(
    ) {
        this._supportedAssociationList.clear();
    }

    /**
     */
    public void removeAllSupportedAssociationQualifier(
    ) {
        this._supportedAssociationQualifierList.clear();
    }

    /**
     */
    public void removeAllSupportedCodingScheme(
    ) {
        this._supportedCodingSchemeList.clear();
    }

    /**
     */
    public void removeAllSupportedConceptDomain(
    ) {
        this._supportedConceptDomainList.clear();
    }

    /**
     */
    public void removeAllSupportedContainerName(
    ) {
        this._supportedContainerNameList.clear();
    }

    /**
     */
    public void removeAllSupportedContext(
    ) {
        this._supportedContextList.clear();
    }

    /**
     */
    public void removeAllSupportedDataType(
    ) {
        this._supportedDataTypeList.clear();
    }

    /**
     */
    public void removeAllSupportedDegreeOfFidelity(
    ) {
        this._supportedDegreeOfFidelityList.clear();
    }

    /**
     */
    public void removeAllSupportedEntityType(
    ) {
        this._supportedEntityTypeList.clear();
    }

    /**
     */
    public void removeAllSupportedHierarchy(
    ) {
        this._supportedHierarchyList.clear();
    }

    /**
     */
    public void removeAllSupportedLanguage(
    ) {
        this._supportedLanguageList.clear();
    }

    /**
     */
    public void removeAllSupportedNamespace(
    ) {
        this._supportedNamespaceList.clear();
    }

    /**
     */
    public void removeAllSupportedProperty(
    ) {
        this._supportedPropertyList.clear();
    }

    /**
     */
    public void removeAllSupportedPropertyLink(
    ) {
        this._supportedPropertyLinkList.clear();
    }

    /**
     */
    public void removeAllSupportedPropertyQualifier(
    ) {
        this._supportedPropertyQualifierList.clear();
    }

    /**
     */
    public void removeAllSupportedPropertyQualifierType(
    ) {
        this._supportedPropertyQualifierTypeList.clear();
    }

    /**
     */
    public void removeAllSupportedPropertyType(
    ) {
        this._supportedPropertyTypeList.clear();
    }

    /**
     */
    public void removeAllSupportedRepresentationalForm(
    ) {
        this._supportedRepresentationalFormList.clear();
    }

    /**
     */
    public void removeAllSupportedSortOrder(
    ) {
        this._supportedSortOrderList.clear();
    }

    /**
     */
    public void removeAllSupportedSource(
    ) {
        this._supportedSourceList.clear();
    }

    /**
     */
    public void removeAllSupportedSourceRole(
    ) {
        this._supportedSourceRoleList.clear();
    }

    /**
     */
    public void removeAllSupportedStatus(
    ) {
        this._supportedStatusList.clear();
    }

    /**
     * Method removeSupportedAssociation.
     * 
     * @param vSupportedAssociation
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedAssociation(
            final org.LexGrid.naming.SupportedAssociation vSupportedAssociation) {
        boolean removed = _supportedAssociationList.remove(vSupportedAssociation);
        return removed;
    }

    /**
     * Method removeSupportedAssociationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedAssociation removeSupportedAssociationAt(
            final int index) {
        java.lang.Object obj = this._supportedAssociationList.remove(index);
        return (org.LexGrid.naming.SupportedAssociation) obj;
    }

    /**
     * Method removeSupportedAssociationQualifier.
     * 
     * @param vSupportedAssociationQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedAssociationQualifier(
            final org.LexGrid.naming.SupportedAssociationQualifier vSupportedAssociationQualifier) {
        boolean removed = _supportedAssociationQualifierList.remove(vSupportedAssociationQualifier);
        return removed;
    }

    /**
     * Method removeSupportedAssociationQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedAssociationQualifier removeSupportedAssociationQualifierAt(
            final int index) {
        java.lang.Object obj = this._supportedAssociationQualifierList.remove(index);
        return (org.LexGrid.naming.SupportedAssociationQualifier) obj;
    }

    /**
     * Method removeSupportedCodingScheme.
     * 
     * @param vSupportedCodingScheme
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedCodingScheme(
            final org.LexGrid.naming.SupportedCodingScheme vSupportedCodingScheme) {
        boolean removed = _supportedCodingSchemeList.remove(vSupportedCodingScheme);
        return removed;
    }

    /**
     * Method removeSupportedCodingSchemeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedCodingScheme removeSupportedCodingSchemeAt(
            final int index) {
        java.lang.Object obj = this._supportedCodingSchemeList.remove(index);
        return (org.LexGrid.naming.SupportedCodingScheme) obj;
    }

    /**
     * Method removeSupportedConceptDomain.
     * 
     * @param vSupportedConceptDomain
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedConceptDomain(
            final org.LexGrid.naming.SupportedConceptDomain vSupportedConceptDomain) {
        boolean removed = _supportedConceptDomainList.remove(vSupportedConceptDomain);
        return removed;
    }

    /**
     * Method removeSupportedConceptDomainAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedConceptDomain removeSupportedConceptDomainAt(
            final int index) {
        java.lang.Object obj = this._supportedConceptDomainList.remove(index);
        return (org.LexGrid.naming.SupportedConceptDomain) obj;
    }

    /**
     * Method removeSupportedContainerName.
     * 
     * @param vSupportedContainerName
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedContainerName(
            final org.LexGrid.naming.SupportedContainerName vSupportedContainerName) {
        boolean removed = _supportedContainerNameList.remove(vSupportedContainerName);
        return removed;
    }

    /**
     * Method removeSupportedContainerNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedContainerName removeSupportedContainerNameAt(
            final int index) {
        java.lang.Object obj = this._supportedContainerNameList.remove(index);
        return (org.LexGrid.naming.SupportedContainerName) obj;
    }

    /**
     * Method removeSupportedContext.
     * 
     * @param vSupportedContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedContext(
            final org.LexGrid.naming.SupportedContext vSupportedContext) {
        boolean removed = _supportedContextList.remove(vSupportedContext);
        return removed;
    }

    /**
     * Method removeSupportedContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedContext removeSupportedContextAt(
            final int index) {
        java.lang.Object obj = this._supportedContextList.remove(index);
        return (org.LexGrid.naming.SupportedContext) obj;
    }

    /**
     * Method removeSupportedDataType.
     * 
     * @param vSupportedDataType
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedDataType(
            final org.LexGrid.naming.SupportedDataType vSupportedDataType) {
        boolean removed = _supportedDataTypeList.remove(vSupportedDataType);
        return removed;
    }

    /**
     * Method removeSupportedDataTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedDataType removeSupportedDataTypeAt(
            final int index) {
        java.lang.Object obj = this._supportedDataTypeList.remove(index);
        return (org.LexGrid.naming.SupportedDataType) obj;
    }

    /**
     * Method removeSupportedDegreeOfFidelity.
     * 
     * @param vSupportedDegreeOfFidelity
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedDegreeOfFidelity(
            final org.LexGrid.naming.SupportedDegreeOfFidelity vSupportedDegreeOfFidelity) {
        boolean removed = _supportedDegreeOfFidelityList.remove(vSupportedDegreeOfFidelity);
        return removed;
    }

    /**
     * Method removeSupportedDegreeOfFidelityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedDegreeOfFidelity removeSupportedDegreeOfFidelityAt(
            final int index) {
        java.lang.Object obj = this._supportedDegreeOfFidelityList.remove(index);
        return (org.LexGrid.naming.SupportedDegreeOfFidelity) obj;
    }

    /**
     * Method removeSupportedEntityType.
     * 
     * @param vSupportedEntityType
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedEntityType(
            final org.LexGrid.naming.SupportedEntityType vSupportedEntityType) {
        boolean removed = _supportedEntityTypeList.remove(vSupportedEntityType);
        return removed;
    }

    /**
     * Method removeSupportedEntityTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedEntityType removeSupportedEntityTypeAt(
            final int index) {
        java.lang.Object obj = this._supportedEntityTypeList.remove(index);
        return (org.LexGrid.naming.SupportedEntityType) obj;
    }

    /**
     * Method removeSupportedHierarchy.
     * 
     * @param vSupportedHierarchy
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedHierarchy(
            final org.LexGrid.naming.SupportedHierarchy vSupportedHierarchy) {
        boolean removed = _supportedHierarchyList.remove(vSupportedHierarchy);
        return removed;
    }

    /**
     * Method removeSupportedHierarchyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedHierarchy removeSupportedHierarchyAt(
            final int index) {
        java.lang.Object obj = this._supportedHierarchyList.remove(index);
        return (org.LexGrid.naming.SupportedHierarchy) obj;
    }

    /**
     * Method removeSupportedLanguage.
     * 
     * @param vSupportedLanguage
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedLanguage(
            final org.LexGrid.naming.SupportedLanguage vSupportedLanguage) {
        boolean removed = _supportedLanguageList.remove(vSupportedLanguage);
        return removed;
    }

    /**
     * Method removeSupportedLanguageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedLanguage removeSupportedLanguageAt(
            final int index) {
        java.lang.Object obj = this._supportedLanguageList.remove(index);
        return (org.LexGrid.naming.SupportedLanguage) obj;
    }

    /**
     * Method removeSupportedNamespace.
     * 
     * @param vSupportedNamespace
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedNamespace(
            final org.LexGrid.naming.SupportedNamespace vSupportedNamespace) {
        boolean removed = _supportedNamespaceList.remove(vSupportedNamespace);
        return removed;
    }

    /**
     * Method removeSupportedNamespaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedNamespace removeSupportedNamespaceAt(
            final int index) {
        java.lang.Object obj = this._supportedNamespaceList.remove(index);
        return (org.LexGrid.naming.SupportedNamespace) obj;
    }

    /**
     * Method removeSupportedProperty.
     * 
     * @param vSupportedProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedProperty(
            final org.LexGrid.naming.SupportedProperty vSupportedProperty) {
        boolean removed = _supportedPropertyList.remove(vSupportedProperty);
        return removed;
    }

    /**
     * Method removeSupportedPropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedProperty removeSupportedPropertyAt(
            final int index) {
        java.lang.Object obj = this._supportedPropertyList.remove(index);
        return (org.LexGrid.naming.SupportedProperty) obj;
    }

    /**
     * Method removeSupportedPropertyLink.
     * 
     * @param vSupportedPropertyLink
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedPropertyLink(
            final org.LexGrid.naming.SupportedPropertyLink vSupportedPropertyLink) {
        boolean removed = _supportedPropertyLinkList.remove(vSupportedPropertyLink);
        return removed;
    }

    /**
     * Method removeSupportedPropertyLinkAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedPropertyLink removeSupportedPropertyLinkAt(
            final int index) {
        java.lang.Object obj = this._supportedPropertyLinkList.remove(index);
        return (org.LexGrid.naming.SupportedPropertyLink) obj;
    }

    /**
     * Method removeSupportedPropertyQualifier.
     * 
     * @param vSupportedPropertyQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedPropertyQualifier(
            final org.LexGrid.naming.SupportedPropertyQualifier vSupportedPropertyQualifier) {
        boolean removed = _supportedPropertyQualifierList.remove(vSupportedPropertyQualifier);
        return removed;
    }

    /**
     * Method removeSupportedPropertyQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedPropertyQualifier removeSupportedPropertyQualifierAt(
            final int index) {
        java.lang.Object obj = this._supportedPropertyQualifierList.remove(index);
        return (org.LexGrid.naming.SupportedPropertyQualifier) obj;
    }

    /**
     * Method removeSupportedPropertyQualifierType.
     * 
     * @param vSupportedPropertyQualifierType
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedPropertyQualifierType(
            final org.LexGrid.naming.SupportedPropertyQualifierType vSupportedPropertyQualifierType) {
        boolean removed = _supportedPropertyQualifierTypeList.remove(vSupportedPropertyQualifierType);
        return removed;
    }

    /**
     * Method removeSupportedPropertyQualifierTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedPropertyQualifierType removeSupportedPropertyQualifierTypeAt(
            final int index) {
        java.lang.Object obj = this._supportedPropertyQualifierTypeList.remove(index);
        return (org.LexGrid.naming.SupportedPropertyQualifierType) obj;
    }

    /**
     * Method removeSupportedPropertyType.
     * 
     * @param vSupportedPropertyType
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedPropertyType(
            final org.LexGrid.naming.SupportedPropertyType vSupportedPropertyType) {
        boolean removed = _supportedPropertyTypeList.remove(vSupportedPropertyType);
        return removed;
    }

    /**
     * Method removeSupportedPropertyTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedPropertyType removeSupportedPropertyTypeAt(
            final int index) {
        java.lang.Object obj = this._supportedPropertyTypeList.remove(index);
        return (org.LexGrid.naming.SupportedPropertyType) obj;
    }

    /**
     * Method removeSupportedRepresentationalForm.
     * 
     * @param vSupportedRepresentationalForm
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedRepresentationalForm(
            final org.LexGrid.naming.SupportedRepresentationalForm vSupportedRepresentationalForm) {
        boolean removed = _supportedRepresentationalFormList.remove(vSupportedRepresentationalForm);
        return removed;
    }

    /**
     * Method removeSupportedRepresentationalFormAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedRepresentationalForm removeSupportedRepresentationalFormAt(
            final int index) {
        java.lang.Object obj = this._supportedRepresentationalFormList.remove(index);
        return (org.LexGrid.naming.SupportedRepresentationalForm) obj;
    }

    /**
     * Method removeSupportedSortOrder.
     * 
     * @param vSupportedSortOrder
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedSortOrder(
            final org.LexGrid.naming.SupportedSortOrder vSupportedSortOrder) {
        boolean removed = _supportedSortOrderList.remove(vSupportedSortOrder);
        return removed;
    }

    /**
     * Method removeSupportedSortOrderAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedSortOrder removeSupportedSortOrderAt(
            final int index) {
        java.lang.Object obj = this._supportedSortOrderList.remove(index);
        return (org.LexGrid.naming.SupportedSortOrder) obj;
    }

    /**
     * Method removeSupportedSource.
     * 
     * @param vSupportedSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedSource(
            final org.LexGrid.naming.SupportedSource vSupportedSource) {
        boolean removed = _supportedSourceList.remove(vSupportedSource);
        return removed;
    }

    /**
     * Method removeSupportedSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedSource removeSupportedSourceAt(
            final int index) {
        java.lang.Object obj = this._supportedSourceList.remove(index);
        return (org.LexGrid.naming.SupportedSource) obj;
    }

    /**
     * Method removeSupportedSourceRole.
     * 
     * @param vSupportedSourceRole
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedSourceRole(
            final org.LexGrid.naming.SupportedSourceRole vSupportedSourceRole) {
        boolean removed = _supportedSourceRoleList.remove(vSupportedSourceRole);
        return removed;
    }

    /**
     * Method removeSupportedSourceRoleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedSourceRole removeSupportedSourceRoleAt(
            final int index) {
        java.lang.Object obj = this._supportedSourceRoleList.remove(index);
        return (org.LexGrid.naming.SupportedSourceRole) obj;
    }

    /**
     * Method removeSupportedStatus.
     * 
     * @param vSupportedStatus
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedStatus(
            final org.LexGrid.naming.SupportedStatus vSupportedStatus) {
        boolean removed = _supportedStatusList.remove(vSupportedStatus);
        return removed;
    }

    /**
     * Method removeSupportedStatusAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.naming.SupportedStatus removeSupportedStatusAt(
            final int index) {
        java.lang.Object obj = this._supportedStatusList.remove(index);
        return (org.LexGrid.naming.SupportedStatus) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedAssociation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedAssociation(
            final int index,
            final org.LexGrid.naming.SupportedAssociation vSupportedAssociation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedAssociationList.size()) {
            throw new IndexOutOfBoundsException("setSupportedAssociation: Index value '" + index + "' not in range [0.." + (this._supportedAssociationList.size() - 1) + "]");
        }

        this._supportedAssociationList.set(index, vSupportedAssociation);
    }

    /**
     * 
     * 
     * @param vSupportedAssociationArray
     */
    public void setSupportedAssociation(
            final org.LexGrid.naming.SupportedAssociation[] vSupportedAssociationArray) {
        //-- copy array
        _supportedAssociationList.clear();

        for (int i = 0; i < vSupportedAssociationArray.length; i++) {
                this._supportedAssociationList.add(vSupportedAssociationArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedAssociationList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedAssociationList the Vector to copy.
     */
    public void setSupportedAssociation(
            final java.util.List<org.LexGrid.naming.SupportedAssociation> vSupportedAssociationList) {
        // copy vector
        this._supportedAssociationList.clear();

        this._supportedAssociationList.addAll(vSupportedAssociationList);
    }

    /**
     * Sets the value of '_supportedAssociationList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedAssociationList the Vector to set.
     */
    public void setSupportedAssociationAsReference(
            final java.util.List<org.LexGrid.naming.SupportedAssociation> supportedAssociationList) {
        this._supportedAssociationList = supportedAssociationList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedAssociationQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedAssociationQualifier(
            final int index,
            final org.LexGrid.naming.SupportedAssociationQualifier vSupportedAssociationQualifier)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedAssociationQualifierList.size()) {
            throw new IndexOutOfBoundsException("setSupportedAssociationQualifier: Index value '" + index + "' not in range [0.." + (this._supportedAssociationQualifierList.size() - 1) + "]");
        }

        this._supportedAssociationQualifierList.set(index, vSupportedAssociationQualifier);
    }

    /**
     * 
     * 
     * @param vSupportedAssociationQualifierArray
     */
    public void setSupportedAssociationQualifier(
            final org.LexGrid.naming.SupportedAssociationQualifier[] vSupportedAssociationQualifierArray) {
        //-- copy array
        _supportedAssociationQualifierList.clear();

        for (int i = 0; i < vSupportedAssociationQualifierArray.length; i++) {
                this._supportedAssociationQualifierList.add(vSupportedAssociationQualifierArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedAssociationQualifierList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedAssociationQualifierList the Vector to copy.
     */
    public void setSupportedAssociationQualifier(
            final java.util.List<org.LexGrid.naming.SupportedAssociationQualifier> vSupportedAssociationQualifierList) {
        // copy vector
        this._supportedAssociationQualifierList.clear();

        this._supportedAssociationQualifierList.addAll(vSupportedAssociationQualifierList);
    }

    /**
     * Sets the value of '_supportedAssociationQualifierList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedAssociationQualifierList the Vector to set.
     */
    public void setSupportedAssociationQualifierAsReference(
            final java.util.List<org.LexGrid.naming.SupportedAssociationQualifier> supportedAssociationQualifierList) {
        this._supportedAssociationQualifierList = supportedAssociationQualifierList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedCodingScheme
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedCodingScheme(
            final int index,
            final org.LexGrid.naming.SupportedCodingScheme vSupportedCodingScheme)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedCodingSchemeList.size()) {
            throw new IndexOutOfBoundsException("setSupportedCodingScheme: Index value '" + index + "' not in range [0.." + (this._supportedCodingSchemeList.size() - 1) + "]");
        }

        this._supportedCodingSchemeList.set(index, vSupportedCodingScheme);
    }

    /**
     * 
     * 
     * @param vSupportedCodingSchemeArray
     */
    public void setSupportedCodingScheme(
            final org.LexGrid.naming.SupportedCodingScheme[] vSupportedCodingSchemeArray) {
        //-- copy array
        _supportedCodingSchemeList.clear();

        for (int i = 0; i < vSupportedCodingSchemeArray.length; i++) {
                this._supportedCodingSchemeList.add(vSupportedCodingSchemeArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedCodingSchemeList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedCodingSchemeList the Vector to copy.
     */
    public void setSupportedCodingScheme(
            final java.util.List<org.LexGrid.naming.SupportedCodingScheme> vSupportedCodingSchemeList) {
        // copy vector
        this._supportedCodingSchemeList.clear();

        this._supportedCodingSchemeList.addAll(vSupportedCodingSchemeList);
    }

    /**
     * Sets the value of '_supportedCodingSchemeList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedCodingSchemeList the Vector to set.
     */
    public void setSupportedCodingSchemeAsReference(
            final java.util.List<org.LexGrid.naming.SupportedCodingScheme> supportedCodingSchemeList) {
        this._supportedCodingSchemeList = supportedCodingSchemeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedConceptDomain
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedConceptDomain(
            final int index,
            final org.LexGrid.naming.SupportedConceptDomain vSupportedConceptDomain)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedConceptDomainList.size()) {
            throw new IndexOutOfBoundsException("setSupportedConceptDomain: Index value '" + index + "' not in range [0.." + (this._supportedConceptDomainList.size() - 1) + "]");
        }

        this._supportedConceptDomainList.set(index, vSupportedConceptDomain);
    }

    /**
     * 
     * 
     * @param vSupportedConceptDomainArray
     */
    public void setSupportedConceptDomain(
            final org.LexGrid.naming.SupportedConceptDomain[] vSupportedConceptDomainArray) {
        //-- copy array
        _supportedConceptDomainList.clear();

        for (int i = 0; i < vSupportedConceptDomainArray.length; i++) {
                this._supportedConceptDomainList.add(vSupportedConceptDomainArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedConceptDomainList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedConceptDomainList the Vector to copy.
     */
    public void setSupportedConceptDomain(
            final java.util.List<org.LexGrid.naming.SupportedConceptDomain> vSupportedConceptDomainList) {
        // copy vector
        this._supportedConceptDomainList.clear();

        this._supportedConceptDomainList.addAll(vSupportedConceptDomainList);
    }

    /**
     * Sets the value of '_supportedConceptDomainList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedConceptDomainList the Vector to set.
     */
    public void setSupportedConceptDomainAsReference(
            final java.util.List<org.LexGrid.naming.SupportedConceptDomain> supportedConceptDomainList) {
        this._supportedConceptDomainList = supportedConceptDomainList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedContainerName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedContainerName(
            final int index,
            final org.LexGrid.naming.SupportedContainerName vSupportedContainerName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedContainerNameList.size()) {
            throw new IndexOutOfBoundsException("setSupportedContainerName: Index value '" + index + "' not in range [0.." + (this._supportedContainerNameList.size() - 1) + "]");
        }

        this._supportedContainerNameList.set(index, vSupportedContainerName);
    }

    /**
     * 
     * 
     * @param vSupportedContainerNameArray
     */
    public void setSupportedContainerName(
            final org.LexGrid.naming.SupportedContainerName[] vSupportedContainerNameArray) {
        //-- copy array
        _supportedContainerNameList.clear();

        for (int i = 0; i < vSupportedContainerNameArray.length; i++) {
                this._supportedContainerNameList.add(vSupportedContainerNameArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedContainerNameList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedContainerNameList the Vector to copy.
     */
    public void setSupportedContainerName(
            final java.util.List<org.LexGrid.naming.SupportedContainerName> vSupportedContainerNameList) {
        // copy vector
        this._supportedContainerNameList.clear();

        this._supportedContainerNameList.addAll(vSupportedContainerNameList);
    }

    /**
     * Sets the value of '_supportedContainerNameList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedContainerNameList the Vector to set.
     */
    public void setSupportedContainerNameAsReference(
            final java.util.List<org.LexGrid.naming.SupportedContainerName> supportedContainerNameList) {
        this._supportedContainerNameList = supportedContainerNameList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedContext
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedContext(
            final int index,
            final org.LexGrid.naming.SupportedContext vSupportedContext)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedContextList.size()) {
            throw new IndexOutOfBoundsException("setSupportedContext: Index value '" + index + "' not in range [0.." + (this._supportedContextList.size() - 1) + "]");
        }

        this._supportedContextList.set(index, vSupportedContext);
    }

    /**
     * 
     * 
     * @param vSupportedContextArray
     */
    public void setSupportedContext(
            final org.LexGrid.naming.SupportedContext[] vSupportedContextArray) {
        //-- copy array
        _supportedContextList.clear();

        for (int i = 0; i < vSupportedContextArray.length; i++) {
                this._supportedContextList.add(vSupportedContextArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedContextList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedContextList the Vector to copy.
     */
    public void setSupportedContext(
            final java.util.List<org.LexGrid.naming.SupportedContext> vSupportedContextList) {
        // copy vector
        this._supportedContextList.clear();

        this._supportedContextList.addAll(vSupportedContextList);
    }

    /**
     * Sets the value of '_supportedContextList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedContextList the Vector to set.
     */
    public void setSupportedContextAsReference(
            final java.util.List<org.LexGrid.naming.SupportedContext> supportedContextList) {
        this._supportedContextList = supportedContextList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedDataType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedDataType(
            final int index,
            final org.LexGrid.naming.SupportedDataType vSupportedDataType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedDataTypeList.size()) {
            throw new IndexOutOfBoundsException("setSupportedDataType: Index value '" + index + "' not in range [0.." + (this._supportedDataTypeList.size() - 1) + "]");
        }

        this._supportedDataTypeList.set(index, vSupportedDataType);
    }

    /**
     * 
     * 
     * @param vSupportedDataTypeArray
     */
    public void setSupportedDataType(
            final org.LexGrid.naming.SupportedDataType[] vSupportedDataTypeArray) {
        //-- copy array
        _supportedDataTypeList.clear();

        for (int i = 0; i < vSupportedDataTypeArray.length; i++) {
                this._supportedDataTypeList.add(vSupportedDataTypeArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedDataTypeList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedDataTypeList the Vector to copy.
     */
    public void setSupportedDataType(
            final java.util.List<org.LexGrid.naming.SupportedDataType> vSupportedDataTypeList) {
        // copy vector
        this._supportedDataTypeList.clear();

        this._supportedDataTypeList.addAll(vSupportedDataTypeList);
    }

    /**
     * Sets the value of '_supportedDataTypeList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedDataTypeList the Vector to set.
     */
    public void setSupportedDataTypeAsReference(
            final java.util.List<org.LexGrid.naming.SupportedDataType> supportedDataTypeList) {
        this._supportedDataTypeList = supportedDataTypeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedDegreeOfFidelity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedDegreeOfFidelity(
            final int index,
            final org.LexGrid.naming.SupportedDegreeOfFidelity vSupportedDegreeOfFidelity)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedDegreeOfFidelityList.size()) {
            throw new IndexOutOfBoundsException("setSupportedDegreeOfFidelity: Index value '" + index + "' not in range [0.." + (this._supportedDegreeOfFidelityList.size() - 1) + "]");
        }

        this._supportedDegreeOfFidelityList.set(index, vSupportedDegreeOfFidelity);
    }

    /**
     * 
     * 
     * @param vSupportedDegreeOfFidelityArray
     */
    public void setSupportedDegreeOfFidelity(
            final org.LexGrid.naming.SupportedDegreeOfFidelity[] vSupportedDegreeOfFidelityArray) {
        //-- copy array
        _supportedDegreeOfFidelityList.clear();

        for (int i = 0; i < vSupportedDegreeOfFidelityArray.length; i++) {
                this._supportedDegreeOfFidelityList.add(vSupportedDegreeOfFidelityArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedDegreeOfFidelityList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedDegreeOfFidelityList the Vector to copy.
     */
    public void setSupportedDegreeOfFidelity(
            final java.util.List<org.LexGrid.naming.SupportedDegreeOfFidelity> vSupportedDegreeOfFidelityList) {
        // copy vector
        this._supportedDegreeOfFidelityList.clear();

        this._supportedDegreeOfFidelityList.addAll(vSupportedDegreeOfFidelityList);
    }

    /**
     * Sets the value of '_supportedDegreeOfFidelityList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedDegreeOfFidelityList the Vector to set.
     */
    public void setSupportedDegreeOfFidelityAsReference(
            final java.util.List<org.LexGrid.naming.SupportedDegreeOfFidelity> supportedDegreeOfFidelityList) {
        this._supportedDegreeOfFidelityList = supportedDegreeOfFidelityList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedEntityType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedEntityType(
            final int index,
            final org.LexGrid.naming.SupportedEntityType vSupportedEntityType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedEntityTypeList.size()) {
            throw new IndexOutOfBoundsException("setSupportedEntityType: Index value '" + index + "' not in range [0.." + (this._supportedEntityTypeList.size() - 1) + "]");
        }

        this._supportedEntityTypeList.set(index, vSupportedEntityType);
    }

    /**
     * 
     * 
     * @param vSupportedEntityTypeArray
     */
    public void setSupportedEntityType(
            final org.LexGrid.naming.SupportedEntityType[] vSupportedEntityTypeArray) {
        //-- copy array
        _supportedEntityTypeList.clear();

        for (int i = 0; i < vSupportedEntityTypeArray.length; i++) {
                this._supportedEntityTypeList.add(vSupportedEntityTypeArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedEntityTypeList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedEntityTypeList the Vector to copy.
     */
    public void setSupportedEntityType(
            final java.util.List<org.LexGrid.naming.SupportedEntityType> vSupportedEntityTypeList) {
        // copy vector
        this._supportedEntityTypeList.clear();

        this._supportedEntityTypeList.addAll(vSupportedEntityTypeList);
    }

    /**
     * Sets the value of '_supportedEntityTypeList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedEntityTypeList the Vector to set.
     */
    public void setSupportedEntityTypeAsReference(
            final java.util.List<org.LexGrid.naming.SupportedEntityType> supportedEntityTypeList) {
        this._supportedEntityTypeList = supportedEntityTypeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedHierarchy
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedHierarchy(
            final int index,
            final org.LexGrid.naming.SupportedHierarchy vSupportedHierarchy)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedHierarchyList.size()) {
            throw new IndexOutOfBoundsException("setSupportedHierarchy: Index value '" + index + "' not in range [0.." + (this._supportedHierarchyList.size() - 1) + "]");
        }

        this._supportedHierarchyList.set(index, vSupportedHierarchy);
    }

    /**
     * 
     * 
     * @param vSupportedHierarchyArray
     */
    public void setSupportedHierarchy(
            final org.LexGrid.naming.SupportedHierarchy[] vSupportedHierarchyArray) {
        //-- copy array
        _supportedHierarchyList.clear();

        for (int i = 0; i < vSupportedHierarchyArray.length; i++) {
                this._supportedHierarchyList.add(vSupportedHierarchyArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedHierarchyList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedHierarchyList the Vector to copy.
     */
    public void setSupportedHierarchy(
            final java.util.List<org.LexGrid.naming.SupportedHierarchy> vSupportedHierarchyList) {
        // copy vector
        this._supportedHierarchyList.clear();

        this._supportedHierarchyList.addAll(vSupportedHierarchyList);
    }

    /**
     * Sets the value of '_supportedHierarchyList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedHierarchyList the Vector to set.
     */
    public void setSupportedHierarchyAsReference(
            final java.util.List<org.LexGrid.naming.SupportedHierarchy> supportedHierarchyList) {
        this._supportedHierarchyList = supportedHierarchyList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedLanguage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedLanguage(
            final int index,
            final org.LexGrid.naming.SupportedLanguage vSupportedLanguage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedLanguageList.size()) {
            throw new IndexOutOfBoundsException("setSupportedLanguage: Index value '" + index + "' not in range [0.." + (this._supportedLanguageList.size() - 1) + "]");
        }

        this._supportedLanguageList.set(index, vSupportedLanguage);
    }

    /**
     * 
     * 
     * @param vSupportedLanguageArray
     */
    public void setSupportedLanguage(
            final org.LexGrid.naming.SupportedLanguage[] vSupportedLanguageArray) {
        //-- copy array
        _supportedLanguageList.clear();

        for (int i = 0; i < vSupportedLanguageArray.length; i++) {
                this._supportedLanguageList.add(vSupportedLanguageArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedLanguageList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedLanguageList the Vector to copy.
     */
    public void setSupportedLanguage(
            final java.util.List<org.LexGrid.naming.SupportedLanguage> vSupportedLanguageList) {
        // copy vector
        this._supportedLanguageList.clear();

        this._supportedLanguageList.addAll(vSupportedLanguageList);
    }

    /**
     * Sets the value of '_supportedLanguageList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedLanguageList the Vector to set.
     */
    public void setSupportedLanguageAsReference(
            final java.util.List<org.LexGrid.naming.SupportedLanguage> supportedLanguageList) {
        this._supportedLanguageList = supportedLanguageList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedNamespace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedNamespace(
            final int index,
            final org.LexGrid.naming.SupportedNamespace vSupportedNamespace)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedNamespaceList.size()) {
            throw new IndexOutOfBoundsException("setSupportedNamespace: Index value '" + index + "' not in range [0.." + (this._supportedNamespaceList.size() - 1) + "]");
        }

        this._supportedNamespaceList.set(index, vSupportedNamespace);
    }

    /**
     * 
     * 
     * @param vSupportedNamespaceArray
     */
    public void setSupportedNamespace(
            final org.LexGrid.naming.SupportedNamespace[] vSupportedNamespaceArray) {
        //-- copy array
        _supportedNamespaceList.clear();

        for (int i = 0; i < vSupportedNamespaceArray.length; i++) {
                this._supportedNamespaceList.add(vSupportedNamespaceArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedNamespaceList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedNamespaceList the Vector to copy.
     */
    public void setSupportedNamespace(
            final java.util.List<org.LexGrid.naming.SupportedNamespace> vSupportedNamespaceList) {
        // copy vector
        this._supportedNamespaceList.clear();

        this._supportedNamespaceList.addAll(vSupportedNamespaceList);
    }

    /**
     * Sets the value of '_supportedNamespaceList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedNamespaceList the Vector to set.
     */
    public void setSupportedNamespaceAsReference(
            final java.util.List<org.LexGrid.naming.SupportedNamespace> supportedNamespaceList) {
        this._supportedNamespaceList = supportedNamespaceList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedProperty(
            final int index,
            final org.LexGrid.naming.SupportedProperty vSupportedProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyList.size()) {
            throw new IndexOutOfBoundsException("setSupportedProperty: Index value '" + index + "' not in range [0.." + (this._supportedPropertyList.size() - 1) + "]");
        }

        this._supportedPropertyList.set(index, vSupportedProperty);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyArray
     */
    public void setSupportedProperty(
            final org.LexGrid.naming.SupportedProperty[] vSupportedPropertyArray) {
        //-- copy array
        _supportedPropertyList.clear();

        for (int i = 0; i < vSupportedPropertyArray.length; i++) {
                this._supportedPropertyList.add(vSupportedPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedPropertyList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedPropertyList the Vector to copy.
     */
    public void setSupportedProperty(
            final java.util.List<org.LexGrid.naming.SupportedProperty> vSupportedPropertyList) {
        // copy vector
        this._supportedPropertyList.clear();

        this._supportedPropertyList.addAll(vSupportedPropertyList);
    }

    /**
     * Sets the value of '_supportedPropertyList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedPropertyList the Vector to set.
     */
    public void setSupportedPropertyAsReference(
            final java.util.List<org.LexGrid.naming.SupportedProperty> supportedPropertyList) {
        this._supportedPropertyList = supportedPropertyList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedPropertyLink(
            final int index,
            final org.LexGrid.naming.SupportedPropertyLink vSupportedPropertyLink)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyLinkList.size()) {
            throw new IndexOutOfBoundsException("setSupportedPropertyLink: Index value '" + index + "' not in range [0.." + (this._supportedPropertyLinkList.size() - 1) + "]");
        }

        this._supportedPropertyLinkList.set(index, vSupportedPropertyLink);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyLinkArray
     */
    public void setSupportedPropertyLink(
            final org.LexGrid.naming.SupportedPropertyLink[] vSupportedPropertyLinkArray) {
        //-- copy array
        _supportedPropertyLinkList.clear();

        for (int i = 0; i < vSupportedPropertyLinkArray.length; i++) {
                this._supportedPropertyLinkList.add(vSupportedPropertyLinkArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedPropertyLinkList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedPropertyLinkList the Vector to copy.
     */
    public void setSupportedPropertyLink(
            final java.util.List<org.LexGrid.naming.SupportedPropertyLink> vSupportedPropertyLinkList) {
        // copy vector
        this._supportedPropertyLinkList.clear();

        this._supportedPropertyLinkList.addAll(vSupportedPropertyLinkList);
    }

    /**
     * Sets the value of '_supportedPropertyLinkList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedPropertyLinkList the Vector to set.
     */
    public void setSupportedPropertyLinkAsReference(
            final java.util.List<org.LexGrid.naming.SupportedPropertyLink> supportedPropertyLinkList) {
        this._supportedPropertyLinkList = supportedPropertyLinkList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyQualifier
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedPropertyQualifier(
            final int index,
            final org.LexGrid.naming.SupportedPropertyQualifier vSupportedPropertyQualifier)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyQualifierList.size()) {
            throw new IndexOutOfBoundsException("setSupportedPropertyQualifier: Index value '" + index + "' not in range [0.." + (this._supportedPropertyQualifierList.size() - 1) + "]");
        }

        this._supportedPropertyQualifierList.set(index, vSupportedPropertyQualifier);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyQualifierArray
     */
    public void setSupportedPropertyQualifier(
            final org.LexGrid.naming.SupportedPropertyQualifier[] vSupportedPropertyQualifierArray) {
        //-- copy array
        _supportedPropertyQualifierList.clear();

        for (int i = 0; i < vSupportedPropertyQualifierArray.length; i++) {
                this._supportedPropertyQualifierList.add(vSupportedPropertyQualifierArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedPropertyQualifierList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedPropertyQualifierList the Vector to copy.
     */
    public void setSupportedPropertyQualifier(
            final java.util.List<org.LexGrid.naming.SupportedPropertyQualifier> vSupportedPropertyQualifierList) {
        // copy vector
        this._supportedPropertyQualifierList.clear();

        this._supportedPropertyQualifierList.addAll(vSupportedPropertyQualifierList);
    }

    /**
     * Sets the value of '_supportedPropertyQualifierList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedPropertyQualifierList the Vector to set.
     */
    public void setSupportedPropertyQualifierAsReference(
            final java.util.List<org.LexGrid.naming.SupportedPropertyQualifier> supportedPropertyQualifierList) {
        this._supportedPropertyQualifierList = supportedPropertyQualifierList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyQualifierType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedPropertyQualifierType(
            final int index,
            final org.LexGrid.naming.SupportedPropertyQualifierType vSupportedPropertyQualifierType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyQualifierTypeList.size()) {
            throw new IndexOutOfBoundsException("setSupportedPropertyQualifierType: Index value '" + index + "' not in range [0.." + (this._supportedPropertyQualifierTypeList.size() - 1) + "]");
        }

        this._supportedPropertyQualifierTypeList.set(index, vSupportedPropertyQualifierType);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyQualifierTypeArray
     */
    public void setSupportedPropertyQualifierType(
            final org.LexGrid.naming.SupportedPropertyQualifierType[] vSupportedPropertyQualifierTypeArray) {
        //-- copy array
        _supportedPropertyQualifierTypeList.clear();

        for (int i = 0; i < vSupportedPropertyQualifierTypeArray.length; i++) {
                this._supportedPropertyQualifierTypeList.add(vSupportedPropertyQualifierTypeArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedPropertyQualifierTypeList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedPropertyQualifierTypeList the Vector to copy
     */
    public void setSupportedPropertyQualifierType(
            final java.util.List<org.LexGrid.naming.SupportedPropertyQualifierType> vSupportedPropertyQualifierTypeList) {
        // copy vector
        this._supportedPropertyQualifierTypeList.clear();

        this._supportedPropertyQualifierTypeList.addAll(vSupportedPropertyQualifierTypeList);
    }

    /**
     * Sets the value of '_supportedPropertyQualifierTypeList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedPropertyQualifierTypeList the Vector to set.
     */
    public void setSupportedPropertyQualifierTypeAsReference(
            final java.util.List<org.LexGrid.naming.SupportedPropertyQualifierType> supportedPropertyQualifierTypeList) {
        this._supportedPropertyQualifierTypeList = supportedPropertyQualifierTypeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedPropertyType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedPropertyType(
            final int index,
            final org.LexGrid.naming.SupportedPropertyType vSupportedPropertyType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedPropertyTypeList.size()) {
            throw new IndexOutOfBoundsException("setSupportedPropertyType: Index value '" + index + "' not in range [0.." + (this._supportedPropertyTypeList.size() - 1) + "]");
        }

        this._supportedPropertyTypeList.set(index, vSupportedPropertyType);
    }

    /**
     * 
     * 
     * @param vSupportedPropertyTypeArray
     */
    public void setSupportedPropertyType(
            final org.LexGrid.naming.SupportedPropertyType[] vSupportedPropertyTypeArray) {
        //-- copy array
        _supportedPropertyTypeList.clear();

        for (int i = 0; i < vSupportedPropertyTypeArray.length; i++) {
                this._supportedPropertyTypeList.add(vSupportedPropertyTypeArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedPropertyTypeList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedPropertyTypeList the Vector to copy.
     */
    public void setSupportedPropertyType(
            final java.util.List<org.LexGrid.naming.SupportedPropertyType> vSupportedPropertyTypeList) {
        // copy vector
        this._supportedPropertyTypeList.clear();

        this._supportedPropertyTypeList.addAll(vSupportedPropertyTypeList);
    }

    /**
     * Sets the value of '_supportedPropertyTypeList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedPropertyTypeList the Vector to set.
     */
    public void setSupportedPropertyTypeAsReference(
            final java.util.List<org.LexGrid.naming.SupportedPropertyType> supportedPropertyTypeList) {
        this._supportedPropertyTypeList = supportedPropertyTypeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedRepresentationalForm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedRepresentationalForm(
            final int index,
            final org.LexGrid.naming.SupportedRepresentationalForm vSupportedRepresentationalForm)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedRepresentationalFormList.size()) {
            throw new IndexOutOfBoundsException("setSupportedRepresentationalForm: Index value '" + index + "' not in range [0.." + (this._supportedRepresentationalFormList.size() - 1) + "]");
        }

        this._supportedRepresentationalFormList.set(index, vSupportedRepresentationalForm);
    }

    /**
     * 
     * 
     * @param vSupportedRepresentationalFormArray
     */
    public void setSupportedRepresentationalForm(
            final org.LexGrid.naming.SupportedRepresentationalForm[] vSupportedRepresentationalFormArray) {
        //-- copy array
        _supportedRepresentationalFormList.clear();

        for (int i = 0; i < vSupportedRepresentationalFormArray.length; i++) {
                this._supportedRepresentationalFormList.add(vSupportedRepresentationalFormArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedRepresentationalFormList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedRepresentationalFormList the Vector to copy.
     */
    public void setSupportedRepresentationalForm(
            final java.util.List<org.LexGrid.naming.SupportedRepresentationalForm> vSupportedRepresentationalFormList) {
        // copy vector
        this._supportedRepresentationalFormList.clear();

        this._supportedRepresentationalFormList.addAll(vSupportedRepresentationalFormList);
    }

    /**
     * Sets the value of '_supportedRepresentationalFormList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedRepresentationalFormList the Vector to set.
     */
    public void setSupportedRepresentationalFormAsReference(
            final java.util.List<org.LexGrid.naming.SupportedRepresentationalForm> supportedRepresentationalFormList) {
        this._supportedRepresentationalFormList = supportedRepresentationalFormList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSortOrder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedSortOrder(
            final int index,
            final org.LexGrid.naming.SupportedSortOrder vSupportedSortOrder)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSortOrderList.size()) {
            throw new IndexOutOfBoundsException("setSupportedSortOrder: Index value '" + index + "' not in range [0.." + (this._supportedSortOrderList.size() - 1) + "]");
        }

        this._supportedSortOrderList.set(index, vSupportedSortOrder);
    }

    /**
     * 
     * 
     * @param vSupportedSortOrderArray
     */
    public void setSupportedSortOrder(
            final org.LexGrid.naming.SupportedSortOrder[] vSupportedSortOrderArray) {
        //-- copy array
        _supportedSortOrderList.clear();

        for (int i = 0; i < vSupportedSortOrderArray.length; i++) {
                this._supportedSortOrderList.add(vSupportedSortOrderArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedSortOrderList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedSortOrderList the Vector to copy.
     */
    public void setSupportedSortOrder(
            final java.util.List<org.LexGrid.naming.SupportedSortOrder> vSupportedSortOrderList) {
        // copy vector
        this._supportedSortOrderList.clear();

        this._supportedSortOrderList.addAll(vSupportedSortOrderList);
    }

    /**
     * Sets the value of '_supportedSortOrderList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedSortOrderList the Vector to set.
     */
    public void setSupportedSortOrderAsReference(
            final java.util.List<org.LexGrid.naming.SupportedSortOrder> supportedSortOrderList) {
        this._supportedSortOrderList = supportedSortOrderList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedSource(
            final int index,
            final org.LexGrid.naming.SupportedSource vSupportedSource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceList.size()) {
            throw new IndexOutOfBoundsException("setSupportedSource: Index value '" + index + "' not in range [0.." + (this._supportedSourceList.size() - 1) + "]");
        }

        this._supportedSourceList.set(index, vSupportedSource);
    }

    /**
     * 
     * 
     * @param vSupportedSourceArray
     */
    public void setSupportedSource(
            final org.LexGrid.naming.SupportedSource[] vSupportedSourceArray) {
        //-- copy array
        _supportedSourceList.clear();

        for (int i = 0; i < vSupportedSourceArray.length; i++) {
                this._supportedSourceList.add(vSupportedSourceArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedSourceList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedSourceList the Vector to copy.
     */
    public void setSupportedSource(
            final java.util.List<org.LexGrid.naming.SupportedSource> vSupportedSourceList) {
        // copy vector
        this._supportedSourceList.clear();

        this._supportedSourceList.addAll(vSupportedSourceList);
    }

    /**
     * Sets the value of '_supportedSourceList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedSourceList the Vector to set.
     */
    public void setSupportedSourceAsReference(
            final java.util.List<org.LexGrid.naming.SupportedSource> supportedSourceList) {
        this._supportedSourceList = supportedSourceList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSourceRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedSourceRole(
            final int index,
            final org.LexGrid.naming.SupportedSourceRole vSupportedSourceRole)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceRoleList.size()) {
            throw new IndexOutOfBoundsException("setSupportedSourceRole: Index value '" + index + "' not in range [0.." + (this._supportedSourceRoleList.size() - 1) + "]");
        }

        this._supportedSourceRoleList.set(index, vSupportedSourceRole);
    }

    /**
     * 
     * 
     * @param vSupportedSourceRoleArray
     */
    public void setSupportedSourceRole(
            final org.LexGrid.naming.SupportedSourceRole[] vSupportedSourceRoleArray) {
        //-- copy array
        _supportedSourceRoleList.clear();

        for (int i = 0; i < vSupportedSourceRoleArray.length; i++) {
                this._supportedSourceRoleList.add(vSupportedSourceRoleArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedSourceRoleList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedSourceRoleList the Vector to copy.
     */
    public void setSupportedSourceRole(
            final java.util.List<org.LexGrid.naming.SupportedSourceRole> vSupportedSourceRoleList) {
        // copy vector
        this._supportedSourceRoleList.clear();

        this._supportedSourceRoleList.addAll(vSupportedSourceRoleList);
    }

    /**
     * Sets the value of '_supportedSourceRoleList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedSourceRoleList the Vector to set.
     */
    public void setSupportedSourceRoleAsReference(
            final java.util.List<org.LexGrid.naming.SupportedSourceRole> supportedSourceRoleList) {
        this._supportedSourceRoleList = supportedSourceRoleList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedStatus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedStatus(
            final int index,
            final org.LexGrid.naming.SupportedStatus vSupportedStatus)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedStatusList.size()) {
            throw new IndexOutOfBoundsException("setSupportedStatus: Index value '" + index + "' not in range [0.." + (this._supportedStatusList.size() - 1) + "]");
        }

        this._supportedStatusList.set(index, vSupportedStatus);
    }

    /**
     * 
     * 
     * @param vSupportedStatusArray
     */
    public void setSupportedStatus(
            final org.LexGrid.naming.SupportedStatus[] vSupportedStatusArray) {
        //-- copy array
        _supportedStatusList.clear();

        for (int i = 0; i < vSupportedStatusArray.length; i++) {
                this._supportedStatusList.add(vSupportedStatusArray[i]);
        }
    }

    /**
     * Sets the value of '_supportedStatusList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedStatusList the Vector to copy.
     */
    public void setSupportedStatus(
            final java.util.List<org.LexGrid.naming.SupportedStatus> vSupportedStatusList) {
        // copy vector
        this._supportedStatusList.clear();

        this._supportedStatusList.addAll(vSupportedStatusList);
    }

    /**
     * Sets the value of '_supportedStatusList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedStatusList the Vector to set.
     */
    public void setSupportedStatusAsReference(
            final java.util.List<org.LexGrid.naming.SupportedStatus> supportedStatusList) {
        this._supportedStatusList = supportedStatusList;
    }

    /**
     * Method unmarshalMappings.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.naming.Mappings
     */
    public static org.LexGrid.naming.Mappings unmarshalMappings(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.naming.Mappings) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.naming.Mappings.class, reader);
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
