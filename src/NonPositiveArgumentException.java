public class NonPositiveArgumentException extends RuntimeException {
    private double actual;

    public NonPositiveArgumentException(double actual) {
        this.actual = actual;
    }

    @Override
    public String getMessage() {
        String message = String.format("Expected positive number, but actual is %s", actual);
        return message;
    }
}
