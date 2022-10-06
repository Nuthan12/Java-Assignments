package com.valtech.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeDAOTest {


	@Test
	public void testCount() throws Exception {
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(10, dao.count());
	}
	
//	@Test
//	public void testUpdateEmployees() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		dao.updateEmployee(new Employee(3,"Pramod",25,"Male",1212121));
//		Employee e=dao.getEmployee(3);
//		assertEquals(e.getId(), 3);
//		assertEquals(e.getName(),"Pramod");
//		assertEquals(22, e.getAge());
//		assertEquals(25, e.getAge());
//		assertEquals(121212,0);
//	}
	
//	@Test
//	public void testSaveEmployee() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		int count=dao.count();
//		dao.saveEmployee(new Employee(11,"Mani",22,"Male",250000.00));
//		assertEquals(count+1, dao.count());
//		dao.deleteEmployees(4);
//		assertEquals(count, dao.count());
//	}
	
	@Test
	public void testGetEmployee() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		int count=dao.count();
		Employee e=dao.getEmployee(1);
		assertEquals(1, e.getId());
		assertEquals(21,e.getAge());
	}
	
	@Test
	public void testGetEmployees() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(dao.count(), dao.getEmployees().size());
	}
	@Test
	public void testGetEmployeeByAge() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		int count=dao.count();
		List<Employee> e=dao.getEmployeeByAge(21);
		assertEquals(2, e.size());
	}
	
	@Test
	public void testGetEmployeeBetweenAge() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeBetweenAge(21, 25);
		assertEquals(8, e.size());
	}
	
	@Test
	public void testGetEmployeeByGender() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByGender("Male");
		assertEquals(8,e.size());
	}
	@Test
	public void testGetEmployeeBySalaryG() throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> e=dao.getEmployeeBySalaryG(210000);
		assertEquals(6, e.size());
	}
	
	@Test
	public void testGetEmployeeBySalaryL() throws Exception{
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> e=dao.getEmployeeBySalaryL(205000);
		assertEquals(3, e.size());
//		for (Iterator iterator = e.iterator(); iterator.hasNext();) {
//			Employee employee = (Employee) iterator.next();
//			System.out.println(employee.toString());
//			
//		}
		for(int i=0;i<e.size();i++) {
			System.out.println(e.get(i));
		}
	}
}
