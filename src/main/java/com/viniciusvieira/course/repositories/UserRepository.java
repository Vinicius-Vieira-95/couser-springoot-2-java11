package com.viniciusvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusvieira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
