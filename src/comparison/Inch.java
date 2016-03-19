package comparison;

public class Inch implements Units {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    public Centimetre convertToCentimetre(double valueInInches) {
        return new Centimetre(valueInInches * 2.5);
    }

    @Override
    public boolean equals(Units o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return convertToCentimetre(this.value).equals(o);

        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

}
