package comparison;

public class Comparison {
    private double length;

    public Comparison(double length) {

        this.length = length;
    }

    public boolean compare(double otherLength) {
        return this.length == otherLength;
    }
}
