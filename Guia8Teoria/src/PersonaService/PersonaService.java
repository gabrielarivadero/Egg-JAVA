/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
    private Scanner leer = new Scanner(System.in);
    public void mostrarAtributos(Persona persona){
        
        System.out.println("Introduzca un nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Introduzca un apellido");
        persona.setApellido(leer.nextLine());
        System.out.println("Introduzca una edad");
        persona.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
    }
    
}
