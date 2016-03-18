package comparison;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {
    @Test
    public void aLengthShouldBeEqualToItself() {
        Length length = new Length(5);
        Assert.assertEquals(length,length);
    }

    @Test
    public void shouldAddTwoValidLengths() {
        Length length1 = new Length(2);
        Length length2 = new Length(3);
        Length sum = length1.add(length2);
        Assert.assertEquals(sum,(new Length(5)));
    }
}