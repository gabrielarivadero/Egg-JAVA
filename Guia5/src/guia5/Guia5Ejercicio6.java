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
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
     * sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
     * y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
     * es decir, están entre el 1 y el 9.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[ ][ ] numeros = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                do{
                System.out.println("Ingrese el elemento: ["+ i + "] [" + j + "]");
                numeros[i][j] = leer.nextInt();
                }while ( numeros[i][j]<1 || numeros[i][j]>9);
            }
        }
        System.out.println("La matriz es ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {   
                System.out.print( " [ " + numeros[i][j] +" ] " );  
            }
               System.out.println("  ");
        }
       int[] acumuladorColumnas = new int [3];
       int[] acumuladorFilas = new int [3];
       int[] acumuladorDiagonales = new int [2];
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
            acumuladorFilas[i] += numeros[i][j];
        }
        }
        for (int j = 0; j < 3; j++) {
           for (int i = 0; i < 3; i++) {
            acumuladorColumnas[j] += numeros[i][j];
        }
        }
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (i == j ){
               acumuladorDiagonales[0] += numeros[i][j];
               }
               if ( i + j == 2){
                acumuladorDiagonales[1] += numeros[i][j];
               }
            }
        }
        boolean magica = true;
        
      
           if (acumuladorFilas[0] != acumuladorFilas[1] || acumuladorFilas[0] != acumuladorFilas[2]
                   || acumuladorFilas[1] != acumuladorFilas[2]){
               magica = false;
           }
        
          if (acumuladorColumnas[0] != acumuladorColumnas[1] || acumuladorColumnas[0] != acumuladorColumnas[2]
                   || acumuladorColumnas[1] != acumuladorColumnas[2]){
               magica = false;
           }
        if (acumuladorColumnas[0] != acumuladorDiagonales[0]){
               magica = false;
           }
for (int i = 0; i < 2; i++) {
            if (acumuladorFilas[i] !=  acumuladorColumnas[i] ){
                magica = false;
            } 
        }
      
             if (acumuladorDiagonales[0] !=  acumuladorDiagonales[1] ){
                magica = false;
            } 
        if (magica == true){
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz NO es magica");
          
        }
        }
        // TODO code application logic here
    }
    
