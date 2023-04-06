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
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                   Scanner leer = new Scanner(System.in);
        
        int[ ][ ] numeros = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {   
            numeros[i][j] = (int) (((-1+Math.random())*10)+Math.random()*10);
         }
        }
        System.out.println("La matriz es ");
           for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {   
         System.out.print( " [ " + numeros[i][j] +" ] " );  
         }
               System.out.println("  ");
        }
        System.out.println("La trapuesta de la matriz es ");
        
   int[ ][ ] matriztraspuesta = new int[3][3];
  for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {   
           matriztraspuesta [j][i]= numeros[i][j] ;
         }
  }
             for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {   
         System.out.print( " [ " + matriztraspuesta[i][j] +" ] " );  
         }
               System.out.println("  ");
            
         }
             int cont=0;
              for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {   
             if  (matriztraspuesta [j][i]== - numeros[i][j])  {
                 cont++;
                         }
             
         }
  }
              if  (  cont++==9)  {
                  System.out.println("la matriz es antisimétrica ");
               
                         }
              else   System.out.println("la matriz no es antisimétrica ");
    }
    
}
