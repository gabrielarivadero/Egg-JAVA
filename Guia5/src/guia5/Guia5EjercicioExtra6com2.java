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
public class Guia5EjercicioExtra6com2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String sopa[][] = new String[20][20];
        int filas = 0;
        int columnas = 0;
        String palabra;

        int valfil = 0;
        //ahora leeremos las palabras

        String letra = "";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = letra + ((int) (Math.random() * 10));
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra " + (i + 1) + ": ");
            palabra = leer.nextLine();
            String palabras[] = new String[palabra.length()];
            for (int j = 0; j < palabra.length(); j++) {
                palabras[j] = palabra.substring(j, (j + 1));

            }

            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.print("La palabra debe tener mínimo 3 y máximo 5 caracteres. Intente de nuevo: ");
                palabra = leer.nextLine();
                for (int j = 0; j < palabra.length(); j++) {
                    palabras[j] = palabra.substring(j, (j + 1));
                }

            }

            valfil = filas;
            filas = (int) (Math.random() * 20);
            columnas = (int) (Math.random() * 14);

            if (valfil != filas) {
                for (int j = 0; j < palabras.length; j++) {
                    sopa[filas][columnas + j] = palabras[j];
               
                    
                }
            }else{
                filas = (int) (Math.random() * 20);
                columnas = (int) (Math.random() * 14);
                for (int j = 0; j < palabras.length; j++) {
                    sopa[filas][columnas + j] = palabras[j];
               
                    
                }
            }

        }
        //ahora seleccionar una fila al azar

        /*for (int i = 0; i < 5; i++) {
            filas = (int) (Math.random() * 20);
            columnas = (int) (Math.random() * 15);
            sopa[filas][columnas] = palabras[i];
        }
         */
        //mostrar
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        // TODO code application logic here
    }
    }
}
