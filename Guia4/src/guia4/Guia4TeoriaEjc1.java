/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4TeoriaEjc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String caracter;
         Scanner leer = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase a codificar: ");
        frase = leer.nextLine();
        for (int i = 0; i < frase.length(); i++) {
             caracter = frase.substring(i,i+1);
        String resultado = codificar(caracter);
             System.out.print(resultado);
        }
       
        
    }
    public static String codificar(String letra) {
        String codigo;
        
        switch (letra.toLowerCase()) { 
            case "a":
                    codigo = "@";
            break;
            case "e":
                    codigo = "#";
            break;
            case "i":
                    codigo = "$";
            break;
            case "o":
                    codigo = "%";
            break;
            case "u":
                    codigo = "*";
            break;
            default:
                codigo = letra;
              }
     return codigo;
    }
    
}
