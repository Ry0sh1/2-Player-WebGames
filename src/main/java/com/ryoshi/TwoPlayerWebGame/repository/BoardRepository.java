package com.ryoshi.TwoPlayerWebGame.repository;

import com.ryoshi.TwoPlayerWebGame.entity.Board;
import com.ryoshi.TwoPlayerWebGame.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<Board,Long> {

    Board findByGame(Game game);

}
