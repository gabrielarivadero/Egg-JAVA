/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1;

import CuentaBancariaService.CuentaBancariaService;

/**
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual.
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará
al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que
el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 *
 * @author Usuario
 */
public class Guia8Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaService cuentaServ = new CuentaBancariaService();
        cuentaServ.crearCuenta();
        cuentaServ.ingresar();
        cuentaServ.consultarSaldo();
        cuentaServ.retirar();
        cuentaServ.consultarSaldo();
        cuentaServ.extraccionRapida();
        cuentaServ.consultarSaldo();
        cuentaServ.consultarSaldo();
        cuentaServ.consultarDatos();
        // TODO code application logic here
    }
    
}
