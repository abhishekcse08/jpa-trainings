package com.magnus.jpatraining.model;

import javax.persistence.*;


@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name="address_id",referencedColumnName = "id")
    private Address address;

}
