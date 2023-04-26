/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFService;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Gabriela Rivadero
 */
public class NIFService {
     Scanner leer= new Scanner(System.in);
    
    public void crearNif(NIF nif1){
        
        System.out.println("Ingrese su DNI: ");
        nif1.setDni(leer.nextLong());
        String [] codigo = new String [23];
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < 23; i++) {
            codigo[i] = cadena.substring(i, i+1);
        }
        int resto = (int) nif1.getDni()%23;
       
        nif1.setLetra(codigo[resto]);


    }
    public void mostrar(NIF nif1){
        System.out.println("Su DNI es: " + nif1.getDni() + "-" + nif1.getLetra());
    }
    
}
