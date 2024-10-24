package com.example.tp1spring.Services;

import com.example.tp1spring.Repository.OrderRepository;
import com.example.tp1spring.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public List<Order> getallOrder(){
        return  orderRepository.findAll();
    }
    public Order getOrderBiID(Integer id){
        return orderRepository.findById(id).get();
    }
    public Order updateorder(Order order){
        return orderRepository.saveAndFlush(order);
    }
    public void deleteorder(Integer id){
        orderRepository.deleteById(id);
    }

}
