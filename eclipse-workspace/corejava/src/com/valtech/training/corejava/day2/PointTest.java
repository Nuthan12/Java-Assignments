package com.valtech.training.corejava.day2;

import com.valtech.training.corejava.day1.Point;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testEquals() {
		Point p = new Point(2, 3);
		Point p1 = new Point(2, 3);
		Point p2 = p;
		assertTrue(p == p2);
		assertFalse(p == p1);
		assertTrue(p.equals(p2));
		assertEquals(p.hashCode(),p2.hashCode());
	}

	
	@Test
	public void testDistance() {
		Point p=new Point();
		assertEquals(0.0,p.distance(),0.000001);
		p=new Point(10,20);
		assertEquals(Math.sqrt(10*10+20*20),p.distance(),0.000001);
	}
	@Test
	public void testSetGet() {
		Point p = new Point();
		p.setx(10);
		p.sety(20);
		assertEquals(10, p.getx());
		assertEquals(20, p.gety());

	}

	@Test
	public void testPointConstructor() {
		Point p = new Point();
		assertEquals(0, p.getx());
		assertEquals(0, p.gety());
		Point p1 = new Point(1, 2);
		assertEquals(1, p1.getx());
		assertEquals(2, p1.gety());
	}

}
