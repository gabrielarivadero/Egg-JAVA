/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
 * A continuación, realizar las instrucciones necesarias para que: 
 * B tome el valor de C,
 * C tome el valor de A, 
 * A tome el valor de D 
 * y D tome el valor de B.
 * Mostrar los valores iniciales y los valores finales de cada variable.
 * Utilizar sólo una variable auxiliar.
 * @author Usuario
 */
public class Guia3EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A = 1 ;
       int B = 2 ;
       int C = 3 ;
       int D = 4 ;
       int auxiliar ;
     
        auxiliar = A;
         A = D ;
        D = B ;
         B = C ;
         C = auxiliar ;
        
        
       System.out.println("El valor inicial de A es " + C);
       System.out.println("El valor inicial de B es " + D);
       System.out.println("El valor inicial de C es " + B);
       System.out.println("El valor inicial de D es " + A);
       System.out.println("El valor final de A es " + A);
       System.out.println("El valor final de B es " + B);
       System.out.println("El valor final de C es " + C);
       System.out.println("El valor final de D es " + D);
        
                
                
                
    }
    
}
