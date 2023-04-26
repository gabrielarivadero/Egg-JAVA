/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia8;

import Entidades.Persona;
import Persona.Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio2Guia8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio servicio = new PersonaServicio();

        int vectorIMC[] = new int[4];
        boolean vectorMayorEdad[] = new boolean[4];
        
        int contmayor = 0;
        int contIMCmenor = 0;
        int contIMCideal = 0;

        for (int i = 0; i < vectorIMC.length; i++) {
            
            Persona persona = servicio.crearPersona();
            
            vectorIMC[i] = servicio.calcularIMC(persona);
            vectorMayorEdad[i] = servicio.esMayorEdad(persona);
            
            servicio.mostrarPersona(persona);
            if (vectorMayorEdad[i]){
                contmayor++;
            }
            if (vectorIMC[i]<0){
            
                contIMCmenor++;
            }else if(vectorIMC[i]==0){
            
                contIMCideal++;
            }

        }
        
        int menorEdad = 4-contmayor;
        int tripledemigalovers = 4-contIMCmenor-contIMCideal;
        System.out.println("El promedio de gente mayor de edad es: "+ (contmayor*100/4)+"%");
        System.out.println("El promedio de gente menor de edad es: "+ (menorEdad*100/4)+"%");
        System.out.println("El promedio de gente con peso ideal es: "+ (contIMCideal*100/4)+"%");
        System.out.println("El promedio de gorditos es: "+ (tripledemigalovers*100/4)+"%");
        System.out.println("El promedio de desnutridos (hay que comer che): "+ (contIMCmenor*100/4)+"%");
        
        

    }

}
