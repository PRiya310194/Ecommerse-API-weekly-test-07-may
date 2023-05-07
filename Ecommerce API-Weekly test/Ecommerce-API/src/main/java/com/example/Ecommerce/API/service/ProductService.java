package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.dao.ProductRepository;
import com.example.Ecommerce.API.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public int saveProduct(Product productData) {
        Product product=productRepository.save(productData);
        return product.getProductId();
    }

    public List<Product> findAllProduct() {
return productRepository.findAll();
    }

    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }
}
