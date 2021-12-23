package com.wildcodeschool.checkpoint_carnet_de_voyage.Repository;

import com.wildcodeschool.checkpoint_carnet_de_voyage.Entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {
}
