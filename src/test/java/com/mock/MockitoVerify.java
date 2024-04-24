package com.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MockitoVerify {

	@Test
	void testMockitoVerify() {
		List<String> mockList = Mockito.mock(List.class);

		// Perform some operations on the mockList
		mockList.add("element1");
		mockList.add("element2");
		mockList.add("element2");
		mockList.add("element3");
		// System.out.println(mockList.size());

		verify(mockList, times(1)).add("element1");

		verify(mockList, atLeastOnce()).add("element2");

		verify(mockList, times(4)).add(anyString());

		// verify(mockList, times(1)).remove(anyString());

		when(mockList.get(anyInt())).thenReturn("Mocked element");
		String result = mockList.get(2);
		assertEquals("Mocked element", result);

	}

}
