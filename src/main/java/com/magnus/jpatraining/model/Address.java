package com.magnus.jpatraining.model;


import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    @OneToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;

    public Address() {
    }

    public Address(String street){
        this.street=street;
    }

}
