package Wizard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BallsTest {

    private Ball greenBall;
    private Ball redBall;
    private Ball yellowBall;
    private Ball blueBall;

    @Before
    public void setUp() throws Exception {
        greenBall = Ball.createGreenBall();
        redBall = Ball.createRedBall();
        yellowBall = Ball.createYellowBall();
        blueBall = Ball.createBlueBall();
    }

    @Test
    public void shouldAddABallToBalls() {
        Balls balls = new Balls();
        assertTrue(balls.add(greenBall));
        assertTrue(balls.add(blueBall));
        assertTrue(balls.add(greenBall));
        assertTrue(balls.add(redBall));
    }

    @Test
    public void shouldGiveCountOfEachBall() {
        Balls balls = new Balls();
        balls.add(greenBall);
        balls.add(redBall);
        balls.add(greenBall);
        balls.add(yellowBall);
        balls.add(blueBall);
        balls.add(redBall);

        Assert.assertEquals(2, balls.countOf(Color.GREEN));
        Assert.assertEquals(2, balls.countOf(Color.RED));
        Assert.assertEquals(1, balls.countOf(Color.YELLOW));
    }
}