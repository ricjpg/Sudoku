
package sudoku;

import static java.lang.Math.random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Sudoku {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] cuadro = new int [8][8];
       
        int [][] cuadro2 = new int [4][4];
        int [][] cuadro3 = new int [4][4];
        int [][] cuadro4 = new int [4][4];
        //indicamos las posiciones a mostrar con el random//
        int fila ;
        int col ;
        int valor = 0;
        int opcion;
        for (int i = 0; i < 8; i=i+2) {
            for (int j = 0; j < 8; j=j+2) {
                cuadro[i][j] = (int) (Math.random() * 9) + 1 ;
            }
        }
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(cuadro[i][j]== 0){
                   cuadro[i][j] = '\0'; 
                }
                System.out.print(cuadro[i][j] + " ");
               
            }
            System.out.println("");
        }
        
        System.out.println("Sudoku");
        imprimirSudoku(cuadro);
        System.out.println("introduzca elemento fila a ingresar");
        fila = entrada.nextInt();
        System.out.println("introduzca elemento fila a ingresar");
        col = entrada.nextInt();
        
        
        if (fila < 4 && col < 4) {
            System.out.println("Cuadro 1");
            cuadro1(fila,col,cuadro,entrada);
        }
        if (fila < 4 && col > 3) {
            System.out.println("Cuadro 2");
            cuadro2(fila,col,cuadro,entrada);
                
        }
        if (fila > 3 && col < 4) {
            System.out.println("Cuadro 3");
            cuadro3(fila,col,cuadro,entrada);
                
        }
        if (fila > 3 && col > 3) {
            System.out.println("Cuadro 4");
            cuadro4(fila,col,cuadro,entrada);
                
        }
        
     
        
        }
    //METODOSOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
    
         public static void cuadro1(int fila,int col,int [][] cuadro, Scanner entrada ){
            int valor;
            int [][] cuadro1 = new int [4][4];
            int [] c = new int[4];
            int [] f = new int[4];
            
          
            
            
            for (int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    cuadro1[i][j] = cuadro[i][j] ;
                }
            }
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro1[i][j]+" ") ;
                }
                System.out.println("");
            }
            
              //obtener areglos
            for (int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    if (i==fila) {
                         f[i] = cuadro1[i][j] ;
                         System.out.println(f[i]);
                    }
                    if (j==col) {
                        c[i] = cuadro1[i][j] ;
                        System.out.println(c[i]);
                    }
                }
            }
            System.out.println("Valor a ingresar");
            valor = entrada.nextInt(); 
            
                    if( estaContenido(c,valor) && estaContenido(f,valor) && cuadro1[fila][col]!=0 ){
                        cuadro1[fila][col]= valor;
                    }else {
                        JOptionPane.showMessageDialog(null, "No se puede ingresar ese valor");
                    }   
                
            
             
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro1[i][j]+" ") ;
                }
                  System.out.println("");
            }

        }
         
         
         
         
        public static void cuadro2(int fila,int col,int [][] cuadro, Scanner entrada) {
            int [][] cuadro2 = new int [4][4];
            int valor;
            int c=4;
                
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) { 
                    if (c<8) {
                        cuadro2[i][j] = cuadro[i][c] ;
                        c++;
                    }
                }
            }
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro2[i][j]+" ") ;
                }
                    System.out.println("");
            }
             
            valor = entrada.nextInt(); 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if( cuadro2[fila][j] != valor && cuadro2[i][col] != valor ){
                         cuadro2[fila][col] = valor;
                    }
                }
                System.out.println("");
            }
             
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro2[i][j]+" ") ;
                }
                System.out.println("");
            }
            
            
            
        }
    
        
        public static void cuadro3(int fila,int col,int [][] cuadro, Scanner entrada) {
            int [][] cuadro3 = new int [4][4];
            int valor;
            int f=4;
                
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) { 
                    if (f < 8) {
                        cuadro3[i][j] = cuadro[f][j] ;
                        
                    }
                    
                }
                f++;
            }
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro3[i][j]+" ") ;
                }
                    System.out.println("");
            }
             
            valor = entrada.nextInt(); 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if( cuadro3[fila][j] != valor && cuadro3[i][col] != valor ){
                         cuadro3[fila][col] = valor;
                    }
                }
                System.out.println("");
            }
             
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro3[i][j]+" ") ;
                }
                System.out.println("");
            }
            
            
            
        }
    
        public static void cuadro4(int fila,int col,int [][] cuadro, Scanner entrada) {
            int [][] cuadro4 = new int [4][4];
            int valor;
            int c=4;
            int f=4;
                
            for (int i = 0; i < 4; i++) {
                
                for (int j = 0; j < 4; j++) { 
                    if ( c<8 && f<8) {
                        cuadro4[i][j] = cuadro[f][c] ;
                        c++;
                    }
                    
                }
                if (f<8) {
                    f++;
                    c=4;
                }
                
                
            }
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro4[i][j]+" ") ;
                }
                    System.out.println("");
            }
             
            valor = entrada.nextInt(); 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if( cuadro4[fila][j] != valor && cuadro4[i][col] != valor ){
                         cuadro4[fila][col] = valor;
                    }
                }
                System.out.println("");
            }
             
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cuadro4[i][j]+" ") ;
                }
                System.out.println("");
            }
            
            
            
        }
        
        public static void imprimirSudoku(int [][] cuadro){
            String [][] cadena = new String [8][8] ;
            
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (cuadro[i][j]==0) {
                        cadena[i][j]=" ";
                    }else{
                        cadena[i][j] = String.valueOf(cuadro[i][j]);
                    }
                }
            }
            
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(cadena[i][j] + " ");
                }
                System.out.println("");
            }
        }
    
        static boolean estaContenido(int [] array, int valor){
            
            for (int i = 0; i < 4; i++) {
                if( array[i] == valor ){
                    return false;
                            
                }
            }
            
            return true;
        }
        
        
        
     }

 

