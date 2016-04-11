package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {
	@Test
	public void testAdd() {
		calc calc = new calc();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}
}
