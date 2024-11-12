
package edu.mayo.informatics.lexgrid.convert.exporters.xml.lgxml.impl;

/*
 * code based on example from: http://www.hsqldb.org/doc/guide/apb.html
 */

import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.relations.AssociationSource;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;

import edu.mayo.informatics.lexgrid.convert.exporters.xml.lgxml.interfaces.AssociationSourceCache;

public class AssociationSourceCacheEhcacheImpl implements AssociationSourceCache {

    private Cache theCache;
    private CacheManager theCacheManager;
    
    public AssociationSourceCacheEhcacheImpl() {
        //Create a CacheManager using defaults
        this.theCacheManager = CacheManagerBuilder.newCacheManagerBuilder() 
                .withCache("lg60XmlExporterAssocSrcCache",
                    CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(100))) 
                .build(); 
            theCacheManager.init();

        this.theCache = theCacheManager.getCache("lg60XmlExporterAssocSrcCache", null, null);
  
        
    }
    
    private String makeValue(AssociationSource associationSource) {
        String key = associationSource.getSourceEntityCode() + associationSource.getSourceEntityCodeNamespace();
        return key;
    }
    
    private String makeValue(ResolvedConceptReference rcr) {
        String key = rcr.getCode() + rcr.getCodeNamespace();
        return key;
    }
    
    public void add(ResolvedConceptReference conRef) {
        String value = this.makeValue(conRef);

        this.theCache.put(conRef.getCode(), value);
    }
    
    @Override
    public void add(AssociationSource associationSource) {
        String value = this.makeValue(associationSource);

        this.theCache.put(associationSource.getSourceEntityCode(), value);
    }

    @Override
    public void clear() {
        this.theCache.clear();
    }

    @Override
    public void dumpCacheContentsToStdOut() {
        System.out.println("AssociationSourceCacheEhcacheImpl: dumpCacheContentsToStdOut:");
        this.theCache.forEach(x ->System.out.println( "value: " + x));
    }

    @Override
    public boolean exists(ResolvedConceptReference rcr) {
        
        String key = (String) this.theCache.get(rcr.getCode());
        if(key == null) {
            return false;
        } else {
            return true;
        }
        
    }

    @Override
    public void destroy() {
        this.theCacheManager.close();
    }

}