package com.riddhik.oli.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riddhik.oli.service.entity.User;
import com.riddhik.oli.service.repository.UserRepository;
import com.riddhik.oli.service.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findByEmail(String emailID) {
		return userRepository.findByEmail(emailID);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

}
