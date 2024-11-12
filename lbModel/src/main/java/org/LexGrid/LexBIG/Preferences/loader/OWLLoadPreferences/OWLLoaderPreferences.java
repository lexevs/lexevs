/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences;

/**
 * Class OWLLoaderPreferences.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class OWLLoaderPreferences extends org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.LoaderPreferences 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Entities can be assigned a property that indicates whether
     * or not it is
     *  considered primitive (having no equivalent classes). This
     * preference controls
     *  the name of the property that is created; the property
     * value will indicate
     *  true or false. If not specified, the name 'primitive' is
     * assumed.
     *  
     */
    private java.lang.String _propnamePrimitive;

    /**
     * Anonymous OWL classes of type OWLNAryLogicalClass can be
     * assigned
     *  properties that indicate the nature or type of component
     * logical operations.
     *  This preference controls the name of the property that is
     * created; the
     *  property value will indicate the logical operation (e.g.
     * owl:oneOf). If not
     *  specified, the name 'type' is assumed.
     *  
     */
    private java.lang.String _propnameType;

    /**
     * This preference allows for entity codes to be derived from a
     * specific RDF
     *  property. The provided string is interpreted as a regular
     * expression to be
     *  compared against properties assigned to each processed
     * class. If a
     *  property name matches the regular expression, the property
     * value
     *  is assigned as the entity code. If not specified no default
     * match is
     *  assumed, and the entity code is derived from the RDF
     * resource name.
     *  
     */
    private java.lang.String _matchConceptCode;

    /**
     * This preference allows for entity status to be derived from
     * a specific RDF
     *  property. The provided string is interpreted as a regular
     * expression to be
     *  compared against properties assigned to each processed
     * class. If a
     *  property name matches the regular expression, the property
     * value
     *  is assigned as the entity status. If not specified, the
     * regular expression
     *  of ('concept_status') is assumed, and if not matched no
     * status string
     *  is assigned (the isActive boolean flag will still be set
     * based on
     *  deprecation).
     *  
     */
    private java.lang.String _matchConceptStatus;

    /**
     * This preference allows for classes to be selectively ignored
     * on import to LexGrid.
     *  The provided string is interpreted as a regular expression
     * to be compared
     *  against class namespace. If matched, a counterpart entity
     * is not created in the
     *  LexGrid coding scheme. If not provided, the expression
     * '(:|@_:|protege:|xsp:).'
     *  is assumed.
     *  
     */
    private java.lang.String _matchNoopNamespaces;

    /**
     * This preference allows for custom declaration of root
     * concepts for hierarchical
     *  relationships. The provided string is interpreted as a
     * regular expression to be
     *  compared against the resource name for each class. If
     * matched, the node is
     *  designated as a root in the supported hierarchy metadata.
     * If not specified,
     *  root nodes are identified by having a superclass of
     * owl:thing.
     *  
     */
    private java.lang.String _matchRootName;

    /**
     * If processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * representational form
     *  names contained by XML fragments embedded within rdf
     * property text.
     *  The provided string is interpreted as a regular expression
     * and compared
     *  against the XML tags in each fragment. If not specified,
     * the default
     *  expression '(term-group)' is assumed.
     *  
     */
    private java.lang.String _matchXMLRepformNames;

    /**
     * If processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * source names contained
     *  by XML fragments embedded within rdf property text. The
     * provided string is
     *  interpreted as a regular expression and compared against
     * the XML tags in
     *  each fragment. If not specified, the default expression
     * '(term-source|def-source)'
     *  is assumed.
     *  
     */
    private java.lang.String _matchXMLSourceNames;

    /**
     * If processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * descriptive text contained
     *  by XML fragments embedded within rdf property text. The
     * provided string is
     *  interpreted as a regular expression and compared against
     * the XML tags in
     *  each fragment. If not specified, the default expression
     * '(term-name|def-definition|go-term)'
     *  is assumed.
     *  
     */
    private java.lang.String _matchXMLTextNames;

    /**
     * If processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of ISBN cross
     *  reference information in xml element text. If not
     * specified, the default
     *  of 'false' is assumed.
     *  
     */
    private java.lang.Boolean _isDBXrefSource;

    /**
     * If processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of representational
     *  form cross reference information in xml element text. If
     * not specified, the default
     *  of 'false' is assumed.
     *  
     */
    private java.lang.Boolean _isDBXrefRepform;

    /**
     * Indicates whether rdf property text will be evaluated to
     * detect and process
     *  embedded XML. This is a master switch controlling whether
     * the MatchXML
     *  and isDBXRef preferences are acknowledged. The default is
     * false.
     *  
     */
    private java.lang.Boolean _processComplexProps;

    /**
     * Controls the relationship between restrictions of anonymous
     * classes and parent concepts.
     *  If true, restrictions for anonymous classes are not
     * connected to the parent concepts.
     *  The default is true.
     *  
     */
    private java.lang.Boolean _strictOWLImplementation;

    /**
     * Controls whether concept entities are created for object
     * properties defined in
     *  the OWL source. The default is false.
     *  
     */
    private java.lang.Boolean _createConceptForObjectProp;

    /**
     * Controls how data type properties are converted to
     * components of the LexGrid
     *  model. If 'association' is specified, each data type
     * property is recorded in LexGrid as
     *  an entity-to-entity relationship. If 'conceptProperty' is
     * specified, traditional
     *  LexGrid properties are created and assigned directly to new
     * entities . If 'both'
     *  is specified, both entity relationships and standard
     * LexGrid entity properties
     *  are generated. The default is 'both'.
     *  
     */
    private java.lang.String _datatypePropSwitch;

    /**
     * Field _prioritizedCommentNames.
     */
    private org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames _prioritizedCommentNames;

    /**
     * Field _prioritizedDefinitionNames.
     */
    private org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames _prioritizedDefinitionNames;

    /**
     * Field _prioritizedPresentationNames.
     */
    private org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames _prioritizedPresentationNames;

    /**
     * Transitive management flag indicates administrator will name
     * inverse and normal transitive
     *  elements as opposed to a random implementation
     *  
     */
    private java.lang.Boolean _isTransitiveManaged;

    /**
     * Field _transitiveInverseAssociatinNames.
     */
    private org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames _transitiveInverseAssociatinNames;

    /**
     * Field _transitiveNormalAssociationNames.
     */
    private org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames _transitiveNormalAssociationNames;


      //----------------/
     //- Constructors -/
    //----------------/

    public OWLLoaderPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'createConceptForObjectProp'. The
     * field 'createConceptForObjectProp' has the following
     * description: Controls whether concept entities are created
     * for object properties defined in
     *  the OWL source. The default is false.
     *  
     * 
     * @return the value of field 'CreateConceptForObjectProp'.
     */
    public java.lang.Boolean getCreateConceptForObjectProp(
    ) {
        return this._createConceptForObjectProp;
    }

    /**
     * Returns the value of field 'datatypePropSwitch'. The field
     * 'datatypePropSwitch' has the following description: Controls
     * how data type properties are converted to components of the
     * LexGrid
     *  model. If 'association' is specified, each data type
     * property is recorded in LexGrid as
     *  an entity-to-entity relationship. If 'conceptProperty' is
     * specified, traditional
     *  LexGrid properties are created and assigned directly to new
     * entities . If 'both'
     *  is specified, both entity relationships and standard
     * LexGrid entity properties
     *  are generated. The default is 'both'.
     *  
     * 
     * @return the value of field 'DatatypePropSwitch'.
     */
    public java.lang.String getDatatypePropSwitch(
    ) {
        return this._datatypePropSwitch;
    }

    /**
     * Returns the value of field 'isDBXrefRepform'. The field
     * 'isDBXrefRepform' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of representational
     *  form cross reference information in xml element text. If
     * not specified, the default
     *  of 'false' is assumed.
     *  
     * 
     * @return the value of field 'IsDBXrefRepform'.
     */
    public java.lang.Boolean getIsDBXrefRepform(
    ) {
        return this._isDBXrefRepform;
    }

    /**
     * Returns the value of field 'isDBXrefSource'. The field
     * 'isDBXrefSource' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of ISBN cross
     *  reference information in xml element text. If not
     * specified, the default
     *  of 'false' is assumed.
     *  
     * 
     * @return the value of field 'IsDBXrefSource'.
     */
    public java.lang.Boolean getIsDBXrefSource(
    ) {
        return this._isDBXrefSource;
    }

    /**
     * Returns the value of field 'isTransitiveManaged'. The field
     * 'isTransitiveManaged' has the following description:
     * Transitive management flag indicates administrator will name
     * inverse and normal transitive
     *  elements as opposed to a random implementation
     *  
     * 
     * @return the value of field 'IsTransitiveManaged'.
     */
    public java.lang.Boolean getIsTransitiveManaged(
    ) {
        return this._isTransitiveManaged;
    }

    /**
     * Returns the value of field 'matchConceptCode'. The field
     * 'matchConceptCode' has the following description: This
     * preference allows for entity codes to be derived from a
     * specific RDF
     *  property. The provided string is interpreted as a regular
     * expression to be
     *  compared against properties assigned to each processed
     * class. If a
     *  property name matches the regular expression, the property
     * value
     *  is assigned as the entity code. If not specified no default
     * match is
     *  assumed, and the entity code is derived from the RDF
     * resource name.
     *  
     * 
     * @return the value of field 'MatchConceptCode'.
     */
    public java.lang.String getMatchConceptCode(
    ) {
        return this._matchConceptCode;
    }

    /**
     * Returns the value of field 'matchConceptStatus'. The field
     * 'matchConceptStatus' has the following description: This
     * preference allows for entity status to be derived from a
     * specific RDF
     *  property. The provided string is interpreted as a regular
     * expression to be
     *  compared against properties assigned to each processed
     * class. If a
     *  property name matches the regular expression, the property
     * value
     *  is assigned as the entity status. If not specified, the
     * regular expression
     *  of ('concept_status') is assumed, and if not matched no
     * status string
     *  is assigned (the isActive boolean flag will still be set
     * based on
     *  deprecation).
     *  
     * 
     * @return the value of field 'MatchConceptStatus'.
     */
    public java.lang.String getMatchConceptStatus(
    ) {
        return this._matchConceptStatus;
    }

    /**
     * Returns the value of field 'matchNoopNamespaces'. The field
     * 'matchNoopNamespaces' has the following description: This
     * preference allows for classes to be selectively ignored on
     * import to LexGrid.
     *  The provided string is interpreted as a regular expression
     * to be compared
     *  against class namespace. If matched, a counterpart entity
     * is not created in the
     *  LexGrid coding scheme. If not provided, the expression
     * '(:|@_:|protege:|xsp:).'
     *  is assumed.
     *  
     * 
     * @return the value of field 'MatchNoopNamespaces'.
     */
    public java.lang.String getMatchNoopNamespaces(
    ) {
        return this._matchNoopNamespaces;
    }

    /**
     * Returns the value of field 'matchRootName'. The field
     * 'matchRootName' has the following description: This
     * preference allows for custom declaration of root concepts
     * for hierarchical
     *  relationships. The provided string is interpreted as a
     * regular expression to be
     *  compared against the resource name for each class. If
     * matched, the node is
     *  designated as a root in the supported hierarchy metadata.
     * If not specified,
     *  root nodes are identified by having a superclass of
     * owl:thing.
     *  
     * 
     * @return the value of field 'MatchRootName'.
     */
    public java.lang.String getMatchRootName(
    ) {
        return this._matchRootName;
    }

    /**
     * Returns the value of field 'matchXMLRepformNames'. The field
     * 'matchXMLRepformNames' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * representational form
     *  names contained by XML fragments embedded within rdf
     * property text.
     *  The provided string is interpreted as a regular expression
     * and compared
     *  against the XML tags in each fragment. If not specified,
     * the default
     *  expression '(term-group)' is assumed.
     *  
     * 
     * @return the value of field 'MatchXMLRepformNames'.
     */
    public java.lang.String getMatchXMLRepformNames(
    ) {
        return this._matchXMLRepformNames;
    }

    /**
     * Returns the value of field 'matchXMLSourceNames'. The field
     * 'matchXMLSourceNames' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * source names contained
     *  by XML fragments embedded within rdf property text. The
     * provided string is
     *  interpreted as a regular expression and compared against
     * the XML tags in
     *  each fragment. If not specified, the default expression
     * '(term-source|def-source)'
     *  is assumed.
     *  
     * 
     * @return the value of field 'MatchXMLSourceNames'.
     */
    public java.lang.String getMatchXMLSourceNames(
    ) {
        return this._matchXMLSourceNames;
    }

    /**
     * Returns the value of field 'matchXMLTextNames'. The field
     * 'matchXMLTextNames' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * descriptive text contained
     *  by XML fragments embedded within rdf property text. The
     * provided string is
     *  interpreted as a regular expression and compared against
     * the XML tags in
     *  each fragment. If not specified, the default expression
     * '(term-name|def-definition|go-term)'
     *  is assumed.
     *  
     * 
     * @return the value of field 'MatchXMLTextNames'.
     */
    public java.lang.String getMatchXMLTextNames(
    ) {
        return this._matchXMLTextNames;
    }

    /**
     * Returns the value of field 'prioritizedCommentNames'.
     * 
     * @return the value of field 'PrioritizedCommentNames'.
     */
    public org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames getPrioritizedCommentNames(
    ) {
        return this._prioritizedCommentNames;
    }

    /**
     * Returns the value of field 'prioritizedDefinitionNames'.
     * 
     * @return the value of field 'PrioritizedDefinitionNames'.
     */
    public org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames getPrioritizedDefinitionNames(
    ) {
        return this._prioritizedDefinitionNames;
    }

    /**
     * Returns the value of field 'prioritizedPresentationNames'.
     * 
     * @return the value of field 'PrioritizedPresentationNames'.
     */
    public org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames getPrioritizedPresentationNames(
    ) {
        return this._prioritizedPresentationNames;
    }

    /**
     * Returns the value of field 'processComplexProps'. The field
     * 'processComplexProps' has the following description:
     * Indicates whether rdf property text will be evaluated to
     * detect and process
     *  embedded XML. This is a master switch controlling whether
     * the MatchXML
     *  and isDBXRef preferences are acknowledged. The default is
     * false.
     *  
     * 
     * @return the value of field 'ProcessComplexProps'.
     */
    public java.lang.Boolean getProcessComplexProps(
    ) {
        return this._processComplexProps;
    }

    /**
     * Returns the value of field 'propnamePrimitive'. The field
     * 'propnamePrimitive' has the following description: Entities
     * can be assigned a property that indicates whether or not it
     * is
     *  considered primitive (having no equivalent classes). This
     * preference controls
     *  the name of the property that is created; the property
     * value will indicate
     *  true or false. If not specified, the name 'primitive' is
     * assumed.
     *  
     * 
     * @return the value of field 'PropnamePrimitive'.
     */
    public java.lang.String getPropnamePrimitive(
    ) {
        return this._propnamePrimitive;
    }

    /**
     * Returns the value of field 'propnameType'. The field
     * 'propnameType' has the following description: Anonymous OWL
     * classes of type OWLNAryLogicalClass can be assigned
     *  properties that indicate the nature or type of component
     * logical operations.
     *  This preference controls the name of the property that is
     * created; the
     *  property value will indicate the logical operation (e.g.
     * owl:oneOf). If not
     *  specified, the name 'type' is assumed.
     *  
     * 
     * @return the value of field 'PropnameType'.
     */
    public java.lang.String getPropnameType(
    ) {
        return this._propnameType;
    }

    /**
     * Returns the value of field 'strictOWLImplementation'. The
     * field 'strictOWLImplementation' has the following
     * description: Controls the relationship between restrictions
     * of anonymous classes and parent concepts.
     *  If true, restrictions for anonymous classes are not
     * connected to the parent concepts.
     *  The default is true.
     *  
     * 
     * @return the value of field 'StrictOWLImplementation'.
     */
    public java.lang.Boolean getStrictOWLImplementation(
    ) {
        return this._strictOWLImplementation;
    }

    /**
     * Returns the value of field
     * 'transitiveInverseAssociatinNames'.
     * 
     * @return the value of field 'TransitiveInverseAssociatinNames'
     */
    public org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames getTransitiveInverseAssociatinNames(
    ) {
        return this._transitiveInverseAssociatinNames;
    }

    /**
     * Returns the value of field
     * 'transitiveNormalAssociationNames'.
     * 
     * @return the value of field 'TransitiveNormalAssociationNames'
     */
    public org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames getTransitiveNormalAssociationNames(
    ) {
        return this._transitiveNormalAssociationNames;
    }

    /**
     * Returns the value of field 'createConceptForObjectProp'. The
     * field 'createConceptForObjectProp' has the following
     * description: Controls whether concept entities are created
     * for object properties defined in
     *  the OWL source. The default is false.
     *  
     * 
     * @return the value of field 'CreateConceptForObjectProp'.
     */
    public java.lang.Boolean isCreateConceptForObjectProp(
    ) {
        return this._createConceptForObjectProp;
    }

    /**
     * Returns the value of field 'isDBXrefRepform'. The field
     * 'isDBXrefRepform' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of representational
     *  form cross reference information in xml element text. If
     * not specified, the default
     *  of 'false' is assumed.
     *  
     * 
     * @return the value of field 'IsDBXrefRepform'.
     */
    public java.lang.Boolean isIsDBXrefRepform(
    ) {
        return this._isDBXrefRepform;
    }

    /**
     * Returns the value of field 'isDBXrefSource'. The field
     * 'isDBXrefSource' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of ISBN cross
     *  reference information in xml element text. If not
     * specified, the default
     *  of 'false' is assumed.
     *  
     * 
     * @return the value of field 'IsDBXrefSource'.
     */
    public java.lang.Boolean isIsDBXrefSource(
    ) {
        return this._isDBXrefSource;
    }

    /**
     * Returns the value of field 'isTransitiveManaged'. The field
     * 'isTransitiveManaged' has the following description:
     * Transitive management flag indicates administrator will name
     * inverse and normal transitive
     *  elements as opposed to a random implementation
     *  
     * 
     * @return the value of field 'IsTransitiveManaged'.
     */
    public java.lang.Boolean isIsTransitiveManaged(
    ) {
        return this._isTransitiveManaged;
    }

    /**
     * Returns the value of field 'processComplexProps'. The field
     * 'processComplexProps' has the following description:
     * Indicates whether rdf property text will be evaluated to
     * detect and process
     *  embedded XML. This is a master switch controlling whether
     * the MatchXML
     *  and isDBXRef preferences are acknowledged. The default is
     * false.
     *  
     * 
     * @return the value of field 'ProcessComplexProps'.
     */
    public java.lang.Boolean isProcessComplexProps(
    ) {
        return this._processComplexProps;
    }

    /**
     * Returns the value of field 'strictOWLImplementation'. The
     * field 'strictOWLImplementation' has the following
     * description: Controls the relationship between restrictions
     * of anonymous classes and parent concepts.
     *  If true, restrictions for anonymous classes are not
     * connected to the parent concepts.
     *  The default is true.
     *  
     * 
     * @return the value of field 'StrictOWLImplementation'.
     */
    public java.lang.Boolean isStrictOWLImplementation(
    ) {
        return this._strictOWLImplementation;
    }

    /**
     * Sets the value of field 'createConceptForObjectProp'. The
     * field 'createConceptForObjectProp' has the following
     * description: Controls whether concept entities are created
     * for object properties defined in
     *  the OWL source. The default is false.
     *  
     * 
     * @param createConceptForObjectProp the value of field
     * 'createConceptForObjectProp'.
     */
    public void setCreateConceptForObjectProp(
            final java.lang.Boolean createConceptForObjectProp) {
        this._createConceptForObjectProp = createConceptForObjectProp;
    }

    /**
     * Sets the value of field 'datatypePropSwitch'. The field
     * 'datatypePropSwitch' has the following description: Controls
     * how data type properties are converted to components of the
     * LexGrid
     *  model. If 'association' is specified, each data type
     * property is recorded in LexGrid as
     *  an entity-to-entity relationship. If 'conceptProperty' is
     * specified, traditional
     *  LexGrid properties are created and assigned directly to new
     * entities . If 'both'
     *  is specified, both entity relationships and standard
     * LexGrid entity properties
     *  are generated. The default is 'both'.
     *  
     * 
     * @param datatypePropSwitch the value of field
     * 'datatypePropSwitch'.
     */
    public void setDatatypePropSwitch(
            final java.lang.String datatypePropSwitch) {
        this._datatypePropSwitch = datatypePropSwitch;
    }

    /**
     * Sets the value of field 'isDBXrefRepform'. The field
     * 'isDBXrefRepform' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of representational
     *  form cross reference information in xml element text. If
     * not specified, the default
     *  of 'false' is assumed.
     *  
     * 
     * @param isDBXrefRepform the value of field 'isDBXrefRepform'.
     */
    public void setIsDBXrefRepform(
            final java.lang.Boolean isDBXrefRepform) {
        this._isDBXrefRepform = isDBXrefRepform;
    }

    /**
     * Sets the value of field 'isDBXrefSource'. The field
     * 'isDBXrefSource' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference) and source, this preference allows for
     * identification of ISBN cross
     *  reference information in xml element text. If not
     * specified, the default
     *  of 'false' is assumed.
     *  
     * 
     * @param isDBXrefSource the value of field 'isDBXrefSource'.
     */
    public void setIsDBXrefSource(
            final java.lang.Boolean isDBXrefSource) {
        this._isDBXrefSource = isDBXrefSource;
    }

    /**
     * Sets the value of field 'isTransitiveManaged'. The field
     * 'isTransitiveManaged' has the following description:
     * Transitive management flag indicates administrator will name
     * inverse and normal transitive
     *  elements as opposed to a random implementation
     *  
     * 
     * @param isTransitiveManaged the value of field
     * 'isTransitiveManaged'.
     */
    public void setIsTransitiveManaged(
            final java.lang.Boolean isTransitiveManaged) {
        this._isTransitiveManaged = isTransitiveManaged;
    }

    /**
     * Sets the value of field 'matchConceptCode'. The field
     * 'matchConceptCode' has the following description: This
     * preference allows for entity codes to be derived from a
     * specific RDF
     *  property. The provided string is interpreted as a regular
     * expression to be
     *  compared against properties assigned to each processed
     * class. If a
     *  property name matches the regular expression, the property
     * value
     *  is assigned as the entity code. If not specified no default
     * match is
     *  assumed, and the entity code is derived from the RDF
     * resource name.
     *  
     * 
     * @param matchConceptCode the value of field 'matchConceptCode'
     */
    public void setMatchConceptCode(
            final java.lang.String matchConceptCode) {
        this._matchConceptCode = matchConceptCode;
    }

    /**
     * Sets the value of field 'matchConceptStatus'. The field
     * 'matchConceptStatus' has the following description: This
     * preference allows for entity status to be derived from a
     * specific RDF
     *  property. The provided string is interpreted as a regular
     * expression to be
     *  compared against properties assigned to each processed
     * class. If a
     *  property name matches the regular expression, the property
     * value
     *  is assigned as the entity status. If not specified, the
     * regular expression
     *  of ('concept_status') is assumed, and if not matched no
     * status string
     *  is assigned (the isActive boolean flag will still be set
     * based on
     *  deprecation).
     *  
     * 
     * @param matchConceptStatus the value of field
     * 'matchConceptStatus'.
     */
    public void setMatchConceptStatus(
            final java.lang.String matchConceptStatus) {
        this._matchConceptStatus = matchConceptStatus;
    }

    /**
     * Sets the value of field 'matchNoopNamespaces'. The field
     * 'matchNoopNamespaces' has the following description: This
     * preference allows for classes to be selectively ignored on
     * import to LexGrid.
     *  The provided string is interpreted as a regular expression
     * to be compared
     *  against class namespace. If matched, a counterpart entity
     * is not created in the
     *  LexGrid coding scheme. If not provided, the expression
     * '(:|@_:|protege:|xsp:).'
     *  is assumed.
     *  
     * 
     * @param matchNoopNamespaces the value of field
     * 'matchNoopNamespaces'.
     */
    public void setMatchNoopNamespaces(
            final java.lang.String matchNoopNamespaces) {
        this._matchNoopNamespaces = matchNoopNamespaces;
    }

    /**
     * Sets the value of field 'matchRootName'. The field
     * 'matchRootName' has the following description: This
     * preference allows for custom declaration of root concepts
     * for hierarchical
     *  relationships. The provided string is interpreted as a
     * regular expression to be
     *  compared against the resource name for each class. If
     * matched, the node is
     *  designated as a root in the supported hierarchy metadata.
     * If not specified,
     *  root nodes are identified by having a superclass of
     * owl:thing.
     *  
     * 
     * @param matchRootName the value of field 'matchRootName'.
     */
    public void setMatchRootName(
            final java.lang.String matchRootName) {
        this._matchRootName = matchRootName;
    }

    /**
     * Sets the value of field 'matchXMLRepformNames'. The field
     * 'matchXMLRepformNames' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * representational form
     *  names contained by XML fragments embedded within rdf
     * property text.
     *  The provided string is interpreted as a regular expression
     * and compared
     *  against the XML tags in each fragment. If not specified,
     * the default
     *  expression '(term-group)' is assumed.
     *  
     * 
     * @param matchXMLRepformNames the value of field
     * 'matchXMLRepformNames'.
     */
    public void setMatchXMLRepformNames(
            final java.lang.String matchXMLRepformNames) {
        this._matchXMLRepformNames = matchXMLRepformNames;
    }

    /**
     * Sets the value of field 'matchXMLSourceNames'. The field
     * 'matchXMLSourceNames' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * source names contained
     *  by XML fragments embedded within rdf property text. The
     * provided string is
     *  interpreted as a regular expression and compared against
     * the XML tags in
     *  each fragment. If not specified, the default expression
     * '(term-source|def-source)'
     *  is assumed.
     *  
     * 
     * @param matchXMLSourceNames the value of field
     * 'matchXMLSourceNames'.
     */
    public void setMatchXMLSourceNames(
            final java.lang.String matchXMLSourceNames) {
        this._matchXMLSourceNames = matchXMLSourceNames;
    }

    /**
     * Sets the value of field 'matchXMLTextNames'. The field
     * 'matchXMLTextNames' has the following description: If
     * processing of complex properties is enabled (see
     * ProcessComplexProps
     *  preference), this preference allows for identification of
     * descriptive text contained
     *  by XML fragments embedded within rdf property text. The
     * provided string is
     *  interpreted as a regular expression and compared against
     * the XML tags in
     *  each fragment. If not specified, the default expression
     * '(term-name|def-definition|go-term)'
     *  is assumed.
     *  
     * 
     * @param matchXMLTextNames the value of field
     * 'matchXMLTextNames'.
     */
    public void setMatchXMLTextNames(
            final java.lang.String matchXMLTextNames) {
        this._matchXMLTextNames = matchXMLTextNames;
    }

    /**
     * Sets the value of field 'prioritizedCommentNames'.
     * 
     * @param prioritizedCommentNames the value of field
     * 'prioritizedCommentNames'.
     */
    public void setPrioritizedCommentNames(
            final org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedCommentNames prioritizedCommentNames) {
        this._prioritizedCommentNames = prioritizedCommentNames;
    }

    /**
     * Sets the value of field 'prioritizedDefinitionNames'.
     * 
     * @param prioritizedDefinitionNames the value of field
     * 'prioritizedDefinitionNames'.
     */
    public void setPrioritizedDefinitionNames(
            final org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedDefinitionNames prioritizedDefinitionNames) {
        this._prioritizedDefinitionNames = prioritizedDefinitionNames;
    }

    /**
     * Sets the value of field 'prioritizedPresentationNames'.
     * 
     * @param prioritizedPresentationNames the value of field
     * 'prioritizedPresentationNames'.
     */
    public void setPrioritizedPresentationNames(
            final org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.PrioritizedPresentationNames prioritizedPresentationNames) {
        this._prioritizedPresentationNames = prioritizedPresentationNames;
    }

    /**
     * Sets the value of field 'processComplexProps'. The field
     * 'processComplexProps' has the following description:
     * Indicates whether rdf property text will be evaluated to
     * detect and process
     *  embedded XML. This is a master switch controlling whether
     * the MatchXML
     *  and isDBXRef preferences are acknowledged. The default is
     * false.
     *  
     * 
     * @param processComplexProps the value of field
     * 'processComplexProps'.
     */
    public void setProcessComplexProps(
            final java.lang.Boolean processComplexProps) {
        this._processComplexProps = processComplexProps;
    }

    /**
     * Sets the value of field 'propnamePrimitive'. The field
     * 'propnamePrimitive' has the following description: Entities
     * can be assigned a property that indicates whether or not it
     * is
     *  considered primitive (having no equivalent classes). This
     * preference controls
     *  the name of the property that is created; the property
     * value will indicate
     *  true or false. If not specified, the name 'primitive' is
     * assumed.
     *  
     * 
     * @param propnamePrimitive the value of field
     * 'propnamePrimitive'.
     */
    public void setPropnamePrimitive(
            final java.lang.String propnamePrimitive) {
        this._propnamePrimitive = propnamePrimitive;
    }

    /**
     * Sets the value of field 'propnameType'. The field
     * 'propnameType' has the following description: Anonymous OWL
     * classes of type OWLNAryLogicalClass can be assigned
     *  properties that indicate the nature or type of component
     * logical operations.
     *  This preference controls the name of the property that is
     * created; the
     *  property value will indicate the logical operation (e.g.
     * owl:oneOf). If not
     *  specified, the name 'type' is assumed.
     *  
     * 
     * @param propnameType the value of field 'propnameType'.
     */
    public void setPropnameType(
            final java.lang.String propnameType) {
        this._propnameType = propnameType;
    }

    /**
     * Sets the value of field 'strictOWLImplementation'. The field
     * 'strictOWLImplementation' has the following description:
     * Controls the relationship between restrictions of anonymous
     * classes and parent concepts.
     *  If true, restrictions for anonymous classes are not
     * connected to the parent concepts.
     *  The default is true.
     *  
     * 
     * @param strictOWLImplementation the value of field
     * 'strictOWLImplementation'.
     */
    public void setStrictOWLImplementation(
            final java.lang.Boolean strictOWLImplementation) {
        this._strictOWLImplementation = strictOWLImplementation;
    }

    /**
     * Sets the value of field 'transitiveInverseAssociatinNames'.
     * 
     * @param transitiveInverseAssociatinNames the value of field
     * 'transitiveInverseAssociatinNames'.
     */
    public void setTransitiveInverseAssociatinNames(
            final org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveInverseAssociatinNames transitiveInverseAssociatinNames) {
        this._transitiveInverseAssociatinNames = transitiveInverseAssociatinNames;
    }

    /**
     * Sets the value of field 'transitiveNormalAssociationNames'.
     * 
     * @param transitiveNormalAssociationNames the value of field
     * 'transitiveNormalAssociationNames'.
     */
    public void setTransitiveNormalAssociationNames(
            final org.LexGrid.LexBIG.Preferences.loader.OWLLoadPreferences.TransitiveNormalAssociationNames transitiveNormalAssociationNames) {
        this._transitiveNormalAssociationNames = transitiveNormalAssociationNames;
    }

}
