/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Sudoku1 {

    JFrame frame = new JFrame("SUDOKU 1.0");
    JPanel panel = new JPanel();
    JLabel lblHola = new JLabel("Hola!");
    JTextField txt00 = new JTextField("00");
    JTextField txt01 = new JTextField("01");
    JTextField txt02 = new JTextField("02");
    JTextField txt10 = new JTextField("10");
    JTextField txt11 = new JTextField("11");
    JTextField txt12 = new JTextField("12");
    JTextField txt20 = new JTextField("20");
    JTextField txt21 = new JTextField("21");
    JTextField txt22 = new JTextField("22");

    
    public Sudoku1(){
        panel.setLayout(new GridLayout(3, 3, 2, 2));
        panel.add(lblHola);
        frame.add(txt00);
        frame.add(txt01);
        frame.add(txt02);
        frame.add(txt10);
        frame.add(txt11);
        frame.add(txt12);
        frame.add(txt20);
        frame.add(txt21);
        frame.add(txt22);
        
        txt00.setSize(new Dimension(20,20));
        txt01.setSize(new Dimension(20,20));
        txt02.setSize(new Dimension(20,20));
        txt10.setSize(new Dimension(20,20));
        txt11.setSize(new Dimension(20,20));
        txt12.setSize(new Dimension(20,20));
        txt20.setSize(new Dimension(20,20));
        txt21.setSize(new Dimension(20,20));
        txt22.setSize(new Dimension(20,20));
        
        
        
        frame.setPreferredSize(new Dimension(300,300));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Sudoku1();
            }
            
        });
        
    }
    
}
