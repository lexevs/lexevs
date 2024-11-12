
package edu.mayo.informatics.lexgrid.convert.exporters.xml.lgxml.cache;

import junit.framework.Assert;

import java.util.concurrent.atomic.AtomicInteger;

import org.LexGrid.relations.AssociationSource;
import org.LexGrid.relations.AssociationTarget;
import org.junit.Test;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
//import net.sf.ehcache.Element;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
//import net.sf.ehcache.store.MemoryStoreEvictionPolicy;

public class TestEhcache {
    
    public TestEhcache() {
        super();
    }
    
    @Test
    public void test1() {
        //Create a CacheManager using defaults
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder() 
                .withCache("testcache",
                    CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(2))) 
                .build(); 
            cacheManager.init();
        
        Cache<String, Object> cache = cacheManager.getCache("testCache",String.class, Object.class);
        Assert.assertEquals(0, size(cache));
        System.out.println("Test Ehcache: cache size=" + size(cache));

        
        //--------------------------------------------------------
        // add data to cache
        //--------------------------------------------------------

        System.out.println("TestEhcache: add element \"" + "key1" + "\" +  value1 to empty cache...");
        cache.put("key1", "value1");        
        System.out.println("TestEhcache: cache size=" + size(cache));
        Assert.assertEquals(1, size(cache));
        
        // add duplicate data
        System.out.println("TestEhcache: adding duplicate element...");
        cache.put("key1", "value1");
        System.out.println("TestEhcache: cache size=" + size(cache));
        Assert.assertEquals(1, size(cache));
        

        //--------------------------------------------------------
        // get data from cache
        //--------------------------------------------------------        
        // hit=true
        String value1 = (String) cache.get("key1");       
        System.out.println("TestEhcache: value of element with key1= value1");
        Assert.assertTrue(value1.equals("value1"));
        
        // hit=false
        String value2 = (String) cache.get("key2");
        if(value2 == null) {
            System.out.println("TestEhcache: an element with key value \"key2\" does not exist");
        } else {
 
            System.out.println("TestEhcache: value of element with key2=" + value2);            
        }
        Assert.assertNull(value2);
        
        //--------------------------------------------------------
        // test disk
        //--------------------------------------------------------
        System.out.println("TestEhcache: test disk...");
        String valuePrefix = "value";
        String keyPrefix = "key";
        String tempValue = null;
        String tempKey = null;
        for(int i=0; i<20; ++i) {
            tempKey = keyPrefix + i;
            tempValue = valuePrefix + i;
            System.out.println("TestEhcache: adding to cahce: \"" + tempKey + "\" \""  +  tempValue + "\"");
            cache.put(tempKey, tempValue);
            System.out.println("TestEhcache: cache size=" + size(cache));
        }
        
        Assert.assertEquals(20, size(cache));
        
        // System.out.println(cache.toString());
        //cache.flush();
        
        //System.out.println("TestEhcache: DiskStorePath=" + cache.getCacheConfiguration().dis.getDiskStorePath());
        
        String value18 = (String) cache.get("key18");
       
        System.out.println("TestEhcache: value of element with key18=" + value18);
        Assert.assertTrue(value18.equals("value18"));
    }
    
    @Test
    public void test2() {
        //Create a CacheManager using defaults
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder() 
                .withCache("testcache2",
                    CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(2))) 
                .build(); 
            cacheManager.init();

        //Create a Cache specifying its configuration.
        int maxElementsInMemory = 2;
        
        cacheManager.getCache("testcache2", String.class, Object.class); 
        
        Cache<String, Object> cache = cacheManager.getCache("testCache2", String.class, Object.class);
        System.out.println("Test Ehcache: cache size=" + size(cache));
        Assert.assertEquals(0, size(cache));
        
        //--------------------------------------------------------
        // get data from cache
        //--------------------------------------------------------
        AssociationTarget aT = new AssociationTarget();
        aT.setTargetEntityCode("b");
        aT.setTargetEntityCodeNamespace("ns1");
        AssociationSource aS = new AssociationSource();
        aS.addTarget(aT);
        aS.setSourceEntityCode("a");
        aS.setSourceEntityCodeNamespace("ns1");
        
        String key = aS.getSourceEntityCode() + aS.getSourceEntityCodeNamespace();
        
        System.out.println("TestEhcache: add element with key: " + key + " and value: " + aS + " to empty cache...");
        cache.put(key, aS);
        System.out.println("TestEhcache: cache size=" + size(cache));
        Assert.assertEquals(1, size(cache));
        
        AssociationSource cachedAs = (AssociationSource) cache.get(key);
        Assert.assertNotNull(cachedAs);
    }
    
    private int size(Cache<String, Object> cache) {
        AtomicInteger count = new AtomicInteger(0);
        cache.forEach(item -> count.incrementAndGet());
        return count.get();
    }

    
    
    
    
    
    public static void main(String[] args) {
        TestEhcache tester = new TestEhcache();
        tester.test1();
        tester.test2();
    }

}