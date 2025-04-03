package com.sri.spring.mydiary.dao;

import java.util.List;
import com.sri.spring.mydiary.entities.User;

public interface UserDaoInterface 
{
		public void save(User user);
		public void update(User user);
		public void delete(User user);
		public User findById(int id);
		public List<User> findAll();
		public User findByUsername(String username);
}
