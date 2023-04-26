/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después 
 * de realizar una transacción de retiro.

 * @author Usuario
 */
public class Cuenta {
    private double saldo;
    private String titular;
    private double dineroRetirado;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular, double dineroRetirado) {
        this.saldo = saldo;
        this.titular = titular;
        this.dineroRetirado = dineroRetirado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDineroRetirado() {
        return dineroRetirado;
    }

    public void setRetirarDinero(double dineroRetirado) {
        this.dineroRetirado = dineroRetirado;
    }
    

     public void Titular() {
         
         System.out.println("Ingrese el nombre de titular");
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         titular = leer.nextLine();
    }
    
    public double retirarDinero (){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       saldo = 1500;
        System.out.println("Su saldo es "+saldo+ " Ingresa la contidad de dinero a retirar");
         dineroRetirado = leer.nextDouble();
        if (saldo>dineroRetirado) {
            saldo= saldo - dineroRetirado;
        }else System.out.println("Error. La cantidad de dinero a retirar supera el saldo");
        
        return saldo;
    }
    
}
