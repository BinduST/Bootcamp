package chance;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChanceTest {
    @Rule
    public ExpectedException thrown  = ExpectedException.none();

    @Test
    public void chance_should_take_the_value_between_0_and_1() {
        Chance chance = Chance.create(0.5);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The value should be between 0 and 1, but actual is 1.2");
        Chance.create(1.2);
    }
}