package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class SeasonTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getId() {
        assertThat(new Season(SeasonType.SPRING, "2019"), instanceOf(Season.class));
    }
}