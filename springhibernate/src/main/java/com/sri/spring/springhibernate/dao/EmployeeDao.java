package com.sri.spring.springhibernate.dao;

import java.util.List;

import com.sri.spring.springhibernate.entities.Employee;

public interface EmployeeDao 
{
	//create operation
	public void save(Employee employee);
	
	//update operation
	public void update(Employee employee);
	
	//delete operation
	public void delete(Employee employee);
	
	//Read operation for retrieving single object
	public Employee findById(int id);
	
	//Read operation for retrieving multiple object
	public List<Employee> findAll();
}
