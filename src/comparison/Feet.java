package comparison;

public class Feet implements Units {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public Inch convertToInch(double value) {
        return new Inch(this.value * 12);
    }

    @Override
    public boolean equals(Units unit) {
        if (unit.getClass() == getClass())
            return true;
        return convertToInch(this.value).equals(unit);
    }
}
