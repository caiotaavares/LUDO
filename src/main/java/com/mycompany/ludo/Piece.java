/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ludo;

/**
 *
 * @author caiotavares
 */
public class Piece {
    public String color;
    public int position;
    public boolean started;

    public Piece(String color, int position, boolean started) {
        this.color = color;
        this.position = position;
        this.started = started;
    }

    @Override
    public String toString() {
        return "Piece{" + "color=" + color + ", position=" + position + ", started=" + started + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
