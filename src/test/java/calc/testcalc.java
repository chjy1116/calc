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
	public void testDiv() {
		calc calc = new calc();
		calc.div(20, 10);
		assertEquals(2, calc.getResult());
	}
}
