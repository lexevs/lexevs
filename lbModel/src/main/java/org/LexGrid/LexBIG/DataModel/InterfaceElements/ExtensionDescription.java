/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Describes an add-on module registered to the LexBIG environment.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ExtensionDescription extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ModuleDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Java class name of the extension.
     */
    private java.lang.String _extensionClass;

    /**
     * The Java base class of the extension.
     */
    private java.lang.String _extensionBaseClass;

    /**
     * The extension provider
     */
    private org.LexGrid.commonTypes.Source _extensionProvider;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExtensionDescription() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'extensionBaseClass'. The field
     * 'extensionBaseClass' has the following description: The Java
     * base class of the extension.
     * 
     * @return the value of field 'ExtensionBaseClass'.
     */
    public java.lang.String getExtensionBaseClass(
    ) {
        return this._extensionBaseClass;
    }

    /**
     * Returns the value of field 'extensionClass'. The field
     * 'extensionClass' has the following description: The Java
     * class name of the extension.
     * 
     * @return the value of field 'ExtensionClass'.
     */
    public java.lang.String getExtensionClass(
    ) {
        return this._extensionClass;
    }

    /**
     * Returns the value of field 'extensionProvider'. The field
     * 'extensionProvider' has the following description: The
     * extension provider
     * 
     * @return the value of field 'ExtensionProvider'.
     */
    public org.LexGrid.commonTypes.Source getExtensionProvider(
    ) {
        return this._extensionProvider;
    }

    /**
     * Sets the value of field 'extensionBaseClass'. The field
     * 'extensionBaseClass' has the following description: The Java
     * base class of the extension.
     * 
     * @param extensionBaseClass the value of field
     * 'extensionBaseClass'.
     */
    public void setExtensionBaseClass(
            final java.lang.String extensionBaseClass) {
        this._extensionBaseClass = extensionBaseClass;
    }

    /**
     * Sets the value of field 'extensionClass'. The field
     * 'extensionClass' has the following description: The Java
     * class name of the extension.
     * 
     * @param extensionClass the value of field 'extensionClass'.
     */
    public void setExtensionClass(
            final java.lang.String extensionClass) {
        this._extensionClass = extensionClass;
    }

    /**
     * Sets the value of field 'extensionProvider'. The field
     * 'extensionProvider' has the following description: The
     * extension provider
     * 
     * @param extensionProvider the value of field
     * 'extensionProvider'.
     */
    public void setExtensionProvider(
            final org.LexGrid.commonTypes.Source extensionProvider) {
        this._extensionProvider = extensionProvider;
    }

}
