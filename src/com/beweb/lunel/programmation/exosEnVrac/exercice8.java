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
public class exercice8 {
    public static void run(){
        int compteur = 243;
       while(compteur>=0){
           
                if(compteur%2==0){
                   System.out.print(compteur+"= est paire");
                   if(compteur%5==0){
                       
                        System.out.print( " est un multiple de 5 ");
                        
                    }
                   if(compteur%10==0){
                        System.out.print(", un multiple de 10");
                    }
                   if(compteur%5==0 && compteur%3==0){
                           System.out.print(" vrai");
                       }
                }else{
                    System.out.print(compteur+ " = impaire");
                    if(compteur%5==0){
                        System.out.print( " c'est un multiple de 5 ");
                    }
                    if(compteur%10==0){
                        System.out.print(" un multiple de 10");
                    }
                    
                }
                
            System.out.println("");
            compteur--;
            
        }
        
    }
    
}
