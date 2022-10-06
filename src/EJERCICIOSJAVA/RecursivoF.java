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
public class RecursivoF {
     
    static long intercambio2(long n){
    
        if (n<100)
            return n%10*10+n/10;
        return intercambio2(n%100)+intercambio2(n/100)*100;
        
        
        
    }
     
    
    public static void main(String[] args) {
        System.out.println(intercambio2(435678));
    }
    
}
