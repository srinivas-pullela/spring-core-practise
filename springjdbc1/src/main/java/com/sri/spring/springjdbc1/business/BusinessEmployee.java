package com.sri.spring.springjdbc1.business;


import com.sri.spring.springjdbc1.dto.Employee;

public interface BusinessEmployee 
{
	void printEmployeeHikes();
	void insertEmployee(Employee employee);
	Employee getEmployeeById(String id);
}
