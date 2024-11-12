/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexOnt.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.LexOnt.CodingSchemeManifest;

/**
 * Class CodingSchemeManifestDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class CodingSchemeManifestDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public CodingSchemeManifestDescriptor() {
        super();
        _nsURI = "http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest";
        _xmlName = "codingSchemeManifest";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _id
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_id", "id", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getId();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setId( (java.lang.String) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new java.lang.String();
            }
        };
        desc.setSchemaType("anyURI");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _id
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _codingScheme
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfCodingSchemeName.class, "_codingScheme", "codingScheme", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getCodingScheme();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setCodingScheme( (org.LexGrid.LexOnt.CsmfCodingSchemeName) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfCodingSchemeName();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfCodingSchemeName");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _codingScheme
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _entityDescription
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfEntityDescription.class, "_entityDescription", "entityDescription", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getEntityDescription();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setEntityDescription( (org.LexGrid.LexOnt.CsmfEntityDescription) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfEntityDescription();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfEntityDescription");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _entityDescription
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _formalName
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfFormalName.class, "_formalName", "formalName", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getFormalName();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setFormalName( (org.LexGrid.LexOnt.CsmfFormalName) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfFormalName();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfFormalName");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _formalName
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _codingSchemeURI
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfCodingSchemeURI.class, "_codingSchemeURI", "codingSchemeURI", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getCodingSchemeURI();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setCodingSchemeURI( (org.LexGrid.LexOnt.CsmfCodingSchemeURI) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfCodingSchemeURI();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfCodingSchemeURI");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _codingSchemeURI
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _defaultLanguage
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfDefaultLanguage.class, "_defaultLanguage", "defaultLanguage", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getDefaultLanguage();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setDefaultLanguage( (org.LexGrid.LexOnt.CsmfDefaultLanguage) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfDefaultLanguage();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfDefaultLanguage");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _defaultLanguage
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _representsVersion
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfVersion.class, "_representsVersion", "representsVersion", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getRepresentsVersion();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setRepresentsVersion( (org.LexGrid.LexOnt.CsmfVersion) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfVersion();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfVersion");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _representsVersion
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _localNameList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfLocalName.class, "_localNameList", "localName", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getLocalName();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.addLocalName( (org.LexGrid.LexOnt.CsmfLocalName) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.removeAllLocalName();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfLocalName();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.LexOnt.CsmfLocalName");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _localNameList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _sourceList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfSource.class, "_sourceList", "source", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getSource();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.addSource( (org.LexGrid.LexOnt.CsmfSource) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.removeAllSource();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfSource();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.LexGrid.LexOnt.CsmfSource");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _sourceList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _copyright
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfText.class, "_copyright", "copyright", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getCopyright();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setCopyright( (org.LexGrid.LexOnt.CsmfText) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfText();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfText");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _copyright
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _mappings
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfMappings.class, "_mappings", "mappings", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getMappings();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setMappings( (org.LexGrid.LexOnt.CsmfMappings) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfMappings();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfMappings");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _mappings
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _associationDefinitions
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexOnt.CsmfAssociationDefinition.class, "_associationDefinitions", "associationDefinitions", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeManifest target = (CodingSchemeManifest) object;
                return target.getAssociationDefinitions();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeManifest target = (CodingSchemeManifest) object;
                    target.setAssociationDefinitions( (org.LexGrid.LexOnt.CsmfAssociationDefinition) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexOnt.CsmfAssociationDefinition();
            }
        };
        desc.setSchemaType("org.LexGrid.LexOnt.CsmfAssociationDefinition");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexOnt/CodingSchemeManifest");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _associationDefinitions
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
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
        return org.LexGrid.LexOnt.CodingSchemeManifest.class;
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
