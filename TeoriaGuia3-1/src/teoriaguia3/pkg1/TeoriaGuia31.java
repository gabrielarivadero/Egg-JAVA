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
public class TeoriaGuia31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
           Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese el primer número:");
    int  numero1 = leer.nextInt();
      System.out.println("Ingrese el segundo número:");
    int  numero2 = leer.nextInt();

if (numero1>25 || numero2>25 ) { 
System.out.println("Uno o los dos numeros es mayor a 25"); 
}else { 
System.out.println("Ningun numero es mayor a 25");
}

    }
    
}
