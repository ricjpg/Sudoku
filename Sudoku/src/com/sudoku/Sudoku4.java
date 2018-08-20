/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Ricardo Guardiola
 *
 */
public class Sudoku4 extends JFrame implements ActionListener {
    public boolean hayDuplicado= false;
    public int cont = 0;
    public String[][] matriz = new String[9][9];
    public ArrayList matriz2 = new ArrayList();
    public ArrayList matriz3 = new ArrayList();
    Random rnd = new Random();
    JFrame frame = new JFrame("SUDOKU");
    JPanel panel = new JPanel();
    public int g = 0;
    public int x = 0;
    public int y = 0;
    //Creacion de Cajas
    JTextField txt00 = new JTextField();
    JTextField txt01 = new JTextField();
    JTextField txt02 = new JTextField();
    JTextField txt03 = new JTextField();
    JTextField txt04 = new JTextField();
    JTextField txt05 = new JTextField();
    JTextField txt06 = new JTextField();
    JTextField txt07 = new JTextField();
    JTextField txt08 = new JTextField();

    JTextField txt10 = new JTextField();
    JTextField txt11 = new JTextField();
    JTextField txt12 = new JTextField();
    JTextField txt13 = new JTextField();
    JTextField txt14 = new JTextField();
    JTextField txt15 = new JTextField();
    JTextField txt16 = new JTextField();
    JTextField txt17 = new JTextField();
    JTextField txt18 = new JTextField();

    JTextField txt20 = new JTextField();
    JTextField txt21 = new JTextField();
    JTextField txt22 = new JTextField();
    JTextField txt23 = new JTextField();
    JTextField txt24 = new JTextField();
    JTextField txt25 = new JTextField();
    JTextField txt26 = new JTextField();
    JTextField txt27 = new JTextField();
    JTextField txt28 = new JTextField();

    JTextField txt30 = new JTextField();
    JTextField txt31 = new JTextField();
    JTextField txt32 = new JTextField();
    JTextField txt33 = new JTextField();
    JTextField txt34 = new JTextField();
    JTextField txt35 = new JTextField();
    JTextField txt36 = new JTextField();
    JTextField txt37 = new JTextField();
    JTextField txt38 = new JTextField();

    JTextField txt40 = new JTextField();
    JTextField txt41 = new JTextField();
    JTextField txt42 = new JTextField();
    JTextField txt43 = new JTextField();
    JTextField txt44 = new JTextField();
    JTextField txt45 = new JTextField();
    JTextField txt46 = new JTextField();
    JTextField txt47 = new JTextField();
    JTextField txt48 = new JTextField();

    JTextField txt50 = new JTextField();
    JTextField txt51 = new JTextField();
    JTextField txt52 = new JTextField();
    JTextField txt53 = new JTextField();
    JTextField txt54 = new JTextField();
    JTextField txt55 = new JTextField();
    JTextField txt56 = new JTextField();
    JTextField txt57 = new JTextField();
    JTextField txt58 = new JTextField();

    JTextField txt60 = new JTextField();
    JTextField txt61 = new JTextField();
    JTextField txt62 = new JTextField();
    JTextField txt63 = new JTextField();
    JTextField txt64 = new JTextField();
    JTextField txt65 = new JTextField();
    JTextField txt66 = new JTextField();
    JTextField txt67 = new JTextField();
    JTextField txt68 = new JTextField();

    JTextField txt70 = new JTextField();
    JTextField txt71 = new JTextField();
    JTextField txt72 = new JTextField();
    JTextField txt73 = new JTextField();
    JTextField txt74 = new JTextField();
    JTextField txt75 = new JTextField();
    JTextField txt76 = new JTextField();
    JTextField txt77 = new JTextField();
    JTextField txt78 = new JTextField();

    JTextField txt80 = new JTextField();
    JTextField txt81 = new JTextField();
    JTextField txt82 = new JTextField();
    JTextField txt83 = new JTextField();
    JTextField txt84 = new JTextField();
    JTextField txt85 = new JTextField();
    JTextField txt86 = new JTextField();
    JTextField txt87 = new JTextField();
    JTextField txt88 = new JTextField();

    //Creacion de Botones
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");

