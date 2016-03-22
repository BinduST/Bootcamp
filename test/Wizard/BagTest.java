package Wizard;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addCanAddABallToBag() throws InvalidEntryException {
        Bag bag = new Bag(1);
        Assert.assertTrue(bag.add(new Ball(BallColor.GREEN)));
    }

    @Test
    public void addThrowsExceptionWhenBagIsFull() throws InvalidEntryException {
        Bag bag = new Bag(1);
        bag.add(new Ball(BallColor.BLUE));
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Bag is Full"));
        bag.add(new Ball(BallColor.GREEN));
    }

    @Test
    public void bagShouldAllowOnly3GreenBalls() throws InvalidEntryException {
        Bag bag = new Bag(12);
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.GREEN));
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Not allowed"));
        bag.add(new Ball(BallColor.GREEN));
    }

    @Test
    public void bagShouldPreventAddingDoubleTheNoOfRedBallsThanGreenBalls() throws InvalidEntryException {
        Bag bag = new Bag(12);
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.RED));
        bag.add(new Ball(BallColor.RED));
        bag.add(new Ball(BallColor.RED));
        bag.add(new Ball(BallColor.RED));
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Not allowed"));
        bag.add(new Ball(BallColor.RED));
    }

    @Test
    public void bagShouldPreventAddingRedBallBeforeAGreenBall() throws InvalidEntryException {
        Bag bag = new Bag(12);
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Not allowed"));
        bag.add(new Ball(BallColor.RED));
    }

    @Test
    public void shouldAllowYellowBallsTo40percentOfTotalBalls() throws InvalidEntryException {
        Bag bag = new Bag(12);
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.BLUE));
        bag.add(new Ball(BallColor.BLUE));
        bag.add(new Ball(BallColor.YELLOW));
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Not allowed"));
        bag.add(new Ball(BallColor.YELLOW));

    }

//    @Test
//    public void shouldGiveTheSummaryOfBag() throws InvalidEntryException {
//        Bag bag = new Bag();
//        bag.add(new Ball(BallColor.GREEN));
//        bag.add(new Ball(BallColor.GREEN));
//        bag.add(new Ball(BallColor.BLUE));
//        bag.add(new Ball(BallColor.BLUE));
//        bag.add(new Ball(BallColor.YELLOW));
//        bag.add(new Ball(BallColor.YELLOW));
//        String expected = "BAG: 6 BALLS\nGREEN: 2\nRED: 2\nYELLOW: 2";
//        Assert.assertEquals(expected,bag.getSummary(new BallCountFormatter()));
//
//    }
}