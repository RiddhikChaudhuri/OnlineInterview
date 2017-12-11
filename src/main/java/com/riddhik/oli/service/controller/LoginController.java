package com.riddhik.oli.service.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.riddhik.oli.service.entity.User;
import com.riddhik.oli.service.service.UserService;
import com.riddhik.oli.service.serviceImpl.UserSecurityServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public HttpStatus addNewUser(@RequestBody User user) {
		
		userService.save(user);
		return HttpStatus.CREATED;
		
	}
}
