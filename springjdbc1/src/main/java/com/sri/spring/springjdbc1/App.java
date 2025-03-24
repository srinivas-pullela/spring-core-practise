package com.sri.spring.springjdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.spring.springjdbc1.business.BusinessEmployee;
import com.sri.spring.springjdbc1.business.BusinessEmployeeImpl;
import com.sri.spring.springjdbc1.dto.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
        
        BusinessEmployee businessEmployee = (BusinessEmployeeImpl)context.getBean("businessEmployee");
        
        //Employee employee = new Employee("18", "Sonu", 5);
        
        //businessEmployee.insertEmployee(employee);
        
        //businessEmployee.printEmployeeHikes();
        Employee employee = null;
        
        try 
        {
			employee = businessEmployee.getEmployeeById("2");
		} 
        catch (Exception e) 
        {
		}
        
        if(employee!=null)
        {
        	System.out.println(employee.toString());
        }
        else
        {
        	System.out.println("No matching record found");
        }
    }
}
