/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.gsu.exam;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alexandre
 */

        
public class Sample1 {
    
    public static void main (String[] args) {

        final int MAX_WORDS=10;
        
        ArrayList<String> words = new ArrayList<>();
        int count = 1;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print ("Please enter word #" + count + "....: ");            
            words.add(input.next());        
            
            count ++;
            
        } while ( count <= MAX_WORDS);
        
        System.out.println ("Original array list...:" + words);
        
        Collections.sort(words);
        
        System.out.println ("Sorted array list.....:" + words);
        
        
    }
    
}
