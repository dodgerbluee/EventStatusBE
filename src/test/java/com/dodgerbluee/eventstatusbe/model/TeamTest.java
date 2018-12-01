package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class TeamTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getId() {
        assertThat(new Team("Change Ups", TeamType.MENS), instanceOf(Team.class));
    }
}