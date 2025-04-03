package com.sri.spring.mydiary.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sri.spring.mydiary.dao.EntryDaoInterface;
import com.sri.spring.mydiary.entities.Entry;

@Component
public class EntryBusinessInterfaceImpl implements EntryBusinessInterface 
{
	@Autowired
	private EntryDaoInterface entryDaoInterface;

	//Generate getter and setter methods
	public EntryDaoInterface getEntryDaoInterface() 
	{
		return entryDaoInterface;
	}
	public void setEntryDaoInterface(EntryDaoInterface entryDaoInterface) 
	{
		this.entryDaoInterface = entryDaoInterface;
	}

	//Implement EntryBusinessInterface methods
	@Transactional(readOnly = false)
	public void save(Entry entry) 
	{
		entryDaoInterface.save(entry);
	}

	@Transactional(readOnly = false)
	public void update(Entry entry) 
	{
		entryDaoInterface.update(entry);
	}

	@Transactional(readOnly = false)
	public void delete(Entry entry) 
	{
		entryDaoInterface.delete(entry);
	}

	public Entry findById(int id) 
	{
		return entryDaoInterface.findById(id);
	}

	public List<Entry> findAll() 
	{
		return entryDaoInterface.findAll();
	}

	public List<Entry> findByUserId(int userid) 
	{
		return entryDaoInterface.findByUserId(userid);
	}

}
