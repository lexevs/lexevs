/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.LexBIG.DataModel.Core.ResolvedCodedNodeReference;

/**
 * Class ResolvedCodedNodeReferenceDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class ResolvedCodedNodeReferenceDescriptor extends org.LexGrid.LexBIG.DataModel.Core.descriptors.ConceptReferenceDescriptor {


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

    public ResolvedCodedNodeReferenceDescriptor() {
        super();
        setExtendsWithoutFlatten(new org.LexGrid.LexBIG.DataModel.Core.descriptors.ConceptReferenceDescriptor());
        _nsURI = "http://LexGrid.org/schema/LexBIG/2010/01/Core";
        _xmlName = "ResolvedCodedNodeReference";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _codingSchemeURI
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_codingSchemeURI", "codingSchemeURI", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                return target.getCodingSchemeURI();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                    target.setCodingSchemeURI( (java.lang.String) value);
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
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _codingSchemeURI
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _codingSchemeVersion
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_codingSchemeVersion", "codingSchemeVersion", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                return target.getCodingSchemeVersion();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                    target.setCodingSchemeVersion( (java.lang.String) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _codingSchemeVersion
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
            typeValidator.setMinLength(1);
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _entityDescription
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.commonTypes.EntityDescription.class, "_entityDescription", "entityDescription", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                return target.getEntityDescription();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                    target.setEntityDescription( (org.LexGrid.commonTypes.EntityDescription) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.commonTypes.EntityDescription();
            }
        };
        desc.setSchemaType("org.LexGrid.commonTypes.EntityDescription");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/Core");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _entityDescription
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _entity
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.concepts.Entity.class, "_entity", "entity", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                return target.getEntity();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                    target.setEntity( (org.LexGrid.concepts.Entity) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.concepts.Entity();
            }
        };
        desc.setSchemaType("org.LexGrid.concepts.Entity");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/Core");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _entity
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _sourceOf
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.DataModel.Collections.AssociationList.class, "_sourceOf", "sourceOf", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                return target.getSourceOf();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                    target.setSourceOf( (org.LexGrid.LexBIG.DataModel.Collections.AssociationList) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.DataModel.Collections.AssociationList();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.DataModel.Collections.AssociationList");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/Core");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _sourceOf
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _targetOf
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.DataModel.Collections.AssociationList.class, "_targetOf", "targetOf", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                return target.getTargetOf();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ResolvedCodedNodeReference target = (ResolvedCodedNodeReference) object;
                    target.setTargetOf( (org.LexGrid.LexBIG.DataModel.Collections.AssociationList) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.DataModel.Collections.AssociationList();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.DataModel.Collections.AssociationList");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/Core");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _targetOf
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
        if (_identity == null) {
            return super.getIdentity();
        }
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
        return org.LexGrid.LexBIG.DataModel.Core.ResolvedCodedNodeReference.class;
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
