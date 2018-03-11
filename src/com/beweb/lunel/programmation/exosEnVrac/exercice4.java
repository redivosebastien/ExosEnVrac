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
public class exercice4 {
    
    
    public static void run(boolean flag){
    int compteur= 0;
    boolean tmp;
        if(!flag){// on dis que si la variable boolean est différent de TRUE donc est FALSE on entre dans cette condition
            compteur ++;
                System.out.println("incrementation si le bolean est FAUX = " +compteur);  
        }else{// si le boolean est TRUE alors on entre dans cette condition
             compteur --;
                System.out.println("Decrementation si le boolean est VRAI = " +compteur);
            }
        
             System.out.println("\n-----inversion de la valeur boolean------ \n");
             tmp = !flag;/* declaration d'une variable temporaire qui devien FALSE 
                         en indiquant que variable "tmp" devien la différence du boolean "flag" 
                         flag est forcement VRAI et donc "TMP" devien (FALSE)FAUX
                          */
             flag = tmp; // on renitialise la variable "flag" qui devient la valeur de la variable "tmp"
             
         if(flag){
             compteur --;
                System.out.println("On decremente si le bolean est inverser est faux = " +compteur);
             
         }else{
             compteur ++;
                System.out.println("On incremente si le boolean inverser est vrai = "+compteur);
                 
             }
             
            
    }
}
