package org.LexGrid.LexBIG.Impl;

import java.util.Enumeration;
import java.util.Iterator;

import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceCodingSchemeWithType;
import org.LexGrid.LexBIG.Utility.logging.LgLoggerIF;
import org.apache.lucene.search.Query;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType;
import org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithTypePropertyList;
import org.lexevs.locator.LexEvsServiceLocator;
import org.lexevs.logging.LoggerFactory;


/**
 * Lucene implementation of the LexBIGServiceCodingSchemeWithType interface.
 * 
 */
public class LexBIGServiceCodingSchemeWithTypeImpl implements LexBIGServiceCodingSchemeWithType {


    private static final long serialVersionUID = 1L;
    
    private LgLoggerIF getLogger() {
        return LoggerFactory.getLogger();
    }


    @Override
    public String listResolvedValueSets() throws LBInvocationException {
        getLogger().logMethod(new Object[] {});
        try {
            
            CodingSchemeWithTypePropertyList list = LexEvsServiceLocator.getInstance().
                getIndexServiceManager().getCodingSchemeWithTypeIndexService().listCodingSchemeWithType();
            
            //Enumeration enumeration = list.enumerateCodingSchemeWithType();
            
            // TODO CME: get list of coding schemes with type
            
            
            return  list.getCodingSchemeWithType(0).getFormalName();
       

        } catch (Exception e) {
            String id = getLogger().error("An unexpected error occurred while listing coding schemes.", e);
            throw new LBInvocationException(
                    "An unexpected error occurred while listing coding schemes.  See the log for more details",
                    id);
        }
    }


    @Override
    public String search(Query query) {
        // TODO Auto-generated method stub
        return null;
    }

}
