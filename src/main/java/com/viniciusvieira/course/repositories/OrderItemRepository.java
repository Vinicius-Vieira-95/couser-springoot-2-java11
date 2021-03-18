package com.viniciusvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusvieira.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
