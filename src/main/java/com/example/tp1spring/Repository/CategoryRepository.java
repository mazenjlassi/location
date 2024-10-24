package com.example.tp1spring.Repository;

import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
