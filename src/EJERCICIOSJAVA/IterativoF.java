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
public class IterativoF {
    
    static long intercambiar(long n){
    long r=0;
    long d=1;
    
    while(n>0){
    long v=n%100;
    r=r+(v%10*10+v/10)*d;
    
    d=d*100;
    n=n/100;
    
     
        
    }
    return r;
    }
    
    public static void main(String[] args) {
        System.out.println(intercambiar(454654));
        
    }
    
}
