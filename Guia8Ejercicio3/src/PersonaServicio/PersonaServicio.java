/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Gabriela Rivadero
 */
public class PersonaServicio {
     public boolean esMayorDeEdad(Persona persona1){
       if (persona1.getEdad() >= 18){
          return true; 
       } 
        return false;
    }
    public void crearPersona(Persona persona1 , Scanner leer){
        
        System.out.println("Ingrese el nombre de la persona");
        
        persona1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la edad de la persona");
        
        persona1.setEdad(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingrese el sexo de la persona");
        String sexo = "";
        sexo=leer.nextLine();
        sexo = sexo.toUpperCase();
        if ("H".equals(sexo) || "M".equals(sexo) || "O".equals(sexo)){
            persona1.setSexo(sexo);
        } else {
            System.out.println("Ingresó un valor incorrecto");
        }
               
        System.out.println("Ingrese el peso de la persona");
        
        persona1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese la altura de la persona");
        
        persona1.setAltura(leer.nextDouble());
        leer.nextLine();
    }

    public double calcularIMC(Persona persona1){
        double imc;
        imc = persona1.getPeso()/Math.pow(persona1.getAltura(), 2);
        if (imc<20){
            return -1;
        } else if (imc >=20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    
}
