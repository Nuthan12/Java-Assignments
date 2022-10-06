package com.valtech.training.corejava.day3;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class ListTest {
	
	@Test
	public void testStackAndQueue() {
		Stack<String> Animals=new Stack<>();
		Animals.push("TIger");
		Animals.push("Cat");
		Animals.push("Lion");
		Animals.push("Lion");
		assertEquals(4, Animals.size());
		
		Queue<String> Birds=new LinkedList<>();
		Birds.add("Parrot");
		Birds.add("Sparrow");
		Birds.add("Parrot");
		assertEquals(3, Birds.size());
	}


	@Test
	public void test() {
		List<String> names=new LinkedList<>();
		names.add("Hello");
		names.add("HEllo");
		names.add("Hello");
		names.add(3,"HEllo4");
		names.add("hello");
		assertEquals(5, names.size());
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}

}
