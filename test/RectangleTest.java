import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testAreaShouldReturnAreaOfRectangle() throws Exception {
        Number length = new Number(10);
        Number breadth = new Number(15);
        Rectangle rectangle = new Rectangle(length, breadth);
        Number area = rectangle.area();
        Assert.assertEquals(area.value(), 150);
    }
}