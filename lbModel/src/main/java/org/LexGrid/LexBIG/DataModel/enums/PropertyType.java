/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.enums;

/**
 * Options for filtering for pre-determined property types.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertyType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Option from a set type of properties. Values can only be:
     * COMMENT, DEFINITION, INSTRUCTION, PRESENTATION, GENERIC
     */
    private java.lang.String _propertyTypeOption;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertyType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'propertyTypeOption'. The field
     * 'propertyTypeOption' has the following description: Option
     * from a set type of properties. Values can only be: COMMENT,
     * DEFINITION, INSTRUCTION, PRESENTATION, GENERIC
     * 
     * @return the value of field 'PropertyTypeOption'.
     */
    public java.lang.String getPropertyTypeOption(
    ) {
        return this._propertyTypeOption;
    }

    /**
     * Sets the value of field 'propertyTypeOption'. The field
     * 'propertyTypeOption' has the following description: Option
     * from a set type of properties. Values can only be: COMMENT,
     * DEFINITION, INSTRUCTION, PRESENTATION, GENERIC
     * 
     * @param propertyTypeOption the value of field
     * 'propertyTypeOption'.
     */
    public void setPropertyTypeOption(
            final java.lang.String propertyTypeOption) {
        this._propertyTypeOption = propertyTypeOption;
    }

}
