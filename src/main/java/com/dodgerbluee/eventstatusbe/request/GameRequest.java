package com.dodgerbluee.eventstatusbe.request;

import com.dodgerbluee.eventstatusbe.model.GameTime;
import com.dodgerbluee.eventstatusbe.model.Side;

public class GameRequest {
    private String date;
    private GameTime gameTime;
    private Side side;
    private String location;

    public GameRequest() {
    }

    public GameRequest(String date, GameTime gameTime, Side side, String location) {
        this.date = date;
        this.gameTime = gameTime;
        this.side = side;
        this.location = location;
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
