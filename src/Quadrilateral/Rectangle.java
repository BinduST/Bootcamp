/*
    Job :-
        Calculation and behavior related to properties of a quadrilateral
 */
package Quadrilateral;

public class Rectangle {
    private final double length;
    private final double breadth;

    protected Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(double length, double breadth) {
        if (length <= 0)
            throw new NonPositiveArgumentException(length);
        if (breadth <= 0)
            throw new NonPositiveArgumentException(breadth);
        return new Rectangle(length, breadth);
    }

    public double calculateArea() {


        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
