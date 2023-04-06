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
public class Guia3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
  	 
   	
        System.out.println("Ingrese una frase de 8 ");
       String  respuesta;
    	respuesta = leer.nextLine();
  	 
   	 if (respuesta.length()== 8){
         System.out.println("CORRECTO");
         }
         else  {
           System.out.println("INCORRECTO");
         }  
    }
    }
    

