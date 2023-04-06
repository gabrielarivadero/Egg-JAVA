/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.pkg2;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            String num;
       int doble;
       int triple;
       double raiz;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese un un numero entero:");
      
      num = leer.next();
      
      doble = 2*Integer.parseInt(num);
      triple = 3 *Integer.parseInt(num);
      raiz = Math.sqrt(Integer.parseInt(num));
       System.out.println( doble + " " + triple + " " + raiz );

    }
    
}
