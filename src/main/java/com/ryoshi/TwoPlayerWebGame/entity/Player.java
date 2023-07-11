package com.ryoshi.TwoPlayerWebGame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private boolean symbol;

    public Player(long id, String name, boolean symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public Player() {
    }

    public Player(String name, boolean symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSymbol() {
        return symbol;
    }

    public void setSymbol(boolean symbol) {
        this.symbol = symbol;
    }
}
