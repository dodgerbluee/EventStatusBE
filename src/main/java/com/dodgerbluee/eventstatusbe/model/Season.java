package model;

public class Season {

    private long id;
    private SeasonType seasonType;
    private String seasonYear;

    public Season(SeasonType seasonType, String seasonYear) {
        this.seasonType = seasonType;
        this.seasonYear = seasonYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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