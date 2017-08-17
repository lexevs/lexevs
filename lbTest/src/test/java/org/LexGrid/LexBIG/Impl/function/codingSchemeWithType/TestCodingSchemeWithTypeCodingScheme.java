package org.LexGrid.LexBIG.Impl.function.codingSchemeWithType;

import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.Impl.testUtility.ServiceHolder;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceCodingSchemeWithType;

public class TestCodingSchemeWithTypeCodingScheme extends LexBIGServiceTestCase {

	@Override
	protected String getTestID() {
		return TestCodingSchemeWithTypeCodingScheme.class.getName();
	}
	
	public void testListAllCodingSchemes() throws Exception {
		LexBIGServiceCodingSchemeWithType service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		List<CodingSchemeSummary> cssListAll = service.listAllCodingSchemes();
		
		assertTrue(cssListAll.size() >= 23);
		assertTrue(contains(cssListAll, "urn:oid:11.11.0.1", "1.0", "Automobiles"));
	}
	
	public void testRestrictToCodingSchemeName() throws Exception {
		LexBIGServiceCodingSchemeWithType service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeName("automobiles");
        List<CodingSchemeSummary> cssListByName = service.resolve();
        
        // ALL coding schemes - automobiles
		assertTrue(cssListByName.size() >= 1);
		assertTrue(contains(cssListByName, "urn:oid:11.11.0.1", "1.0", "Automobiles"));
			
		service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeName("owl2lexevs");
        cssListByName = service.resolve();
		
        // ALL coding schemes - owl2lexevs
		assertTrue(cssListByName.size() >= 5);
		
		assertTrue(contains(cssListByName,"http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl", "0.1.0", "owl2lexevs"));
		assertTrue(contains(cssListByName,"http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl", "0.1.1", "owl2lexevs"));
		assertTrue(contains(cssListByName,"http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl", "0.1.2", "owl2lexevs"));
		assertTrue(contains(cssListByName,"http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl", "0.1.3", "owl2lexevs"));
		assertTrue(contains(cssListByName,"http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl", "0.1.5", "owl2lexevs"));						
	}
	
	public void testRestrictToCodingSchemeVersion() throws Exception {
		LexBIGServiceCodingSchemeWithType service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeVersion("1.0");
        List<CodingSchemeSummary> cssListByVersion = service.resolve();
        
		assertTrue(cssListByVersion.size() >= 1);
		assertTrue(contains(cssListByVersion, "urn:oid:11.11.0.1", "1.0", "Automobiles"));
			
		service = ServiceHolder.instance().getLexBIGService().getServiceCodingSchemeWithType();
		service = service.restrictToCodingSchemeVersion("0.1.0");
		cssListByVersion = service.resolve();
		
        // ALL coding schemes - owl2lexevs
		assertTrue(cssListByVersion.size() >= 1);
		assertTrue(contains(cssListByVersion,"http://ncicb.nci.nih.gov/xml/owl/EVS/owl2lexevs.owl", "0.1.0", "owl2lexevs"));
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
