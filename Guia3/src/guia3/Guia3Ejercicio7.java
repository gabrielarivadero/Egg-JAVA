/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
*este tipo de dispositivo lee cadenas enviadas por el usuario. 
*Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
*Las secuencias leídas que respeten el formato se consideran correctas,
*la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
*y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
*Al finalizar el proceso, se imprime un informe indicando la cantidad de 
*lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
*deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        byte correct,incorrect;
        correct = 0;
        incorrect = 0;
        System.out.println("Ingrese una frase de 5 caracteres maximo");
        
        do {
             frase = leer.nextLine();
        if (frase.startsWith("X")&& frase.endsWith("O")&& frase.length()<6) {
            correct++;
        } else incorrect++;
            if (frase.equals("&&&&&")) incorrect--;
            
            
        } while (!frase.equals("&&&&&"));
        
        System.out.println("Las frases con el formato correcto fueron: "+correct);
        System.out.println("Las frases con el formato incorrecto fueron: "+incorrect);
        
      leer.close(); 
         
         }
    }
    

