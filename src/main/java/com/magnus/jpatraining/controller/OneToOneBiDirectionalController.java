package com.magnus.jpatraining.controller;

import com.magnus.jpatraining.model.Address;
import com.magnus.jpatraining.model.User;
import com.magnus.jpatraining.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToOneBiDirectionalController {

    @Autowired
    UserAddressService userAddressService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        ResponseEntity<User> response = new ResponseEntity<>(userAddressService.getUserById(id), HttpStatus.OK);
        return response;
    }


    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id){
        ResponseEntity<Address> response = new ResponseEntity<>(userAddressService.getAddressById(id), HttpStatus.OK);
        return response;
    }
}
