package com.example.Ecommerce.API.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer addressId;
    private String addressName;
    private String landmark;
    private String addressPhoneNumber;
    private String zipcode;
    private String  state;
    @JoinColumn(name="user_id")
    @OneToOne
    private User userId;

}
