/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg1;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese su nombre:");
      
      nom = leer.next();
      System.out.println( "Su nombre es:" + nom);
    }
    
}
