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
	@Test
	public void testSub() {
		calc calc = new calc();
		calc.sub(10, 20);
		assertEquals(-10, calc.getResult());
	}
	@Test
	public void testMul() {
		calc calc = new calc();
		calc.mul(10, 20);
		assertEquals(200, calc.getResult());
	}
}
