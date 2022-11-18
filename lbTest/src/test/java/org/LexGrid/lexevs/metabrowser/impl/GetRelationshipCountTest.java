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

import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction;
import org.junit.Test;

/**
 * The Class GetRelationshipCountTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class GetRelationshipCountTest extends MetaBrowserServiceImplTest{
	
	/**
	 * Test get count b souce tab source of.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBSouceTabSourceOf() throws Exception {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");
		MetaBrowserService impl = new MetaBrowserServiceImpl();

		int count = impl.getCount("C0000726", null, Direction.SOURCEOF);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab source of exclude self referencing false.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabSourceOfExcludeSelfReferencingFalse() throws Exception {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");
		MetaBrowserService impl = new MetaBrowserServiceImpl();

		int count = impl.getCount("C0000726", null, Direction.SOURCEOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab source of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabSourceOfExcludeSelfReferencingTrue() throws Exception {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");
		MetaBrowserService impl = new MetaBrowserServiceImpl();

		int count = impl.getCount("C0000726", null, Direction.SOURCEOF, false);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOf() throws Exception {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");
		MetaBrowserService impl = new MetaBrowserServiceImpl();

		int count = impl.getCount("C0000726", null, Direction.TARGETOF);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOfExcludeSelfReferencingTrue() throws Exception {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");
		MetaBrowserService impl = new MetaBrowserServiceImpl();

		int count = impl.getCount("C0000726", null, Direction.TARGETOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of exclude self referencing false.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOfExcludeSelfReferencingFalse() throws Exception {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");
		MetaBrowserService impl = new MetaBrowserServiceImpl();

		int count = impl.getCount("C0000726", null, Direction.TARGETOF, false);
		
		assertTrue("Count: " + count, count == 20);
	}
}
