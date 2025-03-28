package com.sri.spring.springhibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	private int id;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="address")
	private String address;
	private String contact;
	private int exp;
	
	//default constructor
	public Employee(){}
	
	//Generated Parameterized Constructor
	public Employee(int id, String ename, String address, String contact, int exp) 
	{
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
		this.contact = contact;
		this.exp = exp;
	}

	//Generated getter and setter methods for above properties
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}

	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getContact() 
	{
		return contact;
	}
	public void setContact(String contact) 
	{
		this.contact = contact;
	}

	public int getExp() 
	{
		return exp;
	}
	public void setExp(int exp) 
	{
		this.exp = exp;
	}
	
	
}
