package com.sri.spring.springjdbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.sri.spring.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{

	public void insertEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
	}

	public List<Employee> findAllEmployees() 
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/springjdbc";
		String username="root";
		String password="sp@31";
		
		//code to return all employees in employee table
		List<Employee> employees = new ArrayList<Employee>();
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			 
			while(rs.next())
			{
				String id = rs.getString(1);
				String name = rs.getString(2);
				int exp = rs.getInt(3);
				
				Employee employee = new Employee(id,name,exp);
				
				employees.add(employee);
			}
			con.close();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return employees;
	}

	public Employee getEmployeeById(String id) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	

}
