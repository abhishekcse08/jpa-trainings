package com.magnus.jpatraining.service;

import com.magnus.jpatraining.model.CustomOrder;
import com.magnus.jpatraining.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void saveOrder(CustomOrder order) {

          orderRepository.save(order);

    }

    @Override
    public CustomOrder getOrderDetails(Long id) {
      return  orderRepository.findById(id).get();
    }
}
