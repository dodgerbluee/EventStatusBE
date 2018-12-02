package com.dodgerbluee.eventstatusbe.model;

import javax.persistence.*;

@Entity
@Table(name="games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String date;
    private GameTime gameTime;
    private Side side;
    private String location;

    public Game() {
    }

    public Game(String date, GameTime gameTime, Side side, String location) {
        this.date = date;
        this.gameTime = gameTime;
        this.side = side;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public GameTime getGameTime() {
        return gameTime;
    }

    public void setGameTime(GameTime gameTime) {
        this.gameTime = gameTime;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}