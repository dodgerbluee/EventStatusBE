package com.dodgerbluee.eventstatusbe.model;

public enum GameTime {
    SEVEN("7P"),
    EIGHT("8P"),
    NINE("9P");

    private final String time;

    GameTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
