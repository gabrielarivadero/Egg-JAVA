package teoriaguia3.pkg1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejc2Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número:"); 
        int num1 = leer.nextInt();
         System.out.println("Ingrese el segundo número:"); 
        int num2 = leer.nextInt();
        if (num1 > 25 || num2 > 25) { 
        System.out.println("Ingresó algún número mayor a 25"); 
            }else { 
            System.out.println("Los números ingresados son menores a 25");
        }
    }
    
}
