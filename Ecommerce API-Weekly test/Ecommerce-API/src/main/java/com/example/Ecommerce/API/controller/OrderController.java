package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.Order;
import com.example.Ecommerce.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/place-order")
    public ResponseEntity<String>placeOrder(@RequestBody Order order){
       int orderId= orderService.placeOrder(order);
        return new ResponseEntity<>("order Saved with id -> "+orderId, HttpStatus.CREATED);
    }
    @GetMapping("/get-oder/{orderId}")
    public Order getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }
}
