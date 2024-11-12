/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Represents a pairing of sort algorithm and order.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SortOption implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of the extension defining the sort algorithm (from
     * the sort extension description).
     */
    private java.lang.String _extensionName;

    /**
     * Indicates whether the sort algorithm should be applied in
     * ascending or descending order.
     */
    private java.lang.Boolean _ascending;


      //----------------/
     //- Constructors -/
    //----------------/

    public SortOption() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ascending'. The field
     * 'ascending' has the following description: Indicates whether
     * the sort algorithm should be applied in ascending or
     * descending order.
     * 
     * @return the value of field 'Ascending'.
     */
    public java.lang.Boolean getAscending(
    ) {
        return this._ascending;
    }

    /**
     * Returns the value of field 'extensionName'. The field
     * 'extensionName' has the following description: The name of
     * the extension defining the sort algorithm (from the sort
     * extension description).
     * 
     * @return the value of field 'ExtensionName'.
     */
    public java.lang.String getExtensionName(
    ) {
        return this._extensionName;
    }

    /**
     * Returns the value of field 'ascending'. The field
     * 'ascending' has the following description: Indicates whether
     * the sort algorithm should be applied in ascending or
     * descending order.
     * 
     * @return the value of field 'Ascending'.
     */
    public java.lang.Boolean isAscending(
    ) {
        return this._ascending;
    }

    /**
     * Sets the value of field 'ascending'. The field 'ascending'
     * has the following description: Indicates whether the sort
     * algorithm should be applied in ascending or descending
     * order.
     * 
     * @param ascending the value of field 'ascending'.
     */
    public void setAscending(
            final java.lang.Boolean ascending) {
        this._ascending = ascending;
    }

    /**
     * Sets the value of field 'extensionName'. The field
     * 'extensionName' has the following description: The name of
     * the extension defining the sort algorithm (from the sort
     * extension description).
     * 
     * @param extensionName the value of field 'extensionName'.
     */
    public void setExtensionName(
            final java.lang.String extensionName) {
        this._extensionName = extensionName;
    }

}
