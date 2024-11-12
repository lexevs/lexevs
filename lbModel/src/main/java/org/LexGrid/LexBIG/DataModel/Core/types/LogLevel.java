/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core.types;

/**
 * Enumeration LogLevel.
 * 
 * @version $Revision$ $Date$
 */
public enum LogLevel {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant DEBUG
     */
    DEBUG("debug"),
    /**
     * Constant INFO
     */
    INFO("info"),
    /**
     * Constant WARN
     */
    WARN("warn"),
    /**
     * Constant ERROR
     */
    ERROR("error"),
    /**
     * Constant FATAL
     */
    FATAL("fatal");

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
    private static final java.util.Map<java.lang.String, LogLevel> enumConstants = new java.util.HashMap<java.lang.String, LogLevel>();


    static {
        for (LogLevel c: LogLevel.values()) {
            LogLevel.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private LogLevel(final java.lang.String value) {
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
    public static org.LexGrid.LexBIG.DataModel.Core.types.LogLevel fromValue(
            final java.lang.String value) {
        LogLevel c = LogLevel.enumConstants.get(value);
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
