
package org.lexevs.dao.index.operation;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeVersionOrTag;
import org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.function.TestUtil;
import org.LexGrid.LexBIG.Impl.loaders.LexGridMultiLoaderImpl;
import org.LexGrid.LexBIG.Impl.testUtility.ServiceHolder;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceManager;
import org.LexGrid.LexBIG.Utility.Constructors;
import org.LexGrid.LexBIG.Utility.ConvenienceMethods;
import org.LexGrid.LexBIG.Utility.Iterators.ResolvedConceptReferencesIterator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lexevs.locator.LexEvsServiceLocator;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DefaultLexEVSIndexOperationsCreateMultipleIndexesTest {
	private static List<AbsoluteCodingSchemeVersionReference> references = Arrays.asList(
			Constructors.createAbsoluteCodingSchemeVersionReference("urn:oid:11.11.0.1", "1.0"), // Automobiles 1.0
			Constructors.createAbsoluteCodingSchemeVersionReference("urn:oid:11.11.0.2", "2.0"), // GMP
			Constructors.createAbsoluteCodingSchemeVersionReference("urn:oid:11.11.0.1", "1.1") // Automobiles 1.1
	);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TestUtil.removeAll();

		LexBIGServiceManager lbsm = ServiceHolder.instance().getLexBIGService()
				.getServiceManager(null);

		LexGridMultiLoaderImpl loader = (LexGridMultiLoaderImpl) lbsm
				.getLoader("LexGrid_Loader");

		loader.load(new File("resources/testData/Automobiles.xml").toURI(),
				true, true);

		while (loader.getStatus().getEndTime() == null) {
			Thread.sleep(1000);
		}
		
		LexGridMultiLoaderImpl GMPloader = (LexGridMultiLoaderImpl) lbsm
				.getLoader("LexGrid_Loader");

		GMPloader.load(new File("resources/testData/German_Made_Parts.xml").toURI(),
				true, true);

		while (GMPloader.getStatus().getEndTime() == null) {
			Thread.sleep(1000);
		}
		
		LexGridMultiLoaderImpl A2loader = (LexGridMultiLoaderImpl) lbsm
				.getLoader("LexGrid_Loader");

		A2loader.load(new File("resources/testData/Automobiles2.xml").toURI(),
				true, true);

		while (A2loader.getStatus().getEndTime() == null) {
			Thread.sleep(1000);
		}
		assertTrue(loader.getStatus().getState().equals(ProcessState.COMPLETED));
		assertFalse(loader.getStatus().getErrorsLogged().booleanValue());

		for(AbsoluteCodingSchemeVersionReference ref : references){
			// activate
			lbsm.activateCodingSchemeVersion(ConvenienceMethods.createAbsoluteCodingSchemeVersionReference(
					ref.getCodingSchemeURN(), ref.getCodingSchemeVersion()));
			
			LexEvsServiceLocator.getInstance().getIndexServiceManager().getEntityIndexService().dropIndex(ref);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LexBIGServiceManager lbsm = ServiceHolder.instance().getLexBIGService()
				.getServiceManager(null);
		for(AbsoluteCodingSchemeVersionReference ref: references){
			
			// deactivate
			lbsm.deactivateCodingSchemeVersion(ConvenienceMethods.createAbsoluteCodingSchemeVersionReference(
				ref.getCodingSchemeURN(), ref.getCodingSchemeVersion()), null);	
			
			lbsm.removeCodingSchemeVersion(ref);
		}

	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testMultipleIndexCreation() throws LBParameterException, LBException {
		
		LexBIGService lbs;
		CodedNodeSet set;
		ResolvedConceptReferencesIterator itr;
		
		int count = 0;
		
		DefaultLexEvsIndexOperations ops = (DefaultLexEvsIndexOperations) LexEvsServiceLocator.getInstance().getLexEvsIndexOperations();
		assertFalse(ops.getConcurrentMetaData().getCodingSchemeList().size() > 0);
		for(AbsoluteCodingSchemeVersionReference reference: references){
			assertFalse(ops.doesIndexExist(reference));
			
			LexEvsServiceLocator.getInstance().getLexEvsIndexOperations().
			registerCodingSchemeEntityIndex(reference.getCodingSchemeURN(), reference.getCodingSchemeVersion());
			assertNotNull(ops.getConcurrentMetaData().getCodingSchemeList().get(count));
			
			// Test the index is populated and valid 
			lbs = LexBIGServiceImpl.defaultInstance();
			CodingSchemeVersionOrTag csvt = new CodingSchemeVersionOrTag();
			csvt.setVersion(reference.getCodingSchemeVersion());
			set = lbs.getCodingSchemeConcepts(reference.getCodingSchemeURN(), csvt);
			itr = set.resolve(null, null, null);
			assertNotNull(itr.next());
			
			assertTrue(ops.doesIndexExist(reference));
			count++;
		}
	}

}