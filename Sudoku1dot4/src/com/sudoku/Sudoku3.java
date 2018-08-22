/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Sudoku3 extends JFrame {

    public int[][] matriz = new int[9][9];

    public Sudoku3() {
        this.setLayout(new GridBagLayout());
        this.setLayout(new GridLayout(9, 9));
        GridBagConstraints gbc = new GridBagConstraints();

        RellenoDeCasillas();

        this.mostrar();
    }

    public void mostrar() {
        CreacionDeCasillas();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        //this.pack();
        this.setResizable(false);
//        AgregarBoton();
    }

    public void CreacionDeCasillas() {
        this.setLayout(new GridLayout(10, 9, 5, 5));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(i + " ");
                System.out.println(j + " ");
                JTextField txt = new JTextField(String.valueOf(i) + " - "
                        + String.valueOf(j));

                txt.setPreferredSize(new Dimension(30, 30));
                this.add(txt);

            }

        }
        AgregarBotones();
        //JButton btnSalir = new JButton("EXIT");
        //btnSalir.setPreferredSize(new Dimension(90, 30));
        
        //btnSalir.setPreferredSize(new Dimension(90,30));
        //this.add(btnSalir);

    }

    public void RellenoDeCasillas() {
        Random rnd = new Random();

    }

    public void listener() {
        //this.addMouseListener();
    }

    public void AgregarBotones() {
        for (int i = 0; i < 9; i++) {
            JButton btnNumero = new JButton(String.valueOf(i));
            this.add(btnNumero);
        }
        //this.add(btnExit, gbc);
    }

    public static void main(String[] args) {
        Sudoku3 sdk = new Sudoku3();

    }
}
