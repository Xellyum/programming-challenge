package de.exxcellent.challenge.service;

import de.exxcellent.challenge.model.WeatherData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeatherServiceTest {

    @Test
    @DisplayName("Given a list of weather data, " +
            "When the day with the smallest temperature spread is determined, " +
            "Then the day with the smallest spread will be returned")
    void assertSmallestTemperatureSpreadDay() {
        // Given
        var testWeatherData = List.of(
                new WeatherData(1, 10, 1, 0 , 0.0, 0, 0, 0.0, 0, 0, 0.0, 0, 0, 0.0),
                new WeatherData(2, 10, 8, 0 , 0.0, 0, 0, 0.0, 0, 0, 0.0, 0, 0, 0.0));

        var service = new WeatherService();

        // When
        var day = service.determineSmallestTemperatureSpreadDay(testWeatherData);

        // Then
        assertEquals(2, day);
    }

    @Test
    @DisplayName("Given a list of weather data, " +
            "When the day with the smallest temperature spread is determined and there are multiple days with the same spread, " +
            "Then the first day entry with the smallest spread will be returned")
    void assertSmallestTemperatureSpreadDayAmbiguous() {
        // Given
        var testWeatherData = List.of(
                new WeatherData(1, 10, 8, 0 , 0.0, 0, 0, 0.0, 0, 0, 0.0, 0, 0, 0.0),
                new WeatherData(2, 10, 8, 0 , 0.0, 0, 0, 0.0, 0, 0, 0.0, 0, 0, 0.0));

        var service = new WeatherService();

        // When
        var day = service.determineSmallestTemperatureSpreadDay(testWeatherData);

        // Then
        assertEquals(1, day);
    }

    @Test
    @DisplayName("Given invalid weather data, " +
            "When the day with the smallest temperature spread is determined, " +
            "Then an exception will be thrown")
    void assertInvalidWeatherDataException() {
        // Given
        var invalidTestWeatherData = List.of(
                new WeatherData(null, null, null, 0 , 0.0, 0, 0, 0.0, 0, 0, 0.0, 0, 0, 0.0));

        var service = new WeatherService();

        // When Then
        assertThrows(WeatherServiceException.class, () -> service.determineSmallestTemperatureSpreadDay(invalidTestWeatherData));
    }
}
