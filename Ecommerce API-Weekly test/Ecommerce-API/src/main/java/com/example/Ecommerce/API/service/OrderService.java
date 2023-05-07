package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.dao.OrderRepository;
import com.example.Ecommerce.API.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public int placeOrder(Order order) {
        Order orderData=orderRepository.save(order);
        return orderData.getOrderId();
    }

    public Order getOrder(Integer orderId) {
        return orderRepository.findById(orderId).get();
    }

}
