package com.sri.spring.springjdbc1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sri.spring.springjdbc1.dao.rowmapper.EmployeeRowMapper;
import com.sri.spring.springjdbc1.dto.Employee;

@Component
public class DaoEmployeeImpl implements DaoEmployee 
{
	@Autowired
    JdbcTemplate jdbcTemplate;
    
	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertEmployee(Employee employee) 
	{
		String sql="insert into employee values(?,?,?)";
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
		System.out.println("sql : "+sql);
	}
	
	public List<Employee> findAllEmployee() 
	{
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		//Retrive multiple objects we use query
		//List<Employee> employees = jdbcTemplate.query("select * from employee",rowMapper);
		List<Employee> employees = jdbcTemplate.query("select * from employee where exp>?",rowMapper,15);
		return employees;
	}

	public Employee getEmployeeById(String id) 
	{
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject("select * from employee where id=?",rowMapper,id);
		return employee;
	}


}
