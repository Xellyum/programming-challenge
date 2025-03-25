package de.exxcellent.challenge.util.parser;

public class FileParserException extends RuntimeException {

    public FileParserException() {
        super();
    }

    public FileParserException(String message) {
        super(message);
    }

    public FileParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileParserException(Throwable cause) {
        super(cause);
    }
}
