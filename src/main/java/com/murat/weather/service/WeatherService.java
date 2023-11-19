package com.murat.weather.service;

import com.murat.weather.constants.Constants;
import com.murat.weather.dto.WeatherDto;
import com.murat.weather.exception.ExceptionAdvice;
import com.murat.weather.mapper.WeatherDtoMapper;
import com.murat.weather.model.GeolocationResponse;
import com.murat.weather.model.WeatherResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {
    private final RestTemplate restTemplate;
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable(value = Constants.WEATHER_CACHE_NAME, key = "#city")
    public WeatherDto getWeatherByCityName(String city) {

        GeolocationResponse geolocation = getGeolocationFromApi(city);
        WeatherResponse weatherResponse = getWeatherFromApi(geolocation);
        return WeatherDtoMapper.mapToWeatherDto(weatherResponse);
    }

    private WeatherResponse getWeatherFromApi(GeolocationResponse geolocation) {
        return restTemplate.getForObject(getWeatherApiUrl(geolocation), WeatherResponse.class);
    }

    private String getWeatherApiUrl(GeolocationResponse geolocation) {
        return Constants.weatherUrl + Constants.latitudeParam + geolocation.lat() + Constants.longitudeParam + geolocation.lon() + Constants.appIdParam + Constants.appId;
    }

    private GeolocationResponse getGeolocationFromApi(String city) {
        GeolocationResponse[] geolocations = restTemplate.getForObject(getGeolocationApiUrl(city), GeolocationResponse[].class);

        if (geolocations != null && geolocations.length > 0)
            return geolocations[0];

        throw new ExceptionAdvice.GeolocationNotFoundException(city);
    }

    private String getGeolocationApiUrl(String city) {
        return Constants.geolocationUrl + Constants.cityParam + city + Constants.appIdParam + Constants.appId;
    }
}
