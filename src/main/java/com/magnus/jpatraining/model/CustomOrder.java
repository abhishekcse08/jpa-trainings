package com.magnus.jpatraining.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "custom_Order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderName;
    private String trackingNumber;
    private int quantity;
    private double price;
    private String status;

    @OneToOne
    @JoinColumn(name="address_id",referencedColumnName = "id")
    private CustomAddress customAddress;

}
