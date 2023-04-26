/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicioe1;

import Entidad.Raiz;
import RaizServicio.RaizServicio;

/**
 *
 * @author Gabriela Rivadero
 */
public class Guia8EjercicioE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double a,b,c;
    a=2;
    b=3;
    c=2;
    Raiz r1 = new Raiz(a,b,c);
    RaizServicio rs = new RaizServicio();
    
    rs.calcular(r1);
    
        // TODO code application logic here
    
}
}