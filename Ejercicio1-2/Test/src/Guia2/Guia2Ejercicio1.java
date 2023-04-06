/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String numero1;
      String numero2;
      Scanner leer = new Scanner(System.in);    
      System.out.println("Ingrese el primer número a sumar:");
      numero1 = leer.next();
      int num1 = Integer.parseInt(numero1);
      System.out.println("Ingrese el segundo número a sumar:");
      numero2 = leer.next();
      int num2 = Integer.parseInt(numero2);
      int suma = num1+num2;
      System.out.println( "El valor de la suma es:" + suma);
      
      
      
      
      
      
      
       
        

    }
    
}
