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
public class exercice9 {
    public static void run(){
         for (int line = 0; line < 10 ;line++){
           
           System.out.println();
             
     
           // Gère la ligne horizontale si pair ou impair pour affichage de l' ordre de caractère.  
           for (int dame = 0; dame < 10; dame++){
               
               //test si pair ou impair
               if ((line%2)== 0){
                   System.out.print("faux" + " ");
   
               } else {
                   System.out.print("vrai" + "*");
                 }  
        
           }
    }
    
  }
    

}