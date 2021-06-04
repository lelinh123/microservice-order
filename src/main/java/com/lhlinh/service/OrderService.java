package com.lhlinh.service;

import com.lhlinh.model.Order;
import com.lhlinh.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }
}
