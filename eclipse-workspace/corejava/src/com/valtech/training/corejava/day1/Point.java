package com.valtech.training.corejava.day1;

import java.io.Serializable;

public class Point implements Comparable<Point>,Serializable {
	public int x;
	public int y;
	public static final Point ORIGIN = new Point(0,0);
	public Point() {}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point P=(Point) obj;
			return P.x==x && P.y==y;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return toString().hashCode();
	}
	@Override
	public String toString() {
		
		return new StringBuffer("X = ").append(x).append(" Y = ").append(y).toString();
	}
	
	/**
	 *return -1 if the object is smaller
	 *0 if it is equal
	 *1 if it is greater 
	 */
		
	
	public Point(int x) {
		this.x=x;
	}
	
	public double distance() {
//		System.out.println("Distance of Point2D");
		return Math.sqrt((x*x)+(y*y));
	}
	public double distance(int x,int y) {
		int dx=this.x-x;
		int dy=this.y-y;
		System.out.println(dx);					
		System.out.println(dy);
		return Math.sqrt((dx*dx)+(dy*dy));			//Sqrt[((x2-x1)^2)  +((y2-y1)^2)]
	}
	
	public int getx() {
		return x;
	}
	
	public int gety() {
		
		return y;
	}
	
	public void setx(int x) {
		this.x=x;
	}
	
	public void sety(int y) {
		this.y=y;
	}
	
	public static void main(String[] args) {
		Point p=new Point(1,2);
		System.out.println("x value is "+p.getx()+" y value is "+p.gety());
		System.out.println(p.distance());
		System.out.println(p.distance(10, 10));
		System.out.println(p.x);
		System.out.println(p.y);
		Point p1=new Point(2,3);
		//p.distance(new Point(10,12));
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
	}
	
	@Override
	public int compareTo(Point o) {
		if(distance()<o.distance()) {
			return -1;
		}
		if(distance()==o.distance()) {
			if(x<o.x) {
				return -1;
			}
			if(x>o.x) {
				return +1;
			}
			
			return 0;
		}
		return 1;
		
	}
	
}
