package com.valtech.training.corejava.day4;

public class VariableArguments {
	public static  long add(int...a) {
		long res=0;
		for(int i:a) {
			res+=i;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(add(543543,552162,6453,932164,983216849,6316849,816986651,89876,684987,16897,568497954,1687));
	}
}	
