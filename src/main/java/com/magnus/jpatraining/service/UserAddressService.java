package com.magnus.jpatraining.service;

import com.magnus.jpatraining.model.Address;
import com.magnus.jpatraining.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserAddressService {

    public Address getAddressById(Long id);
    public User getUserById(Long id);
}
