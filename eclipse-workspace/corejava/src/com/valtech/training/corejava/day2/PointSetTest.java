package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;
import java.util.*;

import java.util.Iterator;
import com.valtech.training.corejava.day1.PointD;

import org.junit.Test;

public class PointSetTest {
	
	@Test
	public void testTreeSet() {
		Set<PointD> points=new TreeSet<>();
		points.add(new PointD(2,3,4));
		assertEquals(1,points.size());
		points.add(new PointD(2,3,4));
		assertEquals(1,points.size());
		points.add(new PointD(3,3,5));
		assertEquals(2,points.size());
		points.add(new PointD(3,2,4));
		assertEquals(3,points.size());
		
	}
	
	@Test
	public void testSetOfPoints() {
		Set<PointD> points=new HashSet<>();
		points.add(new PointD(2,3,4));
		assertEquals(1,points.size());
		points.add(new PointD(2,3,5));
		assertEquals(2,points.size());
	}
	
	@Test
	public void testSetOfStringsWithGenerics() {	//Generics helps in taking the required type of input only
		Set<String> myWords=new HashSet<>();
		myWords.add("Hello");
		myWords.add("How");
		myWords.add("Are");
		myWords.add("You");
		myWords.add("Hello");
		for (Iterator iterator = myWords.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	@Test
	public void testSetOfStrings(){
		Set setOfStrings=new HashSet();
		setOfStrings.add("Hello");
		assertEquals(1, setOfStrings.size());
		setOfStrings.add("Hello");
		assertEquals(1, setOfStrings.size());
		setOfStrings.add("HEllo");
		assertEquals(2, setOfStrings.size());
		//setOfStrings.add(123);  Exception occurs here ClassCastException
		//		System.out.println(setOfStrings);
		for (Iterator iterator = setOfStrings.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			String s=(String) object;
			System.out.println(s);
			
		}
	}


}
