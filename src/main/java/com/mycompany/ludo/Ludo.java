/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ludo;

import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author caiotavares
 */
public class Ludo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        GUI gui = new GUI();
        Controller controller = new Controller();
        
        JFrame frame = new JFrame("Ludo");
        frame.add(gui);
        frame.pack();
        frame.setVisible(true);
        
        Piece bluePlayerPiece1 = new Piece("blue", 0, false);
        Piece bluePlayerPiece2 = new Piece("blue", 0, false);
        Piece bluePlayerPiece3 = new Piece("blue", 0, false);
        Piece bluePlayerPiece4 = new Piece("blue", 0, false);
        Player bluePlayer = new Player(
                "blue", 
                bluePlayerPiece1,bluePlayerPiece2,
                bluePlayerPiece3, bluePlayerPiece4
                );
        gui.setBluePlayer(bluePlayer);
    }
}
