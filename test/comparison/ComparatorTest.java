package comparison;

import org.junit.Assert;
import org.junit.Test;


public class ComparatorTest {
    @Test
    public void compareShouldGiveTrueIfTwoDimensionsAreEqual() {
        Length oneFeet = new Feet(1);
        Length twelveInches = new Inch(12);

        RelationShip relationShip = new RelationShip(oneFeet, twelveInches);
        Comparator comparator = new Comparator(relationShip);

        Assert.assertEquals(true, comparator.compare(oneFeet, twelveInches));

    }

    @Test
    public void shouldGiveTrueWhenOneFeetEqualsToOneFeet() {
        Length oneFeet = new Feet(1);

        RelationShip relationShip = new RelationShip(oneFeet, oneFeet);

        Comparator comparator = new Comparator(relationShip);
        Assert.assertEquals(true, comparator.compare(oneFeet, oneFeet));
    }

    @Test
    public void shouldReturnFalseWhenOneFeetNotEqualToThirteenInches() {
        Length oneFeet = new Feet(1);
        Length thirteenInches = new Inch(13);
        Length twelveInches = new Inch(12);

        RelationShip relationShip = new RelationShip(oneFeet, twelveInches);

        Comparator comparator = new Comparator(relationShip);
        Assert.assertEquals(false, comparator.compare(oneFeet, thirteenInches));
    }

    @Test
    public void twoInchesShouldBeEqualToFiveCentimetres() {
        Length twoInches = new Inch(2);
        Length fiveCentimetres = new Centimetre(5);
        RelationShip relationShip = new RelationShip(new Inch(1), new Centimetre(2.5));

        Comparator comparator = new Comparator(relationShip);
        Assert.assertEquals(false, comparator.compare(twoInches, fiveCentimetres));

    }

    @Test
    public void oneCentimetreShouldEqualToTenMM() {
        Length twoInches = new Centimetre(1);
        Length fiveCentimetres = new Millimetre(10);
        RelationShip relationShip = new RelationShip(new Centimetre(1), new Millimetre(10));

        Comparator comparator = new Comparator(relationShip);
        Assert.assertEquals(true, comparator.compare(twoInches, fiveCentimetres));

    }

    @Test
    public void oneGallonShouldBeEqualToLitres() {
        Length oneGallon = new Gallon(1);
        Length litre = new Litre(3.78);
        RelationShip relationShip = new RelationShip(new Gallon(1), new Litre(3.78));

        Comparator comparator = new Comparator(relationShip);
        Assert.assertEquals(true, comparator.compare(oneGallon, litre));

    }

//    @Test
//    public void threeGallonShouldBeEqualTo11Point34Litres() {
//        Length threeGallons = new Gallon(3);
//        Length litres = new Litre(11.34);
//        RelationShip relationShip = new RelationShip(new Gallon(1), new Litre(3.78));
//
//        Comparator comparator = new Comparator(relationShip);
//        Assert.assertEquals(true, comparator.compare(threeGallons, litres));
//
//    }
}