/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio3;

import Entidad.Persona;
import PersonaServicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Gabriela Rivadero
 */
public class Guia8Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Persona persona1 = new Persona();
     Persona persona2 = new Persona();
     Persona persona3 = new Persona();
     Persona persona4 = new Persona();
     
    PersonaServicio personaServ = new PersonaServicio();
    Scanner leer = new Scanner(System.in);
   
    personaServ.crearPersona(persona1, leer);
    personaServ.crearPersona(persona2, leer);
    personaServ.crearPersona(persona3, leer);
    personaServ.crearPersona(persona4, leer); 
    
    if (personaServ.calcularIMC(persona1)==-1){
        System.out.println("La persona 1 tiene bajo peso");
    } else if (personaServ.calcularIMC(persona1)==0){
        System.out.println("La persona 1 tiene peso ideal");
    } else {
         System.out.println("La persona 1 tiene sobrepeso");
    }
    
    if (personaServ.esMayorDeEdad(persona1)) {
        System.out.println("La persona 1 es mayor de edad");
    } else {
        System.out.println("la persona 1 es menor de edad");
    }
    
    if (personaServ.calcularIMC(persona2)==-1){
        System.out.println("La persona 2 tiene bajo peso");
    } else if (personaServ.calcularIMC(persona2)==0){
        System.out.println("La persona 2 tiene peso ideal");
    } else {
         System.out.println("La persona 2 tiene sobrepeso");
    }
    
    if (personaServ.esMayorDeEdad(persona2)) {
        System.out.println("La persona 2 es mayor de edad");
    } else {
        System.out.println("la persona 2 es menor de edad");
    }
    
    if (personaServ.calcularIMC(persona3)==-1){
        System.out.println("La persona 3 tiene bajo peso");
    } else if (personaServ.calcularIMC(persona2)==0){
        System.out.println("La persona 3 tiene peso ideal");
    } else {
         System.out.println("La persona 3 tiene sobrepeso");
    }
    
    if (personaServ.esMayorDeEdad(persona3)) {
        System.out.println("La persona 3 es mayor de edad");
    } else {
        System.out.println("la persona 3 es menor de edad");
    }
    
    if (personaServ.calcularIMC(persona4)==-1){
        System.out.println("La persona 4 tiene bajo peso");
    } else if (personaServ.calcularIMC(persona2)==0){
        System.out.println("La persona 4 tiene peso ideal");
    } else {
         System.out.println("La persona 4 tiene sobrepeso");
    }
    
    if (personaServ.esMayorDeEdad(persona3)) {
        System.out.println("La persona 4 es mayor de edad");
    } else {
        System.out.println("la persona 4 es menor de edad");
    }
    
    }
}

