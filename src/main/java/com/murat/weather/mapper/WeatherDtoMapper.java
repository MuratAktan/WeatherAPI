package com.murat.weather.mapper;

import com.murat.weather.dto.HourlyWeatherDto;
import com.murat.weather.dto.WeatherDto;
import com.murat.weather.model.HourlyWeatherResponse;
import com.murat.weather.model.WeatherResponse;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.TimeZone;

public class WeatherDtoMapper {

    public static WeatherDto mapToWeatherDto(WeatherResponse weatherResponse) {
        List<HourlyWeatherDto> hourlyWeatherDtoList = mapToHourlyWeatherDtoList(weatherResponse.hourly());
        return new WeatherDto(hourlyWeatherDtoList);
    }

    private static List<HourlyWeatherDto> mapToHourlyWeatherDtoList(List<HourlyWeatherResponse> hourlyWeatherResponses) {
        return hourlyWeatherResponses.stream()
                .map(WeatherDtoMapper::mapToHourlyWeatherDto)
                .toList();
    }

    private static HourlyWeatherDto mapToHourlyWeatherDto(HourlyWeatherResponse hourlyWeatherResponse) {
        return new HourlyWeatherDto(
                LocalDateTime.ofInstant(Instant.ofEpochSecond(hourlyWeatherResponse.date()), ZoneId.systemDefault()),
                hourlyWeatherResponse.temperature(),
                hourlyWeatherResponse.feelsLike(),
                hourlyWeatherResponse.weatherDetail().get(0).weatherDescription(),
                hourlyWeatherResponse.humidity()
        );
    }
}
