package com.magnus.jpatraining.oneToManyBiRepository;

import com.magnus.jpatraining.oneToManyBiModel.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
}
