package com.viksuu.tech.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viksuu.tech.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
