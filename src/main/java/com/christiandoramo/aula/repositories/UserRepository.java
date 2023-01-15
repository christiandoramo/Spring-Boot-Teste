package com.christiandoramo.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christiandoramo.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}