package Quadrilateral;

public class Square extends Rectangle {

    private Square(double side) {
        super(side, side);
    }

    public static Square createSquare(double side) {
        if (side <= 0)
            throw new NonPositiveArgumentException(side);
        new Rectangle(-4,-9);
        return new Square(side);
    }
}
