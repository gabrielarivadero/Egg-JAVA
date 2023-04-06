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
public class Guia5Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String equipo[] = new String[6]; // Le ponemos la dimension al vector
   	   Scanner leer = new Scanner(System.in);

   	 
    	// Asigno valores mediante el for
    	for (int i = 0; i < equipo.length; i++) {
    	       System.out.println("Ingrese el nombre del integrante del equipo");
        	equipo[i] =leer.nextLine();
       	 
    	}
   	 
    	// Muestro el vector
    	for (int i = 0; i < equipo.length; i++) {
        	System.out.print("[" + equipo[i] + "]");
    	}
        // TODO code application logic here
    }
    
}
