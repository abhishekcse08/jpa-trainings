package com.magnus.jpatraining.manyToManyModel;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student_tbl")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCollege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private String dept;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL )
    @JoinTable(name = "student_course",
    joinColumns = {
            @JoinColumn(name = "student_id",referencedColumnName = "id"),

    },
            inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "id")}

    )
    private Set<Course> courses;
}
