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
public class Guia5EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Realizar un programa que llene una matriz de tamaño NxM con valores 
        //aleatorios y muestre la suma de sus elementos.
          Scanner leer = new Scanner(System.in);
        int N;
        int M;
        
            System.out.println("Ingrese la dimensión N de la matriz: ");
              N = leer.nextInt();
            System.out.println("Ingrese la dimensión M de la matriz: ");
              M = leer.nextInt();  
        int[][] numeros = new int[N][M];    
        int suma = 0;     
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                numeros[i][j]= (int) ((Math.random())*10); 
                System.out.print("["+ numeros[i][j] +"]" );
                suma += numeros[i][j];
            }  
        System.out.println("" );
        }
        System.out.print("La suma de los elementos de la matriz es: " + suma);
 
        // TODO code application logic here
    }
    
}
