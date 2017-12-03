package com.riddhik.oli.service.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.riddhik.oli.service.entity.User;
import com.riddhik.oli.service.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public HttpStatus addNewUser(@RequestBody User user) {
		UserServiceImpl userDetailsService =new UserServiceImpl();
		userDetailsService.save(user);
		return HttpStatus.CREATED;
		
	}
}
