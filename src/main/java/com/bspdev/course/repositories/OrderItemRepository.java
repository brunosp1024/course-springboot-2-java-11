package com.bspdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bspdev.course.entities.Order;
import com.bspdev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
