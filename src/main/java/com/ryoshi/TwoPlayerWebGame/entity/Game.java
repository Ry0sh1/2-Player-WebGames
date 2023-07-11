package com.ryoshi.TwoPlayerWebGame.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean turn;
    @OneToOne
    private Board board;
    @OneToMany
    private List<Player> players;

    public Game(long id, boolean turn, Board board, List<Player> players) {
        this.id = id;
        this.turn = turn;
        this.board = board;
        this.players = players;
    }

    public Game() {
    }

    public Game(boolean turn, Board board, List<Player> players) {
        this.turn = turn;
        this.board = board;
        this.players = players;
    }

    public Game(boolean turn) {
        this.turn = turn;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
}
