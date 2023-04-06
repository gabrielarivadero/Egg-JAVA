/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaguia3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class eje5for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);

    	int numero;
        int suma= 0;
      
        for ( int i = 0 ; i<= 20; i++ ){
            

            System.out.println("Ingrese un número");
            numero = leer.nextInt();
           
         
        
            if (numero <0) {
                continue;
            }
            suma = suma + numero;

           if (numero == 0) {
               break;
           }
            
        }
        System.out.println("Se capturó el número cero");
        System.out.println("La suma de los números es:" + suma);
        // TODO code application logic here
    }
    
}
