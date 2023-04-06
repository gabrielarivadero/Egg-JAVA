/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado y con una función 
     * se lo pasamos por parámetro para que nos indique si es o no un número primo, 
     * debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
* Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
      
       boolean   numeroprimo1;
               numeroprimo1= primo(numero);
        System.out.println( numeroprimo1);
        // TODO code application logic here
    }
    public static boolean primo (int numero){
boolean numeroprimo = false ;
int contador=1;
for (int i=1 ; i<(numero);i++){
if (numero%i==0){
contador++;}
if (contador == 2){
numeroprimo= true;}
}        

        return numeroprimo;
    }
}

