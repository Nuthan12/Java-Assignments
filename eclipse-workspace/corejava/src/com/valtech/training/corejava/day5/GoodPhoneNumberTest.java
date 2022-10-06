package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class GoodPhoneNumberTest {

	GoodPhoneNumber phoneNumber= new GoodPhoneNumber();
	List<Long> numList = new ArrayList<>();
	
	@Test
	public void test() {
		
		//Test Case Set 1
		numList.add(1212121212L);
		numList.add(7300422656L);
		int size=numList.size();
		
		
		assertEquals(0,GoodPhoneNumber.checkPhoneNumber(size, numList));
		
		
		
		//Test Case Set 2
		
		numList.add(9480991394L);
		numList.add(8065475252L);
		numList.add(7034564875L);
		size=numList.size();
		
		
		assertEquals(0,GoodPhoneNumber.checkPhoneNumber(size, numList));
		
		//Test Case Set 3 
		
		numList.add(9999999999L);
		numList.add(1234567890L);
		size=numList.size();
		
		
		assertEquals(0,GoodPhoneNumber.checkPhoneNumber(size, numList));
		
		// Test Case Set 4
		numList.add(1212363636L);
		numList.add(8217576371L);
		size=numList.size();
		assertEquals(0,GoodPhoneNumber.checkPhoneNumber(size, numList));
		
		
		
		
		
		
	}
	
	
	

}
