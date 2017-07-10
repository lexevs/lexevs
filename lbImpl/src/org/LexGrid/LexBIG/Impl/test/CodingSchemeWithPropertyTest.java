package org.LexGrid.LexBIG.Impl.test;

import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceCodingSchemeWithType;

public class CodingSchemeWithPropertyTest {
    public static void main(String[] args) throws Exception {
        try {
            LexBIGService lbs = LexBIGServiceImpl.defaultInstance();
            LexBIGServiceCodingSchemeWithType scst = lbs.getServiceCodingSchemeWithType();

            System.out.println("Indexed coding schemes:");
            String test = scst.listResolvedValueSets();
            
//            int i = 0;
//            for (Enumeration<? extends AbsoluteCodingSchemeVersionReference> items = al
//                    .enumerateAbsoluteCodingSchemeVersionReference(); items.hasMoreElements();) {
//                AbsoluteCodingSchemeVersionReference ref = items.nextElement();
//                System.out.println("Coding Scheme URN - " + ref.getCodingSchemeURN());
//                System.out.println("Coding Scheme version - " + ref.getCodingSchemeVersion());
//                i++;
//            }

            System.out.println(test);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
