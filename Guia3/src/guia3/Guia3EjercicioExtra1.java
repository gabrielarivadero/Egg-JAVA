/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    *Por ejemplo, si el usuario ingresa 1600 minutos, 
    *el sistema debe calcular su equivalente: 1 día, 2 horas.D*/
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
       double minutoUsuario, dias, horas;
      
        System.out.println("Ingrese minutos para calcular su equivalente en dias y minutos");
        minutoUsuario = leer.nextDouble();
        dias  = Math.floor(minutoUsuario/60/24);
        horas = Math.floor((minutoUsuario - (dias*24*60))/60);
        System.out.println("La cantidad de días son "+dias);
       
    
        System.out.println("La cantidad de horas son "  +horas );
        // TODO code application logic here
    
    }
}
