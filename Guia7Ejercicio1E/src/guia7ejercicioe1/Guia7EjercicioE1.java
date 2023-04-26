/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioe1;

import Entidad.Cancion;

/**
 *
 * @author Usuario
 */
public class Guia7EjercicioE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
       String autor;
       String titulo;
       
          Cancion cancion1 = new Cancion();
        cancion1.autor = "Romeo";
        cancion1.titulo="amor";
        System.out.println( cancion1.autor + " " +  cancion1.titulo );
        // TODO code application logic here
    }
    
}
