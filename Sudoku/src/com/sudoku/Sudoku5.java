/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Sudoku5 extends JFrame implements MouseListener {

    JButton btnNumero1 = new JButton("1");
    JButton btnNumero2 = new JButton("2");
    JButton btnNumero3 = new JButton("3");
    JButton btnNumero4 = new JButton("4");
    JButton btnNumero5 = new JButton("5");
    JButton btnNumero6 = new JButton("6");
    JButton btnNumero7 = new JButton("7");
    JButton btnNumero8 = new JButton("8");
    JButton btnNumero9 = new JButton("9");
    JTextField jtf = new JTextField("hola");
    public JTextField txt = new JTextField();
    public int[][] matriz = new int[9][9];
    JButton btnPrueba = new JButton("prueba");
    

    public ArrayList nombreDeCaja = new ArrayList();

    public Sudoku5() {
        this.setLayout(new GridBagLayout());
        this.setLayout(new GridLayout(9, 9));
        GridBagConstraints gbc = new GridBagConstraints();
        RellenoDeCasillas();
        txt.addMouseListener((MouseListener) this);

        this.mostrar();

        btnPrueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        listener();
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
        this.setLayout(new GridLayout(11, 9, 5, 5));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                txt = new JTextField();
                txt.setName(String.valueOf(i).concat(String.valueOf(j)));
                nombreDeCaja.add(i + j, txt.getName());
                System.out.println("El nombre es: " + txt.getName());
                txt.setText(String.valueOf(i).concat(String.valueOf(j)));
                txt.setPreferredSize(new Dimension(30, 30));
                this.add(txt);

            }
            txt.requestFocus();
//            for(Object o: nombreDeCaja){
//                System.out.println(o);
//            }
            System.out.println(txt.getName());
            switch (txt.getName()){
                case "88" :
                    System.out.println("caso 00: "+ txt.getText());
                break;
                default:
                    System.out.println("aasdas");
                    break;
            }
        }
        AgregarBotones();
        this.add(btnPrueba);
    }
    
    public void ingresoDeNumeros(){
        
            
    }

    public void RellenoDeCasillas() {
        Random rnd = new Random();

    }

    public void listener() {
        btnNumero1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 1");

            }

        });

        btnNumero2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 2");
            }

        });

        btnNumero3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 3");
            }

        });

        btnNumero4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 4");
            }

        });

        btnNumero5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 5");
            }

        });

        btnNumero6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 6");

            }

        });

        btnNumero7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 7");
            }

        });

        btnNumero8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 8");
            }

        });

        btnNumero9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola 9");
            }

        });

    }

    public void AgregarBotones() {
        this.add(btnNumero1);
        this.add(btnNumero2);
        this.add(btnNumero3);
        this.add(btnNumero4);
        this.add(btnNumero5);
        this.add(btnNumero6);
        this.add(btnNumero7);
        this.add(btnNumero8);
        this.add(btnNumero9);
    }

    public static void main(String[] args) {
        Sudoku5 sdk = new Sudoku5();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(txt.isFocusable()){
            jtf.setText("ASdasd");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//
//        btnNumero.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource().equals("1")) {
//                    System.out.println("//////////////////");
//                }
//            }
//        });
//
//for (int i = 1; i <= 9; i++) {
//            btnNumero = new JButton(String.valueOf(i));
//            this.add(btnNumero);
//            btnNumero.setName(String.valueOf(i));
//            //System.out.println(btnNumero.getName());
//        }
