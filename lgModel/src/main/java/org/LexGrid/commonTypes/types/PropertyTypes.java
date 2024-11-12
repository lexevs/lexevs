/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes.types;

/**
 * A list of propertyTypes to be used where appropriate. Service
 * behavior may be keyed off of these local identifiers,
 * independent of the associated URI's
 * 
 * @version $Revision$ $Date$
 */
public enum PropertyTypes {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant PRESENTATION
     */
    PRESENTATION("presentation"),
    /**
     * Constant DEFINITION
     */
    DEFINITION("definition"),
    /**
     * Constant COMMENT
     */
    COMMENT("comment"),
    /**
     * Constant PROPERTY
     */
    PROPERTY("property");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, PropertyTypes> enumConstants = new java.util.HashMap<java.lang.String, PropertyTypes>();


    static {
        for (PropertyTypes c: PropertyTypes.values()) {
            PropertyTypes.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private PropertyTypes(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.LexGrid.commonTypes.types.PropertyTypes fromValue(
            final java.lang.String value) {
        PropertyTypes c = PropertyTypes.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
