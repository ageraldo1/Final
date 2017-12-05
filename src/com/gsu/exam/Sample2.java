/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.exam;

/**
 *
 * @author Alexandre
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Sample2 {

 public static void main (String[] args) {

        final int MAX_POINTS=6;
        
        ArrayList<Integer> points = new ArrayList<>();
        int count = 1;
        String value;
        boolean flag = false;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print ("Please enter data point #" + count + "....: ");            
            
            value = input.next();
            
            try {
                points.add(Integer.parseInt(value));
                count++;                
                
            } catch (NumberFormatException e ) {
                System.out.println ("Selection invalid !");
            }           
            
            if ( count > MAX_POINTS) {
                flag = true;
            }
            
        } while ( flag == false);
        
        System.out.println ("Entered numbers...: " + points);
        
        Iterator it = points.listIterator();
        
        int mapValue;
        
        System.out.println ("List of Values using Iterator");
        
        while ( it.hasNext()) {
            mapValue = (int)it.next();
            
            System.out.println (mapValue);
        }
            
        
        
    }    
}
