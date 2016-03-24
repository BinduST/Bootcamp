package Wizard;

import java.util.ArrayList;

public class Balls {

    private ArrayList<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
    }

    public boolean add(Ball ball) {
        return balls.add(ball);
    }

    public int size() {
        return balls.size();
    }

    public int countOf(Color color) {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.isOfColor(color))
                count++;
        }
        return count;
    }
}
