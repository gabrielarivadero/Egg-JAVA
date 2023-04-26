/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewMain;

import entidadExtras.Juego;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el número de intentos:");
        int n=sc.nextInt();
        boolean salir= false;
        
        Juego miJuego = new Juego(n);
        
        do{
            miJuego.iniciarJuego();
            miJuego.ingreseNumeroElegido();
            while(miJuego.tieneMasIntentos()){
               miJuego.intentoDeAdivinanza();
               if(miJuego.isGanaste()){
                   break;
               }
            }
            miJuego.muestraInformePorPartida();
            miJuego.finalizaPartida();
            
            System.out.println("¿Desea salir?");
            salir=sc.nextBoolean();
        }while(!salir); 
        miJuego.muestraInformeDeTodasLasPartidas();        
    }    
}
