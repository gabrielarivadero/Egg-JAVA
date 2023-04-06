/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Guia5Ejercicio5comp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];
        Random claseRandom = new Random();
        System.out.println("MATRIZ A");
        System.out.println("");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                int randomInt = -1 + claseRandom.nextInt(1 + 1);
                matrizA[i][j] = randomInt;
                if (matrizA[i][j] >= 0) {
                    System.out.print("+" + matrizA[i][j] + " ");
                } else {
                    System.out.print(matrizA[i][j] + " ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        boolean antiSimetrica = false;
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizA[i][j] == -(matrizB[j][i])) {
                    antiSimetrica = true;
                } else {
                    antiSimetrica = false;
                    System.out.println("");
                    System.out.println("La matriz no es antisimétrica");
                    break;
                }
            }
            if (antiSimetrica == false) {
                break;
            }
        }
        if (antiSimetrica == true) {
            System.out.println("");
            System.out.println("La matriz es antisimétrica");
        }
        System.out.println("");
        System.out.println("MATRIZ B");
        System.out.println("");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizB[i][j] >= 0) {
                    System.out.print("+" + matrizB[i][j] + " ");
                } else {
                    System.out.print(matrizB[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
        // TODO code application logic here
    }
    

