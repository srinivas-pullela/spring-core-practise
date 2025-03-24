package com.sri.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.spring.springjdbc.business.BusinessEmployee;
import com.sri.spring.springjdbc.business.BusinessEmployeeImpl;
import com.sri.spring.springjdbc.dao.EmployeeDao;
import com.sri.spring.springjdbc.dao.EmployeeDaoImpl;
import com.sri.spring.springjdbc.dto.Employee;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
        
        BusinessEmployee employeeBusiness = (BusinessEmployeeImpl) context.getBean("businessEmployee");
        
        Employee employee = new Employee("17","shila",29);
        employeeBusiness.insertEmployee(employee);
        
        employeeBusiness.printEmployeeHikes();
    }
}
