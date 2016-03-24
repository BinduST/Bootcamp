//package Wizard;
//
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
//public class BagTest {
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void addCanAddABallToBag() throws InvalidEntryException {
//        Rules rules = new Rules();
//        Bag bag = new Bag(1, rules);
//        rules.add(new GreenBallRule(3));
//
//        Ball ball = new Ball(Color.GREEN);
//
//        Balls balls = new Balls(ball);
//        Assert.assertTrue(bag.add(ball));
//    }
//
////    @Test
////    public void addThrowsExceptionWhenBagIsFull() throws InvalidEntryException {
////        Bag bag = new Bag(1, rules);
////        bag.add(new Ball(Color.BLUE));
////        thrown.expect(InvalidEntryException.class);
////        thrown.expectMessage(CoreMatchers.is("Bag is Full"));
////        bag.add(new Ball(Color.GREEN));
////    }
////
////    @Test
////    public void bagShouldAllowOnly3GreenBalls() throws InvalidEntryException {
////        Bag bag = new Bag(12, rules);
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.GREEN));
////        thrown.expect(InvalidEntryException.class);
////        thrown.expectMessage(CoreMatchers.is("Not allowed"));
////        bag.add(new Ball(Color.GREEN));
////    }
////
////    @Test
////    public void bagShouldPreventAddingDoubleTheNoOfRedBallsThanGreenBalls() throws InvalidEntryException {
////        Bag bag = new Bag(12, rules);
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.RED));
////        bag.add(new Ball(Color.RED));
////        bag.add(new Ball(Color.RED));
////        bag.add(new Ball(Color.RED));
////        thrown.expect(InvalidEntryException.class);
////        thrown.expectMessage(CoreMatchers.is("Not allowed"));
////        bag.add(new Ball(Color.RED));
////    }
////
////    @Test
////    public void bagShouldPreventAddingRedBallBeforeAGreenBall() throws InvalidEntryException {
////        Bag bag = new Bag(12, rules);
////        thrown.expect(InvalidEntryException.class);
////        thrown.expectMessage(CoreMatchers.is("Not allowed"));
////        bag.add(new Ball(Color.RED));
////    }
////
////    @Test
////    public void shouldAllowYellowBallsTo40percentOfTotalBalls() throws InvalidEntryException {
////        Bag bag = new Bag(12, rules);
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.BLUE));
////        bag.add(new Ball(Color.BLUE));
////        bag.add(new Ball(Color.YELLOW));
////        thrown.expect(InvalidEntryException.class);
////        thrown.expectMessage(CoreMatchers.is("Not allowed"));
////        bag.add(new Ball(Color.YELLOW));
////
////    }
//
////    @Test
////    public void shouldGiveTheSummaryOfBag() throws InvalidEntryException {
////        Bag bag = new Bag();
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.GREEN));
////        bag.add(new Ball(Color.BLUE));
////        bag.add(new Ball(Color.BLUE));
////        bag.add(new Ball(Color.YELLOW));
////        bag.add(new Ball(Color.YELLOW));
////        String expected = "BAG: 6 BALLS\nGREEN: 2\nRED: 2\nYELLOW: 2";
////        Assert.assertEquals(expected,bag.getSummary(new BallCountFormatter()));
////
////    }
//}