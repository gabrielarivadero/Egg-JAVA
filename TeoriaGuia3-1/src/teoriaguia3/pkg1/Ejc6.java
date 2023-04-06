/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaguia3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

       for(int i = 0; i <= 3; i++) {
        System.out.println("Ingrese un número del 1 al 20:"); 
        num = leer.nextInt();
        while ( (num < 1) || (num > 20)) {
        System.out.println("Ingrese un número del 1 al 20:"); 
        num = leer.nextInt();
        }
        System.out.print(+(num)+ " ");
        for(int j = 0; j < (num); j++) {
        System.out.print("*"); 
        
       }
        
       System.out.println("");   
       }
      
       }  
      
    	
    }
    

