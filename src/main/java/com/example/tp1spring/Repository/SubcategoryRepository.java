package com.example.tp1spring.Repository;

import com.example.tp1spring.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubcategoryRepository extends JpaRepository<Subcategory,Integer> {
    public List<Subcategory> findByTitle(String title);
}

