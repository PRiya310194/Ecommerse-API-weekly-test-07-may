package com.example.Ecommerce.API.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userId;
    private String userName;
    private String password;
    private String userNumber;
}
