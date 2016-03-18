package comparison;

import org.junit.Assert;
import org.junit.Test;

public class InchTest {
    @Test
    public void shouldAddTwoInchesAndGiveResultInInches() {
        Length threeInches = new Inch(3);
        Length fourInches = new Inch(4);
        Length sum = threeInches.add(fourInches);
        Assert.assertEquals(true, sum.equals(new Inch(7)));
    }
}