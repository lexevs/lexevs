/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * An absolute reference to a coding scheme. This form of reference
 * is
 *  service independent, as it doesn't depend on local coding
 * schemes names or virtual
 *  tags. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class AbsoluteCodingSchemeVersionReference implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The URN of the referenced coding scheme.
     */
    private java.lang.String _codingSchemeURN;

    /**
     * Field _codingSchemeVersion.
     */
    private java.lang.String _codingSchemeVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public AbsoluteCodingSchemeVersionReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codingSchemeURN'. The field
     * 'codingSchemeURN' has the following description: The URN of
     * the referenced coding scheme.
     * 
     * @return the value of field 'CodingSchemeURN'.
     */
    public java.lang.String getCodingSchemeURN(
    ) {
        return this._codingSchemeURN;
    }

    /**
     * Returns the value of field 'codingSchemeVersion'.
     * 
     * @return the value of field 'CodingSchemeVersion'.
     */
    public java.lang.String getCodingSchemeVersion(
    ) {
        return this._codingSchemeVersion;
    }

    /**
     * Sets the value of field 'codingSchemeURN'. The field
     * 'codingSchemeURN' has the following description: The URN of
     * the referenced coding scheme.
     * 
     * @param codingSchemeURN the value of field 'codingSchemeURN'.
     */
    public void setCodingSchemeURN(
            final java.lang.String codingSchemeURN) {
        this._codingSchemeURN = codingSchemeURN;
    }

    /**
     * Sets the value of field 'codingSchemeVersion'.
     * 
     * @param codingSchemeVersion the value of field
     * 'codingSchemeVersion'.
     */
    public void setCodingSchemeVersion(
            final java.lang.String codingSchemeVersion) {
        this._codingSchemeVersion = codingSchemeVersion;
    }

}
