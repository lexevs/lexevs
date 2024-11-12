/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.commonTypes.types;

/**
 * A list of entityTypes to be used where appropriate. Service
 * behavior may be keyed off of these local identifiers,
 * independent of the associated URI's
 * 
 * @version $Revision$ $Date$
 */
public enum EntityTypes {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CONCEPT
     */
    CONCEPT("concept"),
    /**
     * Constant INSTANCE
     */
    INSTANCE("instance"),
    /**
     * Constant ASSOCIATION
     */
    ASSOCIATION("association");

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
    private static final java.util.Map<java.lang.String, EntityTypes> enumConstants = new java.util.HashMap<java.lang.String, EntityTypes>();


    static {
        for (EntityTypes c: EntityTypes.values()) {
            EntityTypes.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private EntityTypes(final java.lang.String value) {
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
    public static org.LexGrid.commonTypes.types.EntityTypes fromValue(
            final java.lang.String value) {
        EntityTypes c = EntityTypes.enumConstants.get(value);
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
