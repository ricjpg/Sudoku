/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudoku;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Ricardo Guardiola
 *
 */
public class Sudoku4 extends JFrame implements ActionListener {

    public boolean hayDuplicado = false;
    public int cont = 0;
    public String[][] matriz = new String[9][9];
    Random rnd = new Random();
    JFrame frame = new JFrame("SUDOKU");
    JPanel panel = new JPanel();
    public int x = 0;
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
    JButton btn0 = new JButton();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();

    public Sudoku4() {
        panel.setLayout(new GridBagLayout());
        this.add(panel);
        Mostrar();
        GenerarNumeros();

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
                ValidadorGeneral();
            }

        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Limpiar();
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

        int x = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(txt00, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(txt01, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(txt02, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(txt03, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(txt04, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        this.add(txt05, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        this.add(txt06, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        this.add(txt07, gbc);
        gbc.gridx = 0;
        gbc.gridy = 8;
        this.add(txt08, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(txt10, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(txt11, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(txt12, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(txt13, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        this.add(txt14, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        this.add(txt15, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        this.add(txt16, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        this.add(txt17, gbc);
        gbc.gridx = 1;
        gbc.gridy = 8;
        this.add(txt18, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(txt20, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(txt21, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(txt22, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(txt23, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(txt24, gbc);
        gbc.gridx = 2;
        gbc.gridy = 5;
        this.add(txt25, gbc);
        gbc.gridx = 2;
        gbc.gridy = 6;
        this.add(txt26, gbc);
        gbc.gridx = 2;
        gbc.gridy = 7;
        this.add(txt27, gbc);
        gbc.gridx = 2;
        gbc.gridy = 8;
        this.add(txt28, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        this.add(txt30, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        this.add(txt31, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        this.add(txt32, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        this.add(txt33, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        this.add(txt34, gbc);
        gbc.gridx = 3;
        gbc.gridy = 5;
        this.add(txt35, gbc);
        gbc.gridx = 3;
        gbc.gridy = 6;
        this.add(txt36, gbc);
        gbc.gridx = 3;
        gbc.gridy = 7;
        this.add(txt37, gbc);
        gbc.gridx = 3;
        gbc.gridy = 8;
        this.add(txt38, gbc);

        gbc.gridx = 4;
        gbc.gridy = 0;
        this.add(txt40, gbc);
        gbc.gridx = 4;
        gbc.gridy = 1;
        this.add(txt41, gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        this.add(txt42, gbc);
        gbc.gridx = 4;
        gbc.gridy = 3;
        this.add(txt43, gbc);
        gbc.gridx = 4;
        gbc.gridy = 4;
        this.add(txt44, gbc);
        gbc.gridx = 4;
        gbc.gridy = 5;
        this.add(txt45, gbc);
        gbc.gridx = 4;
        gbc.gridy = 6;
        this.add(txt46, gbc);
        gbc.gridx = 4;
        gbc.gridy = 7;
        this.add(txt47, gbc);
        gbc.gridx = 4;
        gbc.gridy = 8;
        this.add(txt48, gbc);

        gbc.gridx = 5;
        gbc.gridy = 0;
        this.add(txt50, gbc);
        gbc.gridx = 5;
        gbc.gridy = 1;
        this.add(txt51, gbc);
        gbc.gridx = 5;
        gbc.gridy = 2;
        this.add(txt52, gbc);
        gbc.gridx = 5;
        gbc.gridy = 3;
        this.add(txt53, gbc);
        gbc.gridx = 5;
        gbc.gridy = 4;
        this.add(txt54, gbc);
        gbc.gridx = 5;
        gbc.gridy = 5;
        this.add(txt55, gbc);
        gbc.gridx = 5;
        gbc.gridy = 6;
        this.add(txt56, gbc);
        gbc.gridx = 5;
        gbc.gridy = 7;
        this.add(txt57, gbc);
        gbc.gridx = 5;
        gbc.gridy = 8;
        this.add(txt58, gbc);

        gbc.gridx = 6;
        gbc.gridy = 0;
        this.add(txt60, gbc);
        gbc.gridx = 6;
        gbc.gridy = 1;
        this.add(txt61, gbc);
        gbc.gridx = 6;
        gbc.gridy = 2;
        this.add(txt62, gbc);
        gbc.gridx = 6;
        gbc.gridy = 3;
        this.add(txt63, gbc);
        gbc.gridx = 6;
        gbc.gridy = 4;
        this.add(txt64, gbc);
        gbc.gridx = 6;
        gbc.gridy = 5;
        this.add(txt65, gbc);
        gbc.gridx = 6;
        gbc.gridy = 6;
        this.add(txt66, gbc);
        gbc.gridx = 6;
        gbc.gridy = 7;
        this.add(txt67, gbc);
        gbc.gridx = 6;
        gbc.gridy = 8;
        this.add(txt68, gbc);

        gbc.gridx = 7;
        gbc.gridy = 0;
        this.add(txt70, gbc);
        gbc.gridx = 7;
        gbc.gridy = 1;
        this.add(txt71, gbc);
        gbc.gridx = 7;
        gbc.gridy = 2;
        this.add(txt72, gbc);
        gbc.gridx = 7;
        gbc.gridy = 3;
        this.add(txt73, gbc);
        gbc.gridx = 7;
        gbc.gridy = 4;
        this.add(txt74, gbc);
        gbc.gridx = 7;
        gbc.gridy = 5;
        this.add(txt75, gbc);
        gbc.gridx = 7;
        gbc.gridy = 6;
        this.add(txt76, gbc);
        gbc.gridx = 7;
        gbc.gridy = 7;
        this.add(txt77, gbc);
        gbc.gridx = 7;
        gbc.gridy = 8;
        this.add(txt78, gbc);

        gbc.gridx = 8;
        gbc.gridy = 0;
        this.add(txt80, gbc);
        gbc.gridx = 8;
        gbc.gridy = 1;
        this.add(txt81, gbc);
        gbc.gridx = 8;
        gbc.gridy = 2;
        this.add(txt82, gbc);
        gbc.gridx = 8;
        gbc.gridy = 3;
        this.add(txt83, gbc);
        gbc.gridx = 8;
        gbc.gridy = 4;
        this.add(txt84, gbc);
        gbc.gridx = 8;
        gbc.gridy = 5;
        this.add(txt85, gbc);
        gbc.gridx = 8;
        gbc.gridy = 6;
        this.add(txt86, gbc);
        gbc.gridx = 8;
        gbc.gridy = 7;
        this.add(txt87, gbc);
        gbc.gridx = 8;
        gbc.gridy = 8;
        this.add(txt88, gbc);

        gbc.gridheight = 2;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 11;
        btn0.setText("Validar");
        this.add(btn0, gbc);

        gbc.gridheight = 2;
        gbc.gridwidth = 3;
        gbc.gridx = 6;
        gbc.gridy = 11;
        btn1.setText("SALIR");
        this.add(btn1, gbc);

        gbc.gridheight = 2;
        gbc.gridwidth = 3;
        gbc.gridx = 3;
        gbc.gridy = 11;
        btn2.setText("Limpiar");
        this.add(btn2, gbc);
        
        GenerarNumeros();
        NombresDeCajas();

    }

    public void Verificador00() {
        extraerNumeros();
        int acumulador00 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador00 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 0: " + matriz[0][j]);

        }

        System.out.println("Total columna 0: " + acumulador00);
        if (acumulador00 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador01() {
        extraerNumeros();
        int acumulador10 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador10 += Integer.parseInt(matriz[1][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 1: " + matriz[1][j]);

        }

        System.out.println("Total columna 0: " + acumulador10);
        if (acumulador10 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador02() {
        extraerNumeros();
        int acumulador02 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador02 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 2: " + matriz[2][j]);

        }

        System.out.println("Total columna 0: " + acumulador02);
        if (acumulador02 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador03() {
        extraerNumeros();
        int acumulador03 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador03 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 3: " + matriz[3][j]);

        }

        System.out.println("Total columna 3: " + acumulador03);
        if (acumulador03 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador04() {
        extraerNumeros();
        int acumulador04 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador04 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 4: " + matriz[4][j]);

        }

        System.out.println("Total columna 0: " + acumulador04);
        if (acumulador04 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador05() {
        extraerNumeros();
        int acumulador05 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador05 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 5: " + matriz[0][j]);

        }

        System.out.println("Total columna 0: " + acumulador05);
        if (acumulador05 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador06() {
        extraerNumeros();
        int acumulador06 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador06 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 5: " + matriz[6][j]);

        }

        System.out.println("Total columna 0: " + acumulador06);
        if (acumulador06 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador07() {
        extraerNumeros();
        int acumulador07 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador07 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 0: " + matriz[7][j]);

        }

        System.out.println("Total columna 0: " + acumulador07);
        if (acumulador07 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void Verificador08() {
        extraerNumeros();
        int acumulador08 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumulador08 += Integer.parseInt(matriz[0][j]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Columna 8: " + matriz[8][j]);

        }

        System.out.println("Total columna 0: " + acumulador08);
        if (acumulador08 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF00() {
        extraerNumeros();
        int acumuladorF00 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF00 += Integer.parseInt(matriz[j][0]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 0: " + matriz[j][0]);

        }

        System.out.println("Total Fila 0: " + acumuladorF00);
        if (acumuladorF00 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF10() {
        extraerNumeros();
        int acumuladorF10 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF10 += Integer.parseInt(matriz[j][1]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 1: " + matriz[j][1]);

        }

        System.out.println("Total Fila 1: " + acumuladorF10);
        if (acumuladorF10 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF20() {
        extraerNumeros();
        int acumuladorF20 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF20 += Integer.parseInt(matriz[j][2]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 2: " + matriz[j][2]);

        }

        System.out.println("Total Fila 2: " + acumuladorF20);
        if (acumuladorF20 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF30() {
        extraerNumeros();
        int acumuladorF30 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF30 += Integer.parseInt(matriz[j][3]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 3: " + matriz[j][3]);

        }

        System.out.println("Total fila 3: " + acumuladorF30);
        if (acumuladorF30 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF40() {
        extraerNumeros();
        int acumuladorF40 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF40 += Integer.parseInt(matriz[j][4]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 0: " + matriz[j][4]);

        }

        System.out.println("Total Fila 4: " + acumuladorF40);
        if (acumuladorF40 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF50() {
        extraerNumeros();
        int acumuladorF50 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF50 += Integer.parseInt(matriz[j][5]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 0: " + matriz[j][5]);

        }

        System.out.println("Total Fila 5: " + acumuladorF50);
        if (acumuladorF50 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF60() {
        extraerNumeros();
        int acumuladorF60 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF60 += Integer.parseInt(matriz[j][6]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 0: " + matriz[j][6]);

        }

        System.out.println("Total Fila 6: " + acumuladorF60);
        if (acumuladorF60 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF70() {
        extraerNumeros();
        int acumuladorF70 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF70 += Integer.parseInt(matriz[j][7]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 0: " + matriz[j][7]);

        }

        System.out.println("Total Fila 7: " + acumuladorF70);
        if (acumuladorF70 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void VerificadorF80() {
        extraerNumeros();
        int acumuladorF80 = 0;
        for (int j = 0; j < 9; j++) {
            try {
                acumuladorF80 += Integer.parseInt(matriz[j][8]);
            } catch (NumberFormatException e) {
                System.out.println("LOS VALORES PERMITIDOS SON NUMEROS "
                        + "DEL 1 al 9");
            }
            System.out.println("Fila 0: " + matriz[j][8]);

        }

        System.out.println("Total Fila 8: " + acumuladorF80);
        if (acumuladorF80 != 45) {
            System.out.println("Hay valores duplicados");
            hayDuplicado = true;
        } else {
            System.out.println("GANO!");
        }
    }

    public void extraerNumeros() {
        matriz[0][0] = txt00.getText();
        matriz[0][1] = txt01.getText();
        matriz[0][2] = txt02.getText();
        matriz[0][3] = txt03.getText();
        matriz[0][4] = txt04.getText();
        matriz[0][5] = txt05.getText();
        matriz[0][6] = txt06.getText();
        matriz[0][7] = txt07.getText();
        matriz[0][8] = txt08.getText();

        matriz[1][0] = txt10.getText();
        matriz[1][1] = txt11.getText();
        matriz[1][2] = txt12.getText();
        matriz[1][3] = txt13.getText();
        matriz[1][4] = txt14.getText();
        matriz[1][5] = txt15.getText();
        matriz[1][6] = txt16.getText();
        matriz[1][7] = txt17.getText();
        matriz[1][8] = txt18.getText();

        matriz[2][0] = txt20.getText();
        matriz[2][1] = txt21.getText();
        matriz[2][2] = txt22.getText();
        matriz[2][3] = txt23.getText();
        matriz[2][4] = txt24.getText();
        matriz[2][5] = txt25.getText();
        matriz[2][6] = txt26.getText();
        matriz[2][7] = txt27.getText();
        matriz[2][8] = txt28.getText();

        matriz[3][0] = txt30.getText();
        matriz[3][1] = txt31.getText();
        matriz[3][2] = txt32.getText();
        matriz[3][3] = txt33.getText();
        matriz[3][4] = txt34.getText();
        matriz[3][5] = txt35.getText();
        matriz[3][6] = txt36.getText();
        matriz[3][7] = txt37.getText();
        matriz[3][8] = txt38.getText();

        matriz[4][0] = txt40.getText();
        matriz[4][1] = txt41.getText();
        matriz[4][2] = txt42.getText();
        matriz[4][3] = txt43.getText();
        matriz[4][4] = txt44.getText();
        matriz[4][5] = txt45.getText();
        matriz[4][6] = txt46.getText();
        matriz[4][7] = txt47.getText();
        matriz[4][8] = txt48.getText();

        matriz[5][0] = txt50.getText();
        matriz[5][1] = txt51.getText();
        matriz[5][2] = txt52.getText();
        matriz[5][3] = txt53.getText();
        matriz[5][4] = txt54.getText();
        matriz[5][5] = txt55.getText();
        matriz[5][6] = txt56.getText();
        matriz[5][7] = txt57.getText();
        matriz[5][8] = txt58.getText();

        matriz[6][0] = txt60.getText();
        matriz[6][1] = txt61.getText();
        matriz[6][2] = txt62.getText();
        matriz[6][3] = txt63.getText();
        matriz[6][4] = txt64.getText();
        matriz[6][5] = txt65.getText();
        matriz[6][6] = txt66.getText();
        matriz[6][7] = txt67.getText();
        matriz[6][8] = txt68.getText();

        matriz[7][0] = txt70.getText();
        matriz[7][1] = txt71.getText();
        matriz[7][2] = txt72.getText();
        matriz[7][3] = txt73.getText();
        matriz[7][4] = txt74.getText();
        matriz[7][5] = txt75.getText();
        matriz[7][6] = txt76.getText();
        matriz[7][7] = txt77.getText();
        matriz[7][8] = txt78.getText();

        matriz[8][0] = txt80.getText();
        matriz[8][1] = txt81.getText();
        matriz[8][2] = txt82.getText();
        matriz[8][3] = txt83.getText();
        matriz[8][4] = txt84.getText();
        matriz[8][5] = txt85.getText();
        matriz[8][6] = txt86.getText();
        matriz[8][7] = txt87.getText();
        matriz[8][8] = txt88.getText();

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

    public void ValidadorGeneral() {
        Verificador00();
        Verificador01();
        Verificador02();
        Verificador03();
        Verificador04();
        Verificador05();
        Verificador06();
        Verificador07();
        Verificador08();

        VerificadorF00();
        VerificadorF10();
        VerificadorF20();
        VerificadorF30();
        VerificadorF40();
        VerificadorF50();
        VerificadorF60();
        VerificadorF70();
        VerificadorF80();

        if (!hayDuplicado) {
            System.out.println("HA GANADO!!");
            JOptionPane.showMessageDialog(null, "HA GANADOOOO!!!");
        } else {
            System.out.println("Aun no gana :(");
            JOptionPane.showMessageDialog(null, "Lo sentimos, aun no gana :(");
        }

    }

    public void Distribucion() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 5;
        gbc.ipady = 5;

    }

    public void GenerarNumeros() {
        x = rnd.nextInt(3)+1;
        txt00.setText(String.valueOf(x));
        x = rnd.nextInt(4)+4;
        txt88.setText(String.valueOf(x));
        x = rnd.nextInt(6)+4;
        txt44.setText(String.valueOf(x));

    }

    public void Limpiar(){
        //txt00.setText("");
        txt01.setText("");
        txt02.setText("");
        txt03.setText("");
        txt04.setText("");
        txt05.setText("");
        txt06.setText("");
        txt07.setText("");
        txt08.setText("");
        
        txt10.setText("");
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
        txt15.setText("");
        txt16.setText("");
        txt17.setText("");
        txt18.setText("");
        
        txt20.setText("");
        txt21.setText("");
        txt22.setText("");
        txt23.setText("");
        txt24.setText("");
        txt25.setText("");
        txt26.setText("");
        txt27.setText("");
        txt28.setText("");
        
        txt30.setText("");
        txt31.setText("");
        txt32.setText("");
        txt33.setText("");
        txt34.setText("");
        txt35.setText("");
        txt36.setText("");
        txt37.setText("");
        txt38.setText("");
       
        txt40.setText("");
        txt41.setText("");
        txt42.setText("");
        txt43.setText("");
        //txt44.setText("");
        txt45.setText("");
        txt46.setText("");
        txt47.setText("");
        txt48.setText("");
        
        txt50.setText("");
        txt51.setText("");
        txt52.setText("");
        txt53.setText("");
        txt54.setText("");
        txt55.setText("");
        txt56.setText("");
        txt57.setText("");
        txt58.setText("");
        
        txt60.setText("");
        txt61.setText("");
        txt62.setText("");
        txt63.setText("");
        txt64.setText("");
        txt65.setText("");
        txt66.setText("");
        txt67.setText("");
        txt68.setText("");
        
        txt70.setText("");
        txt71.setText("");
        txt72.setText("");
        txt73.setText("");
        txt74.setText("");
        txt75.setText("");
        txt76.setText("");
        txt77.setText("");
        txt78.setText("");
        
        txt80.setText("");
        txt81.setText("");
        txt82.setText("");
        txt83.setText("");
        txt84.setText("");
        txt85.setText("");
        txt86.setText("");
        txt87.setText("");
        //txt88.setText("");
        
    }
    public static void main(String[] args) {
        Sudoku4 sdk = new Sudoku4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
