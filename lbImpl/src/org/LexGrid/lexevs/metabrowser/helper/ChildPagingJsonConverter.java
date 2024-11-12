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
package org.LexGrid.lexevs.metabrowser.helper;

import java.util.ArrayList;
import java.util.List;

import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode;
import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode.ExpandedState;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.StringUtils;

/**
 * The Class ChildPagingJsonConverter.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class ChildPagingJsonConverter {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5665088464809753637L;
	
	/** The Constant ONTOLOGY_NODE_CHILD_COUNT. */
	public static final String ONTOLOGY_NODE_CHILD_COUNT = "ontology_node_child_count";
	
	/** The Constant ONTOLOGY_NODE_ID. */
	public static final String ONTOLOGY_NODE_ID = "ontology_node_id";
	
	/** The Constant ONTOLOGY_NODE_NAME. */
	public static final String ONTOLOGY_NODE_NAME = "ontology_node_name";
	
	/** The Constant CHILDREN_NODES. */
	public static final String CHILDREN_NODES = "children_nodes";
	
	/** The Constant NODES. */
	public static final String NODES = "nodes";
	
	/** The Constant PAGE. */
	public static final String PAGE = "page";

	/** The MA x_ children. */
	private int MAX_CHILDREN = 5;
	
	/** The SUBCHILDRE n_ levels. */
	private int SUBCHILDREN_LEVELS = 1;
	
	/** The MOR e_ childre n_ indicator. */
	private static String MORE_CHILDREN_INDICATOR = "...";
	
	
	public ChildPagingJsonConverter(int maxChildren){
		this.MAX_CHILDREN = maxChildren;
	}
	
	public ChildPagingJsonConverter(){
		super();
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.tree.json.JsonConverters#buildJsonPathFromRootTree(org.lexevs.tree.model.LexEvsTreeNode)
	 */
	public String buildJsonPathFromRootTree(MetaTreeNode focusNode){
		MetaTreeNode root = getRoot(focusNode);
		return buildChildrenPathToRootNodes(root).toString();
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.tree.json.JsonConverter#buildChildrenNodes(org.lexevs.tree.model.LexEvsTreeNode)
	 */
	public String buildChildrenNodes(MetaTreeNode focusNode) {
		JSONObject json = new JSONObject();
		try {
			json.put(NODES, buildChildren(focusNode, 1, SUBCHILDREN_LEVELS));
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
		return json.toString();
	}
	

	/* (non-Javadoc)
	 * @see org.lexevs.tree.json.JsonConverter#buildChildrenNodes(org.lexevs.tree.model.LexEvsTreeNode, int)
	 */
	public String buildChildrenNodes(MetaTreeNode focusNode, int page) {
		JSONObject json = new JSONObject();
		try {
			json.put(NODES, buildChildren(focusNode, page, SUBCHILDREN_LEVELS));
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
		return json.toString();
	}

	/**
	 * Builds the children.
	 * 
	 * @param focusNode the focus node
	 * @param page the page
	 * @param levels the levels
	 * 
	 * @return the jSON array
	 */
	private JSONArray buildChildren(MetaTreeNode focusNode, int page, int levels) {
		int children = 0;
		JSONArray childrenArray = new JSONArray();

		ChildIterator itr = focusNode.getChildren();
		List<String> childrenCuis = new ArrayList<String>();
		while(itr.hasNext() && children < (MAX_CHILDREN * page) && levels > 0){
			MetaTreeNode child = itr.next();
			childrenCuis.add(child.getCui());
			
			JSONObject obj = buildNode(child);
			try {
				obj.put("CHILDREN_NODES", buildChildrenNodes(child, levels - 1));
			} catch (JSONException e) {
				throw new RuntimeException(e);
			}
			childrenArray.put(obj);
			children++;
		}

		if(children >= MAX_CHILDREN){
			childrenArray.put(buildMoreChildrenNode(focusNode.getCui(), focusNode.getSab(), childrenCuis));
		}
	
		return childrenArray;
	}

	/**
	 * Builds the children path to root nodes.
	 * 
	 * @param focusNode the focus node
	 * 
	 * @return the jSON array
	 */
	public JSONArray buildChildrenPathToRootNodes(MetaTreeNode focusNode){
		try {
			return (JSONArray)walkTreeFromRoot(focusNode, true).get(CHILDREN_NODES);
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Walk tree from root.
	 * 
	 * @param node the node
	 * 
	 * @return the jSON object
	 */
	private JSONObject walkTreeFromRoot(MetaTreeNode node, boolean isRoot){
		int childLimit;
		if(isRoot){
			childLimit = Integer.MAX_VALUE;
		} else {
			childLimit = MAX_CHILDREN;
		}
		JSONObject nodeObject = new JSONObject();

		try {
			nodeObject = buildNode(node);
		
			JSONArray childrenArray = new JSONArray();
			
			if(node.getPathToRootChilden() != null){	
				List<String> childrenCuis = new ArrayList<String>();
				
				int children = 0;
				for(MetaTreeNode child : node.getPathToRootChilden()){
					children++;
					childrenCuis.add(child.getCui());
					childrenArray.put(walkTreeFromRoot(child, false));
				} 
				
				ChildIterator itr = node.getChildren();
				if(itr != null){
					while(itr.hasNext() && children < childLimit){
						MetaTreeNode child = itr.next();
						if(!knownChildrenContainsCode(node.getPathToRootChilden(), child.getCui())){
							childrenArray.put(walkTreeFromRoot(child, false));
							childrenCuis.add(child.getCui());
							children++;
						}
					}
				}
				
				if(children >= childLimit){
					childrenArray.put(buildMoreChildrenNode(node.getCui(), node.getSab(), childrenCuis));
				}
			}
			nodeObject.put(CHILDREN_NODES, childrenArray);
			
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
		
		return nodeObject;
	}

	/**
	 * Builds the node.
	 * 
	 * @param node the node
	 * 
	 * @return the jSON object
	 */
	private JSONObject buildNode(MetaTreeNode node){
		JSONObject nodeObject = new JSONObject();

		try {
			nodeObject.put(ONTOLOGY_NODE_CHILD_COUNT, expandableStatusToInt(node.getExpandedState()));
			nodeObject.put(ONTOLOGY_NODE_ID, node.getCui());
			nodeObject.put(ONTOLOGY_NODE_NAME, node.getName());

			JSONArray childrenArray = new JSONArray();
			nodeObject.put(CHILDREN_NODES, childrenArray);
			
			return nodeObject;
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Builds the more children node.
	 * 
	 * @param parent the parent
	 * 
	 * @return the jSON object
	 */
	private JSONObject buildMoreChildrenNode(String parentCui, String sab, List<String> childrenCuis){
		JSONObject nodeObject = new JSONObject();

		try {
			nodeObject.put(ONTOLOGY_NODE_CHILD_COUNT, 1);
			nodeObject.put(ONTOLOGY_NODE_ID, parentCui + "|" + sab + "|" + buildChildrenCuisString(childrenCuis) + "|"+ 0);
			nodeObject.put(ONTOLOGY_NODE_NAME, MORE_CHILDREN_INDICATOR);
			nodeObject.put(PAGE, 1);

			JSONArray childrenArray = new JSONArray();
			nodeObject.put(CHILDREN_NODES, childrenArray);
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
		return nodeObject;
	}
	
	private String buildChildrenCuisString(List<String> childrenCuis){
		StringBuffer sb = new StringBuffer();
		
		sb.append(StringUtils.collectionToDelimitedString(childrenCuis, "$"));
		
		return sb.toString();
	}
	
	/**
	 * Known children contains code.
	 * 
	 * @param list the list
	 * @param code the code
	 * 
	 * @return true, if successful
	 */
	private boolean knownChildrenContainsCode(List<MetaTreeNode> list, String cui){
		for(MetaTreeNode node : list){
			if(node.getCui().equals(cui)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Expandable status to int.
	 * 
	 * @param status the status
	 * 
	 * @return the int
	 */
	public int expandableStatusToInt(ExpandedState status){
		if(status.equals(ExpandedState.EXPANDABLE)){
			return 1;
		} else {
			return 0;
		}
	}
	
	public static MetaTreeNode getRoot(MetaTreeNode focus){
		if(focus.getParents() == null || focus.getParents().size() == 0){
			return focus;
		} else {
			return getRoot(focus.getParents().get(0));
		}
	}
}
