/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {
//    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
//   "salario". Luego, crea un método "calcular_aumento" que calcule 
//   el aumento salarial de un empleado en función de su edad y salario
//   actual. El aumento salarial debe ser del 10% si el empleado tiene
//   más de 30 años o del 5% si tiene menos de 30 años.
    
    private String nombre;
  private int edad;
  private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        }
    
    public void datos (){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    nombre = leer.nextLine();
    System.out.println("ingrese su edad");
    edad = leer.nextInt ();
    System.out.println("Ingrese su salario");
    salario = leer.nextDouble();        
    };
    
     double aumento=0;
    public double calcularAumento () {
     
     if (edad>30)
     {
     aumento = salario*0.1;
     }
     else 
     {
     aumento = salario*0.05;
     }
     return aumento;
            
    }
    
  
    }
    
    
    

