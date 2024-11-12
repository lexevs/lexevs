/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.OWLLoaderPreferences;

/**
 * Class OWLLoaderPreferencesDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class OWLLoaderPreferencesDescriptor extends org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.descriptors.LoaderPreferencesDescriptor {


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

    public OWLLoaderPreferencesDescriptor() {
        super();
        setExtendsWithoutFlatten(new org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.descriptors.LoaderPreferencesDescriptor());
        _nsURI = "http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences";
        _xmlName = "OWLLoaderPreferences";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _propnamePrimitive
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_propnamePrimitive", "PropnamePrimitive", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getPropnamePrimitive();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setPropnamePrimitive( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _propnamePrimitive
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _propnameType
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_propnameType", "PropnameType", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getPropnameType();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setPropnameType( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _propnameType
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchConceptCode
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchConceptCode", "MatchConceptCode", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchConceptCode();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchConceptCode( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchConceptCode
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchConceptStatus
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchConceptStatus", "MatchConceptStatus", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchConceptStatus();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchConceptStatus( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchConceptStatus
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchNoopNamespaces
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchNoopNamespaces", "MatchNoopNamespaces", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchNoopNamespaces();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchNoopNamespaces( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchNoopNamespaces
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchRootName
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchRootName", "MatchRootName", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchRootName();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchRootName( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchRootName
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchXMLRepformNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchXMLRepformNames", "MatchXMLRepformNames", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchXMLRepformNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchXMLRepformNames( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchXMLRepformNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchXMLSourceNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchXMLSourceNames", "MatchXMLSourceNames", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchXMLSourceNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchXMLSourceNames( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchXMLSourceNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matchXMLTextNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_matchXMLTextNames", "MatchXMLTextNames", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getMatchXMLTextNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setMatchXMLTextNames( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _matchXMLTextNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _isDBXrefSource
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.class, "_isDBXrefSource", "IsDBXrefSource", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getIsDBXrefSource();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setIsDBXrefSource( (java.lang.Boolean) value);
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
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _isDBXrefSource
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _isDBXrefRepform
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.class, "_isDBXrefRepform", "IsDBXrefRepform", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getIsDBXrefRepform();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setIsDBXrefRepform( (java.lang.Boolean) value);
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
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _isDBXrefRepform
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _processComplexProps
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.class, "_processComplexProps", "ProcessComplexProps", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getProcessComplexProps();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setProcessComplexProps( (java.lang.Boolean) value);
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
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _processComplexProps
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _strictOWLImplementation
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.class, "_strictOWLImplementation", "StrictOWLImplementation", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getStrictOWLImplementation();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setStrictOWLImplementation( (java.lang.Boolean) value);
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
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _strictOWLImplementation
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _createConceptForObjectProp
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.class, "_createConceptForObjectProp", "CreateConceptForObjectProp", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getCreateConceptForObjectProp();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setCreateConceptForObjectProp( (java.lang.Boolean) value);
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
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _createConceptForObjectProp
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _datatypePropSwitch
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_datatypePropSwitch", "DatatypePropSwitch", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getDatatypePropSwitch();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setDatatypePropSwitch( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _datatypePropSwitch
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _prioritizedCommentNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames.class, "_prioritizedCommentNames", "PrioritizedCommentNames", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getPrioritizedCommentNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setPrioritizedCommentNames( (org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setNillable(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _prioritizedCommentNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _prioritizedDefinitionNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames.class, "_prioritizedDefinitionNames", "PrioritizedDefinitionNames", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getPrioritizedDefinitionNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setPrioritizedDefinitionNames( (org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setNillable(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _prioritizedDefinitionNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _prioritizedPresentationNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames.class, "_prioritizedPresentationNames", "PrioritizedPresentationNames", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getPrioritizedPresentationNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setPrioritizedPresentationNames( (org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setNillable(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _prioritizedPresentationNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _isTransitiveManaged
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.class, "_isTransitiveManaged", "IsTransitiveManaged", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getIsTransitiveManaged();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setIsTransitiveManaged( (java.lang.Boolean) value);
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
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _isTransitiveManaged
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _transitiveInverseAssociatinNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames.class, "_transitiveInverseAssociatinNames", "TransitiveInverseAssociatinNames", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getTransitiveInverseAssociatinNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setTransitiveInverseAssociatinNames( (org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setNillable(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _transitiveInverseAssociatinNames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _transitiveNormalAssociationNames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames.class, "_transitiveNormalAssociationNames", "TransitiveNormalAssociationNames", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                return target.getTransitiveNormalAssociationNames();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    OWLLoaderPreferences target = (OWLLoaderPreferences) object;
                    target.setTransitiveNormalAssociationNames( (org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/OWLLoadPreferences");
        desc.setNillable(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _transitiveNormalAssociationNames
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
        return org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.OWLLoaderPreferences.class;
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
