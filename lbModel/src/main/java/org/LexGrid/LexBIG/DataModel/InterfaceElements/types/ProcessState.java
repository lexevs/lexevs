/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements.types;

/**
 * An enumeration of possible reported values for process state.
 * 
 * @version $Revision$ $Date$
 */
public enum ProcessState {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CANCELED
     */
    CANCELED("canceled"),
    /**
     * Constant COMPLETED
     */
    COMPLETED("completed"),
    /**
     * Constant FAILED
     */
    FAILED("failed"),
    /**
     * Constant PENDING
     */
    PENDING("pending"),
    /**
     * Constant PROCESSING
     */
    PROCESSING("processing"),
    /**
     * Constant UNKNOWN
     */
    UNKNOWN("unknown");

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
    private static final java.util.Map<java.lang.String, ProcessState> enumConstants = new java.util.HashMap<java.lang.String, ProcessState>();


    static {
        for (ProcessState c: ProcessState.values()) {
            ProcessState.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ProcessState(final java.lang.String value) {
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
    public static org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState fromValue(
            final java.lang.String value) {
        ProcessState c = ProcessState.enumConstants.get(value);
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
