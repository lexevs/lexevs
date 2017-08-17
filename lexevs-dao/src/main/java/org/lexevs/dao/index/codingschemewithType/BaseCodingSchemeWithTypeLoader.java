package org.lexevs.dao.index.codingschemewithType;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.LexGrid.LexBIG.Utility.logging.LgLoggerIF;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.KeywordAnalyzer;
import org.apache.lucene.analysis.miscellaneous.PerFieldAnalyzerWrapper;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.document.Document;
import org.lexevs.dao.indexer.api.generators.DocumentFromStringsGenerator;
import org.lexevs.logging.LoggerFactory;

/**
 * Base class for building a CodingSchemeWithType index for LexEVS.
 */
public class BaseCodingSchemeWithTypeLoader {
	
	private DocumentFromStringsGenerator generator_ = new DocumentFromStringsGenerator();

	private static final String CODING_SCHEME_URI = "codingSchemeUri";
	private static final String CODING_SCHEME_VERSION = "codingSchemeVersion";
	private static final String CODING_SCHEME_NAME = "codingSchemeRegisteredName";
	private static final String CODING_SCHEME_IS_RESOLVED_VALUE_SET = "codingSchemeIsResolvedValueSet";
	private static final String CODING_SCHEME_NAME_VERSION = "codingSchemeNameAndVersion";
	
	public static final String STRING_TOKENIZER_TOKEN = "<:>";
	public static final String CONCATINATED_VALUE_SPLIT_TOKEN = ":";

	protected LgLoggerIF getLogger() {
		return LoggerFactory.getLogger();
	}

	public Document addProperty(String codingSchemeUri, String codingSchemeVersion, String codingSchemeName,
			boolean isCodingSchemeResolvedValueSet) throws Exception {
		
		StringBuffer fields = new StringBuffer();
		
		generator_.startNewDocument(codingSchemeUri + CONCATINATED_VALUE_SPLIT_TOKEN + codingSchemeVersion
				+ CONCATINATED_VALUE_SPLIT_TOKEN + UUID.randomUUID().toString());
		
		generator_.addTextField(CODING_SCHEME_URI, codingSchemeUri, true, true, true);
		fields.append(CODING_SCHEME_URI + " ");
		
		generator_.addTextField(CODING_SCHEME_VERSION, codingSchemeVersion, true, true, true); // index and tokenize
		fields.append(CODING_SCHEME_VERSION + " ");
		
		generator_.addTextField(CODING_SCHEME_NAME, codingSchemeName, true, true, true);    // index and tokenize
		fields.append(CODING_SCHEME_NAME + " ");
		
		generator_.addTextField(CODING_SCHEME_IS_RESOLVED_VALUE_SET, Boolean.toString(isCodingSchemeResolvedValueSet), true, true, false);
		fields.append(CODING_SCHEME_IS_RESOLVED_VALUE_SET + " ");

		// this field is used to make deletions easier.
		generator_.addTextField(CODING_SCHEME_NAME_VERSION,
				//codingSchemeUri + CONCATINATED_VALUE_SPLIT_TOKEN + codingSchemeName_lower + codingSchemeVersion_lower, false, true, false);
				codingSchemeUri + CONCATINATED_VALUE_SPLIT_TOKEN + codingSchemeVersion, false, true, false);
		fields.append(CODING_SCHEME_NAME_VERSION + " ");
			
		generator_.addTextField("fields", fields.toString(), true, true, true);

		return generator_.getDocument();
	}
	
	 public static Analyzer getCodingSchemeWithTypeAnalyzer() {
		 Map<String,Analyzer> analyzerPerField = new HashMap<>();
	    	  	
    	//treat as string field by analyzing with the KeywordAnalyzer
    	analyzerPerField.put(CODING_SCHEME_URI, new KeywordAnalyzer());
    	analyzerPerField.put(CODING_SCHEME_NAME, new KeywordAnalyzer());
        analyzerPerField.put(CODING_SCHEME_VERSION, new KeywordAnalyzer());
    	analyzerPerField.put(CODING_SCHEME_IS_RESOLVED_VALUE_SET, new KeywordAnalyzer());

    	 // no stop words, default character removal set.
    	PerFieldAnalyzerWrapper analyzer = new PerFieldAnalyzerWrapper(new StandardAnalyzer(CharArraySet.EMPTY_SET), analyzerPerField);
        
    	return analyzer;
	    
	 }
}
