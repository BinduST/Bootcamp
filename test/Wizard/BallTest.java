package Wizard;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BallTest {
    @Test
    public void shouldGiveAGreenBallWhenCreateGreenBallIsCalled() {
        Ball greenBall = Ball.createGreenBall();
        assertTrue(greenBall.isOfColor(Color.GREEN));
    }

    @Test
    public void shouldGiveARedBallWhenCreateRedBallIsCalled() {
        Ball redBall = Ball.createRedBall();
        assertTrue(redBall.isOfColor(Color.RED));
    }

    @Test

    public void shouldGiveABlueBallWhenCreateBlueBallIsCalled() {
        Ball blueBall = Ball.createBlueBall();
        assertTrue(blueBall.isOfColor(Color.BLUE));
    }

    @Test
    public void shouldGiveAYellowBallWhenCreateYellowBallIsCalled() {
        Ball yellowBall = Ball.createYellowBall();
        assertTrue(yellowBall.isOfColor(Color.YELLOW));
    }
}