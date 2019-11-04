import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import new_calculator.Calculator;



public class CalculatorTest {

	@Test
	public void shouldCountSum() { // client requirements!!!
		
		assertEquals(4.0, Calculator.add(2.0, 2.0), 0.0);
	}
	
	@Test
	public void shouldSubstractNumbers() { // client requirements!!!
		
		assertEquals(3.0, Calculator.substract(5.0, 2.0), 0.0);
	}
	
	@Test
	public void shouldCalculateSquareRoot() { // client requirements!!!
		
		assertEquals(9.0, Calculator.calculateSquareRoot(81), 0.0);
	}
	
}
