/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraService;

import Entidad.Cafetera;

/**
 *
 * @author Gabriela Rivadero
 */
public class CafeteraService {
    
    public void llenarCafetera(Cafetera cafetera1){
        cafetera1.setCantidadActual(cafetera1.getCapacidadMaxima());
        
    }
    
    public void servirTaza(int taza, Cafetera cafetera1){
    
        int nuevaCantidad;
        nuevaCantidad = cafetera1.getCantidadActual()-taza;
        if (nuevaCantidad<0){
            System.out.println("No se puede servir la cantidad solcitada, la "
                    + "taza quedó en " + cafetera1.getCantidadActual()+ " unidades");
            cafetera1.setCantidadActual(0); 
        }
        cafetera1.setCantidadActual(nuevaCantidad);
        System.out.println("Le está quedando: " + cafetera1.getCantidadActual() + " café");
    }
    public void vaciarCafetera(Cafetera cafetera1){
        cafetera1.setCantidadActual(0);
        System.out.println("Vació la cafetera");
    }
    public void agregarCafe(int cantidadAgregada, Cafetera cafetera1){
        int nuevaCantidad;
        nuevaCantidad = cafetera1.getCantidadActual() + cantidadAgregada;
        if (nuevaCantidad > cafetera1.getCapacidadMaxima()){
            nuevaCantidad = cafetera1.getCapacidadMaxima();
            System.out.println("Se superó la capacidad máxima, solo agregamos: " +
                    (cafetera1.getCapacidadMaxima()-cafetera1.getCantidadActual()));
        }
        cafetera1.setCantidadActual(nuevaCantidad);
        System.out.println("Café agregado, la cafetera, contiene " + cafetera1.getCantidadActual() + " de café");
    }

}
