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
public class RecursivoC {
    
    static long difAbs2(long n, byte d){
    if(n<10)
        return Math.abs(n-d);
    return Math.abs(n%10-d)+10*difAbs2(n/10,d);
        
        
    }
    public static void main(String[] args) {
        System.out.println(difAbs2(24343,(byte)4));
    }
}

    
    

