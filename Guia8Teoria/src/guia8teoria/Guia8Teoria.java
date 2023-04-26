/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8teoria;

import Entidad.Persona;
import PersonaService.PersonaService;

/**
 *
 * @author Usuario
 */
public class Guia8Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
       
        PersonaService personaservice1 = new PersonaService();
        personaservice1.mostrarAtributos(persona1);
        // TODO code application logic here
    }
    
}
