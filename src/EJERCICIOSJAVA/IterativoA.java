/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOSJAVA;


import java.io.*;
/**
 *
 * @author Gus_m
 */
public class IterativoA {
        
    public static void main(String args[])throws IOException

{

int n,n1,m;

BufferedReader in=new BufferedReader (new InputStreamReader(System.in));

System.out.println("Lee un numero e indica el digito mayor ");

System.out.println("Ingrese numero");

n=Integer.parseInt(in.readLine());

n1=n;

m=0;

while(n>0){

if((n%10)>m){m=n%10;}

n=n/10;}

System.out.println(m+" es el digito mayor de "+ n1);

}

}
    
    
    
    

    
    

