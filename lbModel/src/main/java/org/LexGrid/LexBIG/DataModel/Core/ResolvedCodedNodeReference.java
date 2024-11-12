/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Resolved information for an entity identified by coding scheme
 *  and code.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class ResolvedCodedNodeReference extends org.LexGrid.LexBIG.DataModel.Core.ConceptReference 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The URI of the associated coding scheme, if
     *  known.
     */
    private java.lang.String _codingSchemeURI;

    /**
     * The version of the associated coding scheme,
     *  if known.
     */
    private java.lang.String _codingSchemeVersion;

    /**
     * Primary text describing the referenced entity.
     *  Always resolved, if present.
     */
    private org.LexGrid.commonTypes.EntityDescription _entityDescription;

    /**
     * The referenced entity, optionally resolved.
     *  
     */
    private org.LexGrid.concepts.Entity _entity;

    /**
     * The list of associations for which the referenced
     *  code acts as the source (lhs, parent, ..) for. If this
     * element is absent,
     *  no information is available about the target nodes. If the
     * element is
     *  present, but 0 length, the code does not appear as the
     * source of
     *  any associations (in the context of the containing graph).
     *  
     */
    private org.LexGrid.LexBIG.DataModel.Collections.AssociationList _sourceOf;

    /**
     * The list of associations for which the referenced
     *  code acts as the target (rhs, child..) for. If this element
     * is absent,
     *  no information is available about the source nodes. If the
     * element is
     *  present, but 0 length, the CodedNode doesn't appear as the
     * target of
     *  any associations (in the context of the containing graph).
     *  
     */
    private org.LexGrid.LexBIG.DataModel.Collections.AssociationList _targetOf;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedCodedNodeReference() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The URI of
     * the associated coding scheme, if
     *  known.
     * 
     * @return the value of field 'CodingSchemeURI'.
     */
    public java.lang.String getCodingSchemeURI(
    ) {
        return this._codingSchemeURI;
    }

    /**
     * Returns the value of field 'codingSchemeVersion'. The field
     * 'codingSchemeVersion' has the following description: The
     * version of the associated coding scheme,
     *  if known.
     * 
     * @return the value of field 'CodingSchemeVersion'.
     */
    public java.lang.String getCodingSchemeVersion(
    ) {
        return this._codingSchemeVersion;
    }

    /**
     * Returns the value of field 'entity'. The field 'entity' has
     * the following description: The referenced entity, optionally
     * resolved.
     *  
     * 
     * @return the value of field 'Entity'.
     */
    public org.LexGrid.concepts.Entity getEntity(
    ) {
        return this._entity;
    }

    /**
     * Returns the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: Primary
     * text describing the referenced entity.
     *  Always resolved, if present.
     * 
     * @return the value of field 'EntityDescription'.
     */
    public org.LexGrid.commonTypes.EntityDescription getEntityDescription(
    ) {
        return this._entityDescription;
    }

    /**
     * Returns the value of field 'sourceOf'. The field 'sourceOf'
     * has the following description: The list of associations for
     * which the referenced
     *  code acts as the source (lhs, parent, ..) for. If this
     * element is absent,
     *  no information is available about the target nodes. If the
     * element is
     *  present, but 0 length, the code does not appear as the
     * source of
     *  any associations (in the context of the containing graph).
     *  
     * 
     * @return the value of field 'SourceOf'.
     */
    public org.LexGrid.LexBIG.DataModel.Collections.AssociationList getSourceOf(
    ) {
        return this._sourceOf;
    }

    /**
     * Returns the value of field 'targetOf'. The field 'targetOf'
     * has the following description: The list of associations for
     * which the referenced
     *  code acts as the target (rhs, child..) for. If this element
     * is absent,
     *  no information is available about the source nodes. If the
     * element is
     *  present, but 0 length, the CodedNode doesn't appear as the
     * target of
     *  any associations (in the context of the containing graph).
     *  
     * 
     * @return the value of field 'TargetOf'.
     */
    public org.LexGrid.LexBIG.DataModel.Collections.AssociationList getTargetOf(
    ) {
        return this._targetOf;
    }

    /**
     * Sets the value of field 'codingSchemeURI'. The field
     * 'codingSchemeURI' has the following description: The URI of
     * the associated coding scheme, if
     *  known.
     * 
     * @param codingSchemeURI the value of field 'codingSchemeURI'.
     */
    public void setCodingSchemeURI(
            final java.lang.String codingSchemeURI) {
        this._codingSchemeURI = codingSchemeURI;
    }

    /**
     * Sets the value of field 'codingSchemeVersion'. The field
     * 'codingSchemeVersion' has the following description: The
     * version of the associated coding scheme,
     *  if known.
     * 
     * @param codingSchemeVersion the value of field
     * 'codingSchemeVersion'.
     */
    public void setCodingSchemeVersion(
            final java.lang.String codingSchemeVersion) {
        this._codingSchemeVersion = codingSchemeVersion;
    }

    /**
     * Sets the value of field 'entity'. The field 'entity' has the
     * following description: The referenced entity, optionally
     * resolved.
     *  
     * 
     * @param entity the value of field 'entity'.
     */
    public void setEntity(
            final org.LexGrid.concepts.Entity entity) {
        this._entity = entity;
    }

    /**
     * Sets the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: Primary
     * text describing the referenced entity.
     *  Always resolved, if present.
     * 
     * @param entityDescription the value of field
     * 'entityDescription'.
     */
    public void setEntityDescription(
            final org.LexGrid.commonTypes.EntityDescription entityDescription) {
        this._entityDescription = entityDescription;
    }

    /**
     * Sets the value of field 'sourceOf'. The field 'sourceOf' has
     * the following description: The list of associations for
     * which the referenced
     *  code acts as the source (lhs, parent, ..) for. If this
     * element is absent,
     *  no information is available about the target nodes. If the
     * element is
     *  present, but 0 length, the code does not appear as the
     * source of
     *  any associations (in the context of the containing graph).
     *  
     * 
     * @param sourceOf the value of field 'sourceOf'.
     */
    public void setSourceOf(
            final org.LexGrid.LexBIG.DataModel.Collections.AssociationList sourceOf) {
        this._sourceOf = sourceOf;
    }

    /**
     * Sets the value of field 'targetOf'. The field 'targetOf' has
     * the following description: The list of associations for
     * which the referenced
     *  code acts as the target (rhs, child..) for. If this element
     * is absent,
     *  no information is available about the source nodes. If the
     * element is
     *  present, but 0 length, the CodedNode doesn't appear as the
     * target of
     *  any associations (in the context of the containing graph).
     *  
     * 
     * @param targetOf the value of field 'targetOf'.
     */
    public void setTargetOf(
            final org.LexGrid.LexBIG.DataModel.Collections.AssociationList targetOf) {
        this._targetOf = targetOf;
    }

}
