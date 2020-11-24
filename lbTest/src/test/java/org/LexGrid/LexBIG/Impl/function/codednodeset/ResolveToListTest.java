
package org.LexGrid.LexBIG.Impl.function.codednodeset;

import org.LexGrid.LexBIG.DataModel.Collections.ResolvedConceptReferenceList;
import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Impl.helpers.TestFilter;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet.PropertyType;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet.SearchDesignationOption;
import org.LexGrid.LexBIG.Utility.Constructors;
import org.LexGrid.LexBIG.Utility.IncludeForDistributedTests;
import org.LexGrid.LexBIG.Utility.RemoveFromDistributedTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * The Class ResolveToListTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@Category(IncludeForDistributedTests.class)
@RunWith(BlockJUnit4ClassRunner.class)
public class ResolveToListTest extends BaseCodedNodeSetTest {
    
    /**
     * Test resolve to list all null.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testResolveToListAllNull() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, null, -1);
        assertTrue("Length: "+ rcrl.getResolvedConceptReference().length,
                rcrl.getResolvedConceptReference().length > 0);
    }
    
    /**
     * Test resolve to list with limit.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testResolveToListWithLimit() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, null, 2);
        assertTrue("Length: "+ rcrl.getResolvedConceptReference().length,
                rcrl.getResolvedConceptReference().length == 2);
    }
    
    /**
     * Test resolve objects.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testResolveObjects() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, null, null, true, -1);
        assertTrue(rcrl.getResolvedConceptReference().length > 0);
        assertTrue(rcrl.getResolvedConceptReference(0).getEntity() != null);
    }
    
    /**
     * Test dont resolve objects.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testDontResolveObjects() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, null, null, false, -1);
        assertTrue(rcrl.getResolvedConceptReference().length > 0);
        assertTrue(rcrl.getResolvedConceptReference(0).getEntity() == null);
    }
    
    /**
     * Test sort.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testSort() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(Constructors.createSortOptionList(new String[]{"code"}), null, null, -1);
        assertTrue(rcrl.getResolvedConceptReference().length > 0);
        assertTrue("Found: " + rcrl.getResolvedConceptReference(0).getCode(),
                rcrl.getResolvedConceptReference(0).getCode().equals("005"));   
    }
    
    /**
     * Test sort backwards.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testSortBackwards() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(Constructors.createSortOptionList(new String[]{"code"}, new Boolean[]{false}), null, null, -1);
        assertTrue(rcrl.getResolvedConceptReference().length > 0);
        assertTrue("Found: " + rcrl.getResolvedConceptReference(0).getCode(),
                rcrl.getResolvedConceptReference(0).getCode().equals("T0001"));   
    }
   
    /**
     * Test two sorts.
     * 
     * @throws LBInvocationException the LB invocation exception
     * @throws LBParameterException the LB parameter exception
     */
	@Test
    public void testTwoSorts() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(Constructors.createSortOptionList(new String[]{"codeSystem", "code"}, new Boolean[]{true,true}), null, null, -1);
        assertTrue(rcrl.getResolvedConceptReference().length > 0);
        assertTrue("Found: " + rcrl.getResolvedConceptReference(0).getCode(),
                rcrl.getResolvedConceptReference(0).getCode().equals("005"));   
    }
    
	@Test
    public void testPostSort() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(Constructors.createSortOptionList(new String[]{"codePost"}, new Boolean[]{false}), null, null, 2);
        assertTrue(rcrl.getResolvedConceptReference().length == 2);
        
        assertTrue(1 <=
        		rcrl.getResolvedConceptReference(0).getCode().compareTo(
      
        		rcrl.getResolvedConceptReference(1).getCode()));
    }
    
	@Test
    public void testPreAndPostSort() throws LBInvocationException, LBParameterException{
        ResolvedConceptReferenceList rcrl = cns.resolveToList(Constructors.createSortOptionList(new String[]{"code", "codePost"}, new Boolean[]{false, true}), null, null, 2);
        assertTrue(rcrl.getResolvedConceptReference().length == 2);
        assertTrue("Found: " + rcrl.getResolvedConceptReference(0).getCode(),
                rcrl.getResolvedConceptReference(0).getCode().equals("SpecialCharactersConcept"));   
        assertTrue("Found: " + rcrl.getResolvedConceptReference(1).getCode(),
                rcrl.getResolvedConceptReference(1).getCode().equals("T0001"));
    }
    
	@Test
    public void testMultipleCodeSystemSort() throws Exception{
        
        CodedNodeSet cns2 = lbs.getCodingSchemeConcepts(PARTS_SCHEME, null);
        
        CodedNodeSet union = cns.union(cns2);

        union = union.restrictToMatchingDesignations("(rims^5 OR automobile OR truck^4 OR piston )", SearchDesignationOption.ALL, "LuceneQuery", null);

        ResolvedConceptReference[] refs = union.resolveToList(
                Constructors.createSortOptionList(new String[]{"matchToQuery"}), null, null, -1).getResolvedConceptReference();
  
       assertTrue(refs[0].getCode().equals("R0001"));
       assertTrue(refs[1].getCode().equals("T0001"));   
     }
     
	@Test
     public void testMultipleCodeSystemSortDifferentOrder() throws Exception{
         
         CodedNodeSet cns2 = lbs.getCodingSchemeConcepts(PARTS_SCHEME, null);
         
         CodedNodeSet union = cns2.union(cns);

         union = union.restrictToMatchingDesignations("( automobile OR truck^4 OR piston OR rims^5 )", SearchDesignationOption.ALL, "LuceneQuery", null);

         ResolvedConceptReference[] refs = union.resolveToList(
                 Constructors.createSortOptionList(new String[]{"matchToQuery"}), null, null, -1).getResolvedConceptReference();

        assertTrue(refs[0].getCode().equals("R0001"));
        assertTrue(refs[1].getCode().equals("T0001"));   
      }
     
