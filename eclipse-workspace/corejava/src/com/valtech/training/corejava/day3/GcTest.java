package com.valtech.training.corejava.day3;

public class GcTest {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		long x=System.nanoTime();
		for (int i = 0; i < n; i++) {
//			String s=" "+i+" "+i+" "+i;
			StringBuffer sb=new StringBuffer();
//			s
			
		}
		long y=System.nanoTime();
		long time=(y-x)/1000000;
		System.out.println("Time Taken = "+time);      //Time is given in Milliseconds
	}
}
