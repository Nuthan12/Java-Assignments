package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortOddEvenTest {

	@Test
	public void testSortOddEven() {
		Integer[]data=new Integer[] {57,32,46,71,1};
		System.out.println(Arrays.asList(data));
		Arrays.sort(data,new SortOddEven());
		System.out.println(Arrays.asList(data));
		assertArrayEquals(new Integer[] {1,57,71,46,32},data);
	}

}
