package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class DynamicFactTest {

	@Test
	public void testCachedFact() {
		DynamicFact cf=new DynamicFact();
		assertEquals(120,DynamicFact.fact(5));
		cf.dump();
	}

}
