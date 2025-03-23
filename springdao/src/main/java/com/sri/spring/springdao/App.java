package com.sri.spring.springdao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.spring.springjdbc.business.EmployeeBusiness;
import com.sri.spring.springjdbc.business.EmployeeBusinessImpl;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
        
        EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl) context.getBean("employeeBusiness");
        
        employeeBusiness.printEmployeeHikes();
    }
}
