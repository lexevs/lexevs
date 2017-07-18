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
		assertTrue(contains(cssListAll, "sritest:auto:alldomesticbutgm", "12.03test", "all domestic autos but gm"));
		assertTrue(contains(cssListAll, "xtest:one.node.valueset", "1.0", "one child value set"));
	}
	
	public void testRestrictToCodingSchemeName() throws Exception {
		LexBIGServiceCodingSchemeWithType service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeName("one child value set");
        List<CodingSchemeSummary> cssListByName = service.resolve();
        
		assertTrue(cssListByName.size() >= 1);
		assertTrue(contains(cssListByName, "xtest:one.node.valueset", "1.0", "one child value set"));				
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
