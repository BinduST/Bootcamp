//package Wizard;
//
//import Wizard.holder.BallHolder;
//import org.hamcrest.CoreMatchers;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
//public class BallHolderTest {
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void shouldHoldBallsUptoGivenCount() throws InvalidEntryException {
//        BallHolder redBallHolder = new BallHolder(3, BallColor.RED);
//        Assert.assertTrue(redBallHolder.canAccomodate());
//        redBallHolder.add(new Ball(BallColor.RED));
//        redBallHolder.add(new Ball(BallColor.RED));
//        redBallHolder.add(new Ball(BallColor.RED));
//
//        Assert.assertFalse(redBallHolder.canAccomodate());
//    }
//
//    @Test
//    public void shouldAllowOnlyOneKindOfBall() throws InvalidEntryException {
//        BallHolder greenBallHolder = new BallHolder(2, BallColor.GREEN);
//        greenBallHolder.add(new Ball(BallColor.GREEN));
//        thrown.expect(InvalidEntryException.class);
//        thrown.expectMessage(CoreMatchers.is("Not allowed"));
//        greenBallHolder.add(new Ball(BallColor.RED));
//
//    }
//}