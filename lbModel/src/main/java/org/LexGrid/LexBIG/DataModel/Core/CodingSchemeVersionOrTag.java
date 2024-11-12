/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * A named coding scheme version or a virtual tag (e.g. latest,
 *  production, etc). Note that the tagged form of identifier is
 * only applicable in the
 *  context of a given service, as one service may identify the
 * scheme as "production"
 *  and another as "staging".
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class CodingSchemeVersionOrTag implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * The specific version of the coding scheme.
     */
    private java.lang.String _version;

    /**
     * The specific tag for the coding scheme
     */
    private java.lang.String _tag;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeVersionOrTag() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'tag'. The field 'tag' has the
     * following description: The specific tag for the coding
     * scheme
     * 
     * @return the value of field 'Tag'.
     */
    public java.lang.String getTag(
    ) {
        return this._tag;
    }

    /**
     * Returns the value of field 'version'. The field 'version'
     * has the following description: The specific version of the
     * coding scheme.
     * 
     * @return the value of field 'Version'.
     */
    public java.lang.String getVersion(
    ) {
        return this._version;
    }

    /**
     * Sets the value of field 'tag'. The field 'tag' has the
     * following description: The specific tag for the coding
     * scheme
     * 
     * @param tag the value of field 'tag'.
     */
    public void setTag(
            final java.lang.String tag) {
        this._tag = tag;
        this._choiceValue = tag;
    }

    /**
     * Sets the value of field 'version'. The field 'version' has
     * the following description: The specific version of the
     * coding scheme.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final java.lang.String version) {
        this._version = version;
        this._choiceValue = version;
    }

}
