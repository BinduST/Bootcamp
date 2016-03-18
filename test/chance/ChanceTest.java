package chance;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChanceTest {
    @Rule
    public ExpectedException thrown  = ExpectedException.none();

    @Test
    public void chance_should_take_the_value_between_0_and_1() {
        Chance chance = Chance.create(0.5);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The value should be between 0 and 1, but actual is 1.2");
        Chance.create(1.2);
    }


    @Test
    public void getChanceToOccurOnceForSingleEventShouldGiveTheChanceToOccurOnceForSingleEvent() {
        Chance chance = Chance.create(0.5);
        Chance occurrenceOfOneEvent = chance.getChanceToOccurOnceForSingleEvent();
        Assert.assertEquals(Chance.create(0.5), occurrenceOfOneEvent);
    }

    @Test
    public void getChanceToOccurOnceForSingleEventShouldGiveTheProbabilityOfGivenEventInDice() {
        Chance chance = Chance.create(1d/6);
        Chance occurrenceOfOneEvent = chance.getChanceToOccurOnceForSingleEvent();
        Assert.assertEquals(Chance.create(1d/6), occurrenceOfOneEvent);
    }


    @Test
    public void getChanceToNotOccurForSingleEventShouldGiveTheNegateOfGetOccurrenceOfOneEvent() {
        Chance chance = Chance.create(0.5);
        Chance notOccurForSingleEvent = chance.getChanceToNotOccurForSingleEvent();
        Assert.assertEquals(Chance.create(0.5),notOccurForSingleEvent);
    }

    @Test
    public void getChanceToOccurOnceForMultipleEventShouldReturnTheProbabilityOfNotOccuringForMultipleEvent() {
        Chance chance = Chance.create(0.5);
        Chance occurForMultipleEvent = chance.getChanceToNotOccurForMultipleEvent(2);
        Assert.assertEquals(Chance.create(0.25),occurForMultipleEvent);
    }

    @Test
    public void getChanceToOccurAtleastOnceForMultipleEventsShouldGiveTheProbabilityToGetChanceToOccurAtleastOnce() {
        Chance chance = Chance.create(0.5);
        Chance forMultipleEvents = chance.getChanceToOccurAtLeastOnceForMultipleEvents(2);
        Assert.assertEquals(Chance.create(3d/4),forMultipleEvents);
    }
    @Test
    public void getChanceToOccurAtleastOnceFor3EventsShouldGiveTheProbabilityToGetChanceToOccurAtleastOnce() {
        Chance chance = Chance.create(0.5);
        Chance forMultipleEvents = chance.getChanceToOccurAtLeastOnceForMultipleEvents(3);
        Assert.assertEquals(Chance.create(8d/9),forMultipleEvents);
    }
}