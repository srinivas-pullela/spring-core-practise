package com.sri.setterInjection.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //create spring container
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/setterInjection/firstproject/configmetadata.xml");
    	
    	Customer customer = (Customer) context.getBean("customer1");
    	System.out.println("Customer Details : "+customer.toString());
    	
    	Order order = (Order) context.getBean("order");
    	System.out.println("Order Details : "+order.toString());
    	
    }
}
