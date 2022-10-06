package com.valtech.training.corejava.day2;

/*Not advisable to have same class names in different packages
 * as a part of the same project
 */
public class Outer {
	private int x=5;
	
	public Inner createInner() {
		return new Inner();
	}

	private class Inner {
		private void printX() {
			System.out.println("X = " + x);
		}

		private void increment() {
			x++;
		}
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
//		we can also use Outer.Inner i=o.createInner() instead of the above line;
		Outer.Inner i1=o.createInner();
		i.printX();
		i1.printX();
		i.increment();
		i1.printX();
		Outer.Inner i2=new Outer().createInner();
		i2.printX();
		i2.increment();
		i2.increment();
		i.printX();
		i2.printX();
	
	
	}
}
