package comparison;


public class Centimetre implements Units {
    private double value;

    public Centimetre(double value) {
        this.value = value;
    }

    public Millimetre convertToMillimetres(double valueInCm){
        return new Millimetre(valueInCm * 10);
    }

    @Override
    public boolean equals(Units unit) {
        if (unit.getClass() != getClass())
            return convertToMillimetres(this.value).equals(unit);

        Centimetre cm = (Centimetre) unit;
        return Double.compare(cm.value, value) == 0;
    }
}
