package com.valtech.training.corejava.day5;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CustomerDetailsTest {
	int Silver=1;int Gold=2;int Platinum =3;int Diamond=4;

	@Test
	public void test() throws Exception {
		
		Set<CustomerDetailsMain> customer= new TreeSet<CustomerDetailsMain>();
		
		CustomerDetailsMain c1= new CustomerDetailsMain("Nuthan",Diamond,"2022-09-02",43000);
		CustomerDetailsMain c2= new CustomerDetailsMain("Ritesh",Platinum,"2022-08-17",48000);
  	    CustomerDetailsMain c3= new CustomerDetailsMain("Pramod",Silver,"2022-08-29",28000);
        CustomerDetailsMain c4= new CustomerDetailsMain("Dheeraj",Platinum,"2021-08-19",56000);
        CustomerDetailsMain c5= new CustomerDetailsMain("Bharath",Gold,"2018-09-16",7200);
        CustomerDetailsMain c6= new CustomerDetailsMain("Sanjay",Silver,"2009-06-15",7800);
        CustomerDetailsMain c7= new CustomerDetailsMain("Sai",Diamond,"2008-05-28",7800);
        CustomerDetailsMain c8= new CustomerDetailsMain("Subbu",Gold,"2014-06-30",7200);
        
		
		customer.add(c1);
		customer.add(c2);
  	    customer.add(c3);
  	    customer.add(c4);
  	    customer.add(c5);
  	    customer.add(c6);
  	    customer.add(c7);
  	    customer.add(c8);
  	    
  	    
		
		 System.out.println(customer.size());
		for(CustomerDetailsMain i : customer) {
			System.out.println(i.name+" "+convert_to_string(i.typeOfMembership)+" "+i.date+" "+i.moneySpentByTheCustomer);
		}

			
		
		
	}
	
	public String convert_to_string (int t1) {
		switch (t1) {
		case 1:
			  return "Silver";
		
		case 2:
			  return "Gold";
		
		case 3:
			  return "Platinum";
			
		case 4:
			  return "Diamond";
			

		default:
			return "0";
		
		}
	}

}
