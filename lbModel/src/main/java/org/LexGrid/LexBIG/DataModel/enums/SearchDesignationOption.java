/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.enums;

/**
 * Options for filtering for pre-determined search designations.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SearchDesignationOption implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Option to limit search to preferred or general designations
     * of a concept. Values limited to PREFERRED_ONLY,
     * NON_PREFERRED_ONLY, ALL
     */
    private java.lang.String _searchDesignationOptionName;


      //----------------/
     //- Constructors -/
    //----------------/

    public SearchDesignationOption() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'searchDesignationOptionName'.
     * The field 'searchDesignationOptionName' has the following
     * description: Option to limit search to preferred or general
     * designations of a concept. Values limited to PREFERRED_ONLY,
     * NON_PREFERRED_ONLY, ALL
     * 
     * @return the value of field 'SearchDesignationOptionName'.
     */
    public java.lang.String getSearchDesignationOptionName(
    ) {
        return this._searchDesignationOptionName;
    }

    /**
     * Sets the value of field 'searchDesignationOptionName'. The
     * field 'searchDesignationOptionName' has the following
     * description: Option to limit search to preferred or general
     * designations of a concept. Values limited to PREFERRED_ONLY,
     * NON_PREFERRED_ONLY, ALL
     * 
     * @param searchDesignationOptionName the value of field
     * 'searchDesignationOptionName'.
     */
    public void setSearchDesignationOptionName(
            final java.lang.String searchDesignationOptionName) {
        this._searchDesignationOptionName = searchDesignationOptionName;
    }

}
