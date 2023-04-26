/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio2;

import CafeteraService.CafeteraService;
import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Gabriela Rivadero
 */
public class Guia8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int capacidadMaxima = 10;
        int cantidadActual = 5;
        Scanner leer = new Scanner(System.in);
        
        Cafetera cafetera1 = new Cafetera(capacidadMaxima, cantidadActual);
       
        CafeteraService cafetera = new CafeteraService();
        
        cafetera.llenarCafetera(cafetera1);
        System.out.println("Indique el tamaño de taza que desea servir: ");
        
        cafetera.servirTaza(leer.nextInt(), cafetera1);
        cafetera.vaciarCafetera(cafetera1);
         System.out.println("Indique cuanto café desea agregar: ");
        cafetera.agregarCafe(leer.nextInt(), cafetera1);
    }
        // TODO code application logic here
    }
    

