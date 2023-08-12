package com.magnus.jpatraining.repository;

import com.magnus.jpatraining.model.CustomAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomAddressRepository extends JpaRepository<CustomAddress,Long> {
}
