package com.sri.spring.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sri.spring.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> findAllEmployee() 
	{
		return null;
	}

	public void insertEmployee(Employee employee) 
	{
		/*String sql = "insert into employee values('"+employee.getId()+"','"+employee.getName()+"',"+employee.getExp()+")";*/
		
		String sql = "insert into employee values(?,?,?)";
		
		System.out.println("Sql query is "+sql);
		
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
	}

}
