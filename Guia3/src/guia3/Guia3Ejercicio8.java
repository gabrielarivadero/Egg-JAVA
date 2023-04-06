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
public class Guia3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        byte tamanio;
        System.out.println("Ingrese el tamaño deseado para su cuadrado");
        tamanio = leer.nextByte();
        for (int i=0; i<tamanio; i++) { 
            for (int j=0; j<tamanio; j++) {  //j siempre va a valer uno cuando el bucle de la vuelta porque se vuelve a resetear (j=0)
            if (i==0 || i ==tamanio -1 || j==0 || j==tamanio -1) { // tamanio-1 xq empiezo en cero
                System.out.print("* ");
                
            } else {
                System.out.print("  "); //pongo dos espacios para que ocupe el mismo lugar que el asterisco y el espacio de arriba asi se imprime alineado
            }  
            
             }
            
        System.out.println();    
        // TODO code application logic here
    }
    }
}
