package com.murat.weather.service;

import com.murat.weather.model.GeolocationResponse;
import com.murat.weather.model.WeatherResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;
    private final String GEOLOCATION_URL = "http://api.openweathermap.org/geo/1.0/direct?appid=%s&q=%s";
    private final String APP_ID = "2cc1e14d9f374307aa286c7fdcac0d1e";
    private final String WEATHER_URL = "https://api.openweathermap.org/data/3.0/onecall?lat=%s&lon=%s&appid=%s&exclude=minutely";
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable(value = "weatherCache", key = "#city")
    public WeatherResponse getWeatherByCityName(String city) {

        GeolocationResponse geolocation = getGeolocationByCityName(city);
        WeatherResponse weatherResponse = restTemplate.getForObject(String.format(WEATHER_URL, geolocation.lat(), geolocation.lon(), APP_ID), WeatherResponse.class);
        return weatherResponse;
    }

    public GeolocationResponse getGeolocationByCityName(String city) {
        GeolocationResponse[] geolocations = restTemplate.getForObject(String.format(GEOLOCATION_URL, APP_ID, city), GeolocationResponse[].class);

        if (geolocations != null && geolocations.length > 0)
            return geolocations[0];

        return null;
        //return ResponseEntity.badRequest().body(String.format("Unable to find a city with given name %s", city));
    }
}
