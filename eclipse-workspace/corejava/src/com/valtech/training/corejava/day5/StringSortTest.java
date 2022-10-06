package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSortTest {
	String[]a= {"Nuthan","Manijj","Sai","Sanjayguptha"};
	@Test
	public void testLength() {
		
		Arrays.sort(a,new StringSort());
		assertArrayEquals(new String[] {"Sai","Manijj","Nuthan","Sanjayguptha"}, a);
	}
	
	@Test
	public void testVowelCount() {
		Arrays.sort(a,new StringSort());
		assertArrayEquals(new String [] {"Sai","Manijj","Nuthan","Sanjayguptha"},a);
		
	}
	
	@Test
	public void testAlphabeticalOrder() {
		Arrays.sort(a,new StringSort());
		assertArrayEquals(new String [] {"Sai","Manijj","Nuthan","Sanjayguptha"},a);
	}

}
