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
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
 * por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
 * este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de Euros a convertir");
    	double euros = leer.nextInt();
         System.out.println("Ingrese en que moneda desea convertir");
    	String cambio = leer.next();
        convertir( euros, cambio);
        // TODO code application logic here
    }
     public static void convertir (double euros, String cambio){
         double libras = euros*0.86 ;
         double dolares = euros*1.28611;
         double yenes = euros * 129.852;
                 
                 
    if ("libras".equalsIgnoreCase(cambio))
    { System.out.println("El cambio es " +libras+ " libras");
    } else if ("dolar".equalsIgnoreCase(cambio)) {
    // si es menor que 5 y esta nevando y no es mayor que 15 ni mayor que 25
    System.out.println("El cambio es " +dolares+ " dolares");
} else if ("yenes".equalsIgnoreCase(cambio)) {
    // si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
    System.out.println("El cambio es " +yenes+ " yenes");
}
            
            }
}
