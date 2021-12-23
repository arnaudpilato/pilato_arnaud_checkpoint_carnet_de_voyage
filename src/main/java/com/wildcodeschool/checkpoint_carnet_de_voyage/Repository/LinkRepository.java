package com.wildcodeschool.checkpoint_carnet_de_voyage.Repository;

import com.wildcodeschool.checkpoint_carnet_de_voyage.Entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
}
