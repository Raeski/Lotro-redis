package com.api.lotro.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//@Configuration
//@EnableCaching
//@EnableScheduling
public class CachingConfig {
/*
    public static final String BOOk = "book";

    @Bean
    public CacheManager cacheManager() {
        ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager(BOOk);

        return cacheManager;
    }

    @CacheEvict(allEntries = true, value = {BOOk})
    @Scheduled(fixedDelay = 200 ,  initialDelay = 100)
    public void reportCacheEvict() {
       // System.out.println("Flush Cache " + DateFormat().zz(new Date()));
    }


 */
}
