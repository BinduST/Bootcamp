import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testAreaShouldReturnAreaOfRectangle() throws Exception {
        Number length = new Number(10);
        Number breadth = new Number(15);
        Rectangle rectangle = new Rectangle(length, breadth);

        Number area = rectangle.area();
        Number expectedArea = new Number(150);

        Assert.assertTrue(area.equals(expectedArea));
    }

    @Test
    public void testAreaShouldReturnPerimeterOfRectangle() throws Exception {
        Number length = new Number(10);
        Number breadth = new Number(15);
        Rectangle rectangle = new Rectangle(length, breadth);

        Number perimeter = rectangle.perimeter();
        Number expectedPerimeter = new Number(50);

        Assert.assertTrue(perimeter.equals(expectedPerimeter));
    }
}