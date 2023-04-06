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
public class Guia3EjercicioExtra3 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
     * Caso contrario mostrar un mensaje.
     * Nota: investigar la función equals() de la clase String.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
  	 
   	
        System.out.println("Ingrese una vocal");
       String  respuesta;
    	respuesta = leer.nextLine();
  	 
   	 if ("a". equalsIgnoreCase(respuesta)||"e". equalsIgnoreCase(respuesta)||"i". equalsIgnoreCase(respuesta)||"o". equalsIgnoreCase(respuesta)||"u". equalsIgnoreCase(respuesta) ){
         System.out.println("Es correcto");
         }
         else  {
           System.out.println("error, no es una vocal");
         }  
    }
    
}
