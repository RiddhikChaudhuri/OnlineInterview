package com.riddhik.oli.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.riddhik.oli.service.entity.User;
import com.riddhik.oli.service.entity.UserSecurityDetail;
import com.riddhik.oli.service.service.UserService;

@Service("userSecurityService")
public class UserSecurityServiceImpl implements UserDetailsService {


	@Autowired
	private UserService userService;

	@Override
	public final UserSecurityDetail loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.findByEmail(username);

		if(user == null) {
			throw new UsernameNotFoundException("Not Exist User");
		}

		UserSecurityDetail frontUserDetail = new UserSecurityDetail(user);
		return frontUserDetail;
	}
}
