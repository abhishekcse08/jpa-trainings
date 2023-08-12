package com.magnus.jpatraining.oneTomanyUniRepository;

import com.magnus.jpatraining.oneToManyUniModel.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University,Long> {
}
