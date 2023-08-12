package com.magnus.jpatraining.controller;

import com.magnus.jpatraining.oneToManyBiModel.Cart;
import com.magnus.jpatraining.oneToManyBiModel.Item;
import com.magnus.jpatraining.oneToManyBiRepository.CartRepository;
import com.magnus.jpatraining.oneToManyBiRepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class OneToManyBiDirectionalController {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/saveItem")
    public void saveItems(){
        Cart c = new Cart("C001");

        Item desk = new Item("D001",c);
        Item pen = new Item("P002",c);

        List<Item> items = Arrays.asList(desk,pen);
        c.setListItem(items);
        cartRepository.save(c);

    }


    @GetMapping("/getItem")
    public void getItems(){
       // Cart c = new Cart("C001");

        //Item desk = new Item("D001",c);
        //Item pen = new Item("P002",c);

        //List<Item> items = Arrays.asList(desk,pen);
        //c.setListItem(items);
        //cartRepository.save(c);

        System.out.println(cartRepository.findById(9L).get());

        System.out.println(itemRepository.findById(10L).get());
    }


}
