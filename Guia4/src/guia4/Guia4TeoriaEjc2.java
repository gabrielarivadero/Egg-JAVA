/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4TeoriaEjc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero1;
         int numero2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número a saber si es multiplo de siguiente ");
        numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = leer.nextInt();
        
        multiplos(numero1, numero2);
          
        }
       
         public static void multiplos (int numero1,int numero2) {
            double division; 
            division = numero2%numero1;
            if (division == 0){
                System.out.println("Son multiplos");
              } else {
                System.out.println("No son multiplos");
               }
    }
    
}
