package com.sri.spring.springhibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sri.spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//getter and setter methods of hibernateTemplate
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) 
	{
		this.hibernateTemplate = hibernateTemplate;
	}

	//Implemented methods of EmployeeDao
	@Transactional(readOnly=false)
	public void save(Employee employee) 
	{
		hibernateTemplate.save(employee);
	}

	@Transactional(readOnly=false)
	public void update(Employee employee) 
	{
		hibernateTemplate.update(employee);
	}

	@Transactional(readOnly=false)
	public void delete(Employee employee) 
	{
		hibernateTemplate.delete(employee);
	}

	public Employee findById(int id) 
	{
		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}

	public List<Employee> findAll() 
	{
		List<Employee> employee = hibernateTemplate.loadAll(Employee.class);
		return employee;
	}

}
