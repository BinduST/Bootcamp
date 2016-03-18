package comparison;

import org.junit.Assert;
import org.junit.Test;

public class ComparisonTest {
    @Test
    public void compareShouldGiveTrueIfTwoDimensionsAreEqual() {
        Comparison feet = new Comparison(12);
        double inches = 12;
        Assert.assertEquals(true,feet.compare(inches));

    }
}