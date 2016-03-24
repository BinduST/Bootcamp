package Parking;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void carShouldBeSameAsItself() {
        Car car = new Car();
        Assert.assertEquals(car, car);
    }
}