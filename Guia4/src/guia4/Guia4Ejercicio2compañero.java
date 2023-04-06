package guia4;

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
public class Guia4Ejercicio2compañero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Scanner leer = new Scanner(System.in);
    char opcion;
    do{
        persona();
        System.out.println("Desea continuar (s/n)");
        opcion = leer.next().charAt(0);}
    
    while ('n' != opcion);
            
   // TODO code application logic herering
    }
    
    public static void persona(){
       Scanner leer = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Ingrese Nombre");
       nombre= leer.nextLine();    
        edad= leer.nextInt();
        System.out.print(nombre+" es: ");
        if (edad <= 18) {System.out.println("Es menor");        }
        else {
            System.out.println("Es mayor");
        }
    
}
}