package com.valtech.training.corejava.day5;

public class Factorial {
	public static long fact(long i) {
		if(i<=1) {
			return 1;
		}
		else {
			return(i*fact(i-1));
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}

