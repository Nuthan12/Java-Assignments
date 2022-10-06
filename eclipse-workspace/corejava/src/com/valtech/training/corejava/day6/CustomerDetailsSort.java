package com.valtech.training.corejava.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import oracle.net.aso.l;

public class CustomerDetailsSort extends Customer {
	
	static List<CustomerDetailsSort> l=new LinkedList<>();

	public CustomerDetailsSort(String name, String email,int mobileNmber, char typeOfMembership) {
		super(name, email, mobileNmber, typeOfMembership);
		
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+" Email : "+this.email;
	}
	
	public static List<CustomerDetailsSort> getCustomerList() {
		
		CustomerDetailsSort c1=new CustomerDetailsSort("Nuthan","nuthan.sml@valtech.com",82175,'P');
		l.add(c1);
		return l;
	}
	
	public static void printCustomerList(List<CustomerDetailsSort> k) {
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
	}
	
	public static <T> void sortCustomersBasedOnMembership(List<CustomerDetailsSort> k) {
		Collections.sort((List<T>) k);
	}
	
	public static void main(String[] args) {
		System.out.println(getCustomerList());
		System.out.println(l.size());
		printCustomerList(l);
	}
	
	
	
	
}
