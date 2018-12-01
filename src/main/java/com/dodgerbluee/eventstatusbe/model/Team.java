package model;

public class Team {

    private long id;
    private String teamName;
    private TeamType teamType;

    public Team(String teamName, TeamType teamType) {
        this.teamName = teamName;
        this.teamType = teamType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeamType getTeamType() {
        return teamType;
    }

    public void setTeamType(TeamType teamType) {
        this.teamType = teamType;
    }
}