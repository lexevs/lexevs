package org.lexevs.property;

import java.util.List;
import java.util.Map;
import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeVersionOrTag;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Extensions.Generic.GenericExtension;

public interface PropertyExtension extends GenericExtension {
    Map<String, String> getConceptStatusForNCItCodes(List<String> var1);

    Map<String, String> getProperty(String var1, CodingSchemeVersionOrTag var2, String var3, List<String> var4)
            throws LBParameterException;
}