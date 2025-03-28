package com.sri.spring.springhibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.spring.springhibernate.business.EmployeeBusiness;
import com.sri.spring.springhibernate.business.EmployeeBusinessImpl;
import com.sri.spring.springhibernate.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
        EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl)context.getBean("employeeBusinessImpl");
        /*Employee employee = new Employee();
        employee.setId(3);
        employee.setEname("Ramu");
        employee.setContact("8888888888");
        employee.setAddress("Raichur");
        employee.setExp(10);
        employeeBusiness.save(employee);*/
        
        /*Employee employee = employeeBusiness.findById(2);
        employee.setEname("Somu");
        employeeBusiness.update(employee);*/
        
        /*Employee employee = employeeBusiness.findById(2);
        employeeBusiness.delete(employee);*/
        
        List<Employee> employees = employeeBusiness.findAll();
        for(Employee e:employees)
        {
        	System.out.print("Id:"+e.getId());
        	System.out.println(" - Name:"+e.getEname());
        }
    }
}
