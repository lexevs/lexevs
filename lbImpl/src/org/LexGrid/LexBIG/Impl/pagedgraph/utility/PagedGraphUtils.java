/*
 * Copyright: (c) 2004-2010 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.LexGrid.LexBIG.Impl.pagedgraph.utility;

import java.util.List;
import java.util.Map;

import org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference;
import org.LexGrid.LexBIG.DataModel.Core.ConceptReference;
import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.LexBIG.Extensions.Query.Filter;
import org.LexGrid.LexBIG.Impl.pagedgraph.query.DefaultGraphQueryBuilder;
import org.LexGrid.LexBIG.Impl.pagedgraph.root.RootsResolver.ResolveDirection;
import org.LexGrid.LexBIG.Utility.ServiceUtility;
import org.apache.commons.lang.ArrayUtils;
import org.lexevs.dao.database.service.codednodegraph.CodedNodeGraphService;
import org.lexevs.dao.database.service.codednodegraph.model.GraphQuery;
import org.lexevs.dao.database.service.codednodegraph.model.GraphQuery.CodeNamespacePair;
import org.lexevs.locator.LexEvsServiceLocator;
import org.springframework.util.CollectionUtils;

/**
 * The Class PagedGraphUtils.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class PagedGraphUtils {
    
    public static boolean checkFocus(
            String uri,
            String version,
            String relationsContainer,
            String entityCode,
            String entityCodeNamespace,
            boolean resolveForward, 
            boolean resolveBackward, 
            GraphQuery graphQuery) {
        ResolvedConceptReference ref = new ResolvedConceptReference();
        ref.setCode(entityCode);
        ref.setCodeNamespace(entityCodeNamespace);
        
        return checkFocus(uri,version,relationsContainer, ref, resolveForward, resolveBackward, null, graphQuery, false);
    }
    
    public static boolean checkFocus(
            String uri,
            String version,
            String relationsContainer,
            ResolvedConceptReference focus, 
            boolean resolveForward, 
            boolean resolveBackward, 
            Filter[] filters, 
            GraphQuery graphQuery,
            boolean needToValidateFocusExistsInGraph) {
        if(focus == null) {return false;}
 
        boolean hasReferenceToSourceCodeRestriction = 
            resolveForward ? hasReferenceToSourceCodeRestriction(uri, version, relationsContainer, focus, graphQuery) : true;
        
        boolean hasReferenceToTargetCodeRestriction = 
            resolveBackward ? hasReferenceToTargetCodeRestriction(uri, version, relationsContainer, focus, graphQuery) : true;
       
        boolean isInvalidMatchConceptReference = isNotInvalidMatchConceptReference(focus);
       
        boolean isNotFilteredOut = isNotFilteredConceptReference(focus, filters);
        
        boolean existsInGraph = needToValidateFocusExistsInGraph ? existsInGraph(uri, version, relationsContainer, focus, graphQuery) : true;
      
        return 
            hasReferenceToSourceCodeRestriction && 
            hasReferenceToTargetCodeRestriction && 
            isInvalidMatchConceptReference &&
            isNotFilteredOut &&
            existsInGraph;  
    }
    
    private static boolean isNotFilteredConceptReference(ResolvedConceptReference focus, Filter[] filters) {
        return ServiceUtility.passFilters(focus, filters);
    }


    private static boolean isNotInvalidMatchConceptReference(ConceptReference focus) {
        return !PagedGraphUtils.areCodedNodeReferencesEquals(focus, DefaultGraphQueryBuilder.INVALID_MATCH_CONCEPT_REFERENCE);
    }
    
    private static boolean hasReferenceToTargetCodeRestriction(
            String uri, 
            String version, 
            String relationsContainer, 
            ConceptReference focus, 
            GraphQuery graphQuery) {
        List<ConceptReference>  restrictToTargetCodes = graphQuery.getRestrictToTargetCodes();
        if(CollectionUtils.isEmpty(restrictToTargetCodes)) {
            return true;
        }
        if(containsConceptReference(focus, restrictToTargetCodes)) {
            return true;
        }
        
        return false;
    }

    private static boolean hasReferenceToSourceCodeRestriction(
            String uri, 
            String version, 
            String relationsContainer, 
            ConceptReference focus, 
            GraphQuery graphQuery) {
        List<ConceptReference>  restrictToSourceCodes = graphQuery.getRestrictToSourceCodes(); 
        if(CollectionUtils.isEmpty(restrictToSourceCodes)) {
            return true;
        }
        if(containsConceptReference(focus, restrictToSourceCodes)) {
            return true;
        }
        
        return false;
    }
    
    private static boolean existsInGraph(
            String uri, 
            String version, 
            String relationsContainer, 
            ConceptReference focus, 
            GraphQuery graphQuery) {
 
        CodedNodeGraphService service = 
            LexEvsServiceLocator.getInstance().getDatabaseServiceManager().getCodedNodeGraphService();
        
        Map<String,Integer> subjectCount = 
        service.getTripleUidsContainingSubjectCount(
                uri, 
                version, 
                relationsContainer, 
                focus.getCode(), 
                focus.getCodeNamespace(), 
                graphQuery);
        
        Map<String,Integer> objectCount = 
            service.getTripleUidsContainingObjectCount(
                    uri, 
                    version, 
                    relationsContainer, 
                    focus.getCode(), 
                    focus.getCodeNamespace(), 
                    graphQuery);
        
        return !subjectCount.isEmpty() || !objectCount.isEmpty();
    }
    
    private static boolean containsConceptReference(ConceptReference ref, List<ConceptReference> list) {
        for(ConceptReference conceptRef : list) {
            if(ref.getCode().equals(conceptRef.getCode()) &&
                    ref.getCodeNamespace().equals(conceptRef.getCodeNamespace())){
                return true;
            }
        }
        return false;
    }

    /**
     * Are coded node references equals.
     * 
     * @param ref1 the ref1
     * @param ref2 the ref2
     * 
     * @return true, if successful
     */
    public static boolean areCodedNodeReferencesEquals(CodedNodeReference ref1, CodedNodeReference ref2) {
        return 
        ref1.getCode().equals(ref2.getCode())
        &&
        ref1.getCodeNamespace().equals(ref2.getCodeNamespace())
        &&
        ArrayUtils.isEquals(ref1.getEntityType(), ref2.getEntityType());
    }
    
    public static ConceptReference codeNamespacePairToConceptReference(CodeNamespacePair pair) {
        ConceptReference ref = new ConceptReference();
        ref.setCode(pair.getCode());
        ref.setCodeNamespace(pair.getNamespace());
        return ref;
    }
    
    public static ResolveDirection getDirection(boolean resolveForward, boolean resolveBackward) {
        if(resolveForward && resolveBackward) {
            throw new RuntimeException();
        }
        
        if(!resolveForward && !resolveBackward) {
            throw new RuntimeException();
        }
        
        if(resolveForward) {
            return ResolveDirection.FORWARD;
        } else {
            return ResolveDirection.BACKWARD;
        }
    }
}
