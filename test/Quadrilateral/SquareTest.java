package Quadrilateral;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void calculateArea_should_return_area_of_square() throws Exception {
        Square square = Square.createSquare(3);
        double area = square.calculateArea();
        assertEquals(area, 9, 0.0);
    }

    @Test
    public void calculatePerimeter_should_return_perimeter_of_square() throws Exception {
        Square square = Square.createSquare(3);
        double perimeter = square.calculatePerimeter();
        assertEquals(perimeter, 12, 0.0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createSquareThrowsExceptionIfSideIsZero() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage("Expected positive number, but actual is 0.0");
        Square.createSquare(0);
    }

    @Test
    public void createSquareThrowsExceptionIfSideIsNegative() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage("Expected positive number, but actual is -2.0");
        Square.createSquare(-2);
    }

}