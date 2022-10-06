package com.valtech.training.corejava.day1;

public class Outer1 {
	private int x=5;
	private void printY(Inner1 i1) {
		System.out.println(i1.y);
	}
	private static class Inner1{
		private int y=10;
		void printX(Outer1 o1) {
			System.out.println(o1.x);
		}
		public void increment(Outer1 o1) {
			o1.x++;
		}
	}
	public static void main(String[] args) {
		Outer1 o1=new Outer1();
		Inner1 i1=new Inner1();
		o1.printY(i1);
		i1.printX(o1);
		i1.increment(o1);
		new Inner1().increment(o1);
		i1.printX(o1);
		i1.printX(o1);
	}
}
