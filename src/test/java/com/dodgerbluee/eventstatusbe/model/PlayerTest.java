package model;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void buildPlayer() {
        assertThat(new Player("Greg", "Sanders", "5419799955", "35",
                        "gregasanders91@gmail.com", Status.UNANSWERED),
                instanceOf(Player.class));
    }
}