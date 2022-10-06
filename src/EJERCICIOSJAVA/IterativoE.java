/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOSJAVA;

import java.util.Scanner;

/**
 *
 * @author Gus_m
 */
public class IterativoE {
  
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        System.out.println("Dame el primer numero: ");
        int n1 = entrada.nextInt();
        String cadena1 = String.valueOf(n1);
        char[] Arre1  = cadena1.toCharArray();
        System.out.println("Dame el segundo numero: ");
        int n2 = entrada.nextInt();
        String cadena2 = String.valueOf(n2);
        char[] Arre2 = cadena2.toCharArray();
        
        boolean e = false;
        int j = 0;
        for(int i = 0; i < Arre1.length; i ++)
           while (Arre1[i]==Arre2[j] && Arre1[i+1]==Arre2[j+1]){
               if(Arre1[i]==Arre2[j]){
               e=true;
              }
           if(e){
               System.out.println("Los numero estan relacionados");   
               break;
           }
               
               
          }
             if(!e){
                 System.out.println("Los numeros no estan relacionados");
       }
}
        
    }
   
      
    
            
    
    

