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
public class Guia5EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una función rellene un vector con números aleatorios, pasándole
        //un arreglo por parámetro. Después haremos otra función o procedimiento
        //que imprima el vector.

        
          Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el tamaño del vector: ");
                N = leer.nextInt();
        int[] numeros = new int[N];
       
        cargar ( numeros , N );
        
        imprimir ( numeros, N );
        
    }
    
    public static int [] cargar (int [] numeros, int N){
          for (int i = 0; i < N; i++) {
            numeros[i]= (int) ((Math.random())*100);
         
        }
          return numeros;
    }
    
    public static void imprimir (int [] numeros, int N ){
        for (int i = 0; i< N ; i++) {
         
             
                 System.out.print("["+ numeros[i] + "] ");
                
             }
         }    
    
    
    }
        // TODO code application logic here
    
    

