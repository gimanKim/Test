package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("setup!");
	}
	
	@Test
	public void divide() {	
		
		assertEquals(3,cal.divide(9,3));
		System.out.println("divide!");
	}
	
	@Test
	public void add() {
		assertEquals(7,cal.add(2,1));
		System.out.println("add!");
	}
	
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
}
 