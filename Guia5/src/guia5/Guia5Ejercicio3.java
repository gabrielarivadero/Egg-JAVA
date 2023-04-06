/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5Ejercicio3 {

    /**
     * recorrer un vector de N enteros contabilizando cuántos números 
     * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int N;
 
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();
        int[ ] numeros = new int[N];
        
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = (int) (Math.random()*(Math.random()*100000));
        }
       int cont0 =0;
        int cont1 = 0;
         int cont2 = 0;
         int cont3 = 0;
         int cont4 = 0;
          int cont5 = 0;
for (int i = 0; i < numeros.length ; i++) {
    System.out.println(" [ "+numeros[i] + " ] ");
    while (numeros[i]!=0) {
       numeros[i] = numeros[i]/10;
          cont0++; 
    } 
           switch (cont0) {   
               case 1:
                   cont1++;
               break;
                case 2:
                   cont2++;
               break;
                case 3:
                   cont3++;
               break;
               case 4:
                   cont4++;
               break;
               case 5:
                   cont5++;
               break;
                          
           }
           cont0=0;
            }
System.out.println("Se encontró  numeros de un digito " + cont1 + "  veces"); 
System.out.println("Se encontró  numeros de dos digitos " + cont2 + "  veces"); 
System.out.println("Se encontró  numeros de tres digitos " + cont3 + "  veces"); 
System.out.println("Se encontró  numeros de cuatro digitos " + cont4 + "  veces"); 
System.out.println("Se encontró  numeros de cinco digitos " + cont5 + "  veces");
        }
     
            
       
        // TODO code application logic here
    }
    

