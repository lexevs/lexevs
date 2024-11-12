/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets;

/**
 * Class PickListEntryNodeChoice.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PickListEntryNodeChoice extends org.mayo.edu.lgModel.LexGridBase 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _exclusionEntry.
     */
    private org.LexGrid.valueSets.PickListEntryExclusion _exclusionEntry;

    /**
     * Field _inclusionEntry.
     */
    private org.LexGrid.valueSets.PickListEntry _inclusionEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public PickListEntryNodeChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'exclusionEntry'.
     * 
     * @return the value of field 'ExclusionEntry'.
     */
    public org.LexGrid.valueSets.PickListEntryExclusion getExclusionEntry(
    ) {
        return this._exclusionEntry;
    }

    /**
     * Returns the value of field 'inclusionEntry'.
     * 
     * @return the value of field 'InclusionEntry'.
     */
    public org.LexGrid.valueSets.PickListEntry getInclusionEntry(
    ) {
        return this._inclusionEntry;
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
     * Sets the value of field 'exclusionEntry'.
     * 
     * @param exclusionEntry the value of field 'exclusionEntry'.
     */
    public void setExclusionEntry(
            final org.LexGrid.valueSets.PickListEntryExclusion exclusionEntry) {
        this._exclusionEntry = exclusionEntry;
    }

    /**
     * Sets the value of field 'inclusionEntry'.
     * 
     * @param inclusionEntry the value of field 'inclusionEntry'.
     */
    public void setInclusionEntry(
            final org.LexGrid.valueSets.PickListEntry inclusionEntry) {
        this._inclusionEntry = inclusionEntry;
    }

    /**
     * Method unmarshalPickListEntryNodeChoice.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.LexGrid.valueSets.PickListEntryNodeChoice
     */
    public static org.LexGrid.valueSets.PickListEntryNodeChoice unmarshalPickListEntryNodeChoice(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.LexGrid.valueSets.PickListEntryNodeChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.LexGrid.valueSets.PickListEntryNodeChoice.class, reader);
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
