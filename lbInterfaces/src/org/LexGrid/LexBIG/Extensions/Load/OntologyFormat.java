
package org.LexGrid.LexBIG.Extensions.Load;

public enum OntologyFormat {
    OBO,
    OWL,
    OWLRDF,
    UMLS,
    TEXT,
    LEXGRID_XML,
    LEXGRID_MAPPING,
    NICHISTORY,
    UMLSHISTORY,
    MRMAP,
    RESOLVEDVALUESET,
    SOURCEASSERTEDRESOLVEDVS,
    MEDDRA;
    
    public static String getMetaName() {
    	return "ontologyFormat";
    }
}