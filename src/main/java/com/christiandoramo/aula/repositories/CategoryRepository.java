package com.christiandoramo.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christiandoramo.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}