package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class VariableArgumentsTest {


	@Test
	public void test() {
		VariableArguments va=new VariableArguments();
		assertEquals(0, va.add());
		assertEquals(2, va.add(1,1));
		assertEquals(5,va.add(4,0,1));
	}

}
