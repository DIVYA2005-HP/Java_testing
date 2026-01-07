package java.testing2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class Calculatortest {

	@Test
	void test() {
		Calculator cal=new Calculator();
		Calci c=new Calci(cal);
		when(cal.add(3,4)).thenReturn(7);
		int result=c.sum(3, 4);
		
		assertEquals(7,result);
	}

}
