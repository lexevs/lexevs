
package edu.mayo.informatics.lexgrid.convert.directConversions.assertedValueSets;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.LexGrid.concepts.Entity;
import org.LexGrid.util.assertedvaluesets.AssertedValueSetParameters;
import org.junit.Before;
import org.junit.Test;
import org.lexevs.dao.database.service.valuesets.AssertedValueSetService;
import org.lexevs.locator.LexEvsServiceLocator;


public class AssertedValueSetTagTest {
private AssertedValueSetService svc;
	@Before
	public void setUp() throws Exception {
		
		// don't pass in a version to the Builder().  
		// This will force to use the default tag (PRODUCTION)
		AssertedValueSetParameters params = new AssertedValueSetParameters.Builder().
				assertedDefaultHierarchyVSRelation("Concept_In_Subset").
				codingSchemeName("owl2lexevs").
				codingSchemeURI("http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl")
				.build();
		svc = LexEvsServiceLocator.getInstance().getDatabaseServiceManager().getAssertedValueSetService();
		svc.init(params);
	}

	@Test
	public void testgetUids() {
		List<String> uids = svc.getSourceAssertedValueSetEntityUidsforPredicateUid(0, 2);
		assertNotNull(uids);
		assertTrue(uids.size() > 0);
		assertEquals(uids.size(), 2);
		
		List<Entity> entities = svc.getEntitiesForUidMap(uids);
		assertNotNull(entities);
		assertTrue(entities.size() > 0);
		assertEquals(entities.size(), 2);
	}
	
	@Test
	public void testGetEntityCountForTopNodeCode() {
		int count = svc.getVSEntityCountForTopNodeCode("C99999");
		assertEquals(count, 2);
	}

}