package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.dao.AddressRepository;
import com.example.Ecommerce.API.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public int saveAddress(Address addressData) {
        Address address=addressRepository.save(addressData);
        return address.getAddressId();
    }
}
