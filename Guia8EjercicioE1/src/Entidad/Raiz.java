/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Gabriela Rivadero
 */
public class Raiz {
    private double a,b,c;
    private double discriminante;
    public Raiz() {
    }

    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
    
    public double getDiscriminante() {
        return discriminante;
    }
    
}
