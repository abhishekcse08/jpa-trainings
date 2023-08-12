package com.magnus.jpatraining.service;

import com.magnus.jpatraining.model.CustomOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public void saveOrder(CustomOrder order);

    public CustomOrder getOrderDetails(Long  id);
}
