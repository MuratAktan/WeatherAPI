package com.murat.weather.dto;

import java.time.LocalDateTime;

public record HourlyWeatherDto(
    LocalDateTime date,
    double temperature,
    double feelsLike,
    String weather,
    int humidity
) {
}
