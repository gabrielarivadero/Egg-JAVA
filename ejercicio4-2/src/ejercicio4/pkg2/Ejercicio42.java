/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.pkg2;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String temperatura;
       double faren;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese una temperatura en ºC:");
      
      temperatura = leer.next();
      faren = 32 + (9 * Double.parseDouble(temperatura)/5 );
      
       System.out.println( faren);

    }
    
}
