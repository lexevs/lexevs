/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.SemNetLoaderPreferences;

/**
 * Class SemNetLoaderPreferencesDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class SemNetLoaderPreferencesDescriptor extends org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.descriptors.LoaderPreferencesDescriptor {


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

    public SemNetLoaderPreferencesDescriptor() {
        super();
        setExtendsWithoutFlatten(new org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.descriptors.LoaderPreferencesDescriptor());
        _nsURI = "http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/SemNetLoadPreferences";
        _xmlName = "SemNetLoaderPreferences";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _inheritanceLevel
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType.class, "_inheritanceLevel", "InheritanceLevel", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                SemNetLoaderPreferences target = (SemNetLoaderPreferences) object;
                return target.getInheritanceLevel();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    SemNetLoaderPreferences target = (SemNetLoaderPreferences) object;
                    target.setInheritanceLevel( (org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType) value);
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
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2009/01/Preferences/load/SemNetLoadPreferences");
        desc.setNillable(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _inheritanceLevel
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
        return org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.SemNetLoaderPreferences.class;
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
