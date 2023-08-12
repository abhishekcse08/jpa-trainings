package com.magnus.jpatraining.service;

import com.magnus.jpatraining.model.CustomAddress;
import com.magnus.jpatraining.repository.CustomAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomAddressServiceImpl implements CustomAddressService{
    @Autowired
    CustomAddressRepository customAddressRepository;


    @Override
    public void saveAddress(CustomAddress address) {
        customAddressRepository.save(address);
    }
}
