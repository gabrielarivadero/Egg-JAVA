/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Persona persona = new Persona();
    String aux;

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Bienvenido a CrearHumanos S.A!");
        System.out.println("Ingrese las caracteristicas de cada persona a crear:");
        System.out.println(" ");
        System.out.println("Empecemos por el sexo de la persona a crear usando la inicial del sexo: H, M, O (Para otros)");
        persona.setSexo(leer.next());
        aux = persona.getSexo();

        if ("H".equalsIgnoreCase(aux) || "M".equalsIgnoreCase(aux) || "O".equalsIgnoreCase(aux)) {
            System.out.println("Ingrese el nombre de la persona:");
            persona.setNombre(leer.next());
            System.out.println("Bien! ingrese el peso que " + persona.getNombre() + " va a tener! :");
            persona.setPeso(leer.nextDouble());
            System.out.println("Ok, ahora que edad quieres darle a " + persona.getNombre() + "?");
            persona.setEdad(leer.nextInt());
            System.out.println("Bien, cuanto mide "+ persona.getNombre()+" ? ");
            persona.setAltura(leer.nextDouble());
        } else {
            System.out.println("Has ingresado una opcion incorrecta.");
            return null;
        }
        return persona;

    }

    public boolean esMayorEdad(Persona persona) {

        if (persona.getEdad() >= 18) {

            return true;

        }

        return false;
    }

    public int calcularIMC(Persona persona) {

        double pesoideal = (persona.getPeso() / (Math.pow(persona.getAltura(), 2)));
        if (pesoideal < 20) {
            return -1;
        } else if (pesoideal > 20 && pesoideal <= 25) {

            return 0;
        } else {

            return 1;
        }
    }

    public void mostrarPersona(Persona persona) {

        System.out.println(persona.getNombre() + " es sexo " + persona.getSexo() + " tiene " + persona.getEdad() + " años");
        System.out.println(persona.getNombre() + " mide " + persona.getAltura() + " y su peso es " + persona.getPeso());

    }

}
