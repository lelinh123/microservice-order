package com.lhlinh.controller;

import com.lhlinh.model.Order;
import com.lhlinh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/orders")
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }
}
