package comparison;

public class Measurement {

    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean isEqualTo(Measurement otherMeasurement) throws IncomparableUnitException {
        if(this.unit.getClass()!=otherMeasurement.unit.getClass())
            throw new IncomparableUnitException();
        return equals(otherMeasurement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        Measurement toCompare = that.convertToBase(unit);
        return Double.compare(value, toCompare.value) == 0 && unit == toCompare.unit;

    }

    private Measurement convertToBase(Unit unit) {
        Measurement standard = getStandard();
        double convertedValue = standard.value / unit.getConversionFactor();
        return new Measurement(convertedValue, unit);
    }

    private Measurement getStandard() {
        double newValue = this.value * this.unit.getConversionFactor();
        Unit newUnit = unit.standardUnit();
        return new Measurement(newValue, newUnit);
    }

    public Measurement add(Measurement otherMeasurement) {
        Measurement convertedMeasurement = otherMeasurement.convertToBase(unit);
        double newValue = (this.value+convertedMeasurement.value) *10 *0.1;
        return new Measurement(newValue, unit);
    }
}
