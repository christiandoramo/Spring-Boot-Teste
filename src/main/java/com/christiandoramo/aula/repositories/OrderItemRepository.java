package com.christiandoramo.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christiandoramo.aula.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
