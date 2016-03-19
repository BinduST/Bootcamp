package comparison;


public class Millimetre implements Units {
    private double value;

    public Millimetre(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Units unit) {
        if (unit.getClass() != getClass()) return false;
        Millimetre mm = (Millimetre) unit;
        return Double.compare(mm.value, value) == 0;
    }
}
