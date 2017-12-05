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
import java.util.Stack;

public class Sample3 {
    
    public static void main (String args[]) {
        
        final int MAX_STUDENTS=5;
        boolean flag = false;
        int count = 1;
        int selection = 0;
        
        String value;
        Double grade;
        
        
        Stack<String> student = new Stack<>();
        Stack<Double> grades = new Stack<>();
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print ("Please enter the name for student #" + count + "...: ");
            student.push(input.next());
            
            System.out.print ("Please enter the grade for student #" + count + "...: ");
            
            try {
                grade  = Double.parseDouble(input.next());
                
                if ( grade >= 0 && grade <= 100) {
                    grades.push( grade);
                    count ++;
                    
                } else { 
                    System.out.println ("Invalid grade !");
                }
                
            } catch (NumberFormatException e ) {
                System.out.println ("Invalid grade !");
            }
            
            if ( count > MAX_STUDENTS) {
                flag = true;
            }
            
            
        } while ( flag == false);
        
        flag = false;
        System.out.println ("Choose ONE option below");
        System.out.println ("[1] = MinGrade");
        System.out.println ("[2] = AvgGrade");
        
        do {
            System.out.print ("Your selection...: ");
            value =  input.next();
            
            try {
                selection = Integer.parseInt(value);
                
                if ( selection == 1 || selection == 2) {
                    flag = true;
                    
                } else { 
                    System.out.println ("Invalid selection!");
                }
            } catch (NumberFormatException e ) {
                System.out.println ("Invalid selection !");
            }            
            
        } while ( flag == false);
        
        switch (selection) {
            case 1:
                System.out.println ("Minimum Grade...:" + minGrade(grades));
                break;

            case 2:
                System.out.println ("Average Grade...:" + avgGrade(grades));
                break;
                
            default:
                break;
                
        }
        
    }
    
    public static Double minGrade(Stack<Double> grades) {
	Double retGrade = null;
        double element;
        
        while (!grades.isEmpty()) {
	    element = grades.pop();
            
            if ( retGrade == null) {
                retGrade = element;
            }
            
            if ( element < retGrade) {
                retGrade = element;
            }
	}        
        
        return retGrade;        
    }
    
    public static Double avgGrade(Stack<Double> grades) {
        Double total = 0.0;
        int nr_grades = 0;
        
        while (!grades.isEmpty()) {
            total = total + grades.pop();
            nr_grades ++;
        }
        
        return (Double)(total / nr_grades);
        
    }
    
}
