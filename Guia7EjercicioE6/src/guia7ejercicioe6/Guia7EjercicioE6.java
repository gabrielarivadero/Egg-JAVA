/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioe6;

import Entidad.Rectangulo;

/**
 *
 * @author Usuario
 */
public class Guia7EjercicioE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo (4,6);
        
        System.out.println("El del rectangulo con lado 1 = "+rectangulo1.getLado1()+ " lado 2 = "+ rectangulo1.getLado2()+ " el area es de " + rectangulo1.calcularArea(4, 6) );
        
        // TODO code application logic here
    }
    
}
