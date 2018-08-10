package com.djamware.react.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.djamware.react.models.Login;
import com.djamware.react.repositories.LoginRepository;

@CrossOrigin
@RestController
public class LoginController {
	 @Autowired
	    LoginRepository loginRepository;

	 
	    @RequestMapping(method=RequestMethod.POST, value="/login")
	    public Login save(@RequestBody Login login) {
	    	System.out.println(login.getFirstName());
	    	loginRepository.save(login);

	        return login;
	    }
	    @RequestMapping(method=RequestMethod.GET, value="/login")
	    public Iterable<Login> loginDetail() {
	        return loginRepository.findAll();
	    }
}
