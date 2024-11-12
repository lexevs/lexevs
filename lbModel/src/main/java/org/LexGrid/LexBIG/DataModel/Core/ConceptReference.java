/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * A reference to a concept code. Maintained for
 *  backward compatibility, but no longer enhanced in favor of the
 * more
 *  flexible CodedNodeReference.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class ConceptReference extends org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Uniquely identifies the concept within the coding scheme.
     *  Alias for CodedNodeReference:code.
     */
    private java.lang.String _conceptCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conceptCode'. The field
     * 'conceptCode' has the following description: Uniquely
     * identifies the concept within the coding scheme.
     *  Alias for CodedNodeReference:code.
     * 
     * @return the value of field 'ConceptCode'.
     */
    public java.lang.String getConceptCode(
    ) {
        return this.getCode();
    }

    /**
     * Sets the value of field 'conceptCode'. The field
     * 'conceptCode' has the following description: Uniquely
     * identifies the concept within the coding scheme.
     *  Alias for CodedNodeReference:code.
     * 
     * @param conceptCode the value of field 'conceptCode'.
     */
    public void setConceptCode(
            final java.lang.String conceptCode) {
        this.setCode(conceptCode);
    }

}
