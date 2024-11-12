/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.LoadPreferences;

/**
 * Class LoaderPreferences.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class LoaderPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Any xml document can be assigned as metadata to a newly
     * loaded coding scheme.
     *  The xml document is broken down into individual tags and
     * values, which are then searchable
     *  through the LexBIG Service Metadata interface. This
     * parameter indicates the path of
     *  xml metadata assigned during the current load operation.
     * For most loaders, the given path
     *  serves strictly as an option to input user-specified data.
     * For some loaders, such as the
     *  HL7 loader and NCI Metathesaurus loader, metadata is
     * automatically generated and
     *  assigned to the coding scheme. In these cases, the
     * generated xml will be output to the
     *  given file, overwriting any existing content .
     *  
     */
    private java.lang.String _XMLMetadataFilePath;


      //----------------/
     //- Constructors -/
    //----------------/

    public LoaderPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'XMLMetadataFilePath'. The field
     * 'XMLMetadataFilePath' has the following description: Any xml
     * document can be assigned as metadata to a newly loaded
     * coding scheme.
     *  The xml document is broken down into individual tags and
     * values, which are then searchable
     *  through the LexBIG Service Metadata interface. This
     * parameter indicates the path of
     *  xml metadata assigned during the current load operation.
     * For most loaders, the given path
     *  serves strictly as an option to input user-specified data.
     * For some loaders, such as the
     *  HL7 loader and NCI Metathesaurus loader, metadata is
     * automatically generated and
     *  assigned to the coding scheme. In these cases, the
     * generated xml will be output to the
     *  given file, overwriting any existing content .
     *  
     * 
     * @return the value of field 'XMLMetadataFilePath'.
     */
    public java.lang.String getXMLMetadataFilePath(
    ) {
        return this._XMLMetadataFilePath;
    }

    /**
     * Sets the value of field 'XMLMetadataFilePath'. The field
     * 'XMLMetadataFilePath' has the following description: Any xml
     * document can be assigned as metadata to a newly loaded
     * coding scheme.
     *  The xml document is broken down into individual tags and
     * values, which are then searchable
     *  through the LexBIG Service Metadata interface. This
     * parameter indicates the path of
     *  xml metadata assigned during the current load operation.
     * For most loaders, the given path
     *  serves strictly as an option to input user-specified data.
     * For some loaders, such as the
     *  HL7 loader and NCI Metathesaurus loader, metadata is
     * automatically generated and
     *  assigned to the coding scheme. In these cases, the
     * generated xml will be output to the
     *  given file, overwriting any existing content .
     *  
     * 
     * @param XMLMetadataFilePath the value of field
     * 'XMLMetadataFilePath'.
     */
    public void setXMLMetadataFilePath(
            final java.lang.String XMLMetadataFilePath) {
        this._XMLMetadataFilePath = XMLMetadataFilePath;
    }

}
