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

import java.util.ArrayList;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet.PropertyType;
import org.LexGrid.LexBIG.Utility.Constructors;
import org.LexGrid.commonTypes.Source;
import org.LexGrid.concepts.Entity;
import org.LexGrid.concepts.Presentation;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaTree;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction;
import org.LexGrid.lexevs.metabrowser.helper.ChildIterator;
import org.LexGrid.lexevs.metabrowser.helper.ChildPagingJsonConverter;
import org.LexGrid.lexevs.metabrowser.model.BySourceTabResults;
import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode;
import org.LexGrid.lexevs.metabrowser.model.MetaTreeNode.ExpandedState;

/**
 * The Class MetaTreeImpl.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class MetaTreeImpl implements MetaTree {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -143953173771075028L;

	/** The CH d_ rel. */
	private String CHD_REL = MetaBrowserServiceImpl.CHD_REL;
	private String PAR_REL = MetaBrowserServiceImpl.PAR_REL;
	
	/** The CODIN g_ schem e_ name. */
	private static String CODING_SCHEME_NAME = MetaBrowserServiceImpl.CODING_SCHEME_NAME;
	
	/** The service. */
	private transient MetaBrowserService service;
	
	/** The source. */
	private String source;
	
	/** The current focus. */
	private MetaTreeNode currentFocus;
	
	/**
	 * Instantiates a new meta tree impl.
	 */
	public MetaTreeImpl(){};
	
	/**
	 * Instantiates a new meta tree impl.
	 * 
	 * @param service the service
	 * @param source the source
	 * 
	 * @throws LBException the LB exception
	 */
	public MetaTreeImpl(MetaBrowserService service, String source) throws LBException {
		this.source = source;
		this.service = service;
		currentFocus = setInitialFocus();
	}
	
	/**
	 * Instantiates a new meta tree impl.
	 * 
	 * @param service the service
	 * @param focus the focus
	 * @param source the source
	 * 
	 * @throws LBException the LB exception
	 */
	public MetaTreeImpl(MetaBrowserService service, String focus, String source) throws LBException {
		this.source = source;
		this.service = service;
		currentFocus = setInitialFocus(focus);
	}

	
	/**
	 * Gets the children.
	 * 
	 * @param focus the focus
	 * 
	 * @return the children
	 * 
	 * @throws LBException the LB exception
	 */
	private ChildIterator getChildren(MetaTreeNode focus) throws LBException{
		return this.getChildren(focus, null);
	}
	
	private ChildIterator getChildren(MetaTreeNode focus, MetaTreeNode parent) throws LBException{
		List<String> rels = new ArrayList<String>();
		rels.add(PAR_REL);

		return new ChildIterator(
				focus.getCui(), 
				source, 
				rels, 
				Direction.SOURCEOF, 
				getService(), 
				parent,
				focus.getChildrenCount());
	}
	
	private List<MetaTreeNode> getParents(MetaTreeNode focus, List<String> previousParentCuis) throws LBException{
		if(previousParentCuis == null){
			previousParentCuis = new ArrayList<String>();
		}
		
		List<String> rels = new ArrayList<String>();
		rels.add(PAR_REL);
		
		List<BySourceTabResults> results =
			getService().getBySourceTabDisplay(focus.getCui(), source, rels, Direction.TARGETOF, true, 0, -1).get(CHD_REL);

		if(results == null || results.size() == 0){return null;}
		
		List<MetaTreeNode> returnList = new ArrayList<MetaTreeNode>();
		
		for(BySourceTabResults bySource : results){
			String cui = bySource.getCui();
			
			if(previousParentCuis.contains(cui)){
				continue;
			} else {
				previousParentCuis.add(cui);
			}
			
			String name = bySource.getTerm();
			
			MetaTreeNode parent = this.buildMetaTreeNode(cui, name);
			
			parent.setChildrenCount(getService().getCount(cui, source, rels, Direction.SOURCEOF, true));
			
			parent.setChildren(this.getChildren(parent, focus));

			parent.getPathToRootChilden().add(focus);
			parent.setExpandedState(ExpandedState.EXPANDABLE);
			
			parent.setParents(getParents(parent, previousParentCuis));
			returnList.add(parent);
		}
		
		return returnList;
	}
	
	/**
	 * Builds the meta tree node.
	 * 
	 * @param cui the cui
	 * @param term the term
	 * 
	 * @return the meta tree node
	 */
	private MetaTreeNode buildMetaTreeNode(String cui, String term){
		MetaTreeNode node = new MetaTreeNode();
		
		node.setCui(cui);
		node.setName(term);
		node.setSab(source);
		return node;
	}
	
	/**
	 * Gets the UMLS root node of a given SAB.
	 * 
	 * @param sab the sab
	 * 
	 * @return the coding scheme root
	 * 
	 * @throws LBException the LB exception
	 */
	protected ResolvedConceptReference getCodingSchemeRoot(String sab) throws LBException {
		CodedNodeSet cns = getService().getLexBIGService().getNodeSet(CODING_SCHEME_NAME, null, null);

		cns = cns.restrictToProperties(null, new PropertyType[] {PropertyType.PRESENTATION}, Constructors.createLocalNameList("SRC"), null, Constructors.createNameAndValueList("source-code", "V-"+sab));
		ResolvedConceptReference[] refs = cns.resolveToList(null, null, null, null, false, -1).getResolvedConceptReference();

		if(refs.length > 1){
			throw new LBException("Found more than one Root for SAB: " + sab);
		}
		if(refs.length == 0){
			throw new LBException("Didn't find a Root for SAB: " + sab);
		}
		return refs[0];
	}
	
	/**
	 * Sets the initial focus.
	 * 
	 * @param cui the cui
	 * 
	 * @return the meta tree node
	 * 
	 * @throws LBException the LB exception
	 */
	private MetaTreeNode setInitialFocus(String cui) throws LBException {	
		MetaTreeNode focusNode = this.getFocusDetails(cui);
		
		List<String> rels = new ArrayList<String>();
		rels.add(PAR_REL);
	
		int childrenCount = getService().getCount(cui, source, rels, Direction.SOURCEOF, true);
		focusNode.setChildrenCount(childrenCount);

		ChildIterator children = getChildren(focusNode);

		if(childrenCount > 0){
			focusNode.setExpandedState(ExpandedState.EXPANDABLE);
		} else {
			focusNode.setExpandedState(ExpandedState.LEAF);
		}
		focusNode.setChildren(children);

		focusNode.setParents(
				this.getParents(focusNode, null));
		
		return focusNode;
	}
	
	/**
	 * Sets the initial focus.
	 * 
	 * @return the meta tree node
	 * 
	 * @throws LBException the LB exception
	 */
	private MetaTreeNode setInitialFocus() throws LBException {	
		List<String> rels = new ArrayList<String>();
		rels.add(PAR_REL);
		
		ResolvedConceptReference ref = getCodingSchemeRoot(source);
		MetaTreeNode focusNode = 
			this.buildMetaTreeNode(
					ref.getCode(), 
					ref.getEntityDescription().getContent());	
		
		int childrenCount = getService().getCount(ref.getCode(), source, rels, Direction.SOURCEOF, true);
		
		focusNode.setChildrenCount(childrenCount);

		ChildIterator children = getChildren(focusNode);

		if(childrenCount > 0){
			focusNode.setExpandedState(ExpandedState.EXPANDABLE);
		} else {
			focusNode.setExpandedState(ExpandedState.LEAF);
		}
		
		focusNode.setChildren(children);
		
		focusNode.setParents(
				this.getParents(focusNode, null));

		return focusNode;	
	}

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaTree#getCurrentFocus()
	 */
	public MetaTreeNode getCurrentFocus() {
		return this.currentFocus;
	}
	
	

	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaTree#focus(org.LexGrid.lexevs.metabrowser.model.MetaTreeNode)
	 */
	public MetaTreeNode focus(MetaTreeNode newFocus) {
		if(newFocus.getExpandedState().equals(ExpandedState.EXPANDABLE)){
			try {
				newFocus.setChildren(this.getChildren(newFocus));
			} catch (LBException e) {
				throw new RuntimeException(e);
			}
		}
		this.currentFocus = newFocus;
		
		try {
			currentFocus.setParents(
					this.getParents(newFocus, null));
		
		} catch (LBException e) {
			throw new RuntimeException(e);
		}
		
		return newFocus;
	}

	/**
	 * Gets the focus details.
	 * 
	 * @param cui the cui
	 * 
	 * @return the focus details
	 * 
	 * @throws LBException the LB exception
	 */
	private MetaTreeNode getFocusDetails(String cui) throws LBException {
		CodedNodeSet cns = LexBIGServiceImpl.defaultInstance().getCodingSchemeConcepts(CODING_SCHEME_NAME, null);
		cns = cns.restrictToCodes(Constructors.createConceptReferenceList(cui));
		ResolvedConceptReference ref = cns.resolve(null, null, new PropertyType[]{PropertyType.PRESENTATION}).next();
		return buildMetaTreeNode(cui, 
				getBestSabTermString(
						ref.getReferencedEntry()));	
	}
	
	/**
	 * Gets the best sab term string.
	 * 
	 * @param entity the entity
	 * 
	 * @return the best sab term string
	 */
	private String getBestSabTermString(Entity entity){
		Presentation bestPres = null;
		for(Presentation pres : entity.getPresentation()){
			for(Source source : pres.getSource()){
				if(source.getContent().equals(source)){
					if(bestPres == null){
						bestPres = pres;
					} else {
						if(pres.getRepresentationalForm().equals("PT")){
							bestPres = pres;
						}
					}
				}
			}
		}
		if(bestPres == null){
			return entity.getEntityDescription().getContent();
		}
		return bestPres.getValue().getContent();
	}
	
	/**
	 * Sets the service.
	 * 
	 * @param service the new service
	 */
	public void setService(MetaBrowserService service) {
		this.service = service;
	}
	
	public MetaBrowserService getService() {
		if(this.service != null){
			return this.service;
		} else {
			LexBIGService lbs = LexBIGServiceImpl.defaultInstance();
		
			try {
				return (MetaBrowserService) lbs.getGenericExtension("metabrowser-extension");
			} catch (LBException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see org.LexGrid.lexevs.metabrowser.MetaTree#getSab()
	 */
	public String getSab(){
		return this.source;
	}

	public String getJsonFromRoot(MetaTreeNode node) {
		ChildPagingJsonConverter converter = new ChildPagingJsonConverter();
		return converter.buildJsonPathFromRootTree(node);
	}
	
	
}
