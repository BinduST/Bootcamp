package Wizard.holder;

import Wizard.Ball;
import Wizard.BallColor;
import Wizard.InvalidEntryException;

import java.util.ArrayList;
import java.util.List;

public abstract class BallHolder {
    private int limit;
    private BallColor kindOfBall;
    private int count;
    private List<Ball> ballHolder = new ArrayList<>();

    public BallHolder(int limit, BallColor kindOfBall) {
        this.limit = limit;
        this.kindOfBall = kindOfBall;
        this.count = 0;
    }


    public boolean canAccomodate() {
        return count < limit;
    }

    public void add(Ball ball) throws InvalidEntryException {
        if (!canAccomodate() || !ball.isColor(kindOfBall))
            throw new InvalidEntryException("Not allowed");
        ballHolder.add(ball);
        count++;
    }

    public abstract void getNotified(Ball ball);

//    protected void incrementLimit();
}
