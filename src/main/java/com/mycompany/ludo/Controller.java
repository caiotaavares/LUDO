/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ludo;

/**
 *
 * @author caiotavares
 */
public class Controller {
    
    public int DiceByPlayer(Player actualPlayer) {
        int roll = actualPlayer.rollDice();
        
        if (roll == 6) {
            
        } else {
            
        }
        
        return roll;
    }
    
    public Player startGame() {
        
        Piece bluePlayerPiece1 = new Piece("blue", 0, false);
        Piece bluePlayerPiece2 = new Piece("blue", 0, false);
        Piece bluePlayerPiece3 = new Piece("blue", 0, false);
        Piece bluePlayerPiece4 = new Piece("blue", 0, false);
        Player bluePlayer = new Player(
                "blue", 
                bluePlayerPiece1,bluePlayerPiece2,
                bluePlayerPiece3, bluePlayerPiece4
                );
        
        return bluePlayer; 
    }
}
