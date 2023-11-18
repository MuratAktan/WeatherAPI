package com.murat.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HourlyWeatherResponse(
        @JsonProperty("dt") long timestamp,
        @JsonProperty("temp") double temperature,
        @JsonProperty("feels_like") double feelsLike,
        int humidity
) {
}