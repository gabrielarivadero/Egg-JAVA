/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declarar una clase llamada Circunferencia que tenga como atributo 
        //privado el radio de tipo real. A continuación, se deben crear los 
        //siguientes métodos:
        //Método constructor que inicialice el radio pasado como parámetro.
        //Métodos get y set para el atributo radio de la clase Circunferencia.
        //Método para crearCircunferencia(): que le pide el radio y lo guarda  
        //en el atributo del objeto.
        //Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        //Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
        Scanner leer = new Scanner(System.in);
        double radio;
        System.out.println("Ingrese el radio de la circunferencia");     
        radio= leer.nextDouble();
        Circunferencia c1 = new Circunferencia(radio);
        double area = c1.area();
        System.out.println("El area de la circunferencia es:" + area);         
        double perimetro = c1.perimetro();
        System.out.println("El perimetro de la circunferencia es:" + perimetro);  
        // TODO code application logic here
    }
    
}
