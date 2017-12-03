package com.riddhik.oli.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riddhik.oli.service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
	
	public User save(User user);
}