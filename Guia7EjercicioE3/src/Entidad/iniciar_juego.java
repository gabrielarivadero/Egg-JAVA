/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * //        Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
 * jugar un juego de 
//         adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo.
//         El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo"
//         después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin
//          intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces
//         que cada jugador ha ganado.
 *
 * @author Usuario
 */
public class iniciar_juego {
    Scanner leer = new Scanner (System.in);
   public int numero;
   public int numero2;
   public int intentos;
   public int cont1;
   public int cont2;
   
   public iniciar_juego() {
  
    }
  

    public iniciar_juego(int numero, int numero2, int intentos) {
        this.numero = numero;
        this.numero2 = numero2;
        this.intentos = intentos;
        
      
    }
public void ingresarNumero () {
    
    System.out.println("Jugador 1 ingrese el numero a adivinar");
    
   numero = leer.nextInt();
   
    
}
public void adivinarNumero(){
 
    this.intentos = 4;
    int cont=0;
   
    System.out.println("Tiene 4 intentos para adivinar el numero Ingresado por el Jugador 1");
    for (int i = 0; i < intentos; i++) {
 System.out.println("Jugador 2 ingrese el numero ingresado por el Jugador 1");
 numero2=leer.nextInt();
        if (numero== numero2) {
            cont++;
   System.out.println("Adivino el numero");
   cont1++;
            System.out.println("Juagador 1 gano "+cont2+" veces");
            System.out.println("Juagador 2 gano "+cont1+" veces");
            break;
        } 
        if (numero<numero2) {
             cont++;
            System.out.println("mas bajo");
        } 
         if (numero>numero2) {
             cont++;
            System.out.println("mas alto");
            
             if (i==intentos-1) {
                 cont2++;
                System.out.println("Juagador 1 gano "+cont2+" veces");
                System.out.println("Juagador 2 gano "+cont1+" veces");
             }
        } 
        
    }
           System.out.println("Cantidad de intentos "+cont );  
}
}

   
    

