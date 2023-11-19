package com.murat.weather.configuration;

import com.murat.weather.constants.Constants;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CacheConfig {
    @Bean
    public CaffeineCacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager(Constants.WEATHER_CACHE_NAME);
        cacheManager.setCaffeine(Caffeine.newBuilder().expireAfterWrite(Constants.cacheTtl, TimeUnit.MINUTES));
        return cacheManager;
    }
}

