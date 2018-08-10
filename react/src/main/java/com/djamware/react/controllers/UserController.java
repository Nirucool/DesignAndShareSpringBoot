package com.djamware.react.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.djamware.react.models.User;
import com.djamware.react.repositories.UserRepository;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping(method=RequestMethod.POST, value="/user")
	public User save(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/user")
	public Iterable<User> loginDetail() {
		return userRepository.findAll();
	}
}


