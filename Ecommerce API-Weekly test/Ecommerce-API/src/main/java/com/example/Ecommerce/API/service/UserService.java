package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.dao.UserRepository;
import com.example.Ecommerce.API.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public int saveUser(User userData) {
User user=userRepository.save(userData);
return user.getUserId();
    }

    public String findUserById(Integer userId) {
        if(userRepository.findById(userId).isPresent()){
            User user=userRepository.findById(userId).get();
            return user.toString();
        }
        else{
            return "please enter valid userId";
        }
    }
}
