package com.ryoshi.TwoPlayerWebGame.entity;

import jakarta.persistence.*;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Game game;

    private int x1_y1_value;
    private int x2_y1_value;
    private int x3_y1_value;
    private int x1_y2_value;
    private int x2_y2_value;
    private int x3_y2_value;
    private int x1_y3_value;
    private int x2_y3_value;
    private int x3_y3_value;

    public Board(long id, Game game, int x1_y1_value, int x2_y1_value, int x3_y1_value, int x1_y2_value, int x2_y2_value, int x3_y2_value, int x1_y3_value, int x2_y3_value, int x3_y3_value) {
        this.id = id;
        this.game = game;
        this.x1_y1_value = x1_y1_value;
        this.x2_y1_value = x2_y1_value;
        this.x3_y1_value = x3_y1_value;
        this.x1_y2_value = x1_y2_value;
        this.x2_y2_value = x2_y2_value;
        this.x3_y2_value = x3_y2_value;
        this.x1_y3_value = x1_y3_value;
        this.x2_y3_value = x2_y3_value;
        this.x3_y3_value = x3_y3_value;
    }

    public Board(Game game, int x1_y1_value, int x2_y1_value, int x3_y1_value, int x1_y2_value, int x2_y2_value, int x3_y2_value, int x1_y3_value, int x2_y3_value, int x3_y3_value) {
        this.game = game;
        this.x1_y1_value = x1_y1_value;
        this.x2_y1_value = x2_y1_value;
        this.x3_y1_value = x3_y1_value;
        this.x1_y2_value = x1_y2_value;
        this.x2_y2_value = x2_y2_value;
        this.x3_y2_value = x3_y2_value;
        this.x1_y3_value = x1_y3_value;
        this.x2_y3_value = x2_y3_value;
        this.x3_y3_value = x3_y3_value;
    }

    public Board() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getX1_y1_value() {
        return x1_y1_value;
    }

    public void setX1_y1_value(int x1_y1_value) {
        this.x1_y1_value = x1_y1_value;
    }

    public int getX2_y1_value() {
        return x2_y1_value;
    }

    public void setX2_y1_value(int x2_y1_value) {
        this.x2_y1_value = x2_y1_value;
    }

    public int getX3_y1_value() {
        return x3_y1_value;
    }

    public void setX3_y1_value(int x3_y1_value) {
        this.x3_y1_value = x3_y1_value;
    }

    public int getX1_y2_value() {
        return x1_y2_value;
    }

    public void setX1_y2_value(int x1_y2_value) {
        this.x1_y2_value = x1_y2_value;
    }

    public int getX2_y2_value() {
        return x2_y2_value;
    }

    public void setX2_y2_value(int x2_y2_value) {
        this.x2_y2_value = x2_y2_value;
    }

    public int getX3_y2_value() {
        return x3_y2_value;
    }

    public void setX3_y2_value(int x3_y2_value) {
        this.x3_y2_value = x3_y2_value;
    }

    public int getX1_y3_value() {
        return x1_y3_value;
    }

    public void setX1_y3_value(int x1_y3_value) {
        this.x1_y3_value = x1_y3_value;
    }

    public int getX2_y3_value() {
        return x2_y3_value;
    }

    public void setX2_y3_value(int x2_y3_value) {
        this.x2_y3_value = x2_y3_value;
    }

    public int getX3_y3_value() {
        return x3_y3_value;
    }

    public void setX3_y3_value(int x3_y3_value) {
        this.x3_y3_value = x3_y3_value;
    }

    public void reset(){
        x1_y1_value = -1;
        x2_y1_value = -1;
        x3_y1_value = -1;
        x1_y2_value = -1;
        x2_y2_value = -1;
        x3_y2_value = -1;
        x1_y3_value = -1;
        x2_y3_value = -1;
        x3_y3_value = -1;
    }

}
