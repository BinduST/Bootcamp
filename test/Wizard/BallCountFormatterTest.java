package Wizard;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BallCountFormatterTest {
    @Test
    public void shoudRepresentTheDataWithTheGivenCount() {
        ArrayList<Pair> counts = new ArrayList<>();
        counts.add(new Pair("BAG",6));
        counts.add(new Pair("GREEN",2));
        counts.add(new Pair("RED",2));
        counts.add(new Pair("YELLOW",2));

        String expected = "BAG: 6\nGREEN: 2\nRED: 2\nYELLOW: 2";
        assertEquals(expected, new BallCountFormatter().format(counts));

    }
}