package com.sri.setterInjection.firstproject;

import java.util.Properties;

public class Customer 
{
	//step-1: Create java beans
	
	//Declare the properties as private
	private String name;
	private String contact;
	private Properties address;
	
	public Customer(String name ,String contact ,Properties address)
	{
		this.name=name;
		this.contact=contact;
		this.address=address;
	}

	public String toString() 
	{
		return "Customer [name=" + name + ", contact=" + contact + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
