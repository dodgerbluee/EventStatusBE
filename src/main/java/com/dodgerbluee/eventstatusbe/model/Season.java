package com.dodgerbluee.eventstatusbe.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="seasons")
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private SeasonType seasonType;
    private String seasonYear;

    @OneToMany
    @JoinColumn(name = "game_id")
    //@JsonManagedReference
    private List<Game> games;

    public Season() {
    }

    public Season(SeasonType seasonType, String seasonYear, List<Game> games) {
        this.seasonType = seasonType;
        this.seasonYear = seasonYear;
        this.games = games;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public SeasonType getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(SeasonType seasonType) {
        this.seasonType = seasonType;
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }
}