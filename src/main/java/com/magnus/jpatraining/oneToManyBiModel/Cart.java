package com.magnus.jpatraining.oneToManyBiModel;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
@NoArgsConstructor
@ToString
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String cartName;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Item> listItem = new ArrayList<>();

    public Cart(String cartName) {
        this.cartName = cartName;

    }

    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
    }
}
