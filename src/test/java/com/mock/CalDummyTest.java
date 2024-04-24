package com.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class CalDummyTest {

	/*
	 * @Test void testAdd() {
	 * 
	 * CalDummy calDummy = new CalDummy(); int a = 4; int b = 6;
	 * 
	 * int res = calDummy.add(a, b); assertEquals(10, res);
	 * 
	 * }
	 * 
	 * @Test void testMultiply() {
	 * 
	 * CalDummy calDummy = new CalDummy();
	 * 
	 * int a = 5; int b = 7;
	 * 
	 * int result = calDummy.multiply(a, b);
	 * 
	 * assertEquals(35, result); }
	 * 
	 */

	@Test
	void testAddMock() {
		CalDummy calDummymock = Mockito.mock(CalDummy.class);
		int a = 5;
		int b = 7;
		Mockito.when(calDummymock.add(a, b)).thenReturn(7);
		int result = calDummymock.add(a, b);

		assertEquals(7, result);

	}

	@Test
	void testMultiplyWithSpy() {

		CalDummy calDummyspy = Mockito.spy(CalDummy.class);

		int a = 5;
		int b = 7;
		// Mockito.when(calDummymock.multiply(a, b)).thenReturn(3);

		int result = calDummyspy.multiply(a, b);

		verify(calDummyspy).multiply(anyInt(), anyInt());
		assertEquals(35, result);
	}

}
