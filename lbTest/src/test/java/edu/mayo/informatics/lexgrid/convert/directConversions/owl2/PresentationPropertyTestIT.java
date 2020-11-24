
package edu.mayo.informatics.lexgrid.convert.directConversions.owl2;import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;import org.LexGrid.LexBIG.Utility.Constructors;import org.LexGrid.concepts.Entity;import org.junit.Before;import org.junit.Test;public class PresentationPropertyTestIT extends DataLoadTestBase {

/** The test entity. */
private Entity testEntity;	/**	 * Builds the test entity.	 * 	 * @throws Exception	 *             the exception	 */	@Before	public void setUp() throws Exception {		super.setUp();		cns.restrictToCodes(Constructors				.createConceptReferenceList("EGFR_pV774_C775insHV"));		ResolvedConceptReference rcr1 = cns.resolveToList(null, null, null, -1)				.getResolvedConceptReference()[0];		testEntity = rcr1.getEntity();	}	@Test	public void testPresentationNotNull() throws Exception {		assertNotNull(testEntity.getPresentation());	}}