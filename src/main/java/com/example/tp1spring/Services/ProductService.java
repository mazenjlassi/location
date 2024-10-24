package com.example.tp1spring.Services;

import com.example.tp1spring.Repository.ProductRepository;
import com.example.tp1spring.entity.Product;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product creatProduct (Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {

    return productRepository.findAll();
    }

    public Product getProductByID(Integer id){
        return productRepository.findById(id).get();
    }

    public Product updateProduct(Product product){
        return productRepository.saveAndFlush(product);
    }

    public void deleteproduct (Integer id){
        productRepository.deleteById(id);
    }
}
