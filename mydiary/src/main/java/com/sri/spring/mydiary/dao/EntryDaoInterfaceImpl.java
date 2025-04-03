package com.sri.spring.mydiary.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sri.spring.mydiary.entities.Entry;

@Component
public class EntryDaoInterfaceImpl implements EntryDaoInterface 
{
	@Autowired
    private HibernateTemplate hibernateTemplate;
    
    //Generate getter and setter methods
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) 
	{
		this.hibernateTemplate = hibernateTemplate;
	}

	//Implement the EntryDaoInterface methods
	@Transactional(readOnly = false)
	public void save(Entry entry) 
	{
		hibernateTemplate.save(entry);
	}

	@Transactional(readOnly = false)
	public void update(Entry entry) 
	{
		hibernateTemplate.update(entry);
	}

	@Transactional(readOnly = false)
	public void delete(Entry entry) 
	{
		hibernateTemplate.delete(entry);
	}

	public Entry findById(int id) 
	{
		return hibernateTemplate.get(Entry.class, id);
	}

	public List<Entry> findAll() 
	{
		return hibernateTemplate.loadAll(Entry.class);
	}
	
	public List<Entry> findByUserId(int userid) 
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(Entry.class);
		criteria.add(Restrictions.eq("userid", userid));
		List<Entry> entries = (List<Entry>) hibernateTemplate.findByCriteria(criteria);
		return entries;
	}

}
