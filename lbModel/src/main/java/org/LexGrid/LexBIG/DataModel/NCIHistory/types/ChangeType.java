/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.NCIHistory.types;

/**
 * Atomic modification actions. To be populated from a combination
 * of Concordia, SNOMED-CT list and NCI's action list.
 * 
 * @version $Revision$ $Date$
 */
public enum ChangeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CREATE
     */
    CREATE("create"),
    /**
     * Constant RETIRE
     */
    RETIRE("retire"),
    /**
     * Constant MERGE
     */
    MERGE("merge"),
    /**
     * Constant SPLIT
     */
    SPLIT("split"),
    /**
     * Constant MODIFY
     */
    MODIFY("modify");

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
    private static final java.util.Map<java.lang.String, ChangeType> enumConstants = new java.util.HashMap<java.lang.String, ChangeType>();


    static {
        for (ChangeType c: ChangeType.values()) {
            ChangeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ChangeType(final java.lang.String value) {
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
    public static org.LexGrid.LexBIG.DataModel.NCIHistory.types.ChangeType fromValue(
            final java.lang.String value) {
        ChangeType c = ChangeType.enumConstants.get(value);
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
