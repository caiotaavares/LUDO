/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ludo;

import javax.swing.JFrame;

/**
 *
 * @author caiotavares
 */
public class Ludo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        GUI gui = new GUI();
        
        JFrame frame = new JFrame("Ludo");
        frame.add(gui);
        frame.pack();
        frame.setVisible(true);
    }
}