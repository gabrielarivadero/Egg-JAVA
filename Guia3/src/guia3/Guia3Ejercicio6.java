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
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        String opcionn;
        boolean activo = true;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do {
            System.out.println("Ingrese el numero de la opción deseada");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado es : " + (num1 + num2) + "\n");
                    break;
                case 2:
                    System.out.println("El resultado es : " + (num1 - num2) + "\n");
                    break;
                case 3:
                    System.out.println("El resultado es : " + (num1 * num2) + "\n");
                    break;
                case 4:
                    System.out.println("El resultado es : " + ((float) num1 / num2) + "\n");
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcionn = leer.next();
                    if (opcionn.equalsIgnoreCase("S")) {
                        activo = false;
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
            }
        } while (activo);
        // TODO code application logic here
    }
    
}
