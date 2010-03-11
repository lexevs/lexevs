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
package org.lexevs.dao.database.ibatis.versions.parameter;

import org.LexGrid.versions.EntryState;
import org.lexevs.dao.database.ibatis.parameter.IdableParameterBean;

/**
 * The Class InsertEntryStateBean.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class InsertEntryStateBean extends IdableParameterBean {

	/** The entry id. */
	private String entryId;
	
	/** The entry type. */
	private String entryType;
	
	/** The previous entry state id. */
	private String previousEntryStateId;
	
	/** The entry state. */
	private EntryState entryState;
	
	/**
	 * Gets the entry id.
	 * 
	 * @return the entry id
	 */
	public String getEntryId() {
		return entryId;
	}
	
	/**
	 * Sets the entry id.
	 * 
	 * @param entryId the new entry id
	 */
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
	
	/**
	 * Gets the entry type.
	 * 
	 * @return the entry type
	 */
	public String getEntryType() {
		return entryType;
	}
	
	/**
	 * Sets the entry type.
	 * 
	 * @param entryType the new entry type
	 */
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	
	/**
	 * Gets the previous entry state id.
	 * 
	 * @return the previous entry state id
	 */
	public String getPreviousEntryStateId() {
		return previousEntryStateId;
	}
	
	/**
	 * Sets the previous entry state id.
	 * 
	 * @param previousEntryStateId the new previous entry state id
	 */
	public void setPreviousEntryStateId(String previousEntryStateId) {
		this.previousEntryStateId = previousEntryStateId;
	}
	
	/**
	 * Sets the entry state.
	 * 
	 * @param entryState the new entry state
	 */
	public void setEntryState(EntryState entryState) {
		this.entryState = entryState;
	}
	
	/**
	 * Gets the entry state.
	 * 
	 * @return the entry state
	 */
	public EntryState getEntryState() {
		return entryState;
	}
	
	
}

