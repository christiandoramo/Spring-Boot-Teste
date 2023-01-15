package com.christiandoramo.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christiandoramo.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}