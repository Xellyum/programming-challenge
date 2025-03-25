package de.exxcellent.challenge.util.parser;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class CsvFileParser implements FileParser {

    @Override
    public <T> List<T> parseFile(Class<T> model, String path) {
        try {
            var reader = new FileReader(path);

            var csvToBean = new CsvToBeanBuilder<T>(reader)
                    .withType(model)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();
        } catch (Exception e) {
            throw new FileParserException("Could not parse csv file", e);
        }
    }
}
