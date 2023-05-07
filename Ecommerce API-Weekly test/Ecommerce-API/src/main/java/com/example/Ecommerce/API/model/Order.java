package com.example.Ecommerce.API.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Tbl_order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer orderId;
    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;
    @OneToOne
    @JoinColumn(name="product_id")
    private Product product;
    @JoinColumn(name="address_id")
    @ManyToOne
    private Address address;


}
