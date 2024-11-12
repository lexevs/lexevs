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


import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class GetBySourceCountTest.
*/
public class GetBySourceCountTest extends LexBIGServiceTestCase {
	
	
	LexBIGService lbs;
	
	MetaBrowserService svc;
	
	@Override
	protected String getTestID() {
		return "Meta Extension Source by Count";
	}
	
	
	@BeforeClass
	public void setUp() throws LBException {
		lbs = LexBIGServiceImpl.defaultInstance();
        svc = (MetaBrowserService) lbs.getGenericExtension("metabrowser-extension");
	}
	
	@Test
	public void testGetCountBSouceTabSourceOf() throws Exception {
		int count = svc.getCount("C0000726", null, null, Direction.SOURCEOF);
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab source of exclude self referencing false.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabSourceOfExcludeSelfReferencingFalse() throws Exception {
	
		int count = svc.getCount("C0000726", null, null, Direction.SOURCEOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}


	/**
	 * Test get count by souce tab source of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabSourceOfExcludeSelfReferencingTrue() throws Exception {
			int count = svc.getCount("C0000726", null, null, Direction.SOURCEOF, false);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOf() throws Exception {

		int count = svc.getCount("C0000726", null, null, Direction.TARGETOF);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOfExcludeSelfReferencingTrue() throws Exception {
		
		int count = svc.getCount("C0000726", null, null, Direction.TARGETOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of exclude self referencing false.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOfExcludeSelfReferencingFalse() throws Exception {
		
		int count = svc.getCount("C0000726", null, null, Direction.TARGETOF, false);
		
		assertTrue("Count: " + count, count == 20);
	}
}
