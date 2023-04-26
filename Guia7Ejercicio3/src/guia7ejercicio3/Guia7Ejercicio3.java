/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear una clase llamada Operacion que tenga como atributos privados 
        //numero1 y numero2. A continuación, se deben crear los siguientes métodos:
        //Método constructor con todos los atributos pasados por parámetro.
        //Método constructor sin los atributos pasados por parámetro.
        //Métodos get y set.
        //Método para crearOperacion(): que le pide al usuario los dos números y los
        //guarda en los atributos del objeto.
        //Método sumar(): calcular la suma de los números y devolver el resultado 
        //al main.
        //Método restar(): calcular la resta de los números y devolver el resultado 
        //al main
        //Método multiplicar(): primero valida que no se haga una multiplicación por
        //cero,si fuera a multiplicar por cero, el método devuelve 0 y se le informa
        //al usuario el error. Si no, se hace la multiplicación y se devuelve el 
        //resultado al main
        //Método dividir(): primero valida que no se haga una división por cero, si 
        //fuera a pasar una división por cero, el método devuelve 0 y se le informa 
        //al usuario el error se le informa al usuario. Si no, se hace la división 
        //y se devuelve el resultado al main.
        Scanner leer = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Ingrese el numero 1:");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2:");
        numero2 = leer.nextInt();
        Operacion oper1 = new Operacion();
        oper1.crearOperacion(numero1, numero2);
        double suma = oper1.sumar();
        double resta = oper1.restar();
        double multi = oper1.multiplicar();
        double divi = oper1.dividir();

        System.out.println("La suma de los numeros es:" + suma);
        System.out.println("La resta de los numeros es:" + resta);
        if (multi == 0) {
        System.out.println("Error uno de los operandos es cero y el reultado es: " + multi);
            
        } else {
        System.out.println("El resultado de la multiplicación es: " + multi);    
        }
        if (divi == 0 ){
        System.out.println("Error el divisor es cero, no es posible realizar la operación");    
        } else {
        System.out.println("El resultado de la división es: " + divi);    
        }
        
        float divi1=10%20;
        
        System.out.println("la división es: " + divi1);
        // TODO code application logic here
    }
    
}
