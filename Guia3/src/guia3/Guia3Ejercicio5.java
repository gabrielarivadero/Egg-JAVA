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
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int limite, num,suma;
       suma = 0;
        System.out.println("Ingrese el limite que desea superar");
        limite = leer.nextInt();
        
        do {
        System.out.println("Ingrese numeros hasta superar el limite");
        num = leer.nextInt();
        suma = suma + num;
    } while (suma<=limite);
        System.out.println("llegaste a " +suma +" ,limite superado");
         leer.close();      
    
    }
    
}
