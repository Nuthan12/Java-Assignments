package com.valtech.training.corejava.day4;

public enum Gender {
	MALE(1),FEMALE(-1),OTHER(0);
	private int value;
		
	
	
	private Gender(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		
		//For Eah loop can be used when ever our class implements Iterable interface
		for(Gender g:Gender.values()) {  // Every enum has a method called as values();
			System.out.println(g+" "+g.getValue());
		}
		System.out.println(Gender.MALE);
	}
}
