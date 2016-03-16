import org.junit.Assert;
import org.junit.Test;

public class NumberTest {
    @Test
    public void testMultiplyShouldMultiplyTheNumberWithSpecifiedNumber() throws Exception {
        Number two = new Number(2);
        Number four = new Number(4);
        Number eight = new Number(8);
        Assert.assertTrue(eight.equals(two.multiply(four)));
    }

    @Test
    public void testAddShouldAddTheNumberWithSpecifiedNumber() throws Exception {
        Number two = new Number(2);
        Number four = new Number(4);
        Number six = new Number(6);
        Assert.assertTrue(six.equals(two.add(four)));
    }

    @Test
    public void testEqualsShouldReturnTrueIfTwoNumbersAreEqual() throws Exception {
        Number two = new Number(2);
        Assert.assertTrue(two.equals(two));
    }

    @Test
    public void testEqualsShouldReturnFalseIfTwoNumbersAreNotEqual() throws Exception {
        Number two = new Number(2);
        Number three = new Number(3);
        Assert.assertFalse(two.equals(three));
    }
}