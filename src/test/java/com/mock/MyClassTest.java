package com.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyClassTest {

	

	@Test
	void testMethod1() {
		MyClass myClassmock = mock(MyClass.class);
		
		
		Mockito.when(MyClass.method1()).thenReturn("gh");
		String res = MyClass.method1();
		assertEquals("gh", res);
		
		
	}
	/*
	 * @Test void testMain() { fail("Not yet implemented"); }
	 */
}
