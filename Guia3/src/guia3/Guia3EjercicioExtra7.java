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
public class Guia3EjercicioExtra7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
     * de n números (n>0). El valor de n se solicitará al principio del programa 
     * y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.

     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
           int cantidadnumeros, contador;
    
       System.out.println("Ingrese la cantidad de numeros a ingresar");
       cantidadnumeros = leer.nextInt();
  
 double numeros, valormax, valormin, promediomax, promediomin, suma ;
 contador = 0;
 valormax=0;
 valormin=0;
 suma =0;     
 
   while (contador<cantidadnumeros);{
        contador = contador + 1 ;
       System.out.println("Ingrese un numero");
    numeros = leer.nextDouble();
    suma = suma + numeros; 
    if (valormax<numeros){
        valormax=numeros;}
    if (valormin>numeros){
        valormin=numeros;}
    }
        System.out.println("El valor minimo ingresado es "+ valormin);
        System.out.println("El valor maximo ingresado es " + valormax);
        double contidadnumeros;
        System.out.println("El promedio de todos los numeros es "+ suma/cantidadnumeros);
    }
  
            
    }
    
    
