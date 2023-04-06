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
public class Guia3EjercicioExtra4 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
     * y se muestre su equivalente en romano.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int numero;
      do{
          System.out.println("Ingrese un numero del 1 al 10");
          numero = leer.nextInt();
      }
        
        while (numero <1 || numero >10);
      switch (numero) {
        	case 1:
           System.out.println("En romano es: I");
           break;

        	case 2:
           System.out.println("En romano es: II");
            break;
            case 3:
           System.out.println("En romano es: III");
            break;
            case 4:
           System.out.println("En romano es: IV");
            break;
            case 5:
           System.out.println("En romano es: V");
            break;
            case 6:
           System.out.println("En romano es: VI");
            break;
            case 7:
           System.out.println("En romano es: VII");
            break;
            case 8:
           System.out.println("En romano es: VIII");
            break;
            case 9:
           System.out.println("En romano es: IX");
            break;
        	default:
           System.out.println("En romano es: X");
      }
    }
    
}
