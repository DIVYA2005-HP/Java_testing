package testing.first;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {

    @Test
    public void test() {
        Add a = new Add();
        int actual = a.sum(2, 3);
        int expectedResult = 5;

        assertEquals(expectedResult, actual);
    }
}
