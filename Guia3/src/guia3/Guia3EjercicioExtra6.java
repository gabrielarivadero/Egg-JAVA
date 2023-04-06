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
public class Guia3EjercicioExtra6 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
     * por debajo de 1.60 mts. y el promedio de estaturas en general.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner leer = new Scanner(System.in);
  	 int  cantidadpersonas, i, contador1;
                 contador1=0;
        double altura, suma1=0, suma2=0;
                 
        System.out.println("Ingrese la cantidad de personas");
  cantidadpersonas = leer.nextInt();
      for (i=1; i<=cantidadpersonas; i++){
          System.out.println("Ingrese la estatura de la persona "+i);
                altura = leer.nextDouble();
                 suma2 = suma2 + altura;
          if (altura <= 1.6)
          {contador1 = contador1 + 1;
          suma1 = suma1 + altura;
          }
          
      }
          System.out.println("El promedio de las personas con estatura menor a 1.6 ms es " + suma1/contador1);
          System.out.println("El promedio de las personas en ms es " + suma2/cantidadpersonas);
    }
    
}
