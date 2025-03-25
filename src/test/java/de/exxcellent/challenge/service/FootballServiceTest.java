package de.exxcellent.challenge.service;

import de.exxcellent.challenge.model.FootballData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FootballServiceTest {

    @Test
    @DisplayName("Given a list of football data, " +
            "When the team with the smallest difference between goals and allowed goals is determined, " +
            "Then the team with the smallest difference will be returned")
    void assertTeamWithSmallestGoalDifference() {
        // Given
        var testFootballData = List.of(
                new FootballData("Team A", 1, 0, 0, 0, 100, 25, 0),
                new FootballData("Team B", 1, 0, 0, 0, 50, 100, 0));

        var service = new FootballService();

        // When
        var team = service.determineTeamWithSmallestGoalDifference(testFootballData);

        // Then
        assertEquals("Team B", team);
    }

    @Test
    @DisplayName("Given a list of football data, " +
            "When the team with the smallest difference between goals and allowed goals is determined and there are multiple teams with the same difference, " +
            "Then the first team entry with the smallest difference will be returned")
    void assertTeamWithSmallestGoalDifferenceAmbiguous() {
        // Given
        var testFootballData = List.of(
                new FootballData("Team A", 1, 0, 0, 0, 50, 25, 0),
                new FootballData("Team B", 1, 0, 0, 0, 50, 25, 0));

        var service = new FootballService();

        // When
        var team = service.determineTeamWithSmallestGoalDifference(testFootballData);

        // Then
        assertEquals("Team A", team);
    }

    @Test
    @DisplayName("Given invalid football data, " +
            "When the team with the smallest difference between goals and allowed goals is determined, " +
            "Then an exception will be thrown")
    void assertInvalidFootballDataException() {
        // Given
        var testFootballData = List.of(
                new FootballData(null, 1, 0, 0, 0, null, null, 0));

        var service = new FootballService();

        // When Then
        assertThrows(FootballServiceException.class, () -> service.determineTeamWithSmallestGoalDifference(testFootballData));
    }
}
