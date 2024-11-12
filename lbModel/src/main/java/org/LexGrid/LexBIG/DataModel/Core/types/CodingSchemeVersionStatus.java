/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core.types;

/**
 * This class provides a series of set values for the version
 * status of a given coding scheme.
 * 
 * @version $Revision$ $Date$
 */
public enum CodingSchemeVersionStatus {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant PENDING
     */
    PENDING("pending"),
    /**
     * Constant ACTIVE
     */
    ACTIVE("active"),
    /**
     * Constant INACTIVE
     */
    INACTIVE("inactive");

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
    private static final java.util.Map<java.lang.String, CodingSchemeVersionStatus> enumConstants = new java.util.HashMap<java.lang.String, CodingSchemeVersionStatus>();


    static {
        for (CodingSchemeVersionStatus c: CodingSchemeVersionStatus.values()) {
            CodingSchemeVersionStatus.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private CodingSchemeVersionStatus(final java.lang.String value) {
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
    public static org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus fromValue(
            final java.lang.String value) {
        CodingSchemeVersionStatus c = CodingSchemeVersionStatus.enumConstants.get(value);
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
