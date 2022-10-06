package com.valtech.training.corejava.day1;

public class Anon {
	public static void main(String[] args) {
		Animal a=new Animal() {
			int counter=0;

			@Override
			public void makeSound() {
				// TODO Auto-generated method stub
				counter++;
				System.out.println("Anon" + counter);
				
			}
			
		};
		a.makeSound();
		a.makeSound();
	}
}
