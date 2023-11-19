package com.murat.weather.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {
    public static String weatherUrl;
    public static String geolocationUrl;
    public static String appId;
    public static int cacheTtl;
    public static String latitudeParam = "&lat=";
    public static String longitudeParam = "&lon=";
    public static String cityParam = "?q=";
    public static String appIdParam = "&appid=";
    public static final String WEATHER_CACHE_NAME = "weatherCache";


    @Value("${open-weather.weather-url}")
    public void setWeatherUrl(String weatherUrl) {
        Constants.weatherUrl = weatherUrl;
    }
    @Value("${open-weather.geolocation-url}")
    public void setGeolocationUrl(String geolocationUrl) {
        Constants.geolocationUrl = geolocationUrl;
    }
    @Value("${open-weather.app-id}")
    public void setAppId(String appId) {
        Constants.appId = appId;
    }

    @Value("${open-weather.cache-ttl}")
    public void setCacheTtl(int cacheTtl) {
        Constants.cacheTtl = cacheTtl;
    }
}
