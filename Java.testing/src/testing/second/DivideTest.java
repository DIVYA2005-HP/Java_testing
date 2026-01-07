package testing.second;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	public void test() {
		Divide a=new Divide();
		int actual=a.divide(6, 3);
		int expectedResult=2;
		assertEquals(expectedResult, actual);
	}

}
