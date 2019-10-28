package org.LexGrid.LexBIG.Extensions.Generic;

import java.util.Iterator;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.DataModel.Core.ConceptReference;

public interface NodeGraphResolutionExtension extends GenericExtension {
	
	public enum AlgorithmMatch {
		EXACT_MATCH("exactMatch"), 
		CONTAINS("contains"),
		STARTS_WITH("startsWith"),		
		LUCENE("LuceneQuery");
		
		private String match;
		
		private AlgorithmMatch(String match){
			this.match = match;
		}
		

		
		public String getMatch(){
			return match;
		}
	}
	
	public enum ModelMatch {
		
		NAME,
		CODE,
		PROPERTY
	}
	
	public Iterator<ConceptReference> getConceptReferencesForEntityCodeAndAssociationTargetOf(
			AbsoluteCodingSchemeVersionReference reference, 
			String associationName, String textMatch, 
			AlgorithmMatch alg, ModelMatch model);
	
	public Iterator<ConceptReference> getConceptReferencesForEntityCodeAndAssociationSourceOf(
			AbsoluteCodingSchemeVersionReference reference, 
			String associationName, String textMatch, 
			AlgorithmMatch alg, ModelMatch model);

}