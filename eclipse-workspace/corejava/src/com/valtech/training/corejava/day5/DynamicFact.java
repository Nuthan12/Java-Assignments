package com.valtech.training.corejava.day5;

import java.util.ArrayList;
import java.util.List;

public class DynamicFact {
	static List<Long> cache=new ArrayList<>();
	public static  long fact(int n) {
		if(cache.size()>=n) {
			return cache.get(n-1);
		}
		if(n==1) {
			cache.add((long) 1);
			return 1;
		}
		long factorial=fact(n-1);
		long factn=n*factorial;
		cache.add(factn);
		return factn;
	}
	public static void main(String[] args) {
		
		System.out.println(fact(5));
	}
	public void dump() {
		for(Long i:cache) {
			System.out.println(i);
		}
		
	}
}
