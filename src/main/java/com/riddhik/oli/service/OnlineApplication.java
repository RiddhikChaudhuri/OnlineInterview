package com.riddhik.oli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import com.riddhik.oli.service.repository.UserRepository;
import com.riddhik.oli.service.serviceImpl.UserSecurityServiceImpl;

@SpringBootApplication
public class OnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineApplication.class, args);
	}
	
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository, UserSecurityServiceImpl service) throws Exception {
		
	}

}
