package com.magnus.jpatraining.manyTomanyRepository;

import com.magnus.jpatraining.manyToManyModel.StudentCollege;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentCollegeRepository extends JpaRepository<StudentCollege,Long> {

    List<StudentCollege> findByNameContaining(String name);
}
