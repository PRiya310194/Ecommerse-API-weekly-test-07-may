package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.Product;
import com.example.Ecommerce.API.model.User;
import com.example.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping(value="/saveProduct")
    public ResponseEntity<String> saveProduct(@RequestBody Product productData){
        int productId=productService.saveProduct(productData);
        return new ResponseEntity<>("product saved with Id-> "+productId, HttpStatus.OK);
    }
    @GetMapping(value="/getAllProduct")
    public ResponseEntity<List<Product>>findAllProduct(){
        List<Product>productList=productService.findAllProduct();
        return new ResponseEntity<>(productList,HttpStatus.FOUND);
    }
@DeleteMapping(value="/delete/{productId}")
    public void deleteProduct(@PathVariable Integer productId){
productService.deleteProductById(productId);
}
}
