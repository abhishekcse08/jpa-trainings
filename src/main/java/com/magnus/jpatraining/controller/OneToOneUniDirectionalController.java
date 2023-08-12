package com.magnus.jpatraining.controller;

import com.magnus.jpatraining.model.CustomAddress;
import com.magnus.jpatraining.model.CustomOrder;
import com.magnus.jpatraining.service.CustomAddressService;
import com.magnus.jpatraining.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToOneUniDirectionalController {

    @Autowired
    OrderService orderService;

    @Autowired
    CustomAddressService customAddressService;

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<CustomOrder> getData(@PathVariable Long id){
        ResponseEntity<CustomOrder> response =  new ResponseEntity<>(orderService.getOrderDetails(id), HttpStatus.OK);
      return response;
    }

    @PostMapping("/sendOrder")
    public ResponseEntity<CustomOrder> postOrder(@RequestBody CustomOrder order){
          orderService.saveOrder(order);
          ResponseEntity<CustomOrder> response =  new ResponseEntity<>(orderService.getOrderDetails(order.getId()), HttpStatus.OK);
        return response;
    }

    @PostMapping("/addAddress")
    public void addAddress(@RequestBody CustomAddress address){
        customAddressService.saveAddress(address);
    }
}
