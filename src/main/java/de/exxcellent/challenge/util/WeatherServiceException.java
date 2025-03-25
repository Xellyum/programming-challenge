package de.exxcellent.challenge.util;

public class WeatherServiceException extends RuntimeException {

    public WeatherServiceException() {
        super();
    }

    public WeatherServiceException(String message) {
        super(message);
    }

    public WeatherServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeatherServiceException(Throwable cause) {
        super(cause);
    }
}
