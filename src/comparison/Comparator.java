package comparison;

public class Comparator {

    private Units firstUnit;
    private Units secondUnit;

    public Comparator(Units firstUnit, Units secondUnit) {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
    }

    public boolean compare() {
        return firstUnit.equals(secondUnit);
    }


}
