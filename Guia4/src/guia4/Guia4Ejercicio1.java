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
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
     * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
     * matemática y deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        int num1, num2;
        double resultado = 0;
        int opcion; 
        
        do{
        opcion = menu();
        
         System.out.println("Ingrese el primer número a operar: ");
          num1 = leer.nextInt();
         System.out.println("Ingrese el segundo número a operar: ");
          num2 = leer.nextInt();
        switch (opcion) { 
            case 1:
                    resultado = sumar(num1, num2);
            break;
            case 2:
                    resultado = restar(num1, num2);
            break;
            case 3:
                   resultado = multiplicar(num1, num2);
            break;
            case 4:
                   resultado = dividir(num1, num2);
            break;
case 5:
                do{
                do{
                    System.out.println("Seguro desea Salir? (S/N)");
                    respuesta = leer.next();
                    } while ((!"N".equals(respuesta)) && (!"S".equals(respuesta))); 
                    } while ("N".equals(respuesta));
            break;
            } 
        System.out.println("El resultado es: " + resultado);
        } while ("".equals(respuesta));

}
    public static int sumar(int num1, int num2){
           int suma;
           suma = num1 + num2;
           return suma;
}
 public static int restar(int num1, int num2){
           int resta;
           resta = num1 - num2;
           return resta;
}
public static int multiplicar(int num1, int num2){
           int multi;
           multi = num1 * num2;
           return multi;
}
public static double dividir(int num1, int num2){
           int divi;
           divi = num1 / num2;
           return divi;}
public static int menu(){
    Scanner leer = new Scanner(System.in);
    int opcion;
        
       
        do {
        System.out.println("MENU");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        System.out.println(" ");
        System.out.println("Elija una opción:");
        
        opcion = leer.nextInt();
        
          
        
        } while (opcion <1 || opcion>5);
         
        return opcion;
}
}
        // TODO code application logic here
    
    

