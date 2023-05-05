/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ludo;

import java.util.Random;

/**
 *
 * @author caiotavares
 */
public class Player {
    public String color;
    public Piece piece1;
    public Piece piece2;
    public Piece piece3;
    public Piece piece4;
    
    public Player(String color, Piece piece1, Piece piece2, Piece piece3, Piece piece4) {
        this.color = color;
        this.piece1 = piece1;
        this.piece2 = piece2;
        this.piece3 = piece3;
        this.piece4 = piece4;
    }
    
    public int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Player{" + "color=" + color + ", piece1=" + piece1 + ", piece2=" + piece2 + ", piece3=" + piece3 + ", piece4=" + piece4 + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Piece getPiece1() {
        return piece1;
    }

    public void setPiece1(Piece piece1) {
        this.piece1 = piece1;
    }

    public Piece getPiece2() {
        return piece2;
    }

    public void setPiece2(Piece piece2) {
        this.piece2 = piece2;
    }

    public Piece getPiece3() {
        return piece3;
    }

    public void setPiece3(Piece piece3) {
        this.piece3 = piece3;
    }

    public Piece getPiece4() {
        return piece4;
    }

    public void setPiece4(Piece piece4) {
        this.piece4 = piece4;
    }
}
