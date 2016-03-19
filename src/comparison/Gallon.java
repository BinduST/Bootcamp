package comparison;


public class Gallon implements Units {
    private final double value;

    public Gallon(double value) {
        this.value = value;
    }

    public Litre convertToLitre(double value) {
        return new Litre(3.78 * value);
    }

    @Override
    public boolean equals(Units unit) {
        if (unit.getClass() != getClass())
            return convertToLitre(this.value).equals(unit);
        Gallon gallon = (Gallon) unit;
        return Double.compare(gallon.value, value) == 0;
    }
}