    public Sudoku4() {
        panel.setLayout(new GridBagLayout());
        this.add(panel);
        Mostrar();
        Arreglo();
        
    }

    public void Mostrar() {
        GenerarIU();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(false);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                extraerNumeros();
//                if (txt00.getText().equals(txt10.getText())) {
//                    System.out.println("error");
//                    txt00.setText("");
//                    txt10.setText("");
//                } else {
//                    System.out.println("aprove");
//                }
                //extraerNumeros();
                String indice;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 3; j++) {
                        indice = String.valueOf(i).concat(String.valueOf(j));
//                        System.out.println("INDICE: "+indice);
//                        System.out.println("El arreglo# " + i + j + " contiene: "
//                                + matriz[i][j]);
                    }
                }
//                System.out.println("JTextField "+txt00.getName()+" :"+txt00.getText());
//                System.out.println("JTextField: "+txt11.getText());
//                System.out.println("JTextField: "+txt22.getText());
//                System.out.println("JTextField: "+txt21.getText());
//                System.out.println("JTextField: "+txt42.getText());
//                System.out.println("JTextField: "+txt12.getText());
//                System.out.println("JTextField: "+txt52.getText());
//                System.out.println("JTextField: "+txt68.getText());
//                System.out.println("JTextField: "+txt87.getText());
//                matriz[2][2]= txt22.getText();
//                
//                System.out.println("matriz22: "+matriz[0][0]);
                Verificador();
                
            }
            
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                extraerNumeros();
                for(int i=0;i<9;i++){
                    for(int j=0;j<3;j++){
                        matriz[i][j] = "";
                    }
                }
            }
        });

    }

    public void GenerarIU() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 10;
        gbc.ipady = 10;
        
        //Definiendo el Tamano de las cajas
        txt00.setPreferredSize(new Dimension(30, 30));
        txt10.setPreferredSize(new Dimension(30, 30));
        txt20.setPreferredSize(new Dimension(30, 30));
        txt30.setPreferredSize(new Dimension(30, 30));
        txt40.setPreferredSize(new Dimension(30, 30));
        txt50.setPreferredSize(new Dimension(30, 30));
        txt60.setPreferredSize(new Dimension(30, 30));
        txt70.setPreferredSize(new Dimension(30, 30));
        txt80.setPreferredSize(new Dimension(30, 30));

        ///////////////////////////////////////////////////////////////////////
        //MATRIZ 00
        int x = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(txt00, gbc);
        x = rnd.nextInt(9) + 1;
        txt00.setText(String.valueOf(x));
        matriz[0][0] = txt00.getText();
        matriz2.add(txt00.getText());
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(txt01, gbc);
        matriz[0][1] = txt01.getText();
        matriz2.add(txt01.getText());
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(txt02, gbc);
        matriz[0][2] = txt02.getText();
        //matriz[0][2] = Integer.parseInt(txt02.getText());
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(txt10, gbc);
        matriz[1][0] = txt10.getText();
        //matriz[1][0] = txt10.getText();
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(txt11, gbc);
        matriz[1][1] = txt11.getText();
        //matriz[1][1] = txt11.getText();
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(txt12, gbc);
        matriz[1][2] = txt12.getText();
        //matriz[1][2] = txt12.getText();
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(txt20, gbc);
        x = rnd.nextInt(9) + 1;
        txt20.setText(String.valueOf(x));
        matriz[2][0] = txt20.getText();
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(txt21, gbc);
        matriz[2][1] = txt21.getText();
        //matriz[2][1] = txt21.getText();
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(txt22, gbc);
        matriz[2][2] = txt22.getText();
        //matriz[2][2] = txt22.getText();
        //////////////////////////////////////////////////////////////////////
        //MATRIZ 10
