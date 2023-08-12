package com.magnus.jpatraining.oneTomanyUniRepository;

import com.magnus.jpatraining.oneToManyUniModel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
