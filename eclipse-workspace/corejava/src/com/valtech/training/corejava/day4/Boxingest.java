package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Boxingest {

	

	@Test
	public void test() {
		int j=10;
		Integer i=new Integer(5);
		Integer k=j;//Boxing    Primitive->Object
		int l=k.intValue();
		int m=l;   //Unboxing   Object->Primitive
	}

}
