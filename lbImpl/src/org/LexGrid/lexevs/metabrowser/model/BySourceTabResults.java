/*
 * Copyright: (c) 2004-2009 Mayo Foundation for Medical Education and 
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

/**
 * The Class BySourceTabResults.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class BySourceTabResults implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The cui. */
	private String cui;
	
	/** The rel. */
	private String rel;
	
	/** The rela. */
	private String rela;
	
	/** The term. */
	private String term;
	
	/** The source. */
	private String source;
	
	/** The type. */
	private String type;
	
	/** The code. */
	private String code;
	
	/**
	 * Gets the cui.
	 * 
	 * @return the cui
	 */
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
	 * Gets the rel.
	 * 
	 * @return the rel
	 */
	public String getRel() {
		return rel;
	}
	
	/**
	 * Sets the rel.
	 * 
	 * @param rel the new rel
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	/**
	 * Gets the rela.
	 * 
	 * @return the rela
	 */
	public String getRela() {
		return rela;
	}
	
	/**
	 * Sets the rela.
	 * 
	 * @param rela the new rela
	 */
	public void setRela(String rela) {
		this.rela = rela;
	}
	
	/**
	 * Gets the term.
	 * 
	 * @return the term
	 */
	public String getTerm() {
		return term;
	}
	
	/**
	 * Sets the term.
	 * 
	 * @param term the new term
	 */
	public void setTerm(String term) {
		this.term = term;
	}
	
	/**
	 * Gets the source.
	 * 
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * Sets the source.
	 * 
	 * @param source the new source
	 */
	public void setSource(String source) {
		this.source = source;
	}
	
	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 * 
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 * 
	 * @param code the new code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("CUI: " + this.cui);
		sb.append(" REL: " + this.rel);
		sb.append(" RELA: " + this.rela);
		sb.append(" TERM: " + this.term);
		sb.append(" SOURCE: " + this.source);
		sb.append(" TYPE: " + this.type);
		sb.append(" CODE: " + this.code);
		
		return sb.toString();
	}
}
