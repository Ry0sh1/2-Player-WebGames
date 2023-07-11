package com.ryoshi.TwoPlayerWebGame.controller;

import com.ryoshi.TwoPlayerWebGame.entity.Board;
import com.ryoshi.TwoPlayerWebGame.entity.Game;
import com.ryoshi.TwoPlayerWebGame.entity.Player;
import com.ryoshi.TwoPlayerWebGame.repository.BoardRepository;
import com.ryoshi.TwoPlayerWebGame.repository.GameRepository;
import com.ryoshi.TwoPlayerWebGame.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

    private final GameRepository gameRepository;
    private final BoardRepository boardRepository;
    private final PlayerRepository playerRepository;

    public RestfulController(GameRepository gameRepository,
                             BoardRepository boardRepository,
                             PlayerRepository playerRepository) {
        this.gameRepository = gameRepository;
        this.boardRepository = boardRepository;
        this.playerRepository = playerRepository;
    }

    @GetMapping("/create-game/{username}/{symbol}")
    public void createGame(@PathVariable String username,@PathVariable boolean symbol){
        Game game = new Game(true);
        Board board = boardRepository.save(new Board(game,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1));
        game.setBoard(board);
        Player player = playerRepository.save(new Player(username,symbol));
        game.getPlayers().add(player);
        gameRepository.save(game);
    }

    @GetMapping("/reset-game/{id}")
    public void resetGame(@PathVariable long id){
        Board board = boardRepository.findByGame(gameRepository.findById(id)
                .orElseThrow());
        board.reset();
        boardRepository.save(board);
    }

}
