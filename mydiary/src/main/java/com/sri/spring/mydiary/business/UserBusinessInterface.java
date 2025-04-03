package com.sri.spring.mydiary.business;

import java.util.List;

import com.sri.spring.mydiary.entities.User;

public interface UserBusinessInterface 
{
    //create operation
	public void save(User user);
	
	//update operation
	public void update(User user);
	
	//delete operation
	public void delete(User user);
	
	//Read operation for retrieving single object
	public User findById(int id);
	
	//Read operation for retrieving multiple object
	public List<User> findAll();
	public User findByUsername(String username);
	
}
