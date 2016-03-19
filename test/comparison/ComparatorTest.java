package comparison;

import org.junit.Assert;
import org.junit.Test;


public class ComparatorTest {
    @Test
    public void compareShouldGiveTrueIfTwoDimensionsAreEqual() {
        Units oneFeet = new Feet(1);
        Units twelveInches = new Inch(12);

        Comparator comparator = new Comparator(oneFeet,twelveInches);

        Assert.assertEquals(true, comparator.compare());

    }

    @Test
    public void shouldGiveTrueWhenOneFeetEqualsToOneFeet() {
        Units oneFeet = new Feet(1);


        Comparator comparator = new Comparator(oneFeet, oneFeet);
        Assert.assertEquals(true, comparator.compare());
    }

    @Test
    public void shouldReturnFalseWhenOneFeetNotEqualToThirteenInches() {
        Units oneFeet = new Feet(1);
        Units thirteenInches = new Inch(13);

        Comparator comparator = new Comparator(oneFeet, thirteenInches);
        Assert.assertEquals(false, comparator.compare());
    }

    @Test
    public void twoInchesShouldBeEqualToFiveCentimetres() {
        Units twoInches = new Inch(2);
        Units fiveCentimetres = new Centimetre(5);

        Comparator comparator = new Comparator(twoInches, fiveCentimetres);
        Assert.assertEquals(true, comparator.compare());

    }

    @Test
    public void oneCentimetreShouldEqualToTenMM() {
        Units oneCentimetre = new Centimetre(1);
        Units tenMillimetres = new Millimetre(10);

        Comparator comparator = new Comparator(oneCentimetre, tenMillimetres);
        Assert.assertEquals(true, comparator.compare());

    }

    @Test
    public void oneGallonShouldBeEqualToLitres() {
        Units oneGallon = new Gallon(1);
        Units litre = new Litre(3.78);

        Comparator comparator = new Comparator(oneGallon,litre);
        Assert.assertEquals(true, comparator.compare());

    }

    @Test
    public void threeGallonShouldBeEqualTo11Point34Litres() {
        Units threeGallons = new Gallon(3);
        Units litres = new Litre(11.34);

        Comparator comparator = new Comparator(threeGallons,litres);
        Assert.assertEquals(true, comparator.compare());

    }
}