/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types;

/**
 * Enumeration InheritanceLevelType.
 * 
 * @version $Revision$ $Date$
 */
public enum InheritanceLevelType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant VALUE_0
     */
    VALUE_0("0"),
    /**
     * Constant VALUE_1
     */
    VALUE_1("1"),
    /**
     * Constant VALUE_2
     */
    VALUE_2("2");

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
    private static final java.util.Map<java.lang.String, InheritanceLevelType> enumConstants = new java.util.HashMap<java.lang.String, InheritanceLevelType>();


    static {
        for (InheritanceLevelType c: InheritanceLevelType.values()) {
            InheritanceLevelType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private InheritanceLevelType(final java.lang.String value) {
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
    public static org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType fromValue(
            final java.lang.String value) {
        InheritanceLevelType c = InheritanceLevelType.enumConstants.get(value);
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
