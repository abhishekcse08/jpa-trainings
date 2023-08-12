package com.magnus.jpatraining.service;

import com.magnus.jpatraining.model.Address;
import com.magnus.jpatraining.model.User;
import com.magnus.jpatraining.repository.AddressRepository;
import com.magnus.jpatraining.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAddressServiceImpl implements  UserAddressService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address getAddressById(Long id) {
       return addressRepository.findById(id).get();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
}
