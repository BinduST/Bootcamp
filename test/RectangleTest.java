
/*
Job:
   Test behaviour of Rectangle class
 */

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RectangleTest {

    @Test
    public void calculateArea_should_return_area_of_rectangle() throws Exception {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double area = rectangle.calculateArea();
        Assert.assertEquals(6, area, 0);
    }

    @Test
    public void calculatePerimeter_should_return_perimeter_of_rectangle() throws Exception {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(10, perimeter, 0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createRectangleThrowsExceptionIfLengthIsZero() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage("Expected positive number, but actual is 0.0");
        Rectangle rectangle = Rectangle.createRectangle(0, 5);

    }
    @Test
    public void createRectangleThrowsExceptionIfBreadthIsZero() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage("Expected positive number, but actual is 0.0");
        Rectangle rectangle = Rectangle.createRectangle(1, 0);
    }
    @Test
    public void createRectangleThrowsExceptionIfBreadthIsNegative() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.is("Expected positive number, but actual is -4.0"));
        Rectangle rectangle = Rectangle.createRectangle(4, -4);
    }
    @Test
    public void createRectangleThrowsExceptionIfLengthIsNegative() throws Exception {
        thrown.expect(NonPositiveArgumentException.class);
        thrown.expectMessage(CoreMatchers.is("Expected positive number, but actual is -1.0"));
        Rectangle rectangle = Rectangle.createRectangle(-1, 6);
    }

}