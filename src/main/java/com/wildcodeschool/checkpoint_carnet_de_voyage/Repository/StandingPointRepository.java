package com.wildcodeschool.checkpoint_carnet_de_voyage.Repository;

import com.wildcodeschool.checkpoint_carnet_de_voyage.Entity.StandingPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandingPointRepository extends JpaRepository<StandingPoint, Long> {
}
