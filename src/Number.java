public class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public Number multiply(Number breadth) {
        return new Number(number * breadth.number);
    }

    public Number add(Number breadth) {
        return new Number(number + breadth.number);
    }


    public boolean equals(Number other) {
        return number == other.number;
    }
}
