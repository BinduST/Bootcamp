package chance;

import org.junit.Assert;
import org.junit.Test;

public class ProbabilityGeneratorTest {
    @Test
    public void probabilityGeneratorShouldGiveTheProbabilityOfGivenEvent() {
        ProbabilityGenerator probabilityGenerator = new ProbabilityGenerator(1, 2);
        Chance occurrenceOfOneEvent = probabilityGenerator.getChanceToOccurOnceForSingleEvent();
        Assert.assertEquals(Chance.create(0.5), occurrenceOfOneEvent);
    }

    @Test
    public void probabilityGeneratorShouldGiveTheProbabilityOfGivenEventInDice() {
        ProbabilityGenerator probabilityGenerator = new ProbabilityGenerator(1, 6);
        Chance occurrenceOfOneEvent = probabilityGenerator.getChanceToOccurOnceForSingleEvent();
        Assert.assertEquals(Chance.create(1d/6), occurrenceOfOneEvent);
    }


    @Test
    public void probabilityGeneratorShouldGiveTheNegateOfGetOccurrenceOfOneEvent() {
        ProbabilityGenerator probabilityGenerator = new ProbabilityGenerator(1, 2);
        Chance notOccurForSingleEvent = probabilityGenerator.getChanceToNotOccurForSingleEvent();
        Assert.assertEquals(Chance.create(0.5),notOccurForSingleEvent);
    }

    @Test
    public void getChanceToOccurOnceForMultipleEventShouldReturnTheProbabilityOfNotOccuringForMultipleEvent() {
        ProbabilityGenerator probabilityGenerator = new ProbabilityGenerator(1, 2);
        Chance occurForMultipleEvent = probabilityGenerator.getChanceToNotOccurForMultipleEvent(2);
        Assert.assertEquals(Chance.create(0.25),occurForMultipleEvent);
    }

    @Test
    public void getChanceToOccurAtleastOnceForMultipleEventsShouldGiveTheProbabilityToGetChanceToOccurAtleastOnce() {
        ProbabilityGenerator probabilityGenerator = new ProbabilityGenerator(1, 2);
        Chance forMultipleEvents = probabilityGenerator.getChanceToOccurAtLeastOnceForMultipleEvents(2);
        Assert.assertEquals(Chance.create(3d/4),forMultipleEvents);
    }
}