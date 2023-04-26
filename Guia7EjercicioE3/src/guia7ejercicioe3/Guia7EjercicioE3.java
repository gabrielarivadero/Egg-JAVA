/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioe3;

import Entidad.iniciar_juego;

/**
 *
 * @author Usuario
 */
public class Guia7EjercicioE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de 
//         adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo.
//         El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo"
//         después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin
//          intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces
//         que cada jugador ha ganado.


iniciar_juego jugador1 = new iniciar_juego();
 jugador1.ingresarNumero();       
jugador1.adivinarNumero();
int cont1 = jugador1.cont1;
int cont2 = jugador1.cont2;
cont1=0;
cont2=0;
 jugador1.ingresarNumero();
jugador1.adivinarNumero();

jugador1.ingresarNumero();
jugador1.adivinarNumero();

jugador1.ingresarNumero();
jugador1.adivinarNumero();

    }
    
}
