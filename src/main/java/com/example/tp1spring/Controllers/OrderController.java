package com.example.tp1spring.Controllers;


import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Order;
import com.example.tp1spring.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService ;
    @RequestMapping("/addOrder")
    public String addOrder(Model model){
        Order order = new Order();
        model.addAttribute("OrderForm", order );
        return "new_order";
    }
    @RequestMapping(value = "/saveOrder" , method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("OrderForm") Order order) {
        orderService.createOrder(order);
        return "redirect:/allOrders";
    }


    @RequestMapping("/allOrders")
    public String listOrders(Model model) {
        List<Order> listOrders=orderService.getallOrder();
        model.addAttribute("listOrders", listOrders);

        return "liste_order";
    }

    @GetMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable("id") Integer id) {
        orderService.deleteorder(id);
        return "redirect:/allOrders";
    }






}