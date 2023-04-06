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
@SuppressWarnings("empty-statement")
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
     * de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
     * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
     * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                edades();
        // TODO code application logic here
    }
  public static void edades () {
Scanner leer= new Scanner (System.in);
String nombre;
String respuesta ;
respuesta = " ";
int edad;
do 
  {
      System.out.println("Ingrese su nombre");
  nombre = leer.next();
      System.out.println("Ingrese su edad");
       edad = leer.nextInt();
 System.out.println("Su nombre es " + nombre);
 if (edad <18) {
    System.out.println("Su edad es "+ edad + " años y es menor de edad ");
} else {
    System.out.println("Su edad es "+ edad + " años y es mayor de edad ");

        }
System.out.println("Quiere continuar " + nombre +" ingrese Si/No ") ;
respuesta = leer.next();
  }
       while (!"No".equals(respuesta));
 
}
}

  
