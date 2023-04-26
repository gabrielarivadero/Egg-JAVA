/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancariaService;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaBancariaService {
     //crear cuenta pidiéndole los datos al usuario.
    private Scanner leer = new Scanner(System.in);
    CuentaBancaria cuenta = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        
        System.out.println("Introduzca un número de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Introduzca un dni: ");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Introduzca un Saldo: ");
        cuenta.setSaldoActual(leer.nextDouble());
        leer.nextLine();

        return cuenta;

    }

    public void ingresar() {
        double saldo;
        saldo = cuenta.getSaldoActual();
        System.out.println("Introduzca la cantidad de dinero a ingresar: ");
        saldo += leer.nextDouble();
        cuenta.setSaldoActual(saldo);
    }

    public void retirar() {
        double saldo;
        saldo = cuenta.getSaldoActual();
        System.out.println("Introduzca la cantidad de dinero a retirar: ");
        saldo -= leer.nextDouble();
        if (saldo < 0) {
            saldo = 0;
        }
        cuenta.setSaldoActual(saldo);
    }

    public void extraccionRapida() {
        double saldo;
        double retiro;
        saldo = cuenta.getSaldoActual();
        System.out.println("Introduzca la cantidad de dinero a retirar por extracción rápida: ");
        retiro = leer.nextDouble();
        if (retiro > saldo * 0.2) {
            retiro = saldo * 0.2;
        }
        cuenta.setSaldoActual(saldo - retiro);
    }

    public void consultarSaldo() {

        System.out.println("El saldo en la cuenta es de : $" + cuenta.getSaldoActual());

    }

    public void consultarDatos() {

        System.out.println("Cuenta Bancaria: " + cuenta.getNumeroCuenta());
        System.out.println("DNI Titular: " + cuenta.getDniCliente());
        System.out.println("Saldo final: " + cuenta.getSaldoActual());
    }
    
}
