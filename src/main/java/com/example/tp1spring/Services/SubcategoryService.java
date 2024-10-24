package com.example.tp1spring.Services;

import com.example.tp1spring.Repository.SubcategoryRepository;
import com.example.tp1spring.entity.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryService {
    @Autowired
    SubcategoryRepository subcategoryRepository;



    public Subcategory addSubcategory(Subcategory subcategory){
        return subcategoryRepository.save(subcategory);
    }

    public List<Subcategory> getAllSubcategory() {
        return subcategoryRepository.findAll();
    }

    public void deleteSubcategory(Integer id){
        subcategoryRepository.deleteById(id);
    }
    public Subcategory updateSubcategory(Subcategory subcategory){
        return subcategoryRepository.saveAndFlush(subcategory);
    }
    public List<Subcategory> findSubcategoryByTitle(String title) {
        return subcategoryRepository.findByTitle(title);
    }
    public Subcategory findSubcategoryById(Integer id){
        return subcategoryRepository.findById(id).get();
    }
}
