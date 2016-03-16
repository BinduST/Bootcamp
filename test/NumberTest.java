import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    @Test
    public void testValueShouldReturnIntegerRepresentationOfNumber() throws Exception {
        Number number = new Number(1);
        assertEquals(1,number.value());
    }
}