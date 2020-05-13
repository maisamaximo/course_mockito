package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysComprareTest {

	@Test
	public void testAssertSort_randomArray() {
		int[] numbers = {12, 4, 1, 6};
		int[] expecteds = {1, 4, 6, 12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expecteds, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testAssertSort_nullArray() {
		int[] numbers = null;
		
		Arrays.sort(numbers);
	}
	
	@Test(timeout=100)
	public void testSort_Performance() {
		int array[] = {12, 14, 5};
		
		for (int i = 1; i < 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
		
	}

}
