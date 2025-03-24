package com.sri.spring.springjdbc.dto;

public class Employee 
{
	private String id;
	private String name;
	private int exp;
	
	//generate getter and setter methods
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getExp() 
	{
		return exp;
	}
	public void setExp(int exp) 
	{
		this.exp = exp;
	}
	
	//Generate constructor
	public Employee(String id, String name, int exp) 
	{
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}
	
}
