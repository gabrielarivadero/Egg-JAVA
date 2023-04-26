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
public class tateti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        String matriz[][] = new String[3][3];
        String jugador = "X";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ".";
                System.out.print(" | " + matriz[i][j] + " | ");

            }

            System.out.println("");
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("Jugador de la " + jugador + " ingrese un numero del 1 al 9");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    matriz[0][0] = jugador;
                    break;
                case 2:
                    matriz[0][1] = jugador;
                    break;
                case 3:
                    matriz[0][2] = jugador;
                    break;
                case 4:
                    matriz[1][0] = jugador;
                    break;
                case 5:
                    matriz[1][1] = jugador;
                    break;
                case 6:
                    matriz[1][2] = jugador;
                    break;
                case 7:
                    matriz[2][0] = jugador;
                    break;
                case 8:
                    matriz[2][1] = jugador;
                    break;
                case 9:
                    matriz[2][2] = jugador;
                    break;

            }
            if (i % 2 == 0) {
                jugador = "O";
            } else {
                jugador = "X";
            }
            
            for (int k = 0; k < 3; k++) {
                for (int s = 0; s < 3; s++) {

                    System.out.print(" | " + matriz[k][s] + " | ");
                }
                System.out.println("");
            }

        }
        // TODO code application logic here
    }
    
}
