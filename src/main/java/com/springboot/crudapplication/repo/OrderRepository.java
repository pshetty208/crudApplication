package com.springboot.crudapplication.repo;

import com.springboot.crudapplication.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}


