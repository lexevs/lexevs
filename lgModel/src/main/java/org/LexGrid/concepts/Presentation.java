/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.concepts;

/**
 * A property ths represents or designates the meaning of the
 * entityCode. The propertyType of presentation must be
 * "presentation"
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Presentation extends org.LexGrid.commonTypes.Property 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * True means that, if the text meets the selection criteria,
     * it should be the preferred form. For a given language there
     * should be only one preferred presentation. 
     */
    private java.lang.Boolean _isPreferred;

    /**
     * A local identifier that states how closely a term
     * approximates the intended meaning of an entry code.
     * degreeOfFidelity must match a local id of a
     * supportedDegreeOfFidelity in the corresponding mappings
     * section. 
     */
    private java.lang.String _degreeOfFidelity;

    /**
     * True means that this presentation is valid in a acontextual
     * setting - that it is always valid in the given language.
     * Default: true if there are no property usageContexts, false
     * otherwise.
     */
    private java.lang.Boolean _matchIfNoContext;

    /**
     * A local identifier that states how the term represents the
     * concept (abbrev, acronym, etc.) representationalForm must
     * match a local id of a representationalForm in the
     * corresponding mappings section.
     */
    private java.lang.String _representationalForm;


      //----------------/
     //- Constructors -/
    //----------------/

    public Presentation() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'degreeOfFidelity'. The field
     * 'degreeOfFidelity' has the following description: A local
     * identifier that states how closely a term approximates the
     * intended meaning of an entry code. degreeOfFidelity must
     * match a local id of a supportedDegreeOfFidelity in the
     * corresponding mappings section. 
     * 
     * @return the value of field 'DegreeOfFidelity'.
     */
    public java.lang.String getDegreeOfFidelity(
    ) {
        return this._degreeOfFidelity;
    }

    /**
     * Returns the value of field 'isPreferred'. The field
     * 'isPreferred' has the following description: True means
     * that, if the text meets the selection criteria, it should be
     * the preferred form. For a given language there should be
     * only one preferred presentation. 
     * 
     * @return the value of field 'IsPreferred'.
     */
    public java.lang.Boolean getIsPreferred(
    ) {
        return this._isPreferred;
    }

    /**
     * Returns the value of field 'matchIfNoContext'. The field
     * 'matchIfNoContext' has the following description: True means
     * that this presentation is valid in a acontextual setting -
     * that it is always valid in the given language. Default: true
     * if there are no property usageContexts, false otherwise.
     * 
     * @return the value of field 'MatchIfNoContext'.
     */
    public java.lang.Boolean getMatchIfNoContext(
    ) {
        return this._matchIfNoContext;
    }

    /**
     * Returns the value of field 'representationalForm'. The field
     * 'representationalForm' has the following description: A
     * local identifier that states how the term represents the
     * concept (abbrev, acronym, etc.) representationalForm must
     * match a local id of a representationalForm in the
     * corresponding mappings section.
     * 
     * @return the value of field 'RepresentationalForm'.
     */
    public java.lang.String getRepresentationalForm(
    ) {
        return this._representationalForm;
    }

    /**
     * Returns the value of field 'isPreferred'. The field
     * 'isPreferred' has the following description: True means
     * that, if the text meets the selection criteria, it should be
     * the preferred form. For a given language there should be
     * only one preferred presentation. 
     * 
     * @return the value of field 'IsPreferred'.
     */
    public java.lang.Boolean isIsPreferred(
    ) {
        return this._isPreferred;
    }

    /**
     * Returns the value of field 'matchIfNoContext'. The field
     * 'matchIfNoContext' has the following description: True means
     * that this presentation is valid in a acontextual setting -
     * that it is always valid in the given language. Default: true
     * if there are no property usageContexts, false otherwise.
     * 
     * @return the value of field 'MatchIfNoContext'.
     */
    public java.lang.Boolean isMatchIfNoContext(
    ) {
        return this._matchIfNoContext;
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
     * Sets the value of field 'degreeOfFidelity'. The field
     * 'degreeOfFidelity' has the following description: A local
     * identifier that states how closely a term approximates the
     * intended meaning of an entry code. degreeOfFidelity must
     * match a local id of a supportedDegreeOfFidelity in the
     * corresponding mappings section. 
     * 
     * @param degreeOfFidelity the value of field 'degreeOfFidelity'
     */
    public void setDegreeOfFidelity(
            final java.lang.String degreeOfFidelity) {
        this._degreeOfFidelity = degreeOfFidelity;
    }

    /**
     * Sets the value of field 'isPreferred'. The field
     * 'isPreferred' has the following description: True means
     * that, if the text meets the selection criteria, it should be
     * the preferred form. For a given language there should be
     * only one preferred presentation. 
     * 
     * @param isPreferred the value of field 'isPreferred'.
     */
    public void setIsPreferred(
            final java.lang.Boolean isPreferred) {
        this._isPreferred = isPreferred;
    }

    /**
     * Sets the value of field 'matchIfNoContext'. The field
     * 'matchIfNoContext' has the following description: True means
     * that this presentation is valid in a acontextual setting -
     * that it is always valid in the given language. Default: true
     * if there are no property usageContexts, false otherwise.
     * 
     * @param matchIfNoContext the value of field 'matchIfNoContext'
     */
    public void setMatchIfNoContext(
            final java.lang.Boolean matchIfNoContext) {
        this._matchIfNoContext = matchIfNoContext;
    }

    /**
     * Sets the value of field 'representationalForm'. The field
     * 'representationalForm' has the following description: A
     * local identifier that states how the term represents the
     * concept (abbrev, acronym, etc.) representationalForm must
     * match a local id of a representationalForm in the
     * corresponding mappings section.
     * 
     * @param representationalForm the value of field
     * 'representationalForm'.
     */
    public void setRepresentationalForm(
            final java.lang.String representationalForm) {
        this._representationalForm = representationalForm;
    }

    /**
     * Method unmarshalPresentation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.LexGrid.concepts.Presentation
     */
    public static org.LexGrid.concepts.Presentation unmarshalPresentation(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.concepts.Presentation) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.concepts.Presentation.class, reader);
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
