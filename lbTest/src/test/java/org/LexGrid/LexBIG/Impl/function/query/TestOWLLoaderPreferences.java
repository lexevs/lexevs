
package org.LexGrid.LexBIG.Impl.function.query;

import org.LexGrid.LexBIG.DataModel.Collections.ConceptReferenceList;
import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeVersionOrTag;
import org.LexGrid.LexBIG.DataModel.Core.ConceptReference;
import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.Impl.testUtility.ServiceHolder;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.concepts.Comment;
import org.LexGrid.concepts.Definition;
import org.LexGrid.concepts.Presentation;

/**
 * Tests OWL LoaderPreferences
 * 
 * @author Kevin Peterson
 * 
 */
public class TestOWLLoaderPreferences extends LexBIGServiceTestCase {

    final static String testID = "T1_FNC_52";

    @Override
    protected String getTestID() {
        return testID;
    }

    public void testT1_FNC_50() {}
// no longer valid under OWL2
//    		throws LBException {
//        LexBIGService lbsi = ServiceHolder.instance().getLexBIGService();
//
//        CodingSchemeVersionOrTag csvt = new CodingSchemeVersionOrTag();
//        csvt.setVersion("CameraV1");
//        CodedNodeSet cns = lbsi.getCodingSchemeConcepts(CAMERA_SCHEME_MANIFEST_URN, csvt);
//
//        ConceptReferenceList crl = new ConceptReferenceList();
//        ConceptReference cr = new ConceptReference();
//        cr.setCodingSchemeName(CAMERA_SCHEME_MANIFEST_URN);
//        cr.setConceptCode("BUCKS");
//        crl.addConceptReference(cr);
//        cns = cns.restrictToCodes(crl);
//
//        ResolvedConceptReference[] rcr = cns.resolveToList(null, null, null, 0).getResolvedConceptReference();
//
//        assertNotNull(rcr);
//        assertEquals(rcr.length, 1);
//
//        ResolvedConceptReference testConcept = rcr[0];
//
//        Presentation[] presentations = testConcept.getEntity().getPresentation();
//        assertTrue(presentations.length == 1);
//        for (int i = 0; i < presentations.length; i++) {
//            String presentation = presentations[i].getValue().getContent();
//            if (presentation.equals("Money")) {
//                assertTrue(presentations[i].isIsPreferred());
//            } else {
//                assertFalse(presentations[i].isIsPreferred());
//            }
//        }
//
//        Definition[] definitions = testConcept.getEntity().getDefinition();
//        assertTrue(definitions.length == 1);
//        for (int i = 0; i < definitions.length; i++) {
//            String definition = definitions[i].getValue().getContent();
//            if (definition.equals("0.999")) {
//                assertTrue(definitions[i].isIsPreferred());
//            } else {
//                assertFalse(definitions[i].isIsPreferred());
//            }
//        }
//
//        Comment[] comments = testConcept.getEntity().getComment();
//        assertTrue(comments.length == 1);
//        assertTrue(comments[0].getPropertyName().equals("units"));
//    }
}