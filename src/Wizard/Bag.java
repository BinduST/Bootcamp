/*
    Job:-
        Add upto 12 balls
 */

package Wizard;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List bag = new ArrayList();
    private int ballLimit = 12;

    private int greenBallLimit = 3;
    private int noOfGreenBall = 0;

    private int noOfRedBalls = 0;
    private int redBallLimit = 0;

    public boolean add(Ball ball) throws InvalidEntryException {
        if (ballLimit > 0) {
            checkValidation(ball);
            bag.add(ball);
            ballLimit--;
            return true;
        }
        throw new InvalidEntryException("Bag is Full");
    }

    private void checkValidation(Ball ball) throws InvalidEntryException {
        if (ball.isColor(BallColor.GREEN)) {
            noOfGreenBall++;
            redBallLimit = noOfGreenBall * 2;
        }
        if (noOfGreenBall > greenBallLimit)
            throw new InvalidEntryException("Only 3 green balls are allowed");

        if (noOfRedBalls >= redBallLimit) {
            throw new InvalidEntryException("Not allowed");
        }
        if (ball.isColor(BallColor.RED)) {
            noOfRedBalls++;
        }

    }
}