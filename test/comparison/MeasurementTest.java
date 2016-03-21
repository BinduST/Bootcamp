package comparison;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MeasurementTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void _1_feet_should_equal_to_12_inches() throws IncomparableUnitException {
        Measurement _1ft = new Measurement(1.0, LengthUnit.FEET);
        Measurement _12inches = new Measurement(12.0, LengthUnit.INCH);
        Assert.assertEquals(true, _1ft.isEqualTo(_12inches));
    }

    @Test
    public void _2_feet_should_equal_to_24_inches() throws IncomparableUnitException {
        Measurement _2ft = new Measurement(2.0, LengthUnit.FEET);
        Measurement _24inches = new Measurement(24.0, LengthUnit.INCH);
        Assert.assertEquals(true, _2ft.isEqualTo(_24inches));
    }

    @Test
    public void _1ft_should_equal_1ft() throws IncomparableUnitException {
        Measurement _1ft = new Measurement(1.0, LengthUnit.FEET);
        Assert.assertEquals(true, _1ft.isEqualTo(_1ft));
    }

    @Test
    public void _1ft_does_not_equal_to_13inches() throws IncomparableUnitException {
        Measurement _1ft = new Measurement(1.0, LengthUnit.FEET);
        Measurement _13inches = new Measurement(13.0, LengthUnit.INCH);
        Assert.assertEquals(false, _1ft.isEqualTo(_13inches));
    }

    @Test
    public void _2inches_should_equal_to_5cm() throws IncomparableUnitException {
        Measurement _2inches = new Measurement(2.0, LengthUnit.INCH);
        Measurement _5cm = new Measurement(5.0, LengthUnit.CENTIMETER);

        Assert.assertEquals(true, _2inches.isEqualTo(_5cm));
    }

    @Test
    public void _1cm_should_equal_to_10mm() throws IncomparableUnitException {
        Measurement _1cm = new Measurement(1.0, LengthUnit.CENTIMETER);
        Measurement _10mm = new Measurement(10.0, LengthUnit.MILLIMETER);

        Assert.assertEquals(true, _1cm.isEqualTo(_10mm));
    }

    @Test
    public void _1gallon_should_equal_to_3point_78_litre() throws IncomparableUnitException {
        Measurement _1Gn = new Measurement(1.0, VolumeUnit.GALLON);
        Measurement _3point_78lt = new Measurement(3.78, VolumeUnit.LITRE);

        Assert.assertEquals(true, _1Gn.isEqualTo(_3point_78lt));
    }

    @Test
    public void _3Gn_should_equal_to_11point34ltrs() throws IncomparableUnitException {
        Measurement _3gn = new Measurement(3.0, VolumeUnit.GALLON);
        Measurement _11point_34ltrs = new Measurement(11.34, VolumeUnit.LITRE);

        Assert.assertEquals(true, _3gn.isEqualTo(_11point_34ltrs));
    }

    @Test
    public void _2inches_adds_to__2inches_and_gives_4inches() throws IncomparableUnitException {
        Measurement _2inches = new Measurement(2.0, LengthUnit.INCH);
        Measurement _4inches = new Measurement(4.0, LengthUnit.INCH);
        Measurement result = _2inches.add(_2inches);
        Assert.assertEquals(true, result.isEqualTo(_4inches));
    }

    @Test
    public void _2inches_adds_to_2point_5cm_and_gives_3inches() throws IncomparableUnitException {
        Measurement _2inches = new Measurement(2.0, LengthUnit.INCH);
        Measurement _3inches = new Measurement(3.0, LengthUnit.INCH);
        Measurement _2point5_cm = new Measurement(2.5, LengthUnit.CENTIMETER);
        Measurement result = _2inches.add(_2point5_cm);
        Assert.assertEquals(true, result.isEqualTo(_3inches));
    }

    @Test
    public void _1Gallon_adds_to_1liters_and_gives_4point_78litres() throws IncomparableUnitException {
        Measurement _1Gn = new Measurement(1.0, VolumeUnit.GALLON);
        Measurement _1ltr = new Measurement(1.0, VolumeUnit.LITRE);
        Measurement _4point78_ltrs = new Measurement(4.78, VolumeUnit.LITRE);
        Measurement result = _1Gn.add(_1ltr);

        Assert.assertEquals(true, result.isEqualTo(_4point78_ltrs));
    }

    @Test
    public void _1gallon_should_not_compare_with_1inch() throws IncomparableUnitException {
        Measurement _1Gn = new Measurement(1.0, VolumeUnit.GALLON);
        Measurement _1inch = new Measurement(1.0, LengthUnit.INCH);
        thrown.expect(IncomparableUnitException.class);
        thrown.expectMessage("Incomparable units");
        _1Gn.isEqualTo(_1inch);
    }

}