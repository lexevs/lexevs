/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.enums;

/**
 * pre-determined options for filtering active, inative or leaving
 * filter neutral.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ActiveOption implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Options describing the status of a concept. Values must
     * include: ACTIVE_ONLY, INACTIVE_ONLY, ALL
     */
    private java.lang.String _activeOptionName;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActiveOption() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'activeOptionName'. The field
     * 'activeOptionName' has the following description: Options
     * describing the status of a concept. Values must include:
     * ACTIVE_ONLY, INACTIVE_ONLY, ALL
     * 
     * @return the value of field 'ActiveOptionName'.
     */
    public java.lang.String getActiveOptionName(
    ) {
        return this._activeOptionName;
    }

    /**
     * Sets the value of field 'activeOptionName'. The field
     * 'activeOptionName' has the following description: Options
     * describing the status of a concept. Values must include:
     * ACTIVE_ONLY, INACTIVE_ONLY, ALL
     * 
     * @param activeOptionName the value of field 'activeOptionName'
     */
    public void setActiveOptionName(
            final java.lang.String activeOptionName) {
        this._activeOptionName = activeOptionName;
    }

}
