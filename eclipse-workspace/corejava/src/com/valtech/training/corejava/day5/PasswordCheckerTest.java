package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordCheckerTest {

	@Test
	public void testcheckLower() {
		 PasswordCheckerMain lwr = new PasswordCheckerMain();
		 assertEquals(false, lwr.checklower("abcdef"));
	}
	
	
	@Test
	public void testcheckUpper() {
		PasswordCheckerMain upr = new PasswordCheckerMain();
		 assertEquals(true, upr.checkupper("ABCDEFGHIJKLMN"));
	}
	
	
	@Test
	public void testcheckDigit() {
		PasswordCheckerMain dig = new PasswordCheckerMain();
		 assertEquals(true, dig.checkupper("1,2,3,4,5,6,7,8,9"));
	}
	
	
	@Test
	public void testcheckSpclChar() {
		 PasswordCheckerMain splch = new PasswordCheckerMain();
		 assertEquals(19, splch.checkspecialchar("!@#$%^&*"));
	}

	@Test
	public void testPasswordStrength() {
		String a="Ritesh@125#";
		PasswordCheckerMain p=new PasswordCheckerMain();
		
		assertEquals("Moderate", p.checkPasswordStrength(a));
		assertEquals(24,p.totalValue);
	}
	
}


