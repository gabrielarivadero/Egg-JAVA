/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

import Entidad.Rectángulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double base ;
        double altura;
        
        System.out.println("Ingrese la base del rectángulo:");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo:");
        altura = leer.nextInt();
        Rectángulo rec1 = new Rectángulo();
        rec1.crearRectángulo(base, altura);
        double superficie = rec1.superficie();
        System.out.println("El area la superficie del rectángulo  es: " + superficie);         
        double perimetro = rec1.perimetro();
        System.out.println("El perimetro del rectángulo es:" + perimetro);  
        double dibujo = rec1.dibujo();
         System.out.println(dibujo);  
        rec1.DibujarRect();

           
        
    }
    
}
