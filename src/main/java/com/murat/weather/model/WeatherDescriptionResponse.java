package com.murat.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record WeatherDescriptionResponse(
        @JsonProperty("description") String weatherDescription
) {
}
