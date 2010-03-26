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
package org.lexevs.dao.database.ibatis.parameter;

/**
 * The Class PrefixedTableParameterBean.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class PrefixedTableParameterBean {

	/** The prefix. */
	private String prefix;
	
	private String entityTypeTablePrefix;
	
	/**
	 * Instantiates a new prefixed table parameter bean.
	 */
	public PrefixedTableParameterBean() {
		super();
	}

	/**
	 * Instantiates a new prefixed table parameter bean.
	 * 
	 * @param prefix the prefix
	 */
	public PrefixedTableParameterBean(String prefix) {
		super();
		this.prefix = prefix;
	}

	/**
	 * Sets the prefix.
	 * 
	 * @param prefix the new prefix
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * Gets the prefix.
	 * 
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	public void setEntityTypeTablePrefix(String entityTypeTablePrefix) {
		this.entityTypeTablePrefix = entityTypeTablePrefix;
	}

	public String getEntityTypeTablePrefix() {
		if(entityTypeTablePrefix == null) {
			return prefix;
		} else {
			return entityTypeTablePrefix;
		}
	}
}
