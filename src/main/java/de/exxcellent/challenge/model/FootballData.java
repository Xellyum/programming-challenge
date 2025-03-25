package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class FootballData {

    @CsvBindByName(column = "Team")
    private String team;

    @CsvBindByName(column = "Games")
    private Integer games;

    @CsvBindByName(column = "Wins")
    private Integer wins;

    @CsvBindByName(column = "Losses")
    private Integer losses;

    @CsvBindByName(column = "Draws")
    private Integer draws;

    @CsvBindByName(column = "Goals")
    private Integer goals;

    @CsvBindByName(column = "Goals Allowed")
    private Integer goalsAllowed;

    @CsvBindByName(column = "Points")
    private Integer points;

    public FootballData() { }

    public FootballData(String team, Integer games, Integer wins, Integer losses, Integer draws,
                        Integer goals, Integer goalsAllowed, Integer points) {
        this.team = team;
        this.games = games;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.points = points;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(Integer goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "FootballData{" +
                "team='" + team + '\'' +
                ", games=" + games +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goals=" + goals +
                ", goalsAllowed=" + goalsAllowed +
                ", points=" + points +
                '}';
    }
}
