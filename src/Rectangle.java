public class Rectangle {
    private final Number length;
    private final Number breadth;

    public Rectangle(Number length, Number breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Number area() {
        return length.multiply(breadth);
    }

    public Number perimeter() {
        return length.add(breadth).multiply(new Number(2));
    }
}
