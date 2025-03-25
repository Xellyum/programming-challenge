package de.exxcellent.challenge.service;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.util.FootballServiceException;
import de.exxcellent.challenge.util.parser.CsvFileParser;
import de.exxcellent.challenge.util.parser.FileParser;

import java.util.Comparator;
import java.util.List;

public class FootballService {

    private final FileParser fileParser = new CsvFileParser();

    public String determineTeamWithSmallestGoalDifference(String footballDataPath) {
        var footballData = fileParser.parseFile(FootballData.class, footballDataPath);
        return determineTeamWithSmallestGoalDifference(footballData);
    }

    public String determineTeamWithSmallestGoalDifference(List<FootballData> footballData) {
        if (isFootballDataInvalid(footballData)) {
            throw new FootballServiceException("At least one football data entry contains invalid information in Team, Goals or Goals Allowed");
        }

        var result = footballData.stream().min(Comparator.comparingDouble(f -> Math.abs(f.getGoals() - f.getGoalsAllowed())));

        if (result.isEmpty()) {
            throw new FootballServiceException("There is no smallest goal difference team");
        }

        return result.get().getTeam();
    }

    private boolean isFootballDataInvalid(List<FootballData> footballData) {
        return footballData.stream().allMatch(f -> f.getTeam() == null || f.getGoals() == null || f.getGoalsAllowed() == null);
    }
}
