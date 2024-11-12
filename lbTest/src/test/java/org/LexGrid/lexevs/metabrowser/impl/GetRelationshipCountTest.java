
package org.LexGrid.lexevs.metabrowser.impl;

import static org.junit.Assert.assertTrue;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService.Direction;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class GetRelationshipCountTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class GetRelationshipCountTest  extends LexBIGServiceTestCase{
	
	
	LexBIGService lbs;
	
	MetaBrowserService svc;
	
	@Override
	protected String getTestID() {
		return "Meta Extension Count Test";
	}
	
	
	@BeforeClass
	public void setUp() throws LBException {
		lbs = LexBIGServiceImpl.defaultInstance();
        svc = (MetaBrowserService) lbs.getGenericExtension("metabrowser-extension");
	}
	/**
	 * Test get count b souce tab source of.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBSouceTabSourceOf() throws Exception {
		 
 

		int count =  svc.getCount("C0000726", null, Direction.SOURCEOF);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab source of exclude self referencing false.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabSourceOfExcludeSelfReferencingFalse() throws Exception {
		 
 

		int count =  svc.getCount("C0000726", null, Direction.SOURCEOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab source of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabSourceOfExcludeSelfReferencingTrue() throws Exception {
		

		int count =  svc.getCount("C0000726", null, Direction.SOURCEOF, false);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOf() throws Exception {
		
		int count =  svc.getCount("C0000726", null, Direction.TARGETOF);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of exclude self referencing true.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOfExcludeSelfReferencingTrue() throws Exception {
		

		int count =  svc.getCount("C0000726", null, Direction.TARGETOF, true);
		
		assertTrue("Count: " + count, count == 20);
	}
	
	/**
	 * Test get count by souce tab target of exclude self referencing false.
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void testGetCountBySouceTabTargetOfExcludeSelfReferencingFalse() throws Exception {
		

		int count =  svc.getCount("C0000726", null, Direction.TARGETOF, false);
		
		assertTrue("Count: " + count, count == 20);
	}
}
