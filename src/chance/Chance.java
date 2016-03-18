
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

    //------------------------------------------- operations ---------------------------

    @Override
    public boolean equals(Object otherChance) {
        if (this == otherChance) return true;
        if (otherChance == null || getClass() != otherChance.getClass()) return false;

        Chance chance = (Chance) otherChance;
        System.out.println("chance = " + chance.value + "-----" + value);
        return Double.compare(chance.value, value) == 0;

    }

    private Chance not() {
        return new Chance(1 - value);
    }

    private Chance and(Chance otherChance) {
        double product = otherChance.value * value;
        System.out.println("product = " + product);
        return Chance.create(product);
    }

    // ---------------------------- occurrences ------------------------------------

    public Chance getChanceToOccurOnceForSingleEvent() {
        return Chance.create(value);
    }

    public Chance getChanceToNotOccurForSingleEvent() {

        return getChanceToOccurOnceForSingleEvent().not();
    }

    public Chance getChanceToNotOccurForMultipleEvent(int noOfEvents) {
        Chance chance = null;
        for (int i = 0; i < noOfEvents - 1; i++) {
            chance = getChanceToOccurOnceForSingleEvent().and(getChanceToOccurOnceForSingleEvent());
        }
        return chance;
    }


    public Chance getChanceToOccurAtLeastOnceForMultipleEvents(int noOfEvents) {
        Chance chance = Chance.create(1);
        for (int i = 0; i < noOfEvents - 1; i++) {
            chance = getChanceToNotOccurForSingleEvent().not();
        }
        return chance;
    }
}