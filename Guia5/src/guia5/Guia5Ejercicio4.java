/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5Ejercicio4 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. 
     * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

     */
    public static void main(String[] args ) {
             Scanner leer = new Scanner(System.in);
        
        int[ ][ ] numeros = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {   
            numeros[i][j] = (int) (Math.random()*10);
         }
        }
        System.out.println("La matriz es ");
           for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {   
         System.out.print( " [ " + numeros[i][j] +" ] " );  
         }
               System.out.println("  ");
        }
        System.out.println("La trapuesta de la matriz es ");
        
   int[ ][ ] matriztraspuesta = new int[4][4];
  for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {   
           matriztraspuesta [j][i]= numeros[i][j] ;
         }
  }
             for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {   
         System.out.print( " [ " + matriztraspuesta[i][j] +" ] " );  
         }
               System.out.println("  ");
            
         }
        }
// TODO code application logic here
    }
    
