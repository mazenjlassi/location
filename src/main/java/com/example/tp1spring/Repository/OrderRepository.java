package com.example.tp1spring.Repository;

import com.example.tp1spring.entity.Order;
import com.example.tp1spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
