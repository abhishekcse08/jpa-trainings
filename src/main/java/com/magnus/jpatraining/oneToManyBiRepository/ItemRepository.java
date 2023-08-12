package com.magnus.jpatraining.oneToManyBiRepository;

import com.magnus.jpatraining.oneToManyBiModel.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
