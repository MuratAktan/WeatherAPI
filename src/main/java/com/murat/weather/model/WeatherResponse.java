package com.murat.weather.model;

import java.util.List;

public record WeatherResponse(
        List<HourlyWeatherResponse> hourly
) {
}
