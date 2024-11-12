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
package org.LexGrid.lexevs.metabrowser.impl;

import static org.junit.Assert.assertTrue;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaTree;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction;
import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode;
import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode.ExpandedState;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class GetMetaTreeTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class GetMetaTreeTest extends LexBIGServiceTestCase{
	
	
	LexBIGService lbs;
	
	MetaBrowserService svc;
	
	@Override
	protected String getTestID() {
		return "Meta Extension Tab Display Test";
	}
	
	
	@BeforeClass
	public void setUp() throws LBException {
		lbs = LexBIGServiceImpl.defaultInstance();
        svc = (MetaBrowserService) lbs.getGenericExtension("metabrowser-extension");
	}
	/**
	 * Test get by souce tab display source of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetBySouceTabDisplaySourceOfExcludeSelfReferencingTrue() throws Exception {
		
		MetaTree tree = svc.getMetaNeighborhood("NCI");
		printMetaTreeNode(tree.getCurrentFocus(), 0);
		
//		tree = tree.focusMetaTreeNode("C0221566");
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		//printMetaTreeNode(tree.getCurrentFocus(), 0);
		
		//tree = tree.focusMetaTreeNode("C0027853");
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		//printMetaTreeNode(tree.getCurrentFocus(), 0);
		tree = svc.getMetaNeighborhood("NCI");
		
	}
	
	/**
	 * Prints the meta tree node.
	 * 
	 * @param node the node
	 * @param level the level
	 * 
	 * @throws Exception the exception
	 */
	private void printMetaTreeNode(MetaTreeNode node, int level) throws Exception {
		System.out.println(getLevelIndent(level) + "CUI: " + node.getCui());
		System.out.println(getLevelIndent(level) + "Name: " + node.getName());
		System.out.println(getLevelIndent(level) + "Expandable: " + node.getExpandedState());
		
		System.out.println(getLevelIndent(level) + "Children: ");
		if(node.getChildren() != null){
			for(MetaTreeNode child : node.getChildren()){
				/*
				if(child.getExpandedState().equals(EXPANDED_STATE.EXPANDABLE)){
					child = impl.focusMetaTreeNode(child);
				}
				*/
				printMetaTreeNode(child, level + 1);
			}
		}
	/*
		System.out.println(getLevelIndent(level) + "Parents: ");
		if(node.getParents() != null){
			for(MetaTreeNode parent : node.getParents()){
				printMetaTreeNode(parent, level + 1);
			}
		}
	*/
	}
	
	/**
	 * Gets the level indent.
	 * 
	 * @param level the level
	 * 
	 * @return the level indent
	 */
	private String getLevelIndent(int level){
		String indent = "";
		for(int i=0;i<level;i++){
			indent = indent + " - ";
		}
		return indent;
	}
}
