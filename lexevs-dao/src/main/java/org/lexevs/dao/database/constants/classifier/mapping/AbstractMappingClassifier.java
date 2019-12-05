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
package org.lexevs.dao.database.constants.classifier.mapping;

import java.util.HashMap;
import java.util.Map;

import org.LexGrid.naming.*;
import org.LexGrid.util.sql.lgTables.SQLTableConstants;
import org.springframework.batch.support.annotation.Classifier;

/**
 * The Class AbstractMappingClassifier.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public abstract class AbstractMappingClassifier<I,O>{
	
	/** The mappings. */
	private Map<Class<? extends URIMap>,String> mappings = buildMap();
	
	/* (non-Javadoc)
	 * @see org.springframework.batch.classify.Classifier#classify(java.lang.Object)
	 */
	@Classifier
	public O classify(I item) {
		try {
			return doClassify(item, mappings);
		} catch (Exception e) {
			throw getException(item);
		}
	}
	
	/**
	 * Gets the exception.
	 * 
	 * @param item the item
	 * 
	 * @return the exception
	 */
	protected RuntimeException getException(Object item) {
		return new RuntimeException("Cound not classify: " + item.toString());
	}

	/**
	 * Do classify.
	 * 
	 * @param item the item
	 * @param mappngs the mappngs
	 * 
	 * @return the o
	 */
	protected abstract O doClassify(I item, Map<Class<? extends URIMap>,String> mappngs);

	/**
	 * Builds the map.
	 * 
	 * @return the map< class<? extends uri map>, string>
	 */
	protected Map<Class<? extends URIMap>,String> buildMap() {
		Map<Class<? extends URIMap>,String> mappings = new HashMap<Class<? extends URIMap>,String>();
		
		mappings.put(
				SupportedAssociation.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_ASSOCIATION); 
		mappings.put(
				SupportedAssociationQualifier.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_ASSOCIATIONQUALIFIER); 
		mappings.put(
				SupportedCodingScheme.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_CODINGSCHEME); 
		mappings.put(
				SupportedConceptDomain.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_CONCEPTDOMAIN); 
		mappings.put(
				SupportedContainerName.class ,SQLTableConstants.TBLCOLVAL_SUPPTAG_CONTAINERNAME); 
		mappings.put(
				SupportedContext.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_CONTEXT); 
		mappings.put(
				SupportedDataType.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_DATATYPE); 
		mappings.put(
				SupportedDegreeOfFidelity.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_DEGREEOFFIDELITY); 
		mappings.put(
				SupportedEntityType.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_ENTITYTYPE); 
		mappings.put(
				SupportedHierarchy.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_HIERARCHY); 
		mappings.put(
				SupportedLanguage.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_LANGUAGE); 
		mappings.put(
				SupportedNamespace.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_NAMESPACE); 
		mappings.put(
				SupportedProperty.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_PROPERTY); 
		mappings.put(
				SupportedPropertyLink.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_PROPERTYLINK); 
		mappings.put(
				SupportedPropertyQualifier.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_PROPERTYQUALIFIER); 
		mappings.put(
				SupportedPropertyQualifierType.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_PROPERTYQUALIFIERTYPE); 
		mappings.put(
				SupportedPropertyType.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_PROPERTYTYPE); 
		mappings.put(
				SupportedRepresentationalForm.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_REPRESENTATIONALFORM); 
		mappings.put(
				SupportedSortOrder.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_SORTORDER); 
		mappings.put(
				SupportedSource.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_SOURCE); 
		mappings.put(
				SupportedSourceRole.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_SOURCEROLE); 
		mappings.put(
				SupportedStatus.class, SQLTableConstants.TBLCOLVAL_SUPPTAG_STATUS); 
		
		return mappings;
	}
}