package com.sri.spring.springjdbc.business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.sri.spring.springjdbc.dao.EmployeeDao;
import com.sri.spring.springjdbc.dto.Employee;

public class BusinessEmployeeImpl implements BusinessEmployee 
{
	@Autowired
	public EmployeeDao employeeDao;

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
		//get employee data from dao
		List<Employee> employees = employeeDao.findAllEmployee();
		
		if(employees!=null)
		{
		    for(Employee employee:employees)
		    {
		    	if(employee.getExp()>15)
		    	{
		    		System.out.println(employee.getName()+" and id "+employee.getId()+" with experience "+employee.getExp()+" years got 20% hike");
		    	}
		    	else if(employee.getExp()>=10)
		    	{
		    		System.out.println(employee.getName()+" and id "+employee.getId()+" with experience "+employee.getExp()+" years got 15% hike");
		    	}
		    	else if(employee.getExp()>=5)
		    	{
		    		System.out.println(employee.getName()+" and id "+employee.getId()+" with experience "+employee.getExp()+" years got 10% hike");
		    	}
		    	else
		    	{
		    		System.out.println(employee.getName()+" and id "+employee.getId()+" with experience "+employee.getExp()+" years got 5% hike");
		    	}
		    }
		}
		else
		{
			System.out.println("No Employees data found");
		}
	}

	public void insertEmployee(Employee employee) 
	{
		employeeDao.insertEmployee(employee);
	}
	
}
