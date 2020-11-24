
package org.LexGrid.LexBIG.Impl.function.codednodegraph;

import org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept;
import org.LexGrid.LexBIG.DataModel.Core.Association;
import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.Utility.Constructors;
import org.LexGrid.LexBIG.Utility.IncludeForDistributedTests;
import org.LexGrid.LexBIG.Utility.RemoteApiSafeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * The Class RestrictToDirectionalNamesTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@Category(IncludeForDistributedTests.class)
public class RestrictToDirectionalNamesTest extends BaseCodedNodeGraphTest {

    /**
     * Test one directional name null qualifiers.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testOneDirectionalNameNullQualifiers() throws LBInvocationException, LBParameterException{
        cng = cng.restrictToDirectionalNames(Constructors.createNameAndValueList("uses"), 
                null);
        
        ResolvedConceptReference[] rcr = 
            cng.resolveAsList(Constructors.createConceptReference("A0001", LexBIGServiceTestCase.AUTO_SCHEME), 
                    true, 
                    false, 
                    -1, 
                    -1, 
                    null, 
                    null, 
                    null, 
                    -1).getResolvedConceptReference();
     
        assertTrue(rcr.length == 1);
        
        ResolvedConceptReference ref = rcr[0];
        
        Association[] assocs = ref.getSourceOf().getAssociation();
        
        assertEquals(1,assocs.length);
        
        assertEquals("uses", assocs[0].getAssociationName());
        
        AssociatedConcept[] assocCons = assocs[0].getAssociatedConcepts().getAssociatedConcept();
        
        assertTrue(assocCons.length == 3);
        
        assertTrue(associatedConceptListContains(assocCons, "Batteries"));
        assertTrue(associatedConceptListContains(assocCons, "Tires"));
        assertTrue(associatedConceptListContains(assocCons, "Brakes"));
    }
    
    /**
     * Test one directional name null qualifiers no match.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testOneDirectionalNameNullQualifiersNoMatch() {
        try {
            cng = cng.restrictToDirectionalNames(Constructors.createNameAndValueList("NOT_A_MATCH"),
			        null);
		} catch (LBInvocationException e) {
			fail();
		} catch (LBParameterException e) {
			return;
		}
        
      fail();
    }
    
    /**
     * Test two directional names null qualifiers.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testTwoDirectionalNamesNullQualifiers() throws LBInvocationException, LBParameterException{
        cng.restrictToDirectionalNames(Constructors.createNameAndValueList(new String[]{"uses", "hasSubtype"}),
                null);
        
        ResolvedConceptReference[] rcr = 
            cng.resolveAsList(Constructors.createConceptReference("A0001", LexBIGServiceTestCase.AUTO_SCHEME), 
                    true, 
                    false, 
                    -1, 
                    -1, 
                    null, 
                    null, 
                    null, 
                    -1).getResolvedConceptReference();
     
        assertTrue(rcr.length == 1);
        
        ResolvedConceptReference ref = rcr[0];
        
        Association[] assocs = ref.getSourceOf().getAssociation();
        
        assertEquals(2,assocs.length);
        assertTrue(associationListContains(assocs, "uses"));
        assertTrue(associationListContains(assocs, "hasSubtype"));

        
        AssociatedConcept[] assocCons1 = assocs[0].getAssociatedConcepts().getAssociatedConcept();
        AssociatedConcept[] assocCons2 = assocs[1].getAssociatedConcepts().getAssociatedConcept();
        
        AssociatedConcept[] all = new AssociatedConcept[assocCons1.length + assocCons2.length];

        
        System.arraycopy(assocCons1, 0, all, 0, assocCons1.length);
        System.arraycopy(assocCons2, 0, all, assocCons1.length, assocCons2.length);
        
        assertTrue(all.length == 5);
        
        assertTrue(associatedConceptListContains(all, "Batteries"));
        assertTrue(associatedConceptListContains(all, "Tires"));
        assertTrue(associatedConceptListContains(all, "Brakes"));
        
        assertTrue(associatedConceptListContains(all, "T0001"));
        assertTrue(associatedConceptListContains(all, "C0001"));     
    }
    
    /**
     * Test one directional name one qualifier without value.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testOneDirectionalNameOneQualifierWithoutValue() throws LBInvocationException, LBParameterException{
        cng = cng.restrictToDirectionalNames(Constructors.createNameAndValueList("hasSubtype"),
                Constructors.createNameAndValueList("hasEngine"));
        
        ResolvedConceptReference[] rcr =
            cng.resolveAsList(Constructors.createConceptReference("A0001", LexBIGServiceTestCase.AUTO_SCHEME),
                    true, 
                    false, 
                    -1, 
                    -1, 
                    null, 
                    null, 
                    null, 
                    -1).getResolvedConceptReference();
     
        assertTrue(rcr.length == 1);
        
        ResolvedConceptReference ref = rcr[0];
        
        Association[] assocs = ref.getSourceOf().getAssociation();
        
        assertTrue(assocs.length == 1);
        
        assertTrue(assocs[0].getAssociationName().equals("hasSubtype"));
        
        AssociatedConcept[] assocCons = assocs[0].getAssociatedConcepts().getAssociatedConcept();
        
        assertEquals(1,assocCons.length);
        
        assertTrue(associatedConceptListContains(assocCons, "C0001")); 
    }
    
    /**
     * Test one directional name one qualifier with value.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testOneDirectionalNameOneQualifierWithValue() throws LBInvocationException, LBParameterException{
        cng = cng.restrictToDirectionalNames(Constructors.createNameAndValueList("hasSubtype"),
                Constructors.createNameAndValueList("hasEngine", "true"));
        
        ResolvedConceptReference[] rcr = 
            cng.resolveAsList(Constructors.createConceptReference("A0001", LexBIGServiceTestCase.AUTO_SCHEME), 
                    true, 
                    false, 
                    -1, 
                    -1, 
                    null, 
                    null, 
                    null, 
                    -1).getResolvedConceptReference();
     
        assertTrue(rcr.length == 1);
        
        ResolvedConceptReference ref = rcr[0];

        Association[] assocs = ref.getSourceOf().getAssociation();

        assertTrue(assocs.length == 1);

        assertTrue(assocs[0].getAssociationName().equals("hasSubtype"));

        AssociatedConcept[] assocCons = assocs[0].getAssociatedConcepts().getAssociatedConcept();

        assertTrue(assocCons.length == 1);

        assertTrue(associatedConceptListContains(assocCons, "C0001")); 
    }

    /**
     * Test one directional name one qualifier with wrong value.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testOneDirectionalNameOneQualifierWithWrongValue() throws LBInvocationException, LBParameterException{
        cng = cng.restrictToDirectionalNames(Constructors.createNameAndValueList("hasSubtype"),
                Constructors.createNameAndValueList("hasEngine", "false"));

        ResolvedConceptReference[] rcr = 
            cng.resolveAsList(Constructors.createConceptReference("A0001", LexBIGServiceTestCase.AUTO_SCHEME), 
                    true, 
                    false, 
                    -1, 
                    -1, 
                    null, 
                    null, 
                    null, 
                    -1).getResolvedConceptReference();

        assertEquals(1,rcr.length);
        assertNull(rcr[0].getSourceOf());
        assertNull(rcr[0].getTargetOf());
    }
}