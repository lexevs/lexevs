/*
 * Copyright: (c) 2004-2011 Mayo Foundation for Medical Education and 
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
package org.LexGrid.lexevs.metabrowser.model;

import java.io.Serializable;

import org.LexGrid.annotations.LgClientSideSafe;

/**
 * The Class SemanticTypeHolder.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@LgClientSideSafe
public class SemanticTypeHolder implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3025220488847418801L;
	
	/** The cui. */
	private String cui;
	
	/** The semantic type. */
	private String semanticType;

	/**
	 * Instantiates a new semantic type holder.
	 *
	 * @param cui the cui
	 * @param semanticType the semantic type
	 */
	public SemanticTypeHolder(String cui, String semanticType) {
		super();
		this.cui = cui;
		this.semanticType = semanticType;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@LgClientSideSafe
	public String toString(){
		return "CUI: " + this.cui + ", Semantic Type: " + this.semanticType;
	}
	
	/**
	 * Gets the cui.
	 *
	 * @return the cui
	 */
	@LgClientSideSafe
	public String getCui() {
		return cui;
	}
	
	/**
	 * Sets the cui.
	 *
	 * @param cui the new cui
	 */
	public void setCui(String cui) {
		this.cui = cui;
	}
	
	/**
	 * Gets the semantic type.
	 *
	 * @return the semantic type
	 */
	@LgClientSideSafe
	public String getSemanticType() {
		return semanticType;
	}
	
	/**
	 * Sets the semantic type.
	 *
	 * @param semanticType the new semantic type
	 */
	public void setSemanticType(String semanticType) {
		this.semanticType = semanticType;
	}
	
	
}