//        gbc.gridx = 3;
//        gbc.gridy = 0;
//        this.add(txt30, gbc);
//
//        // matriz[3][0] = txt30.getText();
//        gbc.gridx = 3;
//        gbc.gridy = 1;
//        this.add(txt31, gbc);
//        // matriz[3][1] = txt31.getText();
//        gbc.gridx = 3;
//        gbc.gridy = 2;
//        this.add(txt32, gbc);
//        // matriz[3][2] = txt32.getText();
//        gbc.gridx = 4;
//        gbc.gridy = 0;
//        this.add(txt40, gbc);
//        x = rnd.nextInt(9) + 1;
//        txt40.setText(String.valueOf(x));
//        gbc.gridx = 4;
//        gbc.gridy = 1;
//        this.add(txt41, gbc);
//        // matriz[4][1] = txt41.getText();
//        gbc.gridx = 4;
//        gbc.gridy = 2;
//        this.add(txt42, gbc);
//        // matriz[4][2] = txt42.getText();
//        gbc.gridx = 5;
//        gbc.gridy = 0;
//        this.add(txt50, gbc);
//        //matriz[5][0] = txt50.getText();
//        gbc.gridx = 5;
//        gbc.gridy = 1;
//        this.add(txt51, gbc);
//        //  matriz[5][1] = txt51.getText();
//        gbc.gridx = 5;
//        gbc.gridy = 2;
//        this.add(txt52, gbc);
//        // matriz[5][2] = txt52.getText();
//        //////////////////////////////////////////////////////////////////////
//        //MATRIZ 20
//        gbc.gridx = 6;
//        gbc.gridy = 0;
//        this.add(txt60, gbc);
//        txt60.setBackground(Color.lightGray);
//        x = rnd.nextInt(9) + 1;
//        txt60.setText(String.valueOf(x));
//        gbc.gridx = 6;
//        gbc.gridy = 1;
//        this.add(txt61, gbc);
//        // matriz[6][1] = txt61.getText();
//        gbc.gridx = 6;
//        gbc.gridy = 2;
//        this.add(txt62, gbc);
//        //  matriz[6][2] = txt62.getText();
//        gbc.gridx = 7;
//        gbc.gridy = 0;
//        this.add(txt70, gbc);
//        //  matriz[7][0] = txt70.getText();
//        gbc.gridx = 7;
//        gbc.gridy = 1;
//        this.add(txt71, gbc);
//        //  matriz[7][1] = txt71.getText();
//        gbc.gridx = 7;
//        gbc.gridy = 2;
//        this.add(txt72, gbc);
//        txt72.setName(txt72.getText());
//        //  matriz[7][2] = txt72.getText();
//        gbc.gridx = 8;
//        gbc.gridy = 0;
//        this.add(txt80, gbc);
//        x = rnd.nextInt(9) + 1;
//        txt80.setText(String.valueOf(x));
//        gbc.gridx = 8;
//        gbc.gridy = 1;
//        this.add(txt81, gbc);
//        //  matriz[8][1] = txt81.getText();
//        gbc.gridx = 8;
//        gbc.gridy = 2;
//        this.add(txt82, gbc);
        // matriz[8][2] = txt82.getText();
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(btn0,gbc);
        gbc.gridx = 5;
        gbc.gridy = 5;
        this.add(btn1,gbc);
        
        GenerarNumeros();
        NombresDeCajas();
        Arreglo();
        //Llenar();
        //txt82.setText("82");
        // matriz[8][2] = String.valueOf(txt82.getText());
        System.out.println(matriz[0][1]);
        
    }

    public void Verificador() {
        extraerNumeros();
        String indice;
        System.out.println(hayDuplicado);
        for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        indice = String.valueOf(i).concat(String.valueOf(j));
                        //System.out.println("INDICE: "+indice);
                        System.out.println("El arreglo# " + i + j + " contiene: "
                                + matriz[i][j]);
                    }
                }
//        if(matriz[0][0].equals(matriz[2][2])){
//            //hayDuplicado = true;
//        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[0][i]!=(matriz[j][0])){
                    hayDuplicado = true;
                }
            }
        }
