package org.lexevs.property.dao;

import java.util.List;
import java.util.Map;

public interface PropertyExtensionDao {
    Map<String, String> getProperty(String var1, String var2, String var3, List<String> var4);

    Map<String, String> getConceptStatusForNCItCodes(List<String> var1);
}