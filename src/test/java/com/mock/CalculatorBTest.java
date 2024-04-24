package com.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
class CalculatorBTest {

//	@Mock
	//private CalculatorA calculatorA;

//	@InjectMocks
	private CalculatorB calculatorB;

	/*
	 * public CalculatorBTest() { MockitoAnnotations.openMocks(this); }
	 */

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
        CalculatorA calculatorA = new CalculatorA();
        calculatorB = spy(new CalculatorB(calculatorA));


	}

	@Test
	void testPerformAddition() {

		/*
		 * Mockito.when(calculatorA.add(10, 10)).thenReturn(20); int result =
		 * calculatorB.performAddition(10, 10); System.out.println(result);
		 * assertEquals(90, result);
		 */

		//when(calculatorA.add(anyInt(), anyInt())).thenReturn(8);
		//CalculatorB calculatorBSpy = Mockito.spy(calculatorB);
		int res = calculatorB.performAddition(4, 4);
		assertEquals(8, res);

	}

	/*
	 * @Test void testPerformDivision() {
	 * 
	 * when(calculatorA.division(anyInt(), anyInt())).thenReturn(5); int res = (int)
	 * calculatorB.performDivision(6, 9); assertEquals(5, res);
	 * 
	 * when(calculatorA.division(Mockito.anyInt(),
	 * Mockito.eq(0))).thenThrow(ArithmeticException.class);
	 * 
	 * assertThrows(ArithmeticException.class, () -> calculatorB.performDivision(3,
	 * 0));
	 * 
	 * }
	 */

}
