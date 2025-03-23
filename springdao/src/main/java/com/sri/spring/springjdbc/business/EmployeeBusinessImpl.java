package com.sri.spring.springjdbc.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sri.spring.springjdbc.dao.EmployeeDao;
import com.sri.spring.springjdbc.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness 
{
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() 
	{
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) 
	{
		this.employeeDao = employeeDao;
	}

	public void printEmployeeHikes() 
	{
		//get employees data from dao
		List<Employee> employees = employeeDao.findAllEmployees();
		
		//check and print of each employee hike
		if(employees!=null)
		{
			for(Employee employee : employees)
			{
				if(employee.getExp()>15)
				{
					System.out.println(employee.getName()+" as "+employee.getExp()+" years of expirence so got 30% hike");
				}
				else if(employee.getExp()>=10)
				{
					System.out.println(employee.getName()+" as "+employee.getExp()+" years of expirence so got 25% hike");
				}
				else if(employee.getExp()>=5)
				{
					System.out.println(employee.getName()+" as "+employee.getExp()+" years of expirence so got 20% hike");
				}
				else 
				{
					System.out.println(employee.getName()+" as "+employee.getExp()+" years of expirence so got 15% hike");
				}
			}
		}
	}

}
