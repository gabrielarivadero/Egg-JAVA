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
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int N;
        int numeroABuscar;
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();
        int[] numeros = new int[N];
        
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = (int) (Math.random()*100);
        }
        System.out.println("Ingrese el numero a buscar dentro del vector");
        numeroABuscar = leer.nextInt();
        int cont = 0;
for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]==numeroABuscar){
                //Algo porque lo encontró pongo un contador que lo registre
                cont++; 
                System.out.println("Número encontrado en la posición :" + i );
            } else {
                /// Algo porque no lo encontró             
            }
        }
     if (cont !=0){
            System.out.println("Se encontró " + cont + " veces"); 
            } else {
                System.out.println("El número no se encontró, maldita sea!!!");
            }
    }
    
}
