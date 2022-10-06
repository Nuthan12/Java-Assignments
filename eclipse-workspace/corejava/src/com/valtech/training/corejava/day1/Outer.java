package com.valtech.training.corejava.day1;

public class Outer {
	private static class Inner extends Outer{
		private static void inMethod() {
			System.out.println("Hello World");
		}

	}
	private void printInnerDetails(Inner i) {
		Inner.inMethod();
	}
	public static void main(String[] args) {
		Inner i=new Inner();
//		Inner.inMethod();
		Outer o=new Outer();
		o.printInnerDetails(i);
	}
}