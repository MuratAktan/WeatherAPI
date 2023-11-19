package com.murat.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.murat.weather.dto.WeatherDto;
import com.murat.weather.model.GeolocationResponse;
import com.murat.weather.model.WeatherResponse;
import com.murat.weather.service.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import static com.murat.weather.TestHelper.getLondonGeolocationJson;
import static com.murat.weather.TestHelper.getLondonWeatherJson;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class WeatherApplicationTest {
    @Mock
    private RestTemplate restTemplate;
    @InjectMocks
    private WeatherService weatherService;
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    void testGetWeatherByCityName() throws JsonProcessingException {
        GeolocationResponse mockGeolocation = objectMapper.readValue(getLondonGeolocationJson(), GeolocationResponse.class);
        WeatherResponse mockWeatherResponse = objectMapper.readValue(getLondonWeatherJson(), WeatherResponse.class);

        when(restTemplate.getForObject(anyString(), eq(GeolocationResponse[].class)))
                .thenReturn(new GeolocationResponse[]{mockGeolocation});
        when(restTemplate.getForObject(anyString(), eq(WeatherResponse.class)))
                .thenReturn(mockWeatherResponse);

        WeatherDto weatherDto = weatherService.getWeatherByCityName("London");
        verify(restTemplate).getForObject(anyString(), eq(GeolocationResponse[].class));
        verify(restTemplate).getForObject(anyString(), eq(WeatherResponse.class));

        assertNotNull(weatherDto);
    }
}
