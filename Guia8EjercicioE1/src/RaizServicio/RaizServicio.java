/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaizServicio;

import Entidad.Raiz;

/**
 *
 * @author Gabriela Rivadero
 */
public class RaizServicio {
    
     public double getDiscriminante(Raiz r1){
       double asd = Math.pow(r1.getB(),2) - (4 * r1.getA() * r1.getC()) ;
       r1.setDiscriminante(asd);
       return asd;
   }     
   
   public Boolean tieneRaices(Raiz p){
       
       return p.getDiscriminante() >= 0;
   }
   
   public Boolean tieneRaiz(Raiz p){
  
       return p.getDiscriminante() == 0;
   }
   
   public void obtieneRaices(Raiz p){
       double positiva =  ((-p.getB())+ Math.sqrt(Math.pow(p.getB(),2) - (4 * p.getA() * p.getC())))/(2* p.getA());
       double negativo =  ((-p.getB())- Math.sqrt(Math.pow(p.getB(),2) - (4 * p.getA() * p.getC())))/(2* p.getA());    
      if(tieneRaices(p)){
          System.out.println("x1 : " + positiva);
          System.out.println("x2 : " + negativo);
      } 
   }
      public void obtieneRaiz(Raiz p){
          double resultado = - p.getB() / 2 * p.getA();
      if(tieneRaiz(p)){
          System.out.println("x: " + resultado);
      } 
   }
    public void calcular(Raiz p){  
            if(tieneRaiz(p)){
               obtieneRaiz(p);
            }
            if(tieneRaices(p)){
               obtieneRaices(p);
            }
            if(p.getDiscriminante() < 0){
                System.out.println("No tiene raices");
            }
    }
        
    

   
}
