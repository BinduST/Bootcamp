package Wizard.holder;

import Wizard.Ball;
import Wizard.BallColor;

public class RedBallHolder extends BallHolder {
    public RedBallHolder(int limit, BallColor kindOfBall) {
        super(limit, kindOfBall);
    }

    @Override
    public void getNotified(Ball ball) {
        if (ball.isColor(BallColor.GREEN)) {
        }

    }
}
