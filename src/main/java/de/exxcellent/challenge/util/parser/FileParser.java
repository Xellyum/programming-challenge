package de.exxcellent.challenge.util.parser;

import java.util.List;

public interface FileParser {

    <T> List<T> parseFile(Class<T> model, String path);
}
