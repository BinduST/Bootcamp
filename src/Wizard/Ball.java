package Wizard;

public class Ball {
    private BallColor color;

    public Ball(BallColor color) {
        this.color = color;
    }

    public boolean isColor(BallColor color){
        return this.color==color;
    }
}
