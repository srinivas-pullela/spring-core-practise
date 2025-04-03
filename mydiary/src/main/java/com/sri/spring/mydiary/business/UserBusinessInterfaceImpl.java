package com.sri.spring.mydiary.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sri.spring.mydiary.dao.UserDaoInterface;
import com.sri.spring.mydiary.entities.User;

@Component
public class UserBusinessInterfaceImpl implements UserBusinessInterface 
{
	@Autowired
	private UserDaoInterface userDaoInterface;

	//Generate getter and setter methods for userDaoInterface
	public UserDaoInterface getUserDaoInterface() 
	{
		return userDaoInterface;
	}
	public void setUserDaoInterface(UserDaoInterface userDaoInterface) 
	{
		this.userDaoInterface = userDaoInterface;
	}

	//Implement the UserBusinessInterface methods
	@Transactional(readOnly = false)
	public void save(User user) 
	{
		userDaoInterface.save(user);
	}

	@Transactional(readOnly = false)
	public void update(User user) 
	{
		userDaoInterface.update(user);
	}

	@Transactional(readOnly = false)
	public void delete(User user) 
	{
		userDaoInterface.delete(user);
	}

	public User findById(int id) 
	{
		return userDaoInterface.findById(id);
	}

	public List<User> findAll() 
	{
		return userDaoInterface.findAll();
	}

	public User findByUsername(String username) 
	{
		return userDaoInterface.findByUsername(username);
	}
	

}
