package com.valtech.training.corejava.day1;

public abstract class Vehicle {
	public  void start() {
		System.out.println("Starting is Initiated");
	}
	public abstract void stop();
	public abstract void accelerate();
	public final void drivevehicle() {
		start();
		accelerate();
		stop();
	}
	public static void main(String[] args) {
		Vehicle v=new Bike();
		v.drivevehicle();
	}
}
