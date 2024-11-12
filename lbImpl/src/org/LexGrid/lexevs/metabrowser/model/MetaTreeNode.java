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
import java.util.ArrayList;
import java.util.List;

import org.LexGrid.annotations.LgClientSideSafe;
import org.LexGrid.lexevs.metabrowser.helper.ChildIterator;

/**
 * The Class MetaTreeNode.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class MetaTreeNode implements Serializable {
	
	private List<MetaTreeNode> parents = new ArrayList<MetaTreeNode>();

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 9090573514921671435L;
	
	private String sab;
	
	/**
	 * The Enum ExpandedState.
	 * 
	 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
	 */
	public enum ExpandedState {
		
		EXPANDABLE, 

		LEAF, 

		UNKNOWN}

	/** The children count. */
	private int childrenCount;
	
	/** The cui. */
	private String cui;
	
	/** The name. */
	private String name;

	/** The children. */
	private ChildIterator children;
	
	private List<MetaTreeNode> pathToRootChilden = new ArrayList<MetaTreeNode>();
	
	/** The expanded state. */
	private ExpandedState expandedState = ExpandedState.UNKNOWN;
	
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
	 * Gets the name.
	 * 
	 * @return the name
	 */
	@LgClientSideSafe
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the children. This iterator will return all of the chilren of this node.
	 * 
	 * NOTE: The iterator itself is paging the children on demand, but the user will
	 * see this as a continuous iteration.
	 * 
	 * @return the children
	 */
	public ChildIterator getChildren() {
		return children;
	}
	
	/**
	 * Sets the children.
	 * 
	 * @param children the new children
	 */
	public void setChildren(ChildIterator children) {
		this.children = children;
	}
	
	/**
	 * Gets the expanded state.
	 * 
	 * @return the expanded state
	 */
	@LgClientSideSafe
	public ExpandedState getExpandedState() {
		return expandedState;
	}
	
	/**
	 * Sets the expanded state.
	 * 
	 * @param expandedState the new expanded state
	 */
	public void setExpandedState(ExpandedState expandedState) {
		this.expandedState = expandedState;
	}
	
	/**
	 * Sets the children count.
	 * 
	 * @param childrenCount the new children count
	 */
	@LgClientSideSafe
	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}
	
	/**
	 * Gets the children count.
	 * 
	 * @return the children count
	 */
	public int getChildrenCount() {
		return childrenCount;
	}

	public void setParents(List<MetaTreeNode> parents) {
		this.parents = parents;
	}

	public List<MetaTreeNode> getParents() {
		return parents;
	}

	public void setPathToRootChilden(List<MetaTreeNode> pathToRootChilden) {
		this.pathToRootChilden = pathToRootChilden;
	}

	public List<MetaTreeNode> getPathToRootChilden() {
		return pathToRootChilden;
	}

	public void setSab(String sab) {
		this.sab = sab;
	}

	public String getSab() {
		return sab;
	}

}
