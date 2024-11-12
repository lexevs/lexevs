/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.valueSets.types;

/**
 * The description of how a given definition entry is applied
 * 
 * @version $Revision$ $Date$
 */
public enum DefinitionOperator {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant OR
     */
    OR("OR"),
    /**
     * Constant SUBTRACT
     */
    SUBTRACT("SUBTRACT"),
    /**
     * Constant AND
     */
    AND("AND");

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
    private static final java.util.Map<java.lang.String, DefinitionOperator> enumConstants = new java.util.HashMap<java.lang.String, DefinitionOperator>();


    static {
        for (DefinitionOperator c: DefinitionOperator.values()) {
            DefinitionOperator.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private DefinitionOperator(final java.lang.String value) {
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
    public static org.LexGrid.valueSets.types.DefinitionOperator fromValue(
            final java.lang.String value) {
        DefinitionOperator c = DefinitionOperator.enumConstants.get(value);
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
