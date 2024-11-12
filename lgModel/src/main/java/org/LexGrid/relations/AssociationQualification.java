/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.relations;

/**
 * A modifier that further qualifies the particular association
 * instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationQualification extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local name of the association qualifier.
     * codingSchemeName must match a local id of a
     * supportedAssociationQualifier in the mappings section.
     */
    private java.lang.String _associationQualifier;

    /**
     * The value associated with this qualifier, if any.
     */
    private org.LexGrid.commonTypes.Text _qualifierText;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationQualification() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'associationQualifier'. The field
     * 'associationQualifier' has the following description: The
     * local name of the association qualifier. codingSchemeName
     * must match a local id of a supportedAssociationQualifier in
     * the mappings section.
     * 
     * @return the value of field 'AssociationQualifier'.
     */
    public java.lang.String getAssociationQualifier(
    ) {
        return this._associationQualifier;
    }

    /**
     * Returns the value of field 'qualifierText'. The field
     * 'qualifierText' has the following description: The value
     * associated with this qualifier, if any.
     * 
     * @return the value of field 'QualifierText'.
     */
    public org.LexGrid.commonTypes.Text getQualifierText(
    ) {
        return this._qualifierText;
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
     * Sets the value of field 'associationQualifier'. The field
     * 'associationQualifier' has the following description: The
     * local name of the association qualifier. codingSchemeName
     * must match a local id of a supportedAssociationQualifier in
     * the mappings section.
     * 
     * @param associationQualifier the value of field
     * 'associationQualifier'.
     */
    public void setAssociationQualifier(
            final java.lang.String associationQualifier) {
        this._associationQualifier = associationQualifier;
    }

    /**
     * Sets the value of field 'qualifierText'. The field
     * 'qualifierText' has the following description: The value
     * associated with this qualifier, if any.
     * 
     * @param qualifierText the value of field 'qualifierText'.
     */
    public void setQualifierText(
            final org.LexGrid.commonTypes.Text qualifierText) {
        this._qualifierText = qualifierText;
    }

    /**
     * Method unmarshalAssociationQualification.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.relations.AssociationQualification
     */
    public static org.LexGrid.relations.AssociationQualification unmarshalAssociationQualification(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.relations.AssociationQualification) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.relations.AssociationQualification.class, reader);
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
