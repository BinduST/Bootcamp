package chance;

import org.junit.Assert;
import org.junit.Test;

public class ChanceTest {
    @Test
    public void getChanceToGetTail_should_return_the_probability_to_get_tail() {
        Chance coinToss = new Chance();
        int noOfCoins = 1;
        double probability = coinToss.getChanceToGetTail(noOfCoins);
        Assert.assertEquals(0.5, probability, 0.0);
    }

    @Test
    public void getChanceTNotoGetTail_should_return_the_probability_to_get_tail() {
        Chance coinToss = new Chance();
        int noOfCoins = 1;
        double probability = coinToss.getChanceToNotGetTail(noOfCoins);
        Assert.assertEquals(0.5, probability, 0.0);
    }

    @Test
    public void getChanceToGetTail_should_return_the_probability_to_get_tails_for_2_coins() {
        Chance coinToss = new Chance();
        int noOfCoins = 2;
        double probability = coinToss.getChanceToGetTail(noOfCoins);
        Assert.assertEquals(0.25, probability, 0.0);
    }

    @Test
    public void getChanceTNotoGetTail_should_return_the_probability_to_get_tails_for_2_coins() {
        Chance coinToss = new Chance();
        int noOfCoins = 2;
        double probability = coinToss.getChanceToNotGetTail(noOfCoins);
        Assert.assertEquals(0.75, probability, 0.0);
    }
}