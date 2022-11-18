package org.LexGrid.lexevs.metabrowser.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Extensions.Load.MetaBatchLoader;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceManager;
import org.LexGrid.lexevs.metabrowser.MetaBrowserService;

public class SetUpHelper {
	
	static {
		System.setProperty("LG_CONFIG_FILE", "src/test/resources/config/lbconfig.props");

		LexBIGService service = LexBIGServiceImpl.defaultInstance();
        LexBIGServiceManager lbsm;
		try {
			lbsm = service.getServiceManager(null);
	

        MetaBatchLoader loader = (MetaBatchLoader) lbsm.getLoader("MetaBatchLoader");

       loader.loadMeta(new File("src/test/resources/SAMPLEMETA").toURI());

        while (loader.getStatus().getEndTime() == null) {
            Thread.sleep(100000);
        }
        System.out.println("Load state: " + loader.getStatus().getState());
        assertTrue(loader.getStatus().getState().equals(ProcessState.COMPLETED));
        assertFalse(loader.getStatus().getErrorsLogged().booleanValue());

        lbsm.activateCodingSchemeVersion(loader.getCodingSchemeReferences()[0]);
		} catch (LBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static void init() {}

}
