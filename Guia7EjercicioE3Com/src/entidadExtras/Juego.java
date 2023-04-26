/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadExtras;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class Juego {
//    Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
//    jugadores jugar un juego de adivinanza de números. El primer jugador elige 
//    un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene
//    un número limitado de intentos y recibe una pista de "más alto" o "más bajo"
//    después de cada intento. El juego termina cuando el segundo jugador adivina
//    el número o se queda sin intentos. Registra el número de intentos necesarios 
//    para adivinar el número y el número de veces que cada jugador ha ganado

    //Atributos
    private int numero_a_adivinar;
    private int numero_de_intentos;

    private int numero_de_intentos_para_adivinar;
    private int numero_de_partidas_jugadas;
    private int numero_que_gano;
    private boolean ganaste;

    //Constructores
    public Juego(int numero_de_intentos) {
        this.numero_de_intentos = numero_de_intentos;
        this.numero_de_intentos_para_adivinar = 0;
        this.numero_de_partidas_jugadas = 0;
        this.numero_que_gano = 0;
        ganaste=false;
    }

    
    //Geters y seters
    public int getNumero_a_adivinar() {
        return numero_a_adivinar;
    }

    public void setNumero_a_adivinar(int numero_a_adivinar) {
        this.numero_a_adivinar = numero_a_adivinar;
    }

    public int getNumero_de_intentos() {
        return numero_de_intentos;
    }

    public void setNumero_de_intentos(int numero_de_intentos) {
        this.numero_de_intentos = numero_de_intentos;
    }

    public int getNumero_de_intentos_para_adivinar() {
        return numero_de_intentos_para_adivinar;
    }

    public void setNumero_de_intentos_para_adivinar(int numero_de_intentos_para_adivinar) {
        this.numero_de_intentos_para_adivinar = numero_de_intentos_para_adivinar;
    }

    public int getNumero_de_partidas_jugadas() {
        return numero_de_partidas_jugadas;
    }

    public void setNumero_de_partidas_jugadas(int numero_de_partidas_jugadas) {
        this.numero_de_partidas_jugadas = numero_de_partidas_jugadas;
    }

    public int getNumero_que_gano() {
        return numero_que_gano;
    }

    public void setNumero_que_gano(int numero_que_gano) {
        this.numero_que_gano = numero_que_gano;
    }

    public boolean isGanaste() {
        return ganaste;
    }

    //Métodos
    
    public void iniciarJuego() {
        this.numero_de_intentos_para_adivinar = 0;
        ganaste=false;
    }

    public void ingreseNumeroElegido() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el número a adivinar");
        this.numero_a_adivinar = sc.nextInt();
       
    }

    public void intentoDeAdivinanza() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número para ver si adivinó");
        int num = sc.nextInt();
        if(num<numero_a_adivinar)
        {
            System.out.println("Mas alto");
        }
        else if(num>numero_a_adivinar)
        {
            System.out.println("Mas bajo");
        }
        else
        {
            System.out.println("Adivinaste el número");
            ganaste=true;
            numero_que_gano++;
        }
        numero_de_intentos_para_adivinar++;
    }
    
    public boolean tieneMasIntentos()
    {
        return numero_de_intentos>numero_de_intentos_para_adivinar;
    }
    
    public void finalizaPartida()
    {
        numero_de_partidas_jugadas++;
    }
    
    public void muestraInformePorPartida()
    {
        System.out.println("¿El jugador ganó? "+ ganaste+ " en cuantos intentos: "+numero_de_intentos_para_adivinar);
    }
    
    public void muestraInformeDeTodasLasPartidas()
    {
        System.out.println("Número de partidas jugadas: "+ numero_de_partidas_jugadas);
        System.out.println("La cantidad de veces que ganó: "+ numero_que_gano);
    }
    

}
