package de.exxcellent.challenge.util;

public class FootballServiceException extends RuntimeException {

    public FootballServiceException() {
        super();
    }

    public FootballServiceException(String message) {
        super(message);
    }

    public FootballServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public FootballServiceException(Throwable cause) {
        super(cause);
    }
}
