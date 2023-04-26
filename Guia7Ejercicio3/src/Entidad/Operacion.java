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
public class Operacion {
    private double numero1;
    private double numero2;

   

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    public void crearOperacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double sumar(){
        return this.numero1 +this.numero2;
        
    }
    public double restar(){
        return this.numero1 - this.numero2;
        
    }
     public double multiplicar(){
         if (this.numero1 == 0 || this.numero2 == 0){
             
             return 0;
         } else {
        return this.numero1 * this.numero2;
         }
    }
     public double dividir(){
         if (this.numero2 == 0){
             
             return 0;
         } else {
        return this.numero1 / this.numero2;
         }
     }
}
