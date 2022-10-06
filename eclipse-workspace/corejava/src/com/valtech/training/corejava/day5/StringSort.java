package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class StringSort implements Comparator<String>{
	
	public int vowelCount(String n) {
		String n1=n.toLowerCase();
		char[]c=n1.toCharArray();
		int count=0;
		for(int i=0;i<=c.length-1;i++) {
			if((c[i]=='a')||(c[i]=='e')||(c[i]=='o')||(c[i]=='i')||(c[i]=='u')) {
				count++;
			}
		}
		return count;
	}
	
	@Override
	public int compare(String o1, String o2) {
		int l1=o1.length();
		int l2=o2.length();
		int l3=vowelCount(o1);
		int l4=vowelCount(o2);
		if(l1<l2) {
			return -1;
		}
		if(l1>l2) {
			return +1;
		}
		if(l1==l2) {
			if(l3<l4) {
				return -1;
			}
			if(l3>l4) {
				return +1;
			}
			
			
		}
		
		return o1.compareTo(o2);
		
	}
	
}
