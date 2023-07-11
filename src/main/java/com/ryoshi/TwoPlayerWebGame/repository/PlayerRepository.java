package com.ryoshi.TwoPlayerWebGame.repository;

import com.ryoshi.TwoPlayerWebGame.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Long> {
}
