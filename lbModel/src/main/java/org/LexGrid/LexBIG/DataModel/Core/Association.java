/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * The representation of a particular association as it appears in
 * a
 *  CodedNode
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class Association implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The local name of the association
     */
    private java.lang.String _associationName;

    /**
     * The local name of the relations container
     */
    private java.lang.String _relationsContainerName;

    /**
     * The name assigned to the association so that it can be read
     *  correctly going from the containing concept to the
     * contained concept.
     *  
     */
    private java.lang.String _directionalName;

    /**
     * The concept reference that defines the
     *  association
     */
    private org.LexGrid.LexBIG.DataModel.Core.ConceptReference _associationReference;

    /**
     * The list of concepts that occur as the source or target of
     *  this association
     */
    private org.LexGrid.LexBIG.DataModel.Collections.AssociatedConceptList _associatedConcepts;

    /**
     * The list of data elements that occur as the source or target
     *  of this association.
     */
    private org.LexGrid.LexBIG.DataModel.Collections.AssociatedDataList _associatedData;


      //----------------/
     //- Constructors -/
    //----------------/

    public Association() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'associatedConcepts'. The field
     * 'associatedConcepts' has the following description: The list
     * of concepts that occur as the source or target of
     *  this association
     * 
     * @return the value of field 'AssociatedConcepts'.
     */
    public org.LexGrid.LexBIG.DataModel.Collections.AssociatedConceptList getAssociatedConcepts(
    ) {
        return this._associatedConcepts;
    }

    /**
     * Returns the value of field 'associatedData'. The field
     * 'associatedData' has the following description: The list of
     * data elements that occur as the source or target
     *  of this association.
     * 
     * @return the value of field 'AssociatedData'.
     */
    public org.LexGrid.LexBIG.DataModel.Collections.AssociatedDataList getAssociatedData(
    ) {
        return this._associatedData;
    }

    /**
     * Returns the value of field 'associationName'. The field
     * 'associationName' has the following description: The local
     * name of the association
     * 
     * @return the value of field 'AssociationName'.
     */
    public java.lang.String getAssociationName(
    ) {
        return this._associationName;
    }

    /**
     * Returns the value of field 'associationReference'. The field
     * 'associationReference' has the following description: The
     * concept reference that defines the
     *  association
     * 
     * @return the value of field 'AssociationReference'.
     */
    public org.LexGrid.LexBIG.DataModel.Core.ConceptReference getAssociationReference(
    ) {
        return this._associationReference;
    }

    /**
     * Returns the value of field 'directionalName'. The field
     * 'directionalName' has the following description: The name
     * assigned to the association so that it can be read
     *  correctly going from the containing concept to the
     * contained concept.
     *  
     * 
     * @return the value of field 'DirectionalName'.
     */
    public java.lang.String getDirectionalName(
    ) {
        return this._directionalName;
    }

    /**
     * Returns the value of field 'relationsContainerName'. The
     * field 'relationsContainerName' has the following
     * description: The local name of the relations container
     * 
     * @return the value of field 'RelationsContainerName'.
     */
    public java.lang.String getRelationsContainerName(
    ) {
        return this._relationsContainerName;
    }

    /**
     * Sets the value of field 'associatedConcepts'. The field
     * 'associatedConcepts' has the following description: The list
     * of concepts that occur as the source or target of
     *  this association
     * 
     * @param associatedConcepts the value of field
     * 'associatedConcepts'.
     */
    public void setAssociatedConcepts(
            final org.LexGrid.LexBIG.DataModel.Collections.AssociatedConceptList associatedConcepts) {
        this._associatedConcepts = associatedConcepts;
    }

    /**
     * Sets the value of field 'associatedData'. The field
     * 'associatedData' has the following description: The list of
     * data elements that occur as the source or target
     *  of this association.
     * 
     * @param associatedData the value of field 'associatedData'.
     */
    public void setAssociatedData(
            final org.LexGrid.LexBIG.DataModel.Collections.AssociatedDataList associatedData) {
        this._associatedData = associatedData;
    }

    /**
     * Sets the value of field 'associationName'. The field
     * 'associationName' has the following description: The local
     * name of the association
     * 
     * @param associationName the value of field 'associationName'.
     */
    public void setAssociationName(
            final java.lang.String associationName) {
        this._associationName = associationName;
    }

    /**
     * Sets the value of field 'associationReference'. The field
     * 'associationReference' has the following description: The
     * concept reference that defines the
     *  association
     * 
     * @param associationReference the value of field
     * 'associationReference'.
     */
    public void setAssociationReference(
            final org.LexGrid.LexBIG.DataModel.Core.ConceptReference associationReference) {
        this._associationReference = associationReference;
    }

    /**
     * Sets the value of field 'directionalName'. The field
     * 'directionalName' has the following description: The name
     * assigned to the association so that it can be read
     *  correctly going from the containing concept to the
     * contained concept.
     *  
     * 
     * @param directionalName the value of field 'directionalName'.
     */
    public void setDirectionalName(
            final java.lang.String directionalName) {
        this._directionalName = directionalName;
    }

    /**
     * Sets the value of field 'relationsContainerName'. The field
     * 'relationsContainerName' has the following description: The
     * local name of the relations container
     * 
     * @param relationsContainerName the value of field
     * 'relationsContainerName'.
     */
    public void setRelationsContainerName(
            final java.lang.String relationsContainerName) {
        this._relationsContainerName = relationsContainerName;
    }

}
