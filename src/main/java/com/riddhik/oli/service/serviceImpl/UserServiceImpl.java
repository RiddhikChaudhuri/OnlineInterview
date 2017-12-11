package com.riddhik.oli.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.riddhik.oli.service.entity.User;
import com.riddhik.oli.service.entity.UserSecurityDetail;
import com.riddhik.oli.service.repository.UserRepository;
import com.riddhik.oli.service.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService,UserDetailsService{

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

	@Override
	public boolean emailExists(String emailID) {
		if (userRepository.findByEmail(emailID) != null)
			return true;
		else
			return false;
	}

	@Override
	public final UserSecurityDetail loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = findByEmail(username);

		if(user == null) {
			throw new UsernameNotFoundException("Not Exist User");
		}

		UserSecurityDetail UserDetail = new UserSecurityDetail(user);
		return UserDetail;
	}

}
