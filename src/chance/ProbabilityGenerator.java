package chance;

public class ProbabilityGenerator {
    private int favourableEvent;
    private int sampleSpace;

    public ProbabilityGenerator(int favourableEvent, int sampleSpace) {

        this.favourableEvent = favourableEvent;
        this.sampleSpace = sampleSpace;
    }

    public Chance getChanceToOccurOnceForSingleEvent() {
        double probability = (double) this.favourableEvent / (double) this.sampleSpace;
        return Chance.create(probability);
    }

    public Chance getChanceToNotOccurForSingleEvent() {
        return getChanceToOccurOnceForSingleEvent().not();
    }

    public Chance getChanceToNotOccurForMultipleEvent(int noOfEvents) {
        Chance chance = null;
        for (int i = 0; i < noOfEvents - 1; i++) {
            chance = getChanceToOccurOnceForSingleEvent().multiply(getChanceToOccurOnceForSingleEvent());
        }
        return chance;
    }


    public Chance getChanceToOccurAtLeastOnceForMultipleEvents(int noOfEvents) {
        Chance chance = null;
        for (int i = 0; i < noOfEvents - 1; i++) {
            chance = getChanceToNotOccurForSingleEvent().multiply(getChanceToNotOccurForSingleEvent()).not();
        }
        return chance;
    }
}
