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
        Bag bag = new Bag();
        Assert.assertTrue(bag.add(new Ball(BallColor.GREEN)));
    }

    @Test
    public void addThrowsExceptionWhenBagIsFull() throws InvalidEntryException {
        Bag bag = new Bag();
        for (int i = 0; i < 10; i++) {
            bag.add(new Ball(BallColor.BLUE));
        }
        Assert.assertTrue(bag.add(new Ball(BallColor.GREEN)));
        Assert.assertTrue(bag.add(new Ball(BallColor.GREEN)));
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Bag is Full"));
        bag.add(new Ball(BallColor.GREEN));
    }

    @Test
    public void bagShouldAllowOnly3GreenBalls() throws InvalidEntryException {
        Bag bag = new Bag();
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.GREEN));
        bag.add(new Ball(BallColor.GREEN));
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Only 3 green balls are allowed"));
        bag.add(new Ball(BallColor.GREEN));
    }

    @Test
    public void bagShouldPreventAddingDoubleTheNoOfRedBallsThanGreenBalls() throws InvalidEntryException {
        Bag bag = new Bag();
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
    public void bagShouldPreventAddingRedBallAtTheBeginning() throws InvalidEntryException {
        Bag bag = new Bag();
        thrown.expect(InvalidEntryException.class);
        thrown.expectMessage(CoreMatchers.is("Not allowed"));
        bag.add(new Ball(BallColor.RED));
    }
}