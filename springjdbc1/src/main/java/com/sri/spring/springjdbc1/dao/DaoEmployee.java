package com.sri.spring.springjdbc1.dao;

import java.util.List;

import com.sri.spring.springjdbc1.dto.Employee;

public interface DaoEmployee 
{
	void insertEmployee(Employee employee);
	List<Employee> findAllEmployee();
	Employee getEmployeeById(String id);
}
