/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Rectángulo {
//   Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
//   La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
//   También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
 //Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    //Se deberán además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

    private double base;
    
    private double altura;

    public Rectángulo() {
    }
    

    public Rectángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
       
    }
public void crearRectángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     public double superficie(){
        return base*altura;
    }
    public double perimetro(){
        return (base+altura)*2;
    }
    
  

    public double dibujo() {
        for(int i=0; i<this.altura; i++ ) {
            for(int j=0; j<this.base; j++ ){
            
           if (i==0 || i == (this.altura-1) || j==0 || j== (this.base-1)){
                    System.out.print("*");
           }else System.out.print(" ");
             
        }
            System.out.println(""); 
        }
        /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
        return 0;
    }
      public void DibujarRect() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i == altura-1 || j==0 || j== base-1 )  {
                    System.out.print("* ");
                    
                } else System.out.print("  ");
            }
            System.out.println();
        }
      }
}
    

