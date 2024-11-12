/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.versions.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.versions.ChangedEntry;

/**
 * Class ChangedEntryDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class ChangedEntryDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public ChangedEntryDescriptor() {
        super();
        _nsURI = "http://LexGrid.org/schema/2010/01/LexGrid/versions";
        _xmlName = "changedEntry";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsChoice();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _changedCodingSchemeEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.codingSchemes.CodingScheme.class, "_changedCodingSchemeEntry", "changedCodingSchemeEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ChangedEntry target = (ChangedEntry) object;
                return target.getChangedCodingSchemeEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ChangedEntry target = (ChangedEntry) object;
                    target.setChangedCodingSchemeEntry( (org.LexGrid.codingSchemes.CodingScheme) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.codingSchemes.CodingScheme();
            }
        };
        desc.setSchemaType("org.LexGrid.codingSchemes.CodingScheme");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/versions");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _changedCodingSchemeEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _changedPickListDefinitionEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.valueSets.PickListDefinition.class, "_changedPickListDefinitionEntry", "changedPickListDefinitionEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ChangedEntry target = (ChangedEntry) object;
                return target.getChangedPickListDefinitionEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ChangedEntry target = (ChangedEntry) object;
                    target.setChangedPickListDefinitionEntry( (org.LexGrid.valueSets.PickListDefinition) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.valueSets.PickListDefinition();
            }
        };
        desc.setSchemaType("org.LexGrid.valueSets.PickListDefinition");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/versions");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _changedPickListDefinitionEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _changedValueSetDefinitionEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.valueSets.ValueSetDefinition.class, "_changedValueSetDefinitionEntry", "changedValueSetDefinitionEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ChangedEntry target = (ChangedEntry) object;
                return target.getChangedValueSetDefinitionEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ChangedEntry target = (ChangedEntry) object;
                    target.setChangedValueSetDefinitionEntry( (org.LexGrid.valueSets.ValueSetDefinition) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.valueSets.ValueSetDefinition();
            }
        };
        desc.setSchemaType("org.LexGrid.valueSets.ValueSetDefinition");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/2010/01/LexGrid/versions");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _changedValueSetDefinitionEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
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
        return org.LexGrid.versions.ChangedEntry.class;
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
