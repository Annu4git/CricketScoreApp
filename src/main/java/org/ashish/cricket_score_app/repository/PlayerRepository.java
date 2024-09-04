package org.ashish.cricket_score_app.repository;


import org.ashish.cricket_score_app.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
}
