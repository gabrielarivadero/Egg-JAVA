/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
  	 
   	
        System.out.println("Ingrese una frase");
       String  respuesta;
    	respuesta = leer.nextLine();
  	 
   	 if (respuesta.substring(0,1).equals("A")){
         System.out.println("CORRECTO");
         }
         else  {
           System.out.println("INCORRECTO");
         }
        // TODO code application logic here
    }
    
}
