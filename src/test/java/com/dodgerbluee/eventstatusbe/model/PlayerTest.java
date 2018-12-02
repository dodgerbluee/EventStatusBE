package com.dodgerbluee.eventstatusbe.model;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PlayerTest {

    @org.junit.Before
    public void setUp() {
    }

    @org.junit.Test
    public void buildPlayer() {
        assertThat(new Player("Greg", "Sanders", "5419799955", "35",
                "gregasanders91@gmail.com"),instanceOf(Player.class));
    }
}