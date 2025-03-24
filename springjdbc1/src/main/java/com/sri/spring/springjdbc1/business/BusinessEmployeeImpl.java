package com.sri.spring.springjdbc1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sri.spring.springjdbc1.dao.DaoEmployee;
import com.sri.spring.springjdbc1.dto.Employee;

@Component("businessEmployee")
public class BusinessEmployeeImpl implements BusinessEmployee
{
	@Autowired
	public DaoEmployee daoEmployee;
	
	//getter and setter methods of daoEmployee
	public DaoEmployee getDaoEmployee() 
	{
		return daoEmployee;
	}
	public void setDaoEmployee(DaoEmployee daoEmployee) 
	{
		this.daoEmployee = daoEmployee;
	}

	public void printEmployeeHikes() 
	{
		//get employee details from dao
		List<Employee> employees = daoEmployee.findAllEmployee();
		
		//check employee experience and print hike
		if(employees!=null)
		{
			for(Employee employee:employees)
			{
				if(employee.getExp()>25)
				{
					System.out.println("Id "+employee.getId()+" "+employee.getName()+" has "+employee.getExp()+" years of experience so got 25% hike");
				}
				else if(employee.getExp()>=20)
				{
					System.out.println("Id "+employee.getId()+" "+employee.getName()+" has "+employee.getExp()+" years of experience so got 20% hike");
				}
				else if(employee.getExp()>=15)
				{
					System.out.println("Id "+employee.getId()+" "+employee.getName()+" has "+employee.getExp()+" years of experience so got 15% hike");
				}
				else if(employee.getExp()>=10)
				{
					System.out.println("Id "+employee.getId()+" "+employee.getName()+" has "+employee.getExp()+" years of experience so got 10% hike");
				}
				else 
				{
					System.out.println("Id "+employee.getId()+" "+employee.getName()+" has "+employee.getExp()+" years of experience so got 5% hike");
				}
			}
		}
		else
		{
			System.out.println("No employees found");
		}
	}

	public void insertEmployee(Employee employee) 
	{
		daoEmployee.insertEmployee(employee);
	}

	public Employee getEmployeeById(String id) 
	{
		return daoEmployee.getEmployeeById(id);
	}


}
