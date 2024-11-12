/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Describes a LexBIG integrated software module.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ModuleDescription implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The module name.
     */
    private java.lang.String _name;

    /**
     * The module version identifier.
     */
    private java.lang.String _version;

    /**
     * A description of the module function, etc.
     */
    private java.lang.String _description;


      //----------------/
     //- Constructors -/
    //----------------/

    public ModuleDescription() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: A description
     * of the module function, etc.
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The module name.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'version'. The field 'version'
     * has the following description: The module version
     * identifier.
     * 
     * @return the value of field 'Version'.
     */
    public java.lang.String getVersion(
    ) {
        return this._version;
    }

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: A description
     * of the module function, etc.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The module name.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'version'. The field 'version' has
     * the following description: The module version identifier.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final java.lang.String version) {
        this._version = version;
    }

}
