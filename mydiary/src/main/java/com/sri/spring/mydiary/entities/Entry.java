package com.sri.spring.mydiary.entities;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="entries")
public class Entry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date entrydate;
	private String description;
	private int userid;

	//Generate getter and setter methods
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public Date getEntrydate() 
	{
		return entrydate;
	}
	public void setEntrydate(Date entrydate) 
	{
		this.entrydate = entrydate;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getUserid() 
	{
		return userid;
	}
	public void setUserid(int userid) 
	{
		this.userid = userid;
	}
	
}
