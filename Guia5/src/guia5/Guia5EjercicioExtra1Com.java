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
public class Guia5EjercicioExtra1Com {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Realizar un algoritmo que calcule la suma de todos los elementos de 
        //un vector de tamaño N, con los valores ingresados por el usuario.
        
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el tamaño del vector: ");
                N = leer.nextInt();
        int[] numeros = new int[N];
        int suma = 0;
        for (int i = 0; i< N ; i++) {
            System.out.println("Ingrese el elemento: ["+ i + "]");
                numeros[i] = leer.nextInt(); 
                suma += numeros[i];
        }
        System.out.println("La suma del vector es:"+ suma);
        
        // TODO code application logic here
    }
    
}
