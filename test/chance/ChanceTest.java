package chance;

import org.junit.Assert;
import org.junit.Test;

public class ChanceTest {
    @Test
    public void getChanceToGetTail_should_return_the_probability_to_get_tail() {
        Chance coinToss = new Chance();
        double probability = coinToss.getChanceToGetTail();
        Assert.assertEquals(0.5,probability,0.0);
    }
}