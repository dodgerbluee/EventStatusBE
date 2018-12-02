package com.dodgerbluee.eventstatusbe.model;

import javax.persistence.*;

@Entity
@Table(name="teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String teamName;

    private TeamType teamType;

    @OneToOne
    @JoinColumn(name = "season_id")
    //@JsonManagedReference
    private Season season;

    public Team() {
    }

    public Team(String teamName, TeamType teamType, Season season) {
        this.teamName = teamName;
        this.teamType = teamType;
        this.season = season;
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

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}