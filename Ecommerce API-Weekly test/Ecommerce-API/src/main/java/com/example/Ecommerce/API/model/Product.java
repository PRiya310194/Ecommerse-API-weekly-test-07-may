package com.example.Ecommerce.API.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String price;
    private String description;
    private String brand;
    private String category;
}
