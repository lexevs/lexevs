package org.LexGrid.LexBIG.Impl.test;

import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceCodingSchemeWithType;

public class CodingSchemeWithPropertyTest {
    public static void main(String[] args) throws Exception {
        try {
            LexBIGService lbs = LexBIGServiceImpl.defaultInstance();
            LexBIGServiceCodingSchemeWithType scst = lbs.getServiceCodingSchemeWithType();

            
            List<CodingSchemeSummary> cssListAll = scst.listAllCodingSchemes();
            System.out.println("ALL coding schemes:");
            System.out.println("--------------------");
            printCodingSchemeWithTypeList(cssListAll);
            
            List<CodingSchemeSummary> cssList = scst.listAllResolvedValueSets();
            System.out.println("ALL Resolved Value Sets:");
            System.out.println("------------------------");
            printCodingSchemeWithTypeList(cssList);
            
            scst = lbs.getServiceCodingSchemeWithType();
            scst.restrictToCodingSchemeName("AUTOMOBILES");
            List<CodingSchemeSummary> cssListByName = scst.resolve();
            System.out.println("ALL coding schemes - automobiles:");
            System.out.println("--------------------");
            printCodingSchemeWithTypeList(cssListByName);
                        
            scst = lbs.getServiceCodingSchemeWithType();
            scst.restrictToCodingSchemeVersion("1.0");
            List<CodingSchemeSummary> cssListByVersion = scst.resolve();
            System.out.println("ALL coding schemes - version 1.0:");
            System.out.println("--------------------");
            printCodingSchemeWithTypeList(cssListByVersion);
                     
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void printCodingSchemeWithTypeList(List<CodingSchemeSummary> cssList) {
        for (CodingSchemeSummary cs: cssList) {
            System.out.println("Coding Scheme Name - " + cs.getFormalName());
            System.out.println("Coding Scheme URN - " + cs.getCodingSchemeURI());
            System.out.println("Coding Scheme version - " + cs.getRepresentsVersion());
            System.out.println("\n");
        }
    }

}
