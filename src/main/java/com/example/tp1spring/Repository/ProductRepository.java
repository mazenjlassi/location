package com.example.tp1spring.Repository;

import com.example.tp1spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
