package com.example.tp1spring.Controllers;


import com.example.tp1spring.Services.CategoryService;
import com.example.tp1spring.Services.CustomerService;
import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService ;
    @RequestMapping("/addCustomer")
    public String addCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute("CustomerForm", customer );
        return "new_customer";
    }
    @RequestMapping(value = "/saveCustomer" , method = RequestMethod.POST)
    public String saveCategory(@ModelAttribute("CustomerForm") Customer customer) {
        customerService.createCustomer(customer);
        return "redirect:/allCustomer";
    }
    @RequestMapping("/allCustomer")
    public String listecustomer(Model model){
        List<Customer> listCustomer =  customerService.getAllCustomer();
        model.addAttribute("listCustomer", listCustomer);
        return "liste_customer";
    }

    @GetMapping("deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable("id")Integer id){
        customerService.deleteCustomerById(id);
        return "redirect:/allCustomer";
    }





}
