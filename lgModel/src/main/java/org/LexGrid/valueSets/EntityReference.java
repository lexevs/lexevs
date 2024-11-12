/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * A reference to an entityCode and/or one or more entityCodes that
 * have a relationship to the specified entity code.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityReference extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The entity code being referenced.
     */
    private java.lang.String _entityCode;

    /**
     * Local identifier of the namespace of the entityCode.
     * entityCodeNamespace must match a local id of a
     * supportedNamespace in the corresponding mappings section. If
     * omitted, the URI of the defaultCodingScheme will be used as
     * the URI of the entity code.
     */
    private java.lang.String _entityCodeNamespace;

    /**
     * The local identifier of an association that appears in the
     * native relations collection in the default coding scheme.
     * This association is used to describe a set of entity codes.
     * If absent, only the entityCode itself is included in this
     * definition.
     */
    private java.lang.String _referenceAssociation;

    /**
     * If true and referenceAssociation is supplied and
     * referenceAssociation is defined as transitive, include all
     * entity codes that belong to transitive closure of
     * referenceAssociation as applied to entity code. Default: fals
     */
    private java.lang.Boolean _transitiveClosure;

    /**
     * If true and referenceAssociation is supplied and
     * referenceAssociation is defined as transitive, include all
     * entity codes that are "leaves" in transitive closure of
     * referenceAssociation as applied to entity code. Default: fals
     */
    private java.lang.Boolean _leafOnly;

    /**
     * If true and referenceAssociation is supplied, navigate from
     * entityCode as the association target to the corresponding
     * sources. If transitiveClosure is true and the
     * referenceAssociation is transitive, include all the
     * ancestors in the list rather than just the direct "parents"
     * (sources).
     */
    private java.lang.Boolean _targetToSource;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'entityCode'. The field
     * 'entityCode' has the following description: The entity code
     * being referenced.
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
     * the URI of the entity code.
     * 
     * @return the value of field 'EntityCodeNamespace'.
     */
    public java.lang.String getEntityCodeNamespace(
    ) {
        return this._entityCodeNamespace;
    }

    /**
     * Returns the value of field 'leafOnly'. The field 'leafOnly'
     * has the following description: If true and
     * referenceAssociation is supplied and referenceAssociation is
     * defined as transitive, include all entity codes that are
     * "leaves" in transitive closure of referenceAssociation as
     * applied to entity code. Default: false
     * 
     * @return the value of field 'LeafOnly'.
     */
    public java.lang.Boolean getLeafOnly(
    ) {
        return this._leafOnly;
    }

    /**
     * Returns the value of field 'referenceAssociation'. The field
     * 'referenceAssociation' has the following description: The
     * local identifier of an association that appears in the
     * native relations collection in the default coding scheme.
     * This association is used to describe a set of entity codes.
     * If absent, only the entityCode itself is included in this
     * definition.
     * 
     * @return the value of field 'ReferenceAssociation'.
     */
    public java.lang.String getReferenceAssociation(
    ) {
        return this._referenceAssociation;
    }

    /**
     * Returns the value of field 'targetToSource'. The field
     * 'targetToSource' has the following description: If true and
     * referenceAssociation is supplied, navigate from entityCode
     * as the association target to the corresponding sources. If
     * transitiveClosure is true and the referenceAssociation is
     * transitive, include all the ancestors in the list rather
     * than just the direct "parents" (sources).
     * 
     * @return the value of field 'TargetToSource'.
     */
    public java.lang.Boolean getTargetToSource(
    ) {
        return this._targetToSource;
    }

    /**
     * Returns the value of field 'transitiveClosure'. The field
     * 'transitiveClosure' has the following description: If true
     * and referenceAssociation is supplied and
     * referenceAssociation is defined as transitive, include all
     * entity codes that belong to transitive closure of
     * referenceAssociation as applied to entity code. Default:
     * false
     * 
     * @return the value of field 'TransitiveClosure'.
     */
    public java.lang.Boolean getTransitiveClosure(
    ) {
        return this._transitiveClosure;
    }

    /**
     * Returns the value of field 'leafOnly'. The field 'leafOnly'
     * has the following description: If true and
     * referenceAssociation is supplied and referenceAssociation is
     * defined as transitive, include all entity codes that are
     * "leaves" in transitive closure of referenceAssociation as
     * applied to entity code. Default: false
     * 
     * @return the value of field 'LeafOnly'.
     */
    public java.lang.Boolean isLeafOnly(
    ) {
        return this._leafOnly;
    }

    /**
     * Returns the value of field 'targetToSource'. The field
     * 'targetToSource' has the following description: If true and
     * referenceAssociation is supplied, navigate from entityCode
     * as the association target to the corresponding sources. If
     * transitiveClosure is true and the referenceAssociation is
     * transitive, include all the ancestors in the list rather
     * than just the direct "parents" (sources).
     * 
     * @return the value of field 'TargetToSource'.
     */
    public java.lang.Boolean isTargetToSource(
    ) {
        return this._targetToSource;
    }

    /**
     * Returns the value of field 'transitiveClosure'. The field
     * 'transitiveClosure' has the following description: If true
     * and referenceAssociation is supplied and
     * referenceAssociation is defined as transitive, include all
     * entity codes that belong to transitive closure of
     * referenceAssociation as applied to entity code. Default:
     * false
     * 
     * @return the value of field 'TransitiveClosure'.
     */
    public java.lang.Boolean isTransitiveClosure(
    ) {
        return this._transitiveClosure;
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
     * Sets the value of field 'entityCode'. The field 'entityCode'
     * has the following description: The entity code being
     * referenced.
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
     * the URI of the entity code.
     * 
     * @param entityCodeNamespace the value of field
     * 'entityCodeNamespace'.
     */
    public void setEntityCodeNamespace(
            final java.lang.String entityCodeNamespace) {
        this._entityCodeNamespace = entityCodeNamespace;
    }

    /**
     * Sets the value of field 'leafOnly'. The field 'leafOnly' has
     * the following description: If true and referenceAssociation
     * is supplied and referenceAssociation is defined as
     * transitive, include all entity codes that are "leaves" in
     * transitive closure of referenceAssociation as applied to
     * entity code. Default: false
     * 
     * @param leafOnly the value of field 'leafOnly'.
     */
    public void setLeafOnly(
            final java.lang.Boolean leafOnly) {
        this._leafOnly = leafOnly;
    }

    /**
     * Sets the value of field 'referenceAssociation'. The field
     * 'referenceAssociation' has the following description: The
     * local identifier of an association that appears in the
     * native relations collection in the default coding scheme.
     * This association is used to describe a set of entity codes.
     * If absent, only the entityCode itself is included in this
     * definition.
     * 
     * @param referenceAssociation the value of field
     * 'referenceAssociation'.
     */
    public void setReferenceAssociation(
            final java.lang.String referenceAssociation) {
        this._referenceAssociation = referenceAssociation;
    }

    /**
     * Sets the value of field 'targetToSource'. The field
     * 'targetToSource' has the following description: If true and
     * referenceAssociation is supplied, navigate from entityCode
     * as the association target to the corresponding sources. If
     * transitiveClosure is true and the referenceAssociation is
     * transitive, include all the ancestors in the list rather
     * than just the direct "parents" (sources).
     * 
     * @param targetToSource the value of field 'targetToSource'.
     */
    public void setTargetToSource(
            final java.lang.Boolean targetToSource) {
        this._targetToSource = targetToSource;
    }

    /**
     * Sets the value of field 'transitiveClosure'. The field
     * 'transitiveClosure' has the following description: If true
     * and referenceAssociation is supplied and
     * referenceAssociation is defined as transitive, include all
     * entity codes that belong to transitive closure of
     * referenceAssociation as applied to entity code. Default:
     * false
     * 
     * @param transitiveClosure the value of field
     * 'transitiveClosure'.
     */
    public void setTransitiveClosure(
            final java.lang.Boolean transitiveClosure) {
        this._transitiveClosure = transitiveClosure;
    }

    /**
     * Method unmarshalEntityReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.valueSets.EntityReference
     */
    public static org.LexGrid.valueSets.EntityReference unmarshalEntityReference(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.EntityReference) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.EntityReference.class, reader);
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
