package de.exxcellent.challenge.service;

import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.util.parser.CsvFileParser;
import de.exxcellent.challenge.util.parser.FileParser;

import java.util.Comparator;
import java.util.List;

public class WeatherService {

    private final FileParser fileParser = new CsvFileParser();

    public int determineSmallestTemperatureSpreadDay(String weatherDataPath) {
        var weatherData = fileParser.parseFile(WeatherData.class, weatherDataPath);
        return determineSmallestTemperatureSpreadDay(weatherData);
    }

    public int determineSmallestTemperatureSpreadDay(List<WeatherData> weatherData) {
        if (isWeatherDataInvalid(weatherData)) {
            throw new WeatherServiceException("At least one weather data entry contains invalid information in Day, MxT or MnT");
        }

        var result = weatherData.stream().min(Comparator.comparingDouble(w -> w.getMxT() - w.getMnT()));

        if (result.isEmpty()) {
            throw new WeatherServiceException("There is no smallest temperature spread day");
        }

        return result.get().getDay();
    }

    private boolean isWeatherDataInvalid(List<WeatherData> weatherData) {
        return weatherData.stream().allMatch(w -> w.getDay() == null || w.getMxT() == null || w.getMnT() == null);
    }
}
