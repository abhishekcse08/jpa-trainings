package com.magnus.jpatraining.service;

import com.magnus.jpatraining.model.CustomAddress;
import org.springframework.stereotype.Service;

@Service
public interface CustomAddressService {

    public void saveAddress(CustomAddress address);
}
