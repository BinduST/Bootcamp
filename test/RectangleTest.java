import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testAreaShouldReturnAreaOfRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        double area = rectangle.area();
        Assert.assertEquals(6, area,0);
    }

    @Test
    public void testAreaShouldReturnPerimeterOfRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        double perimeter = rectangle.perimeter();
        Assert.assertEquals(10, perimeter,0);
    }
}