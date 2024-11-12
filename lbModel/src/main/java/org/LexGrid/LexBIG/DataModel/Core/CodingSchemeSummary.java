/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Abbreviated list of information about a coding
 *  scheme.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class CodingSchemeSummary implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The official URI of the coding scheme
     */
    private java.lang.String _codingSchemeURI;

    /**
     * The version of the coding scheme that this entry represents,
     * if
     *  applicable and known. Note that that is the combination of
     * the codingSchemeURN
     *  and the version that uniquely represents a coding scheme in
     * the
     *  system.
     */
    private java.lang.String _representsVersion;

    /**
     * The short, locally unique name for the coding
     *  scheme.
     */
    private java.lang.String _localName;

    /**
     * The official name of the coding scheme
     */
    private java.lang.String _formalName;

    /**
     * A short description of the coding scheme
     *  contents.
     */
    private org.LexGrid.commonTypes.EntityDescription _codingSchemeDescription;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeSummary() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codingSchemeDescription'. The
     * field 'codingSchemeDescription' has the following
     * description: A short description of the coding scheme
     *  contents.
     * 
     * @return the value of field 'CodingSchemeDescription'.
     */
    public org.LexGrid.commonTypes.EntityDescription getCodingSchemeDescription(
    ) {
        return this._codingSchemeDescription;
    }

    /**
     * Returns the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The
     * official URI of the coding scheme
     * 
     * @return the value of field 'CodingSchemeURI'.
     */
    public java.lang.String getCodingSchemeURI(
    ) {
        return this._codingSchemeURI;
    }

    /**
     * Returns the value of field 'formalName'. The field
     * 'formalName' has the following description: The official
     * name of the coding scheme
     * 
     * @return the value of field 'FormalName'.
     */
    public java.lang.String getFormalName(
    ) {
        return this._formalName;
    }

    /**
     * Returns the value of field 'localName'. The field
     * 'localName' has the following description: The short,
     * locally unique name for the coding
     *  scheme.
     * 
     * @return the value of field 'LocalName'.
     */
    public java.lang.String getLocalName(
    ) {
        return this._localName;
    }

    /**
     * Returns the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * version of the coding scheme that this entry represents, if
     *  applicable and known. Note that that is the combination of
     * the codingSchemeURN
     *  and the version that uniquely represents a coding scheme in
     * the
     *  system.
     * 
     * @return the value of field 'RepresentsVersion'.
     */
    public java.lang.String getRepresentsVersion(
    ) {
        return this._representsVersion;
    }

    /**
     * Sets the value of field 'codingSchemeDescription'. The field
     * 'codingSchemeDescription' has the following description: A
     * short description of the coding scheme
     *  contents.
     * 
     * @param codingSchemeDescription the value of field
     * 'codingSchemeDescription'.
     */
    public void setCodingSchemeDescription(
            final org.LexGrid.commonTypes.EntityDescription codingSchemeDescription) {
        this._codingSchemeDescription = codingSchemeDescription;
    }

    /**
     * Sets the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The
     * official URI of the coding scheme
     * 
     * @param codingSchemeURI the value of field 'codingSchemeURI'.
     */
    public void setCodingSchemeURI(
            final java.lang.String codingSchemeURI) {
        this._codingSchemeURI = codingSchemeURI;
    }

    /**
     * Sets the value of field 'formalName'. The field 'formalName'
     * has the following description: The official name of the
     * coding scheme
     * 
     * @param formalName the value of field 'formalName'.
     */
    public void setFormalName(
            final java.lang.String formalName) {
        this._formalName = formalName;
    }

    /**
     * Sets the value of field 'localName'. The field 'localName'
     * has the following description: The short, locally unique
     * name for the coding
     *  scheme.
     * 
     * @param localName the value of field 'localName'.
     */
    public void setLocalName(
            final java.lang.String localName) {
        this._localName = localName;
    }

    /**
     * Sets the value of field 'representsVersion'. The field
     * 'representsVersion' has the following description: The
     * version of the coding scheme that this entry represents, if
     *  applicable and known. Note that that is the combination of
     * the codingSchemeURN
     *  and the version that uniquely represents a coding scheme in
     * the
     *  system.
     * 
     * @param representsVersion the value of field
     * 'representsVersion'.
     */
    public void setRepresentsVersion(
            final java.lang.String representsVersion) {
        this._representsVersion = representsVersion;
    }

}
