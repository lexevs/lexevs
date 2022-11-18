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
package org.LexGrid.lexevs.metabrowser;

import java.io.Serializable;

import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode;

/**
 * The Interface MetaTree.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public interface MetaTree extends Serializable {

	/**
	 * Gets the current focus of this MetaTree.
	 * 
	 * @return the current focus
	 */
	public MetaTreeNode getCurrentFocus();
	
	/**
	 * Focus the MetaTree on a MetaTreeNode. This will initialize the new focus, enabling its children to 
	 * be iterated over.
	 * 
	 * @param newFocus the new focus
	 * 
	 * @return the meta tree node
	 */
	public MetaTreeNode focus(MetaTreeNode newFocus);
	
	/**
	 * Gets the SAB of this MetaTree
	 * 
	 * @return the sab
	 */
	public String getSab();
	
	public String getJsonFromRoot(MetaTreeNode node);
	
}
