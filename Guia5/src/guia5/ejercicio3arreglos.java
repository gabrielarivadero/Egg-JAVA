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
public class ejercicio3arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        int vector[] = new int[n];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * (Math.random() * 100000));
            String numCadena = String.valueOf(vector[i]);
            System.out.println(vector[i]);
            if (numCadena.length() == 1) {
                cont1++;

            }
            if (numCadena.length() == 2) {
                cont2++;

            }
            if (numCadena.length() == 3) {
                cont3++;

            }
            if (numCadena.length() == 4) {
                cont4++;

            }
            if (numCadena.length() == 5) {
                cont5++;

            }
            
        }
     System.out.println("Numeros de una cifras se encontraron " + cont1);
     System.out.println("Numeros de dos cifras se encontraron " + cont2);
     System.out.println("Numeros de tres cifras se encontraron " + cont3);
     System.out.println("Numeros de cuatro cifras se encontraron " + cont4);
     System.out.println("Numeros de cinco cifras se encontraron " + cont5);
    }
        // TODO code application logic here
    }
    

