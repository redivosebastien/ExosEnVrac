/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

import java.util.Scanner;

/**
 *
 * @author sebastien2
 */
public class AlgoMain {
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean t = true;
        boolean f = false;
        boolean reponse = false;
        int exercice;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Veuillez entrer le numero de l'exercice(1,2,3...) = ");
        
        if(!sc.hasNextInt()){
            System.out.println("Veuillez saisir une donnée valide");
        }else{
            
           exercice=sc.nextInt(); 
             System.out.println("Vous avez choisit l'exercice n° "+exercice);
            if(exercice==3 || exercice==4 || exercice==7){
                System.out.print("veuillez selectionner le type de boolean(true ou false) = ");
                            
                            if(!sc.hasNextBoolean()){
                                System.out.println("saisie incorect");
                            }else{
                            reponse = sc.nextBoolean();
                                if(reponse==true){
                                    reponse= true;
                                }else{
                                    reponse= false;
                                }
                            
                            }
                        
            }

        if(exercice>=0 && exercice<=11){
            switch(exercice){
                case 1 :exercice1.run();
                break;
                case 2: exercice2.run("chaine vide");
                break;
                case 3: exercice3.run(reponse);
                break;
                case 4: exercice4.run(reponse);
                break;
                case 5: exercice5.run();
                break;
                case 6: exercice6.run();
                break;
                case 7: exercice7.run(reponse);
                break;
                case 8: exercice8.run();
                break;
                case 9: exercice9.run();
                break;
                case 10: exercice10.run();
                break;
                case 11: exercice11.run();
                break;
                default: System.out.println(" Alors quelle exercice tu veu afficher ? ");

            }
        }else{
            System.out.println("L'exercice demander n'existe pas!");
        }
       }
      
      
      
      
        
    }
    
}
