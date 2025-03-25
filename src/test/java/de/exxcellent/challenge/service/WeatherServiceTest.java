package de.exxcellent.challenge.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeatherServiceTest {

    @Test
    @DisplayName("Given a CSV File with weather data by day, " +
            "When the day with the smallest temperature spread is determined, " +
            "Then the day with the smallest spread will be returned")
    void assertSmallestTemperatureSpreadDay() {

    }

    @Test
    @DisplayName("Given a CSV File with weather data by day, " +
            "When the day with the smallest temperature spread is determined and there are multiple days with the same spread, " +
            "Then the first day with the smallest spread will be returned")
    void assertSmallestTemperatureSpreadDayAmbiguous() {

    }

    @Test
    @DisplayName("Given a CSV File with invalid weather data, " +
            "When the day with the smallest temperature spread is determined, " +
            "Then an exception will be thrown")
    void assertInvalidWeatherDataException() {

    }
}
