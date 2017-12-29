package com.riddhik.oli.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.riddhik.oli.service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String emailID);

	public User save(User user);

	@Query("UPDATE user u SET u.password = :newPassword where u.username = :userName")
	public int updatePassword(@Param("email") String userName, @Param("password") String newPassword);

}