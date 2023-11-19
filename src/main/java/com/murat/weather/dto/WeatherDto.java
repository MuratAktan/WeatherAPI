package com.murat.weather.dto;

import java.util.List;

public record WeatherDto(
        List<HourlyWeatherDto> hourlyWeather
) {
}
