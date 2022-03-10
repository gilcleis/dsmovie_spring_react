package com.gilclei.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilclei.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
