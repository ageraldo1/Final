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

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;


public class Sample4 {
    
    public static void main (String[] args) {
        
        final int MAX_NUMBERS=2;
        int count = 1;
        boolean flag = false;
        int operation = 0;
        Double value;
        Double result=null;
        
        Queue<Double> queue = new LinkedList<Double>();
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println ("Please enter with the operation to perform");
            System.out.println ("[1] - Addition");
            System.out.println ("[2] - Subtraction");
            System.out.println ("[3] - Multiplication");
            System.out.println ("[4] - Division");
            System.out.println ("[5] - Remainder");
            System.out.println ("[6] - Exponent");
            
            System.out.print   ("Your Selection...:");
            
            try {
                operation  = Integer.parseInt(input.next());
                
                if ( operation >= 1 && operation <= 6) {
                    flag = true;
                    
                } else { 
                    System.out.println ("Invalid operation !");
                }                
            } catch (NumberFormatException e ) {
                System.out.println ("Invalid operation !");
            }            
            
            
        } while ( flag == false);
        
        
        flag = false;
        
        do {
            System.out.print ("Enter the value parameter #" + count + "....: ");            
            
            try {
                value  = Double.parseDouble(input.next());
                
                if ( count  == MAX_NUMBERS) { 
                    if ( operation == 4) {
                        if ( value == 0 ) {
                            System.out.println ("Cannot divide a number by zero");
                            
                        } else {
                            queue.add(value);
                            flag = true;
                        }
                    } else { 
                        queue.add(value);
                        flag = true;
                    }                    
                    
                } else {
                    queue.add(value);
                    count ++;
                }
                
            } catch (NumberFormatException e ) {
                System.out.println ("Invalid input !");
            }                                 
            
        } while ( flag == false);        
        
        Double last, first;
        
        first = queue.remove();
        last = queue.remove();
        
        switch (operation) {
            case 1:
                result = first + last;
                break;
                
            case 2:
                result = first - last;
                break;
                
            case 3:
                result = first * last;
                break;
                
            case 4:
                result = first / last;
                break;
                
            case 5:
                result = first % last;
                break;
                
            case 6:
                result = Math.pow(first, last);
                break;
        }
        
        System.out.println ("Result...:" + result);
    }
    
    public void saveToFile(String msg) {
        final String FILENAME="hello.txt";
        
        File f = new File(FILENAME);
            
        if ( f.canRead() ) { 
            System.out.println ("Warning, file " + f.getAbsoluteFile() + " already exists. This file will be overwritten");
        }
        
        try {                
            printMessage(f, msg);
            readMessage (f);            
            
        } catch (FileNotFoundException e) {
            System.out.println ("Error calling functions. Reason : " + e.toString());
        }
    }
    
    public static void printMessage(File f, String message) throws FileNotFoundException {
         PrintStream output = new PrintStream(f);
        
         output.println (message);
         output.close();
    }     
    
    public static void readMessage(File f) throws FileNotFoundException {
        Scanner input = new Scanner(f);
        
        while (input.hasNextLine() ) {
            String text = input.nextLine();
            System.out.println (text);            
        }                         
        
        input.close();
    }    
    

        

    
    
    
    
    
}
