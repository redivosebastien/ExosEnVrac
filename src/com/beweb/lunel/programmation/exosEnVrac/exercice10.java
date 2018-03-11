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
public class exercice10 {
    public static void run(){
    
    long i = 0;
    long j = 1;
    long temp;
    for (int k = 0; k < 100; k++) {
        temp = i + j;
        i = j;
        j = temp;
       System.out.println(j);
    }
        
    }
    
}
