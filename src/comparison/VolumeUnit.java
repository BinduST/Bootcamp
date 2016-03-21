package comparison;

public enum VolumeUnit implements Unit {
    LITRE(1.0),
    GALLON(3.78);

    private double baseFactor;

    VolumeUnit(double baseFactor) {

        this.baseFactor = baseFactor;
    }

    @Override
    public Unit standardUnit() {
        return VolumeUnit.LITRE;
    }

    @Override
    public double getConversionFactor() {
        return baseFactor;
    }
}
