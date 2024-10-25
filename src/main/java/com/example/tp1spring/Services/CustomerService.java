package com.example.tp1spring.Services;

import com.example.tp1spring.Repository.CustomerRepository;
import com.example.tp1spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Integer id)
    {
        return customerRepository.findById(id).get();
    }
    public Customer updateCustomer(Customer customer)
    {
        return customerRepository.saveAndFlush(customer);
    }
    public void deleteCustomerById(Integer id){
          customerRepository.deleteById(id);
    }



}