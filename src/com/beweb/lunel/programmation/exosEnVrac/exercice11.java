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
public class exercice11 {
    public static void run(){
    int taille= 10;    
    long suites[] =new long[taille];
    long nombresPaires[] = new long [taille];
    long nombresImpaires[] = new long [taille];
    long multiplesDeCinq[] = new long [taille];
    long multiplesDeTrois[] = new long [taille];
    
    long i = 0;
    long j = 1;
    long temp;
    for (int k = 0; k <taille; k++) {
        temp = i + j;
        i = j;
        j = temp;
        
        suites[k]=+j;
        if(suites[k]%2==0){
            nombresPaires[k]=suites[k];            
        }
           
           
        }
     
    
       for(long a : nombresPaires){
    System.out.print(a);
        }
    } 
}
