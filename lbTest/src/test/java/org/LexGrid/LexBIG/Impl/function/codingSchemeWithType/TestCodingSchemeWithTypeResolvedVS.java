package org.LexGrid.LexBIG.Impl.function.codingSchemeWithType;

import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.Impl.testUtility.ServiceHolder;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceCodingSchemeWithType;

public class TestCodingSchemeWithTypeResolvedVS extends LexBIGServiceTestCase {

	@Override
	protected String getTestID() {
		return TestCodingSchemeWithTypeResolvedVS.class.getName();
	}

	public void testListAllResolvedValueSets() throws Exception {
		LexBIGServiceCodingSchemeWithType service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		List<CodingSchemeSummary> cssListAll = service.listAllResolvedValueSets();
		
		assertTrue(cssListAll.size() >= 1);
		assertTrue(contains(cssListAll, "SRITEST:AUTO:AllDomesticButGM", "12.03test", "All Domestic Autos But GM"));
		assertTrue(contains(cssListAll, "XTEST:One.Node.ValueSet", "1.0", "One Child Value Set"));
	}
	
	public void testRestrictToCodingSchemeVersion() throws Exception {
		LexBIGServiceCodingSchemeWithType service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeVersion("12.03test");
        List<CodingSchemeSummary> cssListByVersion = service.resolve();
        
		assertTrue(cssListByVersion.size() >= 1);
		assertTrue(contains(cssListByVersion, "SRITEST:AUTO:AllDomesticButGM", "12.03test", "All Domestic Autos But GM"));
			
		service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeVersion("1.0");
		cssListByVersion = service.resolve();
		
        // ALL coding schemes - owl2lexevs
		assertTrue(cssListByVersion.size() >= 1);
		assertTrue(contains(cssListByVersion, "XTEST:One.Node.ValueSet", "1.0", "One Child Value Set"));
	}
	private boolean contains(List<CodingSchemeSummary> cssList, String urn, String version, String name) {
		
		for (CodingSchemeSummary cs: cssList) {
			if (cs.getCodingSchemeURI().equals(urn) && 
				cs.getRepresentsVersion().equals(version) && 
				cs.getFormalName().equals(name)) {
				return true;
			}
		}
		return false;
    }
}
