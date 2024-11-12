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

import java.util.List;
import java.util.Map;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction;
import org.LexGrid.lexevs.metabrowser.model.BySourceTabResults;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class GetBySourceTabDisplayTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class GetBySourceTabDisplayTest extends LexBIGServiceTestCase{
	
	
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
		
		int count = svc.getCount("C0000726", null, null, Direction.TARGETOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get by souce tab display source of map values.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetBySouceTabDisplaySourceOfMapValues() throws Exception {
		
		Map<String,List<BySourceTabResults>> results = svc.getBySourceTabDisplay("C0000726", null, null, Direction.SOURCEOF);
		
		assertTrue(results.keySet().size() > 3);
		
		assertTrue(results.keySet().contains("AQ"));
		assertTrue(results.keySet().contains("CHD"));
		assertTrue(results.keySet().contains("RO"));	
	}
	
	/**
	 * Test get by souce tab display source of size.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetBySouceTabDisplaySourceOfSize() throws Exception {
		
		Map<String,List<BySourceTabResults>> results = svc.getBySourceTabDisplay("C0000726", null, null, Direction.SOURCEOF);
		
		int size = 0;
		for(String key : results.keySet()){
			size += results.get(key).size();
		}
		assertTrue("Size: " + size, size == 20);
	}
	
	/**
	 * Test get by souce tab display source of with source size.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetBySouceTabDisplaySourceOfWithSourceSize() throws Exception {
		
		Map<String,List<BySourceTabResults>> results = svc.getBySourceTabDisplay("C0000726", "SNOMEDCT", null, Direction.SOURCEOF);
		
		int size = 0;
		for(String key : results.keySet()){
			size += results.get(key).size();
		}
		assertTrue("Size: " + size, size == 1);
	}
	
	/**
	 * Test get by souce tab display source of with source value.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetBySouceTabDisplaySourceOfWithSourceValue() throws Exception {
		
		Map<String,List<BySourceTabResults>> results = svc.getBySourceTabDisplay("C0000726", "CST", null, Direction.SOURCEOF);
		
		BySourceTabResults result = results.get("PAR").get(0);
		
		assertTrue(result.getCui().equals("C0000737"));
		assertTrue(result.getCode().equals("PAIN ABDO"));
		assertTrue(result.getRel().equals("PAR"));
		assertTrue(result.getRela() == null);
		assertTrue(result.getSource().equals("CST"));
		assertTrue(result.getTerm().equals("ABDOMINAL PAIN"));
		assertTrue(result.getType().equals("PT"));
	}
}
