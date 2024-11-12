/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements.types;

/**
 * Describes a LexBIG sort module.
 * 
 * @version $Revision$ $Date$
 */
public enum SortContext {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant GRAPH
     */
    GRAPH("graph"),
    /**
     * Constant SET
     */
    SET("set"),
    /**
     * Constant SETLISTPRERESOLVE
     */
    SETLISTPRERESOLVE("setListPreResolve"),
    /**
     * Constant SETLISTPOSTRESOLVE
     */
    SETLISTPOSTRESOLVE("setListPostResolve"),
    /**
     * Constant SETITERATION
     */
    SETITERATION("setIteration");

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
    private static final java.util.Map<java.lang.String, SortContext> enumConstants = new java.util.HashMap<java.lang.String, SortContext>();


    static {
        for (SortContext c: SortContext.values()) {
            SortContext.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private SortContext(final java.lang.String value) {
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
    public static org.LexGrid.LexBIG.DataModel.InterfaceElements.types.SortContext fromValue(
            final java.lang.String value) {
        SortContext c = SortContext.enumConstants.get(value);
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
