package com.murat.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record HourlyWeatherResponse(
        @JsonProperty("dt") long date,
        @JsonProperty("temp") double temperature,
        @JsonProperty("feels_like") double feelsLike,
        @JsonProperty("weather") List<WeatherDescriptionResponse> weatherDetail,
        int humidity
) {
}