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
package org.lexevs.dao.database.prefix;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.easymock.EasyMock;
import org.junit.Test;
import org.lexevs.dao.database.utility.DatabaseUtility;
import org.lexevs.dao.test.StaticPrefixResolver;
import org.springframework.test.annotation.ExpectedException;

/**
 * The Class CyclingCharDbPrefixGeneratorTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class CyclingCharDbPrefixGeneratorTest {

	/**
	 * Test adjust length chop.
	 */
	@Test
	public void testAdjustLengthChop(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(3);
		
		char[] chars = generator.adjustLength("aasdffdsaer".toCharArray());

		assertEquals(3, chars.length);
		assertArrayEquals("aas".toCharArray(), chars);
	}
	
	/**
	 * Test is in cycle one char true.
	 */
	@Test
	public void testIsInCycleOneCharTrue(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(1);
		
		assertTrue(generator.isInCycle(new char[]{'Z'}));
	}
	
	/**
	 * Test is in cycle one char false.
	 */
	@Test
	public void testIsInCycleOneCharFalse(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(3);
		
		assertFalse(generator.isInCycle(new char[]{'E'}));
	}
	
	/**
	 * Test is in cycle multiple chars true.
	 */
	@Test
	public void testIsInCycleMultipleCharsTrue(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(10);
		
		assertTrue(generator.isInCycle("AEDGRYNGRZ".toCharArray()));
	}
	
	/**
	 * Test is in cycle multiple chars false.
	 */
	@Test
	public void testIsInCycleMultipleCharsFalse(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(10);
		
		assertFalse(generator.isInCycle("EGHHYTVVHH".toCharArray()));
	}
	
	/**
	 * Test generate starting cycling prefix.
	 */
	@Test
	public void testGenerateStartingCyclingPrefix(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(3);
		
		char[] chars = generator.generateStartingCyclingPrefix();

		assertEquals(3, chars.length);
		assertArrayEquals("AAZ".toCharArray(), chars);
	}
	
	/**
	 * Test adjust length add.
	 */
	@Test
	public void testAdjustLengthAdd(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(5);
		
		char[] chars = generator.adjustLength("ff".toCharArray());

		assertEquals(5, chars.length);
		assertArrayEquals("ffAAA".toCharArray(), chars);
	}
	
	/**
	 * Test get prefix without cycle.
	 */
	@Test
	public void testGetPrefixWithoutCycle(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(4);
		
		String newPrefix = generator.generateNextDatabasePrefix("aaaa");
		
		assertEquals("baaa", newPrefix);
	}
	
	/**
	 * Test get prefix without cycle one z.
	 */
	@Test
	public void testGetPrefixWithoutCycleOneZ(){
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		generator.setPrefixLengthLimit(4);
		
		String newPrefix = generator.generateNextDatabasePrefix("zaaa");
		
		assertEquals("zbaa", newPrefix);
	}
	
	/**
	 * Test get prefix with cycle.
	 */
	@Test
	public void testGetPrefixWithCycle(){

		
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		
		generator.setPrefixLengthLimit(4);
		generator.setPrefixResolver(new StaticPrefixResolver("$$"));
		
		
		DatabaseUtility dbUtil = createMock(DatabaseUtility.class);
		expect(dbUtil.doesTableExist("$$aaaz" + generator.getTestDatabaseName())).andReturn(true).anyTimes();
		expect(dbUtil.doesTableExist("$$baaz" + generator.getTestDatabaseName())).andReturn(true).anyTimes();
		expect(dbUtil.doesTableExist("$$caaz" + generator.getTestDatabaseName())).andReturn(true).anyTimes();
		expect(dbUtil.doesTableExist("$$daaz" + generator.getTestDatabaseName())).andReturn(false).anyTimes();
		replay(dbUtil);
		
		generator.setDatabaseUtility(dbUtil);
		
		String newPrefix = generator.generateNextDatabasePrefix("zzzz");
		
		assertEquals("daaz", newPrefix);
	}
	
	/**
	 * Test no more prefixes.
	 */
	@Test
	@ExpectedException(RuntimeException.class)
	public void testNoMorePrefixes(){
		
		PrefixResolver resolver = createMock(PrefixResolver.class);
		expect(resolver.resolveDefaultPrefix()).andReturn("$$").anyTimes();
		replay(resolver);
		
		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		
		generator.setPrefixLengthLimit(4);
		generator.setPrefixResolver(new StaticPrefixResolver("$$"));
		
		DatabaseUtility dbUtil = createMock(DatabaseUtility.class);
		expect(dbUtil.doesTableExist((String)EasyMock.anyObject())).andReturn(true).anyTimes();
		replay(dbUtil);
		
		generator.setDatabaseUtility(dbUtil);
		
		String newPrefix = generator.generateNextDatabasePrefix("a");
	}
	
	/**
	 * Test too small prefix.
	 * 
	 * @throws Exception the exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testTooSmallPrefix() throws Exception {

		CyclingCharDbPrefixGenerator generator = new CyclingCharDbPrefixGenerator();
		
		generator.setPrefixLengthLimit(1);
		
		generator.afterPropertiesSet();
	}
	
}
