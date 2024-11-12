/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * An entity on the "to" (or right hand) side of a relation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationTarget extends org.LexGrid.relations.AssociatableElement 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The entity code of the target entity.
     */
    private java.lang.String _targetEntityCode;

    /**
     * Local name of the namespace of the targetEntityCode.
     * targetEntityCodeNamespace must match a local id of a
     * supportedNamespace in the corresponding mappings section. If
     * omitted, the URI of targetEntityCode namespace is the
     * codingSchemeURI of the containing coding scheme.
     */
    private java.lang.String _targetEntityCodeNamespace;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationTarget() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'targetEntityCode'. The field
     * 'targetEntityCode' has the following description: The entity
     * code of the target entity.
     * 
     * @return the value of field 'TargetEntityCode'.
     */
    public java.lang.String getTargetEntityCode(
    ) {
        return this._targetEntityCode;
    }

    /**
     * Returns the value of field 'targetEntityCodeNamespace'. The
     * field 'targetEntityCodeNamespace' has the following
     * description: Local name of the namespace of the
     * targetEntityCode. targetEntityCodeNamespace must match a
     * local id of a supportedNamespace in the corresponding
     * mappings section. If omitted, the URI of targetEntityCode
     * namespace is the codingSchemeURI of the containing coding
     * scheme.
     * 
     * @return the value of field 'TargetEntityCodeNamespace'.
     */
    public java.lang.String getTargetEntityCodeNamespace(
    ) {
        return this._targetEntityCodeNamespace;
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
     * Sets the value of field 'targetEntityCode'. The field
     * 'targetEntityCode' has the following description: The entity
     * code of the target entity.
     * 
     * @param targetEntityCode the value of field 'targetEntityCode'
     */
    public void setTargetEntityCode(
            final java.lang.String targetEntityCode) {
        this._targetEntityCode = targetEntityCode;
    }

    /**
     * Sets the value of field 'targetEntityCodeNamespace'. The
     * field 'targetEntityCodeNamespace' has the following
     * description: Local name of the namespace of the
     * targetEntityCode. targetEntityCodeNamespace must match a
     * local id of a supportedNamespace in the corresponding
     * mappings section. If omitted, the URI of targetEntityCode
     * namespace is the codingSchemeURI of the containing coding
     * scheme.
     * 
     * @param targetEntityCodeNamespace the value of field
     * 'targetEntityCodeNamespace'.
     */
    public void setTargetEntityCodeNamespace(
            final java.lang.String targetEntityCodeNamespace) {
        this._targetEntityCodeNamespace = targetEntityCodeNamespace;
    }

    /**
     * Method unmarshalAssociationTarget.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.relations.AssociationTarget
     */
    public static org.LexGrid.relations.AssociationTarget unmarshalAssociationTarget(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.AssociationTarget) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.AssociationTarget.class, reader);
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
