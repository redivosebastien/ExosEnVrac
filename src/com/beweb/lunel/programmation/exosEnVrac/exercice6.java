/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

/**
 *
 * @author sebastien2
 */
public class exercice6 {
    public static void run(){
        boolean vrai= true;
        boolean faux= false;
        boolean []tab= new boolean[10];
        
        int i=0;
        while(i<=tab.length-1){
            
            System.out.println(vrai+" = " +i);
            i++;
           
        }
        
        System.out.println("\n--------\n");

        int j = 0;
        
         while(j<=tab.length-1){
            
            System.out.println(faux+" = " +j);
            j++;
            
            
        }
         System.out.println("\n---------\n");
         int a = 0;
         int b = 0;
         while(++a<=tab.length-1){
          
            
              while(++b<=tab.length-1){
                 if(b%2==0){
                     System.out.print(vrai+"-");
                 }else{
                     System.out.print(faux+"-");
                 }
             
                    }
             
            System.out.print(""); 
         }
         
    }
    
}
