package com.christiandoramo.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christiandoramo.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}