//     public void testMultipleCodeSystemSortMoreResuts() throws Exception{
//         
//         CodedNodeSet cns2 = lbs.getCodingSchemeConcepts(PARTS_SCHEME, null);
//         
//         CodedNodeSet union = cns2.union(cns);
//         
//         union.restrictToMatchingDesignations("( an OR tires OR car OR automobile^4 OR truck^2 OR piston^3 OR rims^5 OR general )", SearchDesignationOption.ALL, "LuceneQuery", null);
//
//         ResolvedConceptReference[] refs = union.resolveToList(
//                 Constructors.createSortOptionList(new String[]{"matchToQuery"}), null, null, -1).getResolvedConceptReference();
//
//         assertEquals("R0001", refs[0].getCode());
//         assertEquals("A0001", refs[1].getCode());  
//         assertEquals("P0001", refs[2].getCode()); 
//         assertEquals("T0001", refs[3].getCode());   
//      }
    
    /**
     * Test filter options.
     * 
     * @throws LBException the LB exception
     */
	@Test
    @Category(RemoveFromDistributedTests.class)
    public void testFilterOptions() throws LBException{
        TestFilter filter = new TestFilter();
        try {
            filter.register();
        } catch (Exception e) {
            //if its already registered....
        }
        
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, Constructors.createLocalNameList("JUnit Test Filter"), null, null, -1);
        assertEquals(4,rcrl.getResolvedConceptReference().length);    
    }
    
    /**
     * Test resolve property names presentation.
     * 
     * @throws LBException the LB exception
     */
	@Test
    public void testResolvePropertyNamesPresentation() throws LBException{
        cns = cns.restrictToCodes(Constructors.createConceptReferenceList("A0001"));
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, Constructors.createLocalNameList("textualPresentation"), null, -1);
       
        assertTrue(rcrl.getResolvedConceptReference().length == 1);  
        
        ResolvedConceptReference ref = rcrl.getResolvedConceptReference(0);
        
        assertTrue(ref.getEntity() != null);
        
        assertTrue(ref.getEntity().getPresentation().length == 1);
        
        assertTrue(ref.getEntity().getDefinition().length == 0);
    }
   
    /**
     * Test resolve property names definition.
     * 
     * @throws LBException the LB exception
     */
	@Test
    public void testResolvePropertyNamesDefinition() throws LBException{
        cns = cns.restrictToCodes(Constructors.createConceptReferenceList("A0001"));
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, Constructors.createLocalNameList("definition"), null, -1);

        assertTrue(rcrl.getResolvedConceptReference().length == 1);  
        
        ResolvedConceptReference ref = rcrl.getResolvedConceptReference(0);
        
        assertTrue(ref.getEntity() != null);
        
        assertTrue(ref.getEntity().getPresentation().length == 0);
        
        assertTrue(ref.getEntity().getDefinition().length == 1);
    }
    
    /**
     * Test resolve property types presentation.
     * 
     * @throws LBException the LB exception
     */
	@Test
    public void testResolvePropertyTypesPresentation() throws LBException{
        cns = cns.restrictToCodes(Constructors.createConceptReferenceList("A0001"));
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, null, new PropertyType[]{PropertyType.PRESENTATION}, -1);

        assertTrue(rcrl.getResolvedConceptReference().length == 1);  
        
        ResolvedConceptReference ref = rcrl.getResolvedConceptReference(0);
        
        assertTrue(ref.getEntity() != null);
        
        assertTrue(ref.getEntity().getPresentation().length == 1);
        
        assertTrue(ref.getEntity().getDefinition().length == 0);
    }
   
    /**
     * Test resolve property types definition.
     * 
     * @throws LBException the LB exception
     */
	@Test
    public void testResolvePropertyTypesDefinition() throws LBException{
        cns = cns.restrictToCodes(Constructors.createConceptReferenceList("A0001"));
        ResolvedConceptReferenceList rcrl = cns.resolveToList(null, null, null, new PropertyType[]{PropertyType.DEFINITION}, -1);

        assertTrue(rcrl.getResolvedConceptReference().length == 1);  
        
        ResolvedConceptReference ref = rcrl.getResolvedConceptReference(0);
        
        assertTrue(ref.getEntity() != null);
        
        assertTrue(ref.getEntity().getPresentation().length == 0);
        
        assertTrue(ref.getEntity().getDefinition().length == 1);
    }
}