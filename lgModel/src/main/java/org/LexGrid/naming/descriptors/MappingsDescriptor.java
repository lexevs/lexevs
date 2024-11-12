/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.naming.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.naming.Mappings;

/**
 * Class MappingsDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class MappingsDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public MappingsDescriptor() {
        super();
        _nsURI = "http://LexGrid.org/schema/2010/01/LexGrid/naming";
        _xmlName = "mappings";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _supportedAssociationList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedAssociation.class, "_supportedAssociationList", "supportedAssociation", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedAssociation();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedAssociation( (org.LexGrid.naming.SupportedAssociation) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedAssociation();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedAssociation();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedAssociation");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedAssociationList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedAssociationQualifierList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedAssociationQualifier.class, "_supportedAssociationQualifierList", "supportedAssociationQualifier", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedAssociationQualifier();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedAssociationQualifier( (org.LexGrid.naming.SupportedAssociationQualifier) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedAssociationQualifier();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedAssociationQualifier();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedAssociationQualifier");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedAssociationQualifierList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedCodingSchemeList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedCodingScheme.class, "_supportedCodingSchemeList", "supportedCodingScheme", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedCodingScheme();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedCodingScheme( (org.LexGrid.naming.SupportedCodingScheme) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedCodingScheme();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedCodingScheme();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedCodingScheme");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedCodingSchemeList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedConceptDomainList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedConceptDomain.class, "_supportedConceptDomainList", "supportedConceptDomain", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedConceptDomain();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedConceptDomain( (org.LexGrid.naming.SupportedConceptDomain) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedConceptDomain();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedConceptDomain();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedConceptDomain");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedConceptDomainList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedContainerNameList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedContainerName.class, "_supportedContainerNameList", "supportedContainerName", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedContainerName();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedContainerName( (org.LexGrid.naming.SupportedContainerName) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedContainerName();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedContainerName();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedContainerName");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedContainerNameList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedContextList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedContext.class, "_supportedContextList", "supportedContext", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedContext();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedContext( (org.LexGrid.naming.SupportedContext) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedContext();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedContext();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedContext");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedContextList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedDataTypeList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedDataType.class, "_supportedDataTypeList", "supportedDataType", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedDataType();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedDataType( (org.LexGrid.naming.SupportedDataType) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedDataType();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedDataType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedDataType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedDataTypeList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedDegreeOfFidelityList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedDegreeOfFidelity.class, "_supportedDegreeOfFidelityList", "supportedDegreeOfFidelity", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedDegreeOfFidelity();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedDegreeOfFidelity( (org.LexGrid.naming.SupportedDegreeOfFidelity) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedDegreeOfFidelity();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedDegreeOfFidelity();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedDegreeOfFidelity");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedDegreeOfFidelityList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedEntityTypeList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedEntityType.class, "_supportedEntityTypeList", "supportedEntityType", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedEntityType();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedEntityType( (org.LexGrid.naming.SupportedEntityType) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedEntityType();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedEntityType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedEntityType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedEntityTypeList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedHierarchyList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedHierarchy.class, "_supportedHierarchyList", "supportedHierarchy", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedHierarchy();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedHierarchy( (org.LexGrid.naming.SupportedHierarchy) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedHierarchy();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedHierarchy();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedHierarchy");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedHierarchyList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedLanguageList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedLanguage.class, "_supportedLanguageList", "supportedLanguage", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedLanguage();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedLanguage( (org.LexGrid.naming.SupportedLanguage) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedLanguage();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedLanguage();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedLanguage");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedLanguageList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedNamespaceList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedNamespace.class, "_supportedNamespaceList", "supportedNamespace", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedNamespace();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedNamespace( (org.LexGrid.naming.SupportedNamespace) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedNamespace();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedNamespace();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedNamespace");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedNamespaceList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedPropertyList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedProperty.class, "_supportedPropertyList", "supportedProperty", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedProperty();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedProperty( (org.LexGrid.naming.SupportedProperty) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedProperty();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedProperty();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedProperty");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedPropertyList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedPropertyTypeList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedPropertyType.class, "_supportedPropertyTypeList", "supportedPropertyType", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedPropertyType();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedPropertyType( (org.LexGrid.naming.SupportedPropertyType) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedPropertyType();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedPropertyType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedPropertyType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedPropertyTypeList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedPropertyLinkList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedPropertyLink.class, "_supportedPropertyLinkList", "supportedPropertyLink", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedPropertyLink();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedPropertyLink( (org.LexGrid.naming.SupportedPropertyLink) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedPropertyLink();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedPropertyLink();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedPropertyLink");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedPropertyLinkList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedPropertyQualifierList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedPropertyQualifier.class, "_supportedPropertyQualifierList", "supportedPropertyQualifier", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedPropertyQualifier();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedPropertyQualifier( (org.LexGrid.naming.SupportedPropertyQualifier) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedPropertyQualifier();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedPropertyQualifier();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedPropertyQualifier");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedPropertyQualifierList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedPropertyQualifierTypeList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedPropertyQualifierType.class, "_supportedPropertyQualifierTypeList", "supportedPropertyQualifierType", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedPropertyQualifierType();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedPropertyQualifierType( (org.LexGrid.naming.SupportedPropertyQualifierType) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedPropertyQualifierType();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedPropertyQualifierType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedPropertyQualifierType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedPropertyQualifierTypeList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedRepresentationalFormList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedRepresentationalForm.class, "_supportedRepresentationalFormList", "supportedRepresentationalForm", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedRepresentationalForm();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedRepresentationalForm( (org.LexGrid.naming.SupportedRepresentationalForm) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedRepresentationalForm();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedRepresentationalForm();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedRepresentationalForm");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedRepresentationalFormList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedSortOrderList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedSortOrder.class, "_supportedSortOrderList", "supportedSortOrder", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedSortOrder();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedSortOrder( (org.LexGrid.naming.SupportedSortOrder) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedSortOrder();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedSortOrder();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedSortOrder");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedSortOrderList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedSourceList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedSource.class, "_supportedSourceList", "supportedSource", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedSource();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedSource( (org.LexGrid.naming.SupportedSource) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedSource();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedSource();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedSource");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedSourceList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedSourceRoleList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedSourceRole.class, "_supportedSourceRoleList", "supportedSourceRole", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedSourceRole();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedSourceRole( (org.LexGrid.naming.SupportedSourceRole) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedSourceRole();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedSourceRole();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedSourceRole");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedSourceRoleList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _supportedStatusList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.naming.SupportedStatus.class, "_supportedStatusList", "supportedStatus", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Mappings target = (Mappings) object;
                return target.getSupportedStatus();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Mappings target = (Mappings) object;
                    target.addSupportedStatus( (org.LexGrid.naming.SupportedStatus) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Mappings target = (Mappings) object;
                    target.removeAllSupportedStatus();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.naming.SupportedStatus();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.naming.SupportedStatus");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/naming");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _supportedStatusList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return org.LexGrid.naming.Mappings.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
