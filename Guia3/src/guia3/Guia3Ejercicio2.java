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
public class Guia3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  	 
   	
        System.out.println("Ingrese la contraseña");
       String  respuesta;
    	respuesta = leer.nextLine();
  	 
   	 if ("eureka".equals(respuesta)){
         System.out.println("Es correcto");
         }
         else  {
           System.out.println("error");
         }  
        // TODO code application logic here
    }
    
}
