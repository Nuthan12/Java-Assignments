package com.valtech.training.corejava.day2;

public class ExceptionTest {

	public int div(int a,int b) throws Exception {
		if(b==100) throw new Exception("B is 100 Invalid Value!!");


		return a/b;
	}
	public int calculateSimpleInterest(int p,int t,int r) {
		try {
			return div(p*r*t,100);
		} catch (Exception e) {

			//e.printStackTrace();
			//System.out.println("Exception Occurred");
		}
		finally {
			System.out.println(" I will be executed always");
		}
		return 0;
	}
	public static void main(String[] args) {
		ExceptionTest test= new ExceptionTest();
		System.out.println(test.calculateSimpleInterest(10000, 1, 5));
	}
}
