/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Sudoku2 extends JFrame{
    
    public Sudoku2(){ 
        this.setLayout(new GridBagLayout());
        this.setLayout(new GridLayout(9, 9));
        
        RellenoDeCasillas();
        
        this.mostrar();
    }
    public void mostrar(){
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(300,300);
        this.pack();
    }
    
    public void RellenoDeCasillas(){
        Random rnd = new Random();
        
        for(int i=0;i<81;i++){
            int numeroRandom = (rnd.nextInt(9)+1);
            Point rv = null;
            JTextField txt = new JTextField(" - " + numeroRandom);
            int nn = 1;
            int mm = 1;
            nn = txt.getX();
            nn = txt.getY();
            System.out.println("X = "+ nn + " Y = "+mm);
            txt.setPreferredSize(new Dimension(30,30));
            txt.setName(String.valueOf(i));
            System.out.println(txt);
            this.setResizable(true);
            this.add(txt);
        }
    }
    
    public void listener(){
        //this.addMouseListener();
    }
    
    public static void main(String[] args) {
        Sudoku2 sdk = new Sudoku2();
        
    }
}