//        while(hayDuplicado){
//            if(matriz[i][j]==matriz[2][2]){
//                
//            }
//        }
        System.out.println("HAY DUPLICADOS: "+ hayDuplicado);

    }

    public void extraerNumeros() {
        matriz[0][0] = txt00.getText();
        matriz[0][1] = txt01.getText();
        matriz[0][2] = txt02.getText();
        
        matriz[1][0] = txt10.getText();
        matriz[1][1] = txt11.getText();
        matriz[1][2] = txt12.getText();

        matriz[2][0] = txt20.getText();
        matriz[2][1] = txt21.getText();
        matriz[2][2] = txt22.getText();

        matriz[3][0] = txt30.getText();
        matriz[3][1] = txt31.getText();
        matriz[3][2] = txt32.getText();

        matriz[4][0] = txt40.getText();
        matriz[4][1] = txt41.getText();
        matriz[4][2] = txt42.getText();

        matriz[5][0] = txt50.getText();
        matriz[5][1] = txt51.getText();
        matriz[5][2] = txt52.getText();

        matriz[6][0] = txt60.getText();
        matriz[6][1] = txt61.getText();
        matriz[6][2] = txt62.getText();

        matriz[7][0] = txt70.getText();
        matriz[7][1] = txt71.getText();
        matriz[7][2] = txt72.getText();

        matriz[8][0] = txt80.getText();
        matriz[8][1] = txt81.getText();
        matriz[8][2] = txt82.getText();

    }

    public void NombresDeCajas() {
        txt00.setName("00");
        txt01.setName("01");
        txt02.setName("02");
        txt03.setName("03");
        txt04.setName("04");
        txt05.setName("05");
        txt06.setName("06");
        txt07.setName("07");
        txt08.setName("08");

        txt10.setName("10");
        txt11.setName("11");
        txt12.setName("12");
        txt13.setName("13");
        txt14.setName("14");
        txt15.setName("15");
        txt16.setName("16");
        txt17.setName("17");
        txt18.setName("18");

        txt20.setName("20");
        txt21.setName("21");
        txt22.setName("22");
        txt23.setName("23");
        txt24.setName("24");
        txt25.setName("25");
        txt26.setName("26");
        txt27.setName("27");
        txt28.setName("28");

        txt30.setName("30");
        txt31.setName("31");
        txt32.setName("32");
        txt33.setName("33");
        txt34.setName("34");
        txt35.setName("35");
        txt36.setName("36");
        txt37.setName("37");
        txt38.setName("38");

        txt40.setName("40");
        txt41.setName("41");
        txt42.setName("42");
        txt43.setName("43");
        txt44.setName("44");
        txt45.setName("45");
        txt46.setName("46");
        txt47.setName("47");
        txt48.setName("48");

        txt50.setName("50");
        txt51.setName("51");
        txt52.setName("52");
        txt53.setName("53");
        txt54.setName("54");
        txt55.setName("55");
        txt56.setName("56");
        txt57.setName("57");
        txt58.setName("58");

        txt60.setName("60");
        txt61.setName("61");
        txt62.setName("62");
        txt63.setName("63");
        txt64.setName("64");
        txt65.setName("65");
        txt66.setName("66");
        txt67.setName("67");
        txt68.setName("68");

        txt70.setName("70");
        txt71.setName("71");
        txt72.setName("72");
        txt73.setName("73");
        txt74.setName("74");
        txt75.setName("75");
        txt76.setName("76");
        txt77.setName("77");
        txt78.setName("78");

        txt80.setName("80");
        txt81.setName("81");
        txt82.setName("82");
        txt83.setName("83");
        txt84.setName("84");
        txt85.setName("85");
        txt86.setName("86");
        txt87.setName("87");
        txt88.setName("88");

    }

    public void Arreglo() {
//        for(int x = 0; x<9; x++){
//            for (int y = 0; y<0;y++){
//                switch (matriz[x][y]){
//                    case 1:
//                        System.out.println("caso 1");
//                        break;
//                        
//                    case 2:
//                        System.out.println("caso 2");
//                        break;
//                        
//                    case 3:
//                        System.out.println("caso 3");
//                        break;
//                        
//                    case 4:
//                        System.out.println("caso 4");
//                        break;
//                        
//                    case 5:
//                        System.out.println("caso 5");
//                        break;
//                        
//                }
//            }
//        }

    }

    public void Distribucion() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 5;
        gbc.ipady = 5;

    }

    public void GenerarNumeros() {

        txt00.setBackground(Color.lightGray);
        txt20.setBackground(Color.lightGray);
        txt40.setBackground(Color.lightGray);
        //txt60.setBackground(Color.);
//        txt80.setBackground(Color.RGBtoHSB(240, 240, 240, float[] hsb = {11.0f,0.0f,94.0f}));
    }

    public static void main(String[] args) {
        Sudoku4 sdk = new Sudoku4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
