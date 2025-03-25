package de.exxcellent.challenge.util.parser;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CsvFileParserTest {

    private static final String VALID_TEST_CSV_FILE_PATH = "src/test/resources/valid_test.csv";
    private static final String INVALID_TEST_CSV_FILE_PATH = "src/test/resources/invalid_test.csv";

    @Test
    @DisplayName("Given an valid CSV file, " +
            "When the file is parsed, " +
            "Then the provided model contains the correct values")
    void assertParseFileCorrectly() {
        // Given
        var csvFileParser = new CsvFileParser();

        // When
        var result = csvFileParser.parseFile(TestModel.class, VALID_TEST_CSV_FILE_PATH);

        // Then
        var expectedResult = List.of(new TestModel("a", 1, 1.1), new TestModel("b", 2, 2.2), new TestModel("c", 3, 3.3));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given an invalid CSV file, " +
            "When the file is parsed, " +
            "Then a FileParserException will be thrown")
    void assertInvalidFileException() {
        // Given
        var csvFileParser = new CsvFileParser();

        // When Then
        assertThrows(FileParserException.class, () -> csvFileParser.parseFile(TestModel.class, INVALID_TEST_CSV_FILE_PATH));
    }
}
