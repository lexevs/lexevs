/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * An association code, language, data type, source, etc. that is
 *  represented by a coded node list or node graph. It consists of
 * an optional URN and a
 *  name that is used locally to represent that URN. If the URN is
 * absent, the name has
 *  local meaning and nothing can be assumed outside of the context
 * of the node list or
 *  graph.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class SupportedElement implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * True means that the local reference is considered
     * "complete". The
     *  exact interpretation of this depends upon the element type
     * - if it is the
     *  localName of a code system, then complete means that all
     * codes form the
     *  particular version are present. If it is a matching
     * algorithm, complete means
     *  that all of the codes in the list have been indexed by the
     * algorithm,
     *  etc.
     */
    private java.lang.Boolean _isComplete;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupportedElement() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'isComplete'. The field
     * 'isComplete' has the following description: True means that
     * the local reference is considered "complete". The
     *  exact interpretation of this depends upon the element type
     * - if it is the
     *  localName of a code system, then complete means that all
     * codes form the
     *  particular version are present. If it is a matching
     * algorithm, complete means
     *  that all of the codes in the list have been indexed by the
     * algorithm,
     *  etc.
     * 
     * @return the value of field 'IsComplete'.
     */
    public java.lang.Boolean getIsComplete(
    ) {
        return this._isComplete;
    }

    /**
     * Returns the value of field 'isComplete'. The field
     * 'isComplete' has the following description: True means that
     * the local reference is considered "complete". The
     *  exact interpretation of this depends upon the element type
     * - if it is the
     *  localName of a code system, then complete means that all
     * codes form the
     *  particular version are present. If it is a matching
     * algorithm, complete means
     *  that all of the codes in the list have been indexed by the
     * algorithm,
     *  etc.
     * 
     * @return the value of field 'IsComplete'.
     */
    public java.lang.Boolean isIsComplete(
    ) {
        return this._isComplete;
    }

    /**
     * Sets the value of field 'isComplete'. The field 'isComplete'
     * has the following description: True means that the local
     * reference is considered "complete". The
     *  exact interpretation of this depends upon the element type
     * - if it is the
     *  localName of a code system, then complete means that all
     * codes form the
     *  particular version are present. If it is a matching
     * algorithm, complete means
     *  that all of the codes in the list have been indexed by the
     * algorithm,
     *  etc.
     * 
     * @param isComplete the value of field 'isComplete'.
     */
    public void setIsComplete(
            final java.lang.Boolean isComplete) {
        this._isComplete = isComplete;
    }

}
