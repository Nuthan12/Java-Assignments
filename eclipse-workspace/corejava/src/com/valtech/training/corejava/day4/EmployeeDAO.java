package com.valtech.training.corejava.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static final String TABLE_NAME="Employee";
	
	public List<Employee> getEmployees() throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select id,name,age,gender,salary from "+TABLE_NAME);
		ResultSet rs=ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
		con.close();
		return employees;
		
	}
	public void deleteEmployees(int id) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from "+TABLE_NAME+" where id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		con.close();
	}
	
	public Employee getEmployee(int id) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select id,name,age,gender,salary from "+TABLE_NAME+" where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			Employee e = employeeFromResultSet(rs);
			con.close();
			return e;
		}
		else {
			con.close();
			return null;
		}
		
	}

	private Employee employeeFromResultSet(ResultSet rs) throws SQLException {
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAge(rs.getInt(3));
		e.setGender(rs.getString(4));
		e.setSalary(rs.getDouble(5));
		return e;
	}
	
	public List<Employee> getEmployeeByAge(int age) throws Exception{
		Connection con1=getConnection();
		PreparedStatement ps1=con1.prepareStatement("select id,name,age,gender,salary from "+TABLE_NAME+" where age=?");
		ps1.setInt(1, age);
		ResultSet r=ps1.executeQuery();
		List<Employee> emp = new ArrayList<>();
		
		while(r.next()) {
			emp.add(employeeFromResultSet(r));
			
		}
		con1.close();
		return emp;
	}
	
	public List<Employee> getEmployeeBetweenAge(int minAge,int maxAge) throws Exception{
		Connection con2=getConnection();
		PreparedStatement ps2=con2.prepareStatement("Select id,name,age,gender,salary from "+TABLE_NAME+" where age between ? and ?");
		ps2.setInt(1, minAge);
		ps2.setInt(2, maxAge);
		ResultSet rs1=ps2.executeQuery();
		List<Employee> emp1=new ArrayList<>();
		while(rs1.next()) {
			emp1.add(employeeFromResultSet(rs1));
			
		}
		con2.close();
		return emp1;
	}
	
	public List<Employee> getEmployeeByGender(String Gender) throws Exception{
		Connection con3=getConnection();
		PreparedStatement ps3=con3.prepareStatement("Select id,name,age,gender,salary from "+TABLE_NAME+" where Gender=?");
		ps3.setString(1, "Male");
		ResultSet rs2=ps3.executeQuery();
		List<Employee> emp2=new ArrayList<>();
		while(rs2.next()) {
			emp2.add(employeeFromResultSet(rs2));
		}
		con3.close();
		return emp2;
		
	}
	
	public List<Employee> getEmployeeBySalaryG(double Salary) throws Exception{
		Connection con4=getConnection();
		PreparedStatement ps4=con4.prepareStatement("select id,name,age,gender,salary from "+TABLE_NAME+" where Salary>?");
		ps4.setDouble(1, Salary);
		ResultSet rs3=ps4.executeQuery();
		List<Employee> emp3=new ArrayList<>();
		while(rs3.next()) {
			emp3.add(employeeFromResultSet(rs3));
		}
		con4.close();
		return emp3;
	}
	
	public List<Employee> getEmployeeBySalaryL(double Salary) throws Exception{
		Connection con5=getConnection();
		PreparedStatement ps5=con5.prepareStatement("select id,name,age,gender,salary from "+TABLE_NAME+" where Salary<?");
		ps5.setDouble(1, Salary);
		ResultSet rs4=ps5.executeQuery();
		List<Employee> emp4=new ArrayList<>();
		while(rs4.next()) {
			emp4.add(employeeFromResultSet(rs4));
		}
		con5.close();
		return emp4;
	}
	
	public void saveEmployee(Employee e) throws Exception {
		Connection co=getConnection();
		PreparedStatement ps=co.prepareStatement("insert into "+TABLE_NAME+" (id,name,age,gender,salary) values(?,?,?,?,?)");
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setInt(3, e.getAge());
		ps.setString(4, e.getGender());
		ps.setDouble(5, e.getSalary());
		int rowsAffected =ps.executeUpdate();
		co.close();
	}
	
	public int count() throws Exception {
		Connection con=getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select count(id) from "+ TABLE_NAME);
		if(rs.next()) {
			int count=rs.getInt(1);
			con.close();
			return count;
		}
		else {
			con.close();
			return -1;
		}
	}
	
	public Connection getConnection() throws Exception {
		//return DriverManager.getConnection("jdbc:mysql://localhost:3306/valtrg1");
		return DriverManager.getConnection("jdbc:oracle:thin:@192.168.102.35:1521/xe","valtrg1","valtrg1");
	}
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
}
