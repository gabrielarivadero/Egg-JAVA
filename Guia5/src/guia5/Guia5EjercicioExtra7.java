/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
 * Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...

 * @author Usuario
 */
public class Guia5EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        int N;
        System.out.println("Ingrese un número para realizar la sucesion de Fibonacci ");
        N = leer.nextInt();
        int vector[ ] = new int[N];
        int a = 0;
        int b = 1;
        int suma = 0 ;
       
        for (int i= 0; i<N; i++){
             vector [i]=b ;
            System.out.print(+ vector [i]+" ") ;
            suma = a + b;
            a = b ;
            b = suma;
           
            
        }
        System.out.println("");
        }
                
        // TODO code application logic here
    }
    

