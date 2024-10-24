package com.example.tp1spring.Services;

import com.example.tp1spring.Repository.CategoryRepository;
import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
        @Autowired
        CategoryRepository categoryRepository;
        public Category createCategory(Category category){
            return categoryRepository.save(category);
        }
        public List<Category> getallCategory(){
            return  categoryRepository.findAll() ;
        }
        public Category getCategoryBiID(Integer id){
            return categoryRepository.findById(id).get();
        }
        public Category updateCategory(Category category){
            return categoryRepository.saveAndFlush(category);
        }
        public void deletecategory(Integer id){
            categoryRepository.deleteById(id);
        }

    }

