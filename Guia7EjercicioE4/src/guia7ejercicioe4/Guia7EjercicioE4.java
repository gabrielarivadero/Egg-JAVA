/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioe4;

import Entidad.Cuenta;

/**
 *
 * @author Usuario
 */
public class Guia7EjercicioE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Cuenta cuenta1 = new Cuenta () ;
cuenta1.Titular();
cuenta1.retirarDinero();
        System.out.println("Titular " + cuenta1.getTitular()+ " su saldo es de "+ cuenta1.getSaldo());


        

// TODO code application logic here
    }
    
}
