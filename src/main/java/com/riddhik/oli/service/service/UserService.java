package com.riddhik.oli.service.service;

import com.riddhik.oli.service.entity.User;

public interface UserService {

	public User findByEmail(String username);

	public void save(User user);

	public boolean emailExists(String emailID);

	public void updatePassword(String userName, String existingPassword, String newPassword);

}
