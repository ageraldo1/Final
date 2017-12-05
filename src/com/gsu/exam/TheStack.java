/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.exam;

import java.util.Stack;

/**
 *
 * @author Alexandre
 */
public class TheStack {
    
    // Retrieves elements in the reverse of the order they were added.
    // Last-In, First-Out ("LIFO")
    // undo example in text editor (last thing that you do will be the first to be undo
    

    public static void main (String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> nstack = new Stack<>();
        
        
        stack.push("Dish 1");
        stack.push("Dish 2");
        stack.push("Dish 3");
        
        printStack(stack);
        
        System.out.println("Top Element is : " + stack.peek());
        System.out.println("Stack Size is : " + stack.size());
        
        
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        
         System.out.println("Stack Size is : " + stack.size());
         
         
         nstack.push(1);
         nstack.push(2);
         nstack.push(3);
         nstack.push(4);
         
         System.out.println ("Top of Integer Stack.....: " + nstack.peek());
         System.out.println ("My Stack.................: " + nstack);
         
         nstack.pop(); // remove last = 4
         System.out.println ("My Stack.................: " + nstack);
         
         System.out.println ("Search for Item 3.................: " + nstack.search(3)); 
         // it return 1 because the number 3 is on the top. The search start from top to down
         
         System.out.println ("Search for Item 1.................: " + nstack.search(1)); // last added
        
    }
    
    private static void printStack(Stack<String> s) {
        if ( s.empty() == false) {
            System.out.printf ("%s TOP\n", s);    
            
        } else { 
            System.out.println ("Stack is empty");
        }
        
        
        
    }
    
    public static void loopStack(Stack<String> s) {
     	while (!s.isEmpty()) {
	    //do something with s.pop();
	}

    }
    
              
    
}
