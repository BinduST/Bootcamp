public class Rectangle {
    private final Number length;
    private final Number breadth;

    public Rectangle(Number length, Number breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Number area() {
        int area = length.value() * breadth.value();
        return new Number(area);
    }
}
