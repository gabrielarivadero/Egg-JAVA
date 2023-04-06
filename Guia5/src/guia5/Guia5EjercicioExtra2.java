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
public class Guia5EjercicioExtra2 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N
     * enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        // Escriba un programa que averigüe si dos vectores de N enteros son 
        // iguales (la comparación deberá detenerse en cuanto se detecte alguna
        //diferencia entre los elementos).
        
          Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el tamaño del vector: ");
                N = leer.nextInt();
        int[] numeros1 = new int[N];
        int[] numeros2 = new int[N];
        
        for (int i = 0; i< N ; i++) {
            System.out.println("Ingrese el elemento: ["+ i + "] del vector 1");
                 numeros1[i] = leer.nextInt(); 
            System.out.println("Ingrese el elemento: ["+ i + "] del vector 2");
                numeros2[i] = leer.nextInt(); 
        }
        boolean iguales = true;
         for (int i = 0; i< N ; i++) {
         
             if (numeros1[i] != numeros2[i]){
                 iguales = false;
                 System.out.println("Encontramos valores diferentes");
                 break;
             }
         }
        if (iguales == true) {
            System.out.println("No encontramos valores diferentes");
        // TODO code application logic here
    }
}
}
