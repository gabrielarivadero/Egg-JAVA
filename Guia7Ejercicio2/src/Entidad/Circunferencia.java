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
public class Circunferencia {
     private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    
    public double area(){
        return Math.pow(Math.PI*this.radio, 2);
    }
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
    
}
