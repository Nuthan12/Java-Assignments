package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class SortOddEven implements Comparator<Integer> {
	
	private boolean isOdd(int a) {
		return a%2==1;
		
	}

	@Override
	public int compare(Integer i1,Integer i2) {
		//check both the numbers are odd;
		//put it in ascending order;
		boolean b1=isOdd(i1);
		boolean b2=isOdd(i2);
		if(b1&&b2) {
			return i1-i2;
		}
		
		//check both are even;
		//put in descending order;
		if(!b1&&!b2) {
			return i2-i1;
		}
		//one is odd and another is even;
		//if first value is odd and smaller return -1;
		//second value is odd and smaller return -1;
		if(b1) {
			return -1;
		}
		return 1;
		
	}
}
