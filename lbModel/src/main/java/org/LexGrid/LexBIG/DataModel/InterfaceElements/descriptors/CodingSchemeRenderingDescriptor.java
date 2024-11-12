/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering;

/**
 * Class CodingSchemeRenderingDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class CodingSchemeRenderingDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public CodingSchemeRenderingDescriptor() {
        super();
        _nsURI = "http://LexGrid.org/schema/LexBIG/2010/01/InterfaceElements";
        _xmlName = "CodingSchemeRendering";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _codingSchemeSummary
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary.class, "_codingSchemeSummary", "codingSchemeSummary", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeRendering target = (CodingSchemeRendering) object;
                return target.getCodingSchemeSummary();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeRendering target = (CodingSchemeRendering) object;
                    target.setCodingSchemeSummary( (org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/InterfaceElements");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _codingSchemeSummary
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _renderingDetail
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail.class, "_renderingDetail", "renderingDetail", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeRendering target = (CodingSchemeRendering) object;
                return target.getRenderingDetail();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeRendering target = (CodingSchemeRendering) object;
                    target.setRenderingDetail( (org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/InterfaceElements");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _renderingDetail
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _serviceHandle
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.DataModel.Core.ReferenceLink.class, "_serviceHandle", "serviceHandle", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeRendering target = (CodingSchemeRendering) object;
                return target.getServiceHandle();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeRendering target = (CodingSchemeRendering) object;
                    target.setServiceHandle( (org.LexGrid.LexBIG.DataModel.Core.ReferenceLink) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.DataModel.Core.ReferenceLink();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.DataModel.Core.ReferenceLink");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/InterfaceElements");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _serviceHandle
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _referenceLink
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.LexGrid.LexBIG.DataModel.Core.ReferenceLink.class, "_referenceLink", "referenceLink", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CodingSchemeRendering target = (CodingSchemeRendering) object;
                return target.getReferenceLink();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CodingSchemeRendering target = (CodingSchemeRendering) object;
                    target.setReferenceLink( (org.LexGrid.LexBIG.DataModel.Core.ReferenceLink) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.LexGrid.LexBIG.DataModel.Core.ReferenceLink();
            }
        };
        desc.setSchemaType("org.LexGrid.LexBIG.DataModel.Core.ReferenceLink");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://LexGrid.org/schema/LexBIG/2010/01/InterfaceElements");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _referenceLink
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
        return org.LexGrid.LexBIG.DataModel.InterfaceElements.CodingSchemeRendering.class;
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
