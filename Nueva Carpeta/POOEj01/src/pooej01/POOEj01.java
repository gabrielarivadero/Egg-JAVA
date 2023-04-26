/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
      String nombre;
      String apellido;
       int edad;
       System.out.println("Ingrese nombre:");
        nombre =leer.next();
         System.out.println("Ingrese apellido:");
        apellido =leer.next();
        System.out.println("Ingrese edad:");
        edad =leer.nextInt();
        
        Persona persona1 = new Persona (nombre, apellido, edad);
        
                persona1.setNombre("Camila");
        System.out.println("-------------------");
        System.out.println(persona1.getApellido());
        System.out.println("-------------------");
        System.out.println(persona1.toString());
        
    }

    
}
