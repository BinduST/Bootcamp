
/*
    Job:-
        Given the probability class should be able to give chance of occurrence of the event(s)
 */
package chance;

public class Chance {
    private double value;

    private Chance(double value) {
        this.value = value;
    }


    public static Chance create(double value) {
        if (value < 0 || value > 1)
            throw new IllegalArgumentException("The value should be between 0 and 1, but actual is " + value);
        return new Chance(value);
    }

    @Override
    public boolean equals(Object otherChance) {
        if (this == otherChance) return true;
        if (otherChance == null || getClass() != otherChance.getClass()) return false;

        Chance chance = (Chance) otherChance;
        return Double.compare(chance.value, value) == 0;

    }

    public Chance not() {
        return new Chance(1 - value);
    }

    public Chance multiply(Chance otherChance) {
        double product = otherChance.value * value;
        return Chance.create(product);
    }
}
