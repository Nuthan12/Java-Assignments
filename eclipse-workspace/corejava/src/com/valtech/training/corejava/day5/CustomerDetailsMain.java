package com.valtech.training.corejava.day5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

public class CustomerDetailsMain implements Comparable<CustomerDetailsMain> {
		String name;
		int typeOfMembership;
		double moneySpentByTheCustomer;
		String date;
		

		
	   public CustomerDetailsMain(String name,int type,String date, double moneyspent) {
		   this.name=name;
		   this.typeOfMembership=type;
		   this.date=date;
		   this.moneySpentByTheCustomer=moneyspent;
		   
	   }
	   
	   public int money_compare(double m1, double m2) {
		   if(m1>m2) return +1;
		   if(m1<m2) return -1;
		   return 0;
	   }
	   public int date_Compare(String d1, String d2)   {
		   LocalDate currentDate1= LocalDate.parse(d1);
		   int month1= currentDate1.getMonthValue();
		   int year1=currentDate1.getYear();
		   LocalDate currentDate2= LocalDate.parse(d2);
		   int month2= currentDate2.getMonthValue();
		   int year2=currentDate2.getYear();
		  if(year1==year2) {
			  if(month1>month2) return +1;
			  if(month1<month2) return -1;
			  return 0;	  
		  }
		   
		  if(year1>year2) return +1;
		  return -1;
	   }
	public int compareTo(CustomerDetailsMain o) {
		int compareDate;
		int compareMoney;
		if(typeOfMembership==o.typeOfMembership) {
			
				compareDate = date_Compare(date, o.date);
			
			if(compareDate==0) {
				compareMoney = money_compare(moneySpentByTheCustomer,o.moneySpentByTheCustomer);
				if(compareMoney==0) return 0;
				if(compareMoney==+1) return -1;
				return +1;
			}
			if(compareDate==+1) return +1;
			
			
			return -1;
		}
		if(typeOfMembership<o.typeOfMembership) {
			return +1;
		}
		
		return -1;
	}

	}


