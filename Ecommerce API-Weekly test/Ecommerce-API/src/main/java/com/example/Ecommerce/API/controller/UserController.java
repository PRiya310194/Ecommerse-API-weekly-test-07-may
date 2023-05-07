package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.User;
import com.example.Ecommerce.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
   @PostMapping(value="/saveUser")
 public ResponseEntity<String>saveUser(@RequestBody User userData){
       int userId=userService.saveUser(userData);
       return new ResponseEntity<>("user saved with Id-> "+userId, HttpStatus.OK);
   }
   @GetMapping(value="findById/{userId}")
    public ResponseEntity<String>getUserById(@PathVariable Integer userId){
       if(userId!=null){
           String user=userService.findUserById(userId);
           return new ResponseEntity<>(user,HttpStatus.FOUND);
       }
       else{
           return new ResponseEntity<>("please enter valid id ",HttpStatus.BAD_REQUEST);
       }
   }

}
