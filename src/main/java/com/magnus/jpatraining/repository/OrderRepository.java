package com.magnus.jpatraining.repository;

import com.magnus.jpatraining.model.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<CustomOrder,Long> {
}
