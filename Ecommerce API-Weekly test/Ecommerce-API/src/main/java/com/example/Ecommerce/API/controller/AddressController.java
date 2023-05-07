package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.Address;
import com.example.Ecommerce.API.model.User;
import com.example.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping(value="/saveAddress")
    public ResponseEntity<String> saveAddress(@RequestBody Address addressData){
        int addressId=addressService.saveAddress(addressData);
        return new ResponseEntity<>("address saved with Id-> "+addressId, HttpStatus.OK);
    }
}
