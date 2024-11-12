
package org.lexevs.cache;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.core.internal.statistics.DefaultStatisticsService;
import org.ehcache.core.spi.service.StatisticsService;
import org.ehcache.core.statistics.CacheStatistics;
import org.lexevs.logging.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Most functions moved to the AbstractMethodCachingBean;

public class CacheRegistry implements InitializingBean, DisposableBean {
	private static CacheManager cacheManager;


	private StatisticsService statisticsService;
	Map<String, CacheConfiguration<?, ?>> cacheConfigs;



	private final ThreadLocal<Boolean> inCacheClearingState =
		new ThreadLocal<Boolean>();
	
	public void afterPropertiesSet() throws Exception {
		//NOOP
	}
	
	@Override
	public void destroy() throws Exception {
		LoggerFactory.getLogger().debug(
				getCacheStatisticsStringRepresentation());
		cacheManager.close();
	}
	
	protected String getCacheStatisticsStringRepresentation() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n===============================");
		sb.append("\n         Cache Statistics      \n");
		
		long hits = 0;
		float misses = 0;
		float offheapmemoryUsage = 0;
		float onheapmemoryUsage = 0;
        String[] keys = (String[]) cacheConfigs.keySet().toArray();
		for(int i=0; i < keys.length; i++) {
		 String cacheName = keys[i];

			CacheStatistics ehCacheStat = statisticsService.getCacheStatistics(cacheName);
			hits += ehCacheStat.getCacheHits();
			misses += ehCacheStat.getCacheMisses();
			
			sb.append("\n" + statisticsService.getCacheStatistics(cacheName).getTierStatistics().values().toString());
			float offheapcacheMemory = getMegaBytesFromBytes(statisticsService.getCacheStatistics(cacheName).getTierStatistics().get("offHeap").getAllocatedByteSize());
			offheapmemoryUsage += offheapcacheMemory;
			float onHeapcacheMemory = getMegaBytesFromBytes(statisticsService.getCacheStatistics(cacheName).getTierStatistics().get("OnHeap").getAllocatedByteSize());
			onheapmemoryUsage += onHeapcacheMemory;
			sb.append("\n - Off Heap in Memory Size (MB): " + offheapcacheMemory);
			sb.append("\n - On Heap in Memory Size (MB): " + onHeapcacheMemory);

		
		sb.append("\n\n");
		sb.append("\nTOTAL STATS:");
		sb.append("\n - Total Cache Requests: " + (hits + misses));
		sb.append("\n - Hits: " + hits);
		sb.append("\n - Misses: " + misses);
		sb.append("\n - Total Off Heap Memory Usage (MB): " + offheapmemoryUsage);
		sb.append("\n - Total On Heap Memory Usage (MB): " + onheapmemoryUsage);
		sb.append("\n - Cache Efficiency: " + (hits/(misses+hits)));
		
		sb.append("\n===============================\n");
		}
		return sb.toString();
	}
	
	private float getMegaBytesFromBytes(float bytes) {
		//             to KB  to MB
		return bytes / 1024 / 1024;
	}
	
	protected void initializeCache() {
		this.statisticsService = new DefaultStatisticsService();
		cacheManager = CacheManagerBuilder
				.newCacheManagerBuilder()
				.using(statisticsService)
				.build();
		cacheManager.init();
	}

	public void clearAll() {
		List<String> caches = cacheManager.getRuntimeConfiguration().getCacheConfigurations().keySet().stream().collect(Collectors.toList());
		caches.stream().forEach(x -> cacheManager.getCache(x, String.class, Object.class).clear());
	}


	public void setCacheManager(CacheManager cManager) {
		cacheManager = cManager;
	}

	public CacheManager getCacheManager() {
		return cacheManager;
	}
	
	public Boolean getInThreadCacheClearingState(){
		return this.inCacheClearingState.get();
	}
	
	public void setInThreadCacheClearingState(boolean inThreadClearingState){
		this.inCacheClearingState.set(inThreadClearingState);
	}
	

}