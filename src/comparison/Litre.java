package comparison;


public class Litre implements Units {
    private final double value;

    public Litre(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Units unit) {
        if (unit.getClass() != getClass()) return false;
        Litre liter = (Litre) unit;
        return Double.compare(liter.value, value) == 0;
    }
}
