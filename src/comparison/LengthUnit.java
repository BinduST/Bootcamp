package comparison;

public enum LengthUnit implements Unit {
    INCH(1.0),
    FEET(12.0),
    CENTIMETER(0.4),
    MILLIMETER(0.04);

    private double baseFactor;

    LengthUnit(double baseFactor) {
        this.baseFactor = baseFactor;
    }


    @Override
    public Unit standardUnit() {
        return LengthUnit.INCH;
    }

    @Override
    public double getConversionFactor() {
        return this.baseFactor;
    }
}
