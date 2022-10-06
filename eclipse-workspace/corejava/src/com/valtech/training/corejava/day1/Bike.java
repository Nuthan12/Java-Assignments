package com.valtech.training.corejava.day1;

public class Bike extends Vehicle {

	@Override
	public void stop() {
		System.out.println("Stopping the Vehicle");
		
	}

	@Override
	public void accelerate() {
		System.out.println("More Power to the Bike");
		
	}
	
}
