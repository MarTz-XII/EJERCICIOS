/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOSJAVA;

/**
 *
 * @author Gus_m
 */
public class RecursivoA {
    
    
    
  static  int alfa(int A) {
       if(A<10)
           return A;
       else{
           int x=alfa(A/10);
           if((A%10)>x)
               return (A%10);
           else
               return x;
           
       }
        
       
        
    }
    public static void main(String[] args) {
        
        System.out.println(alfa(749385));
        
    }
}
