package com.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

@ExtendWith(MockitoExtension.class)
class MockitoSpy1 {

	@Test
	public void mockitoSpy1() {

		ArrayList<String> mockMylist = mock(ArrayList.class);
		mockMylist.add("java");
		mockMylist.add("spring");
		System.out.println(mockMylist.size());

		when(mockMylist.size()).thenReturn(2);

		assertEquals(2, mockMylist.size());

		ArrayList<String> spyMylist = Mockito.spy(ArrayList.class);

		spyMylist.add("java");
		spyMylist.add("spring");

		// when(spyMylist.size()).thenReturn(2);
		System.out.println(spyMylist.size());
		assertEquals(2, spyMylist.size());

	}

}
