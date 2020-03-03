package com.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


import com.commerce.model.User;
import com.commerce.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public User register(User info)
	{
		
		return userRepository.saveAndFlush(info);
	}
	
	
	public List<User> getUsers ()
	{
		return userRepository.findAll();
	}
//	public boolean login(String usr,String pas)
//	{
//		return userRepository.login(usr, pas);
//	}
}
