package com.sri.setterInjection.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order 
{
	private String productid;
	private String productname;
	
	@Autowired
	@Qualifier("customer1")
	private Customer customer;
	
	public String toString() 
	{
		return "Order [productid=" + productid + ", productname=" + productname + ", customer=" + customer
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Order() {}
	
	public Order(Customer customer)
	{
		this.customer=customer;
	}
	
	public Order(String productid, String productname, Customer customer) 
	{
		this.productid = productid;
		this.productname = productname;
		this.customer = customer;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Customer getcustomer() {
		return customer;
	}

	public void setcustomer(Customer customer) {
		this.customer = customer;
	}

}
