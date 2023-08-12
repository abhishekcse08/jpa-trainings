package com.magnus.jpatraining.oneToManyUniModel;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String indexNumber;

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
