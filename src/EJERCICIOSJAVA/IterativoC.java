
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
public class IterativoC {
    
static long difAbs(long n, byte d){
long x=1;
long r=0;
while(n>0){

    r=Math.abs(n%10-d)*x+r;
    x=x*10;
    n=n/10;


}

return r;

}

public static void main(String[] args) {
    System.out.println(difAbs(46976, (byte)3));

}

}
    
    

