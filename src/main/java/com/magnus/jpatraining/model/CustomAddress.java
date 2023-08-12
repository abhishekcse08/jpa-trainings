package com.magnus.jpatraining.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="custom_Address")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String state;
    private String country;
    private String zip_code;
    private String street;


}
