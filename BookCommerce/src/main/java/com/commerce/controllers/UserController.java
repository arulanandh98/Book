package com.commerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.model.User;
import com.commerce.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User register(@RequestBody User info)
	{
		return userService.register(info);
	}
	
	
	@GetMapping("/get")
	public List<User> getUsers()
	{
		return userService.getUsers();
	}
	
//	@GetMapping("/login")
//	public boolean login(String usr, String pas)
//	{
//		return userService.login(usr, pas);
//	}
	
}
