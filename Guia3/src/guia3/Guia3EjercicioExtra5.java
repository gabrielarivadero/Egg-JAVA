/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio

 * @author Usuario
 */
public class Guia3EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
       String tiposocio;
       double tarifa = 500;
      do{
          System.out.println("Ingrese tipo de socio A, B O C ");
          tiposocio = leer.nextLine();
      }
        
        while (!"A".equalsIgnoreCase(tiposocio) && !"B".equalsIgnoreCase(tiposocio) && !"C".equalsIgnoreCase(tiposocio));
      switch (tiposocio) {
        	case "A":
           System.out.println("La tarifa del socio A " +tarifa);
           System.out.println("La tarifa con descuento del socio A " +tarifa*0.5);
           break;

        	case "B":
           System.out.println("La tarifa del socio B " +tarifa);
           System.out.println("La tarifa con descuento del socio B " +tarifa*0.65);
            break;
            case "C":
           System.out.println("La tarifa del socio C " +tarifa);
           System.out.println("La tarifa sin descuento del socio C " +tarifa);
            break;
            
        	default:
           System.out.println("La letra es incorrecta ");
      }
        // TODO code application logic here
    }

    private static boolean equalsIgnoreCase(String tiposocio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